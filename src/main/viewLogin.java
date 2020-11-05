package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;

public class viewLogin {

	private JFrame frmTechassistance;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewLogin window = new viewLogin();
					window.frmTechassistance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public viewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTechassistance = new JFrame();
		frmTechassistance.setTitle("TECHAssistance");
		frmTechassistance.setResizable(false);
		frmTechassistance.setBounds(100, 100, 350, 400);
		frmTechassistance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTechassistance.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 131, 188, 44);
		frmTechassistance.getContentPane().add(lblNewLabel);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(20, 201, 188, 44);
		frmTechassistance.getContentPane().add(lblSenha);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(20, 168, 302, 35);
		frmTechassistance.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(212, 280, 110, 50);
		frmTechassistance.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("TECHAssistance");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 38));
		lblNewLabel_1.setBounds(20, 46, 302, 57);
		frmTechassistance.getContentPane().add(lblNewLabel_1);
		
		JButton btnNovoUsurio = new JButton("Novo usu\u00E1rio");
		btnNovoUsurio.setBounds(20, 280, 110, 50);
		frmTechassistance.getContentPane().add(btnNovoUsurio);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(20, 234, 302, 35);
		frmTechassistance.getContentPane().add(passwordField);
	}
}
