package com.management.library;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LibrarianLogin {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Librarian Login");
		
		JLabel name = new JLabel("Enter Name");
		JLabel pass = new JLabel("Enter Password");
		
		JTextField tfname = new JTextField(20);
		JPasswordField tfpass = new JPasswordField(20);
		
		
		name.setLabelFor(tfname);
		pass.setLabelFor(tfpass);
		
		JButton login = new JButton("LOGIN");
		login.addActionListener(new ActionListener(){
			private Component NULL;

			public void actionPerformed(ActionEvent e)
			{
				String name = tfname.getText();
				String pass= String.valueOf(tfpass.getPassword());
				
				if(LibrarianDao.validate(name, pass))
				{
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(NULL, "Unable to login");
					tfname.setText("");
					tfpass.setText("");
				}
				
				
			}
		});
		
		JPanel panel = new JPanel();
		panel.add(name);
		panel.add(tfname);
		panel.add(pass);
		panel.add(tfpass);
		panel.add(login);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
		
		
	}

}
