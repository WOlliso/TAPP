package com.humanbooster.tedi.tapp;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					final Window window = new Window();
					window.frame.setVisible(true);
				} catch (final Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final JLabel lblTapp = new JLabel(
				"TAPP: Teacher Advanced Productivity Platform");
		lblTapp.setBounds(21, 5, 351, 23);
		lblTapp.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 18));

		final JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 119, 33, 16);

		textField = new JTextField();
		textField.setBounds(92, 107, 116, 22);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(92, 142, 116, 22);

		final JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 145, 55, 16);

		label = new JLabel("");
		label.setBounds(307, 44, 0, 0);

		label_1 = new JLabel("");
		label_1.setBounds(312, 44, 0, 0);

		label_2 = new JLabel("");

		final JButton btnNewButton = new JButton("Register Now !");
		btnNewButton.setBounds(226, 107, 118, 57);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(" km km km km ");

				final ConnexionPgSql connection = new ConnexionPgSql(
						"jdbc:postgresql://localhost:5432/MyBigDatabase",
						"user", "0000");
				final String request = "SELECT id, firstname, lastname FROM teachers";
				System.out.println("Connection worked.");

				/*
				 * Statement stmt = connection.createStatement(); ResultSet
				 * resultSet = stmt.executeQuery(request);
				 * 
				 * while (resultSet.next()) { int i = resultSet.getInt("id");
				 * String s = resultSet.getString("firstname"); String s2 =
				 * resultSet.getString("lastname"); System.out.println(i + " | "
				 * + s + " " + s2);}
				 */
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblTapp);
		frame.getContentPane().add(label);
		frame.getContentPane().add(label_1);
		frame.getContentPane().add(lblPassword);
		frame.getContentPane().add(lblName);
		frame.getContentPane().add(passwordField);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(btnNewButton);
	}
}
