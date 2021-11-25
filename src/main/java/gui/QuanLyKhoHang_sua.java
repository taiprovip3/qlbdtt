package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class QuanLyKhoHang_sua extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtSp;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhoHang_sua frame = new QuanLyKhoHang_sua();
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
	public QuanLyKhoHang_sua() {
		setTitle("VNSPORT > menu > Qu\u1EA3n l\u00FD kho h\u00E0ng > s\u1EEDa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 833, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "D\u1EEF li\u1EC7u v\u1EEBa ch\u1ECDn:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 817, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 801, 44);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 SP", "T\u00EAn SP", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "M\u00F4 t\u1EA3", "Nh\u00E0 CC", "Ph\u00E2n lo\u1EA1i"
			}
		));
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "S\u1EEDa th\u00E0nh:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 67, 817, 461);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("M\u00E3 s\u1EA3n ph\u1EA9m:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 102, 21);
		panel_1.add(lblNewLabel);
		
		txtSp = new JTextField();
		txtSp.setText("SP");
		txtSp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtSp.setEditable(false);
		txtSp.setBounds(10, 30, 34, 20);
		panel_1.add(txtSp);
		txtSp.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField.setBounds(54, 32, 140, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblTnSnPhm = new JLabel("T\u00EAn s\u1EA3n ph\u1EA9m:");
		lblTnSnPhm.setForeground(Color.BLUE);
		lblTnSnPhm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnSnPhm.setBounds(10, 52, 113, 21);
		panel_1.add(lblTnSnPhm);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 73, 313, 27);
		panel_1.add(textField_2);
		
		JLabel lblSLng = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSLng.setForeground(Color.BLUE);
		lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSLng.setBounds(10, 101, 113, 21);
		panel_1.add(lblSLng);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 122, 313, 27);
		panel_1.add(textField_1);
		
		JLabel lblnGi = new JLabel("\u0110\u01A1n gi\u00E1:");
		lblnGi.setForeground(Color.BLUE);
		lblnGi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblnGi.setBounds(10, 149, 113, 21);
		panel_1.add(lblnGi);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(10, 170, 313, 27);
		panel_1.add(textField_3);
		
		JLabel lblMT = new JLabel("M\u00F4 t\u1EA3:");
		lblMT.setForeground(Color.BLUE);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMT.setBounds(10, 243, 113, 21);
		panel_1.add(lblMT);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBounds(10, 264, 313, 27);
		panel_1.add(textField_4);
		
		JLabel lblNhCungCp = new JLabel("Nh\u00E0 cung c\u1EA5p:");
		lblNhCungCp.setForeground(Color.BLUE);
		lblNhCungCp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNhCungCp.setBounds(10, 290, 113, 21);
		panel_1.add(lblNhCungCp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"NCC1", "NCC2", "NCC3", "NCC4", "NCC5", "NCC6", "NCC7", "NCC8", "NCC9", "NCC10"}));
		comboBox.setBounds(10, 309, 355, 27);
		panel_1.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"B\u00F3ng \u0111\u00E1", "B\u00F3ng r\u1ED7", "B\u00F3ng ch\u00E0y", "Qu\u1EA7n v\u1EE3t", "B\u00F3ng b\u00E0n", "B\u00F3ng chuy\u1EC1n", "C\u1EA7u l\u00F4ng", "B\u00F3ng b\u1EA7u d\u1EE5c", "Golf", "Kh\u00F4ng x\u00E1c \u0111\u1ECBnh"}));
		comboBox_1.setBounds(10, 355, 355, 27);
		panel_1.add(comboBox_1);
		
		JLabel lblPhnLoi = new JLabel("Ph\u00E2n lo\u1EA1i:");
		lblPhnLoi.setForeground(Color.BLUE);
		lblPhnLoi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPhnLoi.setBounds(10, 334, 113, 21);
		panel_1.add(lblPhnLoi);
		
		JButton btnNewButton_1 = new JButton("S\u1EEDa s\u1EA3n ph\u1EA9m");
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setBounds(10, 406, 156, 44);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("X\u00F3a r\u1ED7ng field");
		btnNewButton_1_1.setForeground(Color.GREEN);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(176, 406, 156, 44);
		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(704, 338, 109, 98);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setBounds(6, 16, 97, 20);
		panel_2.add(lblNewLabel_3_1);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(6, 37, 97, 20);
		panel_2.add(lblNewLabel_3);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JButton btnNewButton_1_2 = new JButton("Quay l\u1EA1i");
		btnNewButton_1_2.setBounds(6, 65, 97, 27);
		panel_2.add(btnNewButton_1_2);
		btnNewButton_1_2.setForeground(Color.WHITE);
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1_2.setBackground(Color.RED);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(375, 372, 325, 23);
		panel_1.add(separator);
		
		JLabel lblNewLabel_1_3 = new JLabel("Môn chuyên Dụng:");
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 199, 139, 20);
		panel_1.add(lblNewLabel_1_3);
		
		JComboBox cbCate_1 = new JComboBox();
		cbCate_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbCate_1.setBounds(10, 218, 355, 27);
		panel_1.add(cbCate_1);
	}
}
