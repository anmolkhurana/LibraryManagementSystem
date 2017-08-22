package com.management.library;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AdminSuccess extends JFrame {

	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame("Success");
		
		JButton add= new JButton("Add Librarian");
		JButton view = new JButton("View Librarian");
		JButton delete = new JButton("Delete Librarian");
		JButton logout= new JButton("Logout");
		
		add.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				LibrarianForm.main(new String[]{});
				frame.dispose();
			}
		
		});
		
		view.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				ViewLibrarian.main(new String [] {});
				frame.dispose();
			}
		});
		
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{	
				DeleteLibrarian.main(new String[]{} );
				frame.dispose();
				
			}
		});
		
		logout.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AdminLogin.main(new String []{});
				frame.dispose();
			}
			
		});
		
		
		JPanel panel= new JPanel();
		panel.add(add);
		panel.add(view);
		panel.add(delete);
		panel.add(logout);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		

	}

}
