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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import entity.HoaDon;
import entity.SanPham;
import util.GetLocalTime;
import util.HibernateUtil;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;

public class QuanLyDonMua extends JFrame {

	private JPanel contentPane;
	private JTable tblHoaDon;
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
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTime.setBounds(0, 11, 109, 14);
		panel.add(lblTime);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDate.setBounds(0, 36, 109, 14);
		panel.add(lblDate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00E1c v\u1EE5 ch\u00EDnh:", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 0, 816, 119);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Th\u00EAm");
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(12, 38, 101, 46);
		panel_1.add(btnNewButton);
		
		JButton btnXanChn = new JButton("X\u00F3a ch\u1ECDn");
		btnXanChn.setForeground(new Color(0, 100, 0));
		btnXanChn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnXanChn.setBackground(Color.GREEN);
		btnXanChn.setBounds(239, 38, 107, 46);
		panel_1.add(btnXanChn);
		
		JButton btnSaHan = new JButton("S\u1EEDa ch\u1ECDn");
		btnSaHan.setForeground(new Color(0, 100, 0));
		btnSaHan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSaHan.setBackground(Color.GREEN);
		btnSaHan.setBounds(123, 38, 106, 46);
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
		
		JButton btnThanhTon = new JButton("Thanh to\u00E1n");
		btnThanhTon.setForeground(new Color(0, 100, 0));
		btnThanhTon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnThanhTon.setBackground(Color.GREEN);
		btnThanhTon.setBounds(356, 38, 121, 46);
		panel_1.add(btnThanhTon);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 113, 816, 275);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 816, 264);
		panel_2.add(scrollPane);
		
		tblHoaDon = new JTable();
		tblHoaDon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		scrollPane.setViewportView(tblHoaDon);
		tblHoaDon.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 \u0111\u01A1n mua", "M\u00E3 s\u1EA3n ph\u1EA9m", "M\u00E3 KH", "Th\u00E0nh ti\u1EC1n", "M\u00E3 NV", "Ng\u00E0y l\u1EADp HD", "Tr\u1EA1ng th\u00E1i"
			}
		));
		
		JButton btnNewButton_1 = new JButton("Quay l\u1EA1i");
		btnNewButton_1.setForeground(new Color(50, 205, 50));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(10, 395, 116, 37);
		contentPane.add(btnNewButton_1);
		
		//Code tay
		GetLocalTime getLocalTime = new GetLocalTime(lblDate, lblTime);
		getLocalTime.showTime();
		getLocalTime.showDate();
		loadDataToTable();
	}
	private void loadDataToTable() {
		SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
				List<HoaDon> ls = new ArrayList<HoaDon>();
				tr.begin();
				ls = session.createNativeQuery("select * from HoaDon", HoaDon.class).list();
				tr.commit();
				for (Iterator iterator = ls.iterator(); iterator.hasNext();) {
					HoaDon hoaDon = (HoaDon) iterator.next();
					DefaultTableModel tblModelHoaDon = (DefaultTableModel) tblHoaDon.getModel();
					tblModelHoaDon.addRow(new Object[] {
						hoaDon.getMaHoaDon(),
						hoaDon.getSanPham().getMaSanPham(),
						"-----",
						hoaDon.getTongTien(),
						"-----",
						hoaDon.getNgayLapHoaDon(),
						hoaDon.getTrangThai()
					});
				}
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		} finally {
			session.close();
		}
	}
}
