package com.teknogeek.architect;

import java.awt.LayoutManager;

import javax.swing.*;

import com.teknogeek.architect.BuildingObjects;

public class Architect
{
	public JFrame mainMenuFrame;
	public JPanel mainMenuPanel;
	
	public void start() throws Exception
	{
		//init window
		mainMenuFrame = new JFrame("Architectural Designer");
		mainMenuFrame.setSize(800, 600);
		mainMenuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//add menu items
		mainMenuPanel = new JPanel();
		mainMenuPanel.setLayout(null);
		
		BuildingObjects buildingObjects = new BuildingObjects();
		buildingObjects.addMenuItems();
		
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
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
