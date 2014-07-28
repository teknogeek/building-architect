package com.teknogeek.architect;

import java.awt.Rectangle;

import javax.swing.JButton;

public class BuildingObjects extends Architect
{
	Rectangle menuButtonRect = new Rectangle(350, 275, 100, 50);
	public void addMenuItems()
	{
		JButton optionsButton = new JButton("Options");
		optionsButton.setLayout(null);
		optionsButton.setBounds(350, 275, 100, 50);
		
		mainMenuPanel.add(optionsButton);
	}
	
	public void addBuildingObjects()
	{
		
	}
}
