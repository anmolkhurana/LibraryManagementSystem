package com.management.library;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LibrarianSuccess {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("LibrarianSuccess");
		
		JButton addbk = new JButton("ADD BOOKS");
		JButton viewbk = new JButton("VIEW BOOKS");
		JButton issuebk= new JButton("ISSUE BOOKS");
		JButton returnbk = new JButton("RETURN BOOK");
		JButton logout = new JButton("LOGOUT");
		
		JPanel panel = new JPanel();
		panel.add(addbk);
		panel.add(viewbk);
		panel.add(issuebk);
		panel.add(returnbk);
		panel.add(logout);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		

	}

}
