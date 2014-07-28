package com.teknogeek.architect;

import java.lang.reflect.Method;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Architect
{
	public JFrame mainMenuFrame;
	public JPanel mainMenuPanel;
	
	public void start() throws Exception, SecurityException
	{
		//init window
		mainMenuFrame = new JFrame("Architectural Designer");
		mainMenuFrame.setSize(800, 600);
		mainMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//add menu items
		mainMenuPanel = new JPanel();
		mainMenuPanel.setLayout(null);
		mainMenuPanel.setBounds(0, 0, 800, 600);
		
		Object buildingObjectsObject = BuildingObjects.class.newInstance();
		Method addMenuItems = BuildingObjects.class.getDeclaredMethod("addMenuItems");		
		addMenuItems.invoke(buildingObjectsObject);
		
		mainMenuFrame.add(mainMenuPanel);
		mainMenuFrame.setVisible(true);
	}
	
	public static void main(String args[])
	{
		Architect arch = new Architect();
		try
		{
			arch.start();
		} 
		catch (SecurityException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
