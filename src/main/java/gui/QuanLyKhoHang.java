package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import util.GetLocalTime;

import javax.swing.JScrollPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyKhoHang extends JFrame {

	private JPanel contentPane;
	private JTable tblSanPham;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhoHang frame = new QuanLyKhoHang();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuanLyKhoHang() {
		setTitle("VNSPORT > menu > qu\u1EA3n l\u00FD d\u1EE5ng c\u1EE5");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 856, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(0, 0, 840, 316);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 840, 316);
		panel.add(scrollPane_1);
		
		tblSanPham = new JTable();
		scrollPane_1.setViewportView(tblSanPham);
		tblSanPham.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 SP", "T\u00EAn SP", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "M\u00F4 t\u1EA3", "Nh\u00E0 CC", "M\u00E3 ph\u00E2n lo\u1EA1i"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, true, true, true, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblSanPham.getColumnModel().getColumn(0).setResizable(false);
		tblSanPham.getColumnModel().getColumn(4).setResizable(false);
		tblSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 250, 154), new Color(0, 255, 0), new Color(0, 100, 0), new Color(95, 158, 160)));
		panel_1.setBounds(0, 328, 840, 88);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnThem = new JButton("Th\u00EAm d\u1EE5ng c\u1EE5");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyKhoHang_them quanLyKhoHang_them = new QuanLyKhoHang_them();
				quanLyKhoHang_them.main(null);
			}
		});
		btnThem.setForeground(new Color(0, 128, 0));
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnThem.setBackground(new Color(60, 179, 113));
		btnThem.setBounds(10, 15, 149, 45);
		panel_1.add(btnThem);
		
		JButton btnSua = new JButton("S\u1EEDa ch\u1ECDn");
		btnSua.setForeground(new Color(0, 128, 0));
		btnSua.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSua.setBackground(new Color(60, 179, 113));
		btnSua.setBounds(179, 15, 137, 45);
		panel_1.add(btnSua);
		
		JButton btnXoa = new JButton("X\u00F3a ch\u1ECDn");
		btnXoa.setForeground(new Color(0, 128, 0));
		btnXoa.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnXoa.setBackground(new Color(60, 179, 113));
		btnXoa.setBounds(332, 15, 137, 45);
		panel_1.add(btnXoa);
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTime.setBounds(741, 15, 89, 14);
		panel_1.add(lblTime);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDate.setBounds(741, 35, 89, 14);
		panel_1.add(lblDate);
		
		JButton btnBack = new JButton("Quay l\u1EA1i");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu();
				dispose();
				mn.main(null);
			}
		});
		btnBack.setForeground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBack.setBackground(new Color(165, 42, 42));
		btnBack.setBounds(741, 54, 89, 23);
		panel_1.add(btnBack);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(613, 15, 1, 62);
		panel_1.add(separator);
		
		GetLocalTime getLocalTime = new GetLocalTime(lblDate, lblTime);
		getLocalTime.showTime();
		getLocalTime.showDate();
	}
}
