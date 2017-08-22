package com.management.library;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteLibrarian {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("DeleteLibrarian");
		JLabel identity = new JLabel("Enter ID");
		
		JButton delete = new JButton("Delete"); 
		JButton back = new JButton("Back");
		
		JTextField tfid = new JTextField(20);
		
		identity.setLabelFor(tfid);
		
		delete.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String sid= tfid.getText();
				if(sid==null||sid.trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "ID cant be balck");
					
				}
				else
				{
					int id=Integer.parseInt(sid);
					int i=LibrarianDao.delete(id);
					if(i>0)
					{
						JOptionPane.showMessageDialog(null, "Record deleted successfully");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Record cant be deleted");
					}
					
				}
			}
		});
	
		back.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				AdminLogin.main(new String[]{});
				frame.dispose();
			}
		});
		
	
		JPanel panel = new JPanel();
		panel.add(identity);
		panel.add(tfid);
		
		panel.add(delete);
		panel.add(back);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
	
	}


}



