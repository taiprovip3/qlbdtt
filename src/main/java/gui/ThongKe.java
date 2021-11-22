package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import javax.swing.JSeparator;

public class ThongKe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKe frame = new ThongKe();
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
	public ThongKe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 742);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 827, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("- VNSPORT -");
		lblNewLabel.setForeground(new Color(60, 179, 113));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 827, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B\u1ED8 L\u1ECCC TH\u1ED0NG K\u00CA TRUY XU\u1EA4T D\u1EEE LI\u1EC6U NHANH CH\u00D3NG V\u00C0 TI\u1EC6N \u00CDCH");
		lblNewLabel_1.setForeground(new Color(60, 179, 113));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 38, 827, 38);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(416, 79, 13, 624);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 380, 827, 13);
		contentPane.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 417, 301);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(427, 80, 400, 301);
		contentPane.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(0, 392, 417, 273);
		contentPane.add(panel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(427, 392, 400, 273);
		contentPane.add(panel_1_1_1);
	}
}
