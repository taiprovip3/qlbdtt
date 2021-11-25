/**
 * 19524791 - PHAN TAN TAI
 * Giao dien chinh cua user NhanVienQuanLyBanHang bao gom tat ca tinh nang.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;

import util.GetLocalTime;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;

public class Menu extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(699, 411, 117, 71);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setBounds(0, 36, 117, 26);
		panel.add(lblDate);
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTime.setBounds(0, 11, 117, 26);
		panel.add(lblTime);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "T\u00E1c v\u1EE5 ch\u00EDnh:", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_1.setBounds(0, 0, 816, 110);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnQuanLyKhoHang = new JButton("");
		btnQuanLyKhoHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyKhoHang qlkh = new QuanLyKhoHang();
				dispose();
				qlkh.main(null);
			}
		});
		btnQuanLyKhoHang.setAction(action);
		btnQuanLyKhoHang.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\equip.png"));
		btnQuanLyKhoHang.setBounds(10, 21, 99, 66);
		panel_1.add(btnQuanLyKhoHang);
		
		JLabel lblNewLabel_2 = new JLabel("Q.l\u00FD Kho h\u00E0ng");
		lblNewLabel_2.setLabelFor(btnQuanLyKhoHang);
		lblNewLabel_2.setBackground(new Color(46, 139, 87));
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 87, 99, 20);
		panel_1.add(lblNewLabel_2);
		
		JButton btnQuanLyDonMua = new JButton("");
		btnQuanLyDonMua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyDonMua qldm = new QuanLyDonMua();
				dispose();
				qldm.main(null);
			}
		});
		btnQuanLyDonMua.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\order.png"));
		btnQuanLyDonMua.setBounds(119, 21, 99, 66);
		panel_1.add(btnQuanLyDonMua);
		
		JLabel lblNewLabel_2_1 = new JLabel("Q.l\u00FD \u0110\u01A1n mua");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_1.setBackground(new Color(46, 139, 87));
		lblNewLabel_2_1.setBounds(119, 87, 99, 20);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnThongKe = new JButton("");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongKe tk = new ThongKe();
				dispose();
				tk.main(null);
			}
		});
		btnThongKe.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\statistic.png"));
		btnThongKe.setBounds(337, 21, 99, 66);
		panel_1.add(btnThongKe);
		
		JLabel lblNewLabel_2_3 = new JLabel("Th\u1ED1ng k\u00EA");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_3.setBackground(new Color(46, 139, 87));
		lblNewLabel_2_3.setBounds(337, 87, 99, 20);
		panel_1.add(lblNewLabel_2_3);
		
		JButton btnTuyChon = new JButton("");
		btnTuyChon.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\option.png"));
		btnTuyChon.setBounds(707, 21, 99, 66);
		panel_1.add(btnTuyChon);
		
		JLabel lblNewLabel_2_4 = new JLabel("T\u00F9y ch\u1ECDn");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_4.setBackground(new Color(46, 139, 87));
		lblNewLabel_2_4.setBounds(707, 87, 99, 20);
		panel_1.add(lblNewLabel_2_4);
		
		JButton btnBoxChatOnline = new JButton("");
		btnBoxChatOnline.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\chat.png"));
		btnBoxChatOnline.setBounds(598, 21, 99, 66);
		panel_1.add(btnBoxChatOnline);
		
		JLabel lblNewLabel_2_5 = new JLabel("Boxchat online");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_5.setBackground(new Color(46, 139, 87));
		lblNewLabel_2_5.setBounds(598, 87, 99, 20);
		panel_1.add(lblNewLabel_2_5);
		
		JButton btnQuanLyVanChuyen = new JButton("");
		btnQuanLyVanChuyen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				QuanLyVangChuyen qlvc = new QuanLyVanChuyen();
//				dispose();
//				qlvc.main(null);
			}
		});
		btnQuanLyVanChuyen.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\transport.png"));
		btnQuanLyVanChuyen.setBounds(228, 21, 99, 66);
		panel_1.add(btnQuanLyVanChuyen);
		
		JLabel lblNewLabel_2_6 = new JLabel("Q.l\u00FD V.chuy\u1EC3n");
		lblNewLabel_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_6.setForeground(new Color(0, 128, 128));
		lblNewLabel_2_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2_6.setBackground(new Color(46, 139, 87));
		lblNewLabel_2_6.setBounds(228, 87, 99, 20);
		panel_1.add(lblNewLabel_2_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 110, 816, 279);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("- VNSPORT -");
		lblNewLabel_3.setForeground(new Color(0, 139, 139));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewLabel_3.setBounds(0, 18, 816, 36);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("QU\u1EA2N L\u00DD \u0110\u1ED2 CHUY\u00CAN D\u1EE4NG TH\u1EC2 THAO");
		lblNewLabel_4.setForeground(new Color(0, 139, 139));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4.setBounds(0, 52, 816, 36);
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Tr\u1EE3 gi\u00FAp ng\u01B0\u1EDDi m\u1EDBi:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_4.setBounds(0, 99, 406, 178);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("- Xin ch\u00E0o, b\u1EA1n c\u00F3 th\u1EC3 tham kh\u1EA3o tr\u1EE3 gi\u00FAp t\u00EDnh");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 23, 365, 20);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("n\u0103ng t\u1EA1i \u0111\u00E2y:");
		lblNewLabel_6_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_1.setBounds(10, 44, 93, 20);
		panel_4.add(lblNewLabel_6_1);
		
		JButton btnHelp = new JButton("link");
		btnHelp.setAction(action);
		btnHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = "https://www.google.com";
		        try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnHelp.setBackground(Color.YELLOW);
		btnHelp.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnHelp.setBounds(102, 43, 93, 23);
		panel_4.add(btnHelp);
		
		JLabel lblNewLabel_6_2 = new JLabel("- N\u1EBFu b\u1EA1n g\u1EB7p l\u1ED7i ho\u1EB7c mu\u1ED1n li\u00EAn h\u1EC7, g\u00F3p \u00FD h\u00E3y");
		lblNewLabel_6_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_2.setBounds(10, 69, 361, 20);
		panel_4.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_2_1 = new JLabel("nh\u1EA5p v\u00E0o li\u00EAn k\u1EBFt n\u00E0y:");
		lblNewLabel_6_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_2_1.setBounds(10, 91, 157, 20);
		panel_4.add(lblNewLabel_6_2_1);
		
		JButton btnReport = new JButton("link");
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String url = "https://www.google.com";
		        try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnReport.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnReport.setBackground(Color.YELLOW);
		btnReport.setBounds(167, 90, 86, 23);
		panel_4.add(btnReport);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "V\u1EC1 ph\u1EA7n m\u1EC1m:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_4_1.setBounds(410, 99, 406, 178);
		panel_2.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_6_3 = new JLabel("- PHI\u00CAN B\u1EA2N: 1.0 (demo)");
		lblNewLabel_6_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_3.setBounds(10, 21, 184, 20);
		panel_4_1.add(lblNewLabel_6_3);
		
		JLabel lblNewLabel_6_4 = new JLabel("- NH\u00C0 PH\u00C1T TRI\u1EC2N: nh\u00F3m 6");
		lblNewLabel_6_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_4.setBounds(10, 44, 207, 20);
		panel_4_1.add(lblNewLabel_6_4);
		
		JLabel lblNewLabel_6_4_1 = new JLabel("- M\u00C3 NGU\u1ED2N: \u0111\u00F3ng");
		lblNewLabel_6_4_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_4_1.setBounds(10, 68, 142, 20);
		panel_4_1.add(lblNewLabel_6_4_1);
		
		JLabel lblNewLabel_6_4_2 = new JLabel("- B\u1EA2N QUY\u1EC0N:");
		lblNewLabel_6_4_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_6_4_2.setBounds(10, 87, 106, 20);
		panel_4_1.add(lblNewLabel_6_4_2);
		
		JLabel lblNewLabel_6_4_3 = new JLabel(" + Product activated");
		lblNewLabel_6_4_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_4_3.setBounds(10, 105, 207, 20);
		panel_4_1.add(lblNewLabel_6_4_3);
		
		JLabel lblNewLabel_6_4_2_1 = new JLabel(" + Exceptional Key: xxxxx-xxxxx-xxxxx");
		lblNewLabel_6_4_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6_4_2_1.setBounds(10, 124, 320, 20);
		panel_4_1.add(lblNewLabel_6_4_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Nh\u00E2n vi\u00EAn \u0111ang s\u1EED d\u1EE5ng:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_3.setBounds(0, 388, 238, 94);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("M\u00E3 s\u1ED1:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(10, 24, 53, 19);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_3 = new JLabel("SELLER002");
		lblNewLabel_5_3.setForeground(Color.RED);
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3.setBounds(73, 26, 146, 14);
		panel_3.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_1 = new JLabel("T\u00EAn user:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(10, 44, 77, 14);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("QuanLy");
		lblNewLabel_5_3_1.setForeground(Color.RED);
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_1.setBounds(97, 44, 135, 19);
		panel_3.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Th\u1EDDi gian d\u00F9ng:");
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5_2.setBounds(11, 63, 127, 20);
		panel_3.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3_2 = new JLabel("0s");
		lblNewLabel_5_3_2.setForeground(Color.RED);
		lblNewLabel_5_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5_3_2.setBounds(147, 69, 84, 14);
		panel_3.add(lblNewLabel_5_3_2);
		
		GetLocalTime getLocalTime = new GetLocalTime(lblDate, lblTime);
		getLocalTime.showTime();
		getLocalTime.showDate();
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
