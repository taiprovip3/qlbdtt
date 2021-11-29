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
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import util.GetLocalTime;

import javax.swing.border.EtchedBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
	public ThongKe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 827, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("- VNSPORT -");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 827, 38);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B\u1ED8 L\u1ECCC TH\u1ED0NG K\u00CA TRUY XU\u1EA4T D\u1EEE LI\u1EC6U NHANH CH\u00D3NG V\u00C0 TI\u1EC6N \u00CDCH");
		lblNewLabel_1.setForeground(new Color(0, 139, 139));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 38, 827, 38);
		panel.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 128, 128));
		separator.setBounds(0, 74, 827, 2);
		panel.add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 827, 152);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Ch\u1EE9c n\u0103ng c\u00F3 s\u1EB5n:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 11, 219, 24);
		panel_1.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Th\u1ED1ng k\u00EA");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setBounds(10, 104, 146, 42);
		panel_1.add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Doanh thu trong th\u00E1ng", "V\u1EADn chuy\u1EC3n trong th\u00E1ng", "Kh\u00E1ch h\u00E0ng t\u01B0\u01A1ng t\u00E1c", "---------- Thu\u1EADn ----------", "D\u1EE5ng c\u1EE5 b\u00E1n ch\u1EA1y", "\u0110\u01A1n mua nhi\u1EC1u $ nh\u1EA5t", "H\u00F3a \u0111\u01A1n \u0111\u00E3 thanh to\u00E1n", "Nh\u00E2n vi\u00EAn ch\u0103m ch\u1EC9", "---------- Ng\u01B0\u1EE3c ----------", "D\u1EE5ng c\u1EE5 b\u00E1n \u1EBF", "\u0110\u01A1n mua \u00EDt $ nh\u1EA5t", "H\u00F3a \u0111\u01A1n ch\u01B0a thanh to\u00E1n", "Nh\u00E2n vi\u00EAn \u00EDt ho\u1EA1t \u0111\u1ED9ng"}));
		comboBox.setBounds(10, 46, 387, 35);
		panel_1.add(comboBox);
		
		JButton btnQuayLi = new JButton("Quay l\u1EA1i:");
		btnQuayLi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mnMenu = new Menu();
				mnMenu.main(null);
				dispose();
			}
		});
		btnQuayLi.setBounds(671, 104, 146, 42);
		panel_1.add(btnQuayLi);
		btnQuayLi.setForeground(new Color(0, 128, 128));
		btnQuayLi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnQuayLi.setBackground(new Color(192, 192, 192));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Logs:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(0, 243, 827, 152);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 21, 617, 120);
		panel_2.add(textArea);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(695, 91, 132, 61);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(0, 11, 132, 14);
		panel_3.add(lblTime);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(0, 36, 132, 14);
		panel_3.add(lblDate);
		GetLocalTime getTime = new GetLocalTime(lblDate, lblTime);
		getTime.showTime();
		getTime.showDate();
		
	}
}
