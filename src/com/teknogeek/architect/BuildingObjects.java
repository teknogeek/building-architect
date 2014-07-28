package com.teknogeek.architect;

import java.awt.Rectangle;
import java.awt.event.ActionListener;

import javax.swing.JButton;

abstract class BuildingObjects extends Architect
{
	JButton startButton, optionsButton, exitButton;
	
	//Architect arch = new Architect();
	public void addMenuItems()
	{
		startButton = new JButton("Start");
		startButton.setLayout(null);
		startButton.setBounds(350, 225, 100, 50);
		
		optionsButton = new JButton("Options");
		optionsButton.setLayout(null);
		optionsButton.setBounds(350, 275, 100, 50);
		
		exitButton = new JButton("Exit");
		exitButton.setLayout(null);
		exitButton.setBounds(350, 375, 100, 50);
		exitButton.setActionCommand("exit");
		exitButton.addActionListener((ActionListener) this);
		
		mainMenuPanel.add(startButton);
		mainMenuPanel.add(optionsButton);
		mainMenuPanel.add(startButton);
	}
	
	public void addBuildingObjects()
	{
		
	}
}
