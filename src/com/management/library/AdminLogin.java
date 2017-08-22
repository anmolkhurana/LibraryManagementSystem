package com.management.library;

//import AdminLogin;

import javax.swing.*;

import java.applet.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLogin extends JFrame {

	
	public static void main(String[] args){ //wirte this code in constructor instead
		
	
	final JFrame frame = new JFrame("Management");
	JLabel username= new JLabel("User Name");
	final JTextField tfuser = new JTextField(20);
	username.setLabelFor(tfuser);
	JLabel pass = new JLabel("Password");
	final JTextField tfpass= new JTextField(20);
	pass.setLabelFor(tfpass);
	
	JButton login = new JButton("Login");
	login.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			String name= tfuser.getText();
			String password=String.valueOf(tfpass.getText());
			if(name.equals("admin")&& password.equals("admin123"))
				{
					System.out.println("Successfully logged in");
					AdminSuccess.main(new String[] {});
				}
			else
			{	System.out.println("Sorry, Information Is incorrect; Try again");
				tfuser.setText("");
				tfpass.setText("");
			}
		}
	});
	
	JPanel panel= new JPanel();
	panel.add(username);
	panel.add(tfuser);
	panel.add(pass);
	panel.add(tfpass);
	panel.add(login);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,300);
	frame.getContentPane().add(panel);
	frame.setVisible(true);
	
	}
	
	
}

