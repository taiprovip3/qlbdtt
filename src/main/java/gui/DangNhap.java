/**
 * 19524791 - PHAN TAN TAI
 * Giao dien dau tien khi user vao ung dung, phai dang nhap de xac dinh nguoi dung
 */
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.NhanVienDao;
import entity.NhanVien;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DangNhap extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap frame = new DangNhap();
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
	public DangNhap() {
		setTitle("VNSPORT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 726, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 66, 710, 246);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("M\u1EADt kh\u1EA9u:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 60, 208, 28);
		panel.add(lblNewLabel_3);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtPassword.setBounds(20, 85, 214, 28);
		panel.add(txtPassword);
		
		JButton btnLogin = new JButton("\u0110\u0103ng nh\u1EADp");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(validData())
				{
					String username = txtUsername.getText();
					String password = txtPassword.getText();
					NhanVienDao nhanVienDao = new NhanVienDao();
					NhanVien nhanVien = new NhanVien();
					String pwSystem = nhanVienDao.getNhanVien(username);
					if(pwSystem ==null)
						JOptionPane.showMessageDialog(contentPane, "Username không tồn tại");
					else
						if(password.equals(pwSystem))
						{
							dispose();
							Menu mn = new Menu();
							mn.main(null);
						}else
							JOptionPane.showMessageDialog(contentPane, "Sai pass");
				}
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setForeground(new Color(60, 179, 113));
		btnLogin.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnLogin.setBounds(10, 138, 141, 39);
		panel.add(btnLogin);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(616, 175, 94, 74);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(0, 30, 94, 14);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(0, 44, 94, 14);
		panel_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3_1 = new JLabel("T\u00EAn \u0111\u0103ng nh\u1EADp:");
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_3_1.setBounds(10, 0, 208, 28);
		panel.add(lblNewLabel_3_1);
		
		JButton btnForgot = new JButton("Qu\u00EAn m\u1EADt kh\u1EA9u");
		btnForgot.setForeground(Color.BLACK);
		btnForgot.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnForgot.setBackground(Color.WHITE);
		btnForgot.setBounds(170, 138, 160, 39);
		panel.add(btnForgot);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtUsername.setBounds(20, 23, 214, 26);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 710, 67);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("TRANG \u0110\u0102NG NH\u1EACP");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(0, 30, 710, 33);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("VNSPORT");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 36));
		lblNewLabel.setBounds(0, 0, 710, 33);
		panel_1.add(lblNewLabel);
	}
	private boolean validData() {
		if(txtUsername.getText().length() <= 0 || txtPassword.getText().length() <= 0)
		{
			JOptionPane.showMessageDialog(contentPane, "Không được bỏ trống 1 trong 2 field");
			return false;
		}
		return true;
	}
}
