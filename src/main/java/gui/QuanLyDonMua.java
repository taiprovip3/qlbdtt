package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class QuanLyDonMua extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyDonMua frame = new QuanLyDonMua();
					frame.setLocationRelativeTo(null);
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
	public QuanLyDonMua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(707, 388, 109, 55);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(0, 11, 109, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 36, 109, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00E1c v\u1EE5 ch\u00EDnh:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 0, 816, 119);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Th\u00EAm \u0111\u01A1n m\u1EDBi");
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 38, 149, 46);
		panel_1.add(btnNewButton);
		
		JButton btnXanChn = new JButton("X\u00F3a \u0111\u01A1n ch\u1ECDn");
		btnXanChn.setForeground(new Color(0, 100, 0));
		btnXanChn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnXanChn.setBackground(Color.GREEN);
		btnXanChn.setBounds(328, 38, 149, 46);
		panel_1.add(btnXanChn);
		
		JButton btnSaHan = new JButton("S\u1EEDa h\u00F3a \u0111\u01A1n");
		btnSaHan.setForeground(new Color(0, 100, 0));
		btnSaHan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSaHan.setBackground(Color.GREEN);
		btnSaHan.setBounds(169, 38, 149, 46);
		panel_1.add(btnSaHan);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00ECm ki\u1EBFm h\u00F3a \u0111\u01A1n:", TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBounds(487, 0, 329, 119);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textField.setBounds(10, 54, 309, 32);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JButton btnTmKim = new JButton("T\u00ECm ki\u1EBFm");
		btnTmKim.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnTmKim.setBackground(Color.GREEN);
		btnTmKim.setBounds(10, 88, 99, 20);
		panel_3.add(btnTmKim);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Theo m\u00E3", "Theo textsearch"}));
		comboBox.setBounds(10, 21, 309, 32);
		panel_3.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 113, 816, 275);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 \u0111\u01A1n mua"
			}
		));
		table.setBounds(0, 11, 816, 264);
		panel_2.add(table);
		
		JButton btnNewButton_1 = new JButton("Quay l\u1EA1i");
		btnNewButton_1.setForeground(new Color(0, 139, 139));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 395, 116, 37);
		contentPane.add(btnNewButton_1);
	}
}
