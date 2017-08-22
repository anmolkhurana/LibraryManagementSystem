package com.management.library;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibrarianForm extends JFrame{

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Librarian_Form");
		JLabel name = new JLabel("Name");
		JLabel email = new JLabel("Email");
		JLabel pass = new JLabel("Password");
		JLabel address = new JLabel("Address");
		JLabel contact = new JLabel("Contact");
		
		
		JButton addLib = new JButton("Add Librarian");
		JButton back = new JButton("Back");
		
		
		JTextField tfname = new JTextField(20);
		JTextField tfemail = new JTextField(20);
		JPasswordField tfpass = new JPasswordField(20);
		JTextField tfaddress = new JTextField(20);
		JTextField tfcontact = new JTextField(20);
		
		
		
		name.setLabelFor(tfname);
		email.setLabelFor(tfemail);
		pass.setLabelFor(tfpass);
		address.setLabelFor(tfaddress);
		contact.setLabelFor(tfcontact);
		
		
		addLib.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String name = tfname.getText();
				String email = tfemail.getText();
				String pass = String.valueOf(tfpass.getPassword());
				String address = tfaddress.getText();
				String contact = tfcontact.getText();
			
				
				int i = LibrarianDao.save(name, email, pass, address, contact);
				if(i>0)
				{
					//JOptionPane.showMessageDialog(LibrarianForm.this,"Librarian Added Successfully" );
					AdminSuccess.main(new String[]{} );
					frame.dispose();
				}
				else
				{
					//JOptionPane.showMessageDialog(LibrarianForm.this," Sorry, we are unable to create one");
				}
			
			
				
				
			}
		});
		
		
		
		
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				AdminSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		
		JPanel panel= new JPanel();
		panel.add(name);
		panel.add(tfname);
		
		panel.add(email);
		panel.add(tfemail);
		
		panel.add(pass);
		panel.add(tfpass);
		
		panel.add(address);
		panel.add(tfaddress);
		
		panel.add(contact);
		panel.add(tfcontact);
		
		panel.add(addLib);
		panel.add(back);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
			
		

	}

}
