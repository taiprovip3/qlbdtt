package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class TuyChon extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TuyChon frame = new TuyChon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TuyChon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\u0110\u1ED5i ng\u01B0\u1EDDi d\u00F9ng");
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setForeground(new Color(60, 179, 113));
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(173, 31, 202, 50);
		contentPane.add(btnNewButton);
		
		JButton btniMtKhu = new JButton("\u0110\u1ED5i m\u1EADt kh\u1EA9u");
		btniMtKhu.setForeground(new Color(60, 179, 113));
		btniMtKhu.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btniMtKhu.setBackground(new Color(152, 251, 152));
		btniMtKhu.setBounds(173, 85, 202, 50);
		contentPane.add(btniMtKhu);
		
		JButton btnCit = new JButton("C\u00E0i \u0111\u1EB7t n\u00E2ng cao");
		btnCit.setForeground(new Color(60, 179, 113));
		btnCit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnCit.setBackground(new Color(152, 251, 152));
		btnCit.setBounds(173, 139, 202, 50);
		contentPane.add(btnCit);
		
		JButton btnNewButton_1 = new JButton("\u0110\u1ED5i ng\u01B0\u1EDDi d\u00F9ng");
		btnNewButton_1.setForeground(new Color(60, 179, 113));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(152, 251, 152));
		btnNewButton_1.setBounds(173, 191, 202, 50);
		contentPane.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(438, 210, 106, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 11, 106, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 36, 106, 14);
		panel.add(lblNewLabel_1);
	}
}
