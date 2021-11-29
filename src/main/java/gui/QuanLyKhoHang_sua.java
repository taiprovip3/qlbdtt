package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dao.SanPhamDao;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class QuanLyKhoHang_sua extends JFrame {

	private JPanel contentPane;
	private JTable tblSanPham;
	private JTextField txtSp;
	private JTextField txtMaSanPham;
	private JTextField txtTenSanPham;
	private JTextField txtSoLuong;
	private JTextField txtDonGia;
	private JTextField txtMoTa;
	private DefaultTableModel tblModelSanPham;
	private JComboBox cbNhaCungCap, cbPhanLoai;
	

	/**
	 * Launch the application.
	 */
	public static void main(final String maSanPham, final String tenSanPham, final int soLuongTon, final float donGia, final String moTa, final String maNhaCungCap, final String tenPhanLoai) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					String ma = maSanPham;
					String ten = tenSanPham;
					int sl = soLuongTon;
					float dg = donGia;
					String mt = moTa;
					String ncc = maNhaCungCap;
					String tenpl = tenPhanLoai;
					QuanLyKhoHang_sua frame = new QuanLyKhoHang_sua();
					frame.setVisible(true);
					frame.suaData(ma, ten, sl, dg, mt, ncc, tenpl);
					frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		setBounds(100, 100, 847, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "D\u1EEF li\u1EC7u v\u1EEBa ch\u1ECDn:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 831, 64);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 16, 815, 48);
		panel.add(scrollPane);
		
		tblSanPham = new JTable();
		tblSanPham.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int a = tblSanPham.getSelectedRow();
				String number = tblSanPham.getValueAt(a, 0).toString().substring(2);
				txtMaSanPham.setText(number);
				txtTenSanPham.setText(tblSanPham.getValueAt(a, 1).toString());
				txtSoLuong.setText(tblSanPham.getValueAt(a, 2).toString());
				txtDonGia.setText(tblSanPham.getValueAt(a, 3).toString());
				txtMoTa.setText(tblSanPham.getValueAt(a, 4).toString());
				cbNhaCungCap.setSelectedItem(tblSanPham.getValueAt(a, 5));
				cbPhanLoai.setSelectedItem(tblSanPham.getValueAt(a, 6));
			}
		});
		tblSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		tblSanPham.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 SP", "T\u00EAn SP", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "M\u00F4 t\u1EA3", "Nh\u00E0 CC", "Ph\u00E2n lo\u1EA1i"
			}
		));
		scrollPane.setViewportView(tblSanPham);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "S\u1EEDa th\u00E0nh:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(0, 67, 831, 409);
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
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMaSanPham.setBounds(54, 32, 140, 20);
		panel_1.add(txtMaSanPham);
		txtMaSanPham.setColumns(10);
		
		JLabel lblTnSnPhm = new JLabel("T\u00EAn s\u1EA3n ph\u1EA9m:");
		lblTnSnPhm.setForeground(Color.BLUE);
		lblTnSnPhm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnSnPhm.setBounds(10, 52, 113, 21);
		panel_1.add(lblTnSnPhm);
		
		txtTenSanPham = new JTextField();
		txtTenSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtTenSanPham.setColumns(10);
		txtTenSanPham.setBounds(10, 73, 313, 27);
		panel_1.add(txtTenSanPham);
		
		JLabel lblSLng = new JLabel("S\u1ED1 l\u01B0\u1EE3ng:");
		lblSLng.setForeground(Color.BLUE);
		lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSLng.setBounds(10, 101, 113, 21);
		panel_1.add(lblSLng);
		
		txtSoLuong = new JTextField();
		txtSoLuong.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtSoLuong.setColumns(10);
		txtSoLuong.setBounds(10, 122, 313, 27);
		panel_1.add(txtSoLuong);
		
		JLabel lblnGi = new JLabel("\u0110\u01A1n gi\u00E1:");
		lblnGi.setForeground(Color.BLUE);
		lblnGi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblnGi.setBounds(10, 149, 113, 21);
		panel_1.add(lblnGi);
		
		txtDonGia = new JTextField();
		txtDonGia.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtDonGia.setColumns(10);
		txtDonGia.setBounds(10, 170, 313, 27);
		panel_1.add(txtDonGia);
		
		JLabel lblMT = new JLabel("M\u00F4 t\u1EA3:");
		lblMT.setForeground(Color.BLUE);
		lblMT.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMT.setBounds(10, 202, 113, 21);
		panel_1.add(lblMT);
		
		txtMoTa = new JTextField();
		txtMoTa.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMoTa.setColumns(10);
		txtMoTa.setBounds(10, 223, 313, 27);
		panel_1.add(txtMoTa);
		
		JLabel lblNhCungCp = new JLabel("Nh\u00E0 cung c\u1EA5p:");
		lblNhCungCp.setForeground(Color.BLUE);
		lblNhCungCp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNhCungCp.setBounds(10, 249, 113, 21);
		panel_1.add(lblNhCungCp);
		
		cbNhaCungCap = new JComboBox();
		cbNhaCungCap.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbNhaCungCap.setModel(new DefaultComboBoxModel(new String[] {"NCC1", "NCC2", "NCC3", "NCC4", "NCC5", "NCC6", "NCC7", "NCC8", "NCC9", "NCC10"}));
		cbNhaCungCap.setBounds(10, 268, 355, 27);
		panel_1.add(cbNhaCungCap);
		
		cbPhanLoai = new JComboBox();
		cbPhanLoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbPhanLoai.setModel(new DefaultComboBoxModel(new String[] {"PL1", "PL2", "PL3", "PL4", "PL5", "PL6", "PL7", "PL8", "PL9", "PL10"}));
		cbPhanLoai.setBounds(10, 314, 355, 27);
		panel_1.add(cbPhanLoai);
		
		JLabel lblPhnLoi = new JLabel("Ph\u00E2n lo\u1EA1i:");
		lblPhnLoi.setForeground(Color.BLUE);
		lblPhnLoi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPhnLoi.setBounds(10, 293, 113, 21);
		panel_1.add(lblPhnLoi);

		JButton btnNewButton_1 = new JButton("S\u1EEDa s\u1EA3n ph\u1EA9m");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtMaSanPham.getText().equals("") || txtSoLuong.getText().equals("") || txtDonGia.getText().equals("") || txtMoTa.getText().equals(""))
				{
					JOptionPane.showMessageDialog(contentPane, "Vui lòng điền đủ thông tin cần sửa");
				}else {
					String ma = tblSanPham.getValueAt(0, 0).toString();
					String ten = txtTenSanPham.getText();
					int sl = Integer.parseInt(txtSoLuong.getText());
					float dg = Float.parseFloat(txtDonGia.getText());
					String mota = txtMoTa.getText();
					String maNCC = cbNhaCungCap.getSelectedItem().toString();
					String maPL = cbPhanLoai.getSelectedItem().toString();
					SanPhamDao sanPhamDao = new SanPhamDao();
					boolean a = sanPhamDao.suaSanPham(ma,ten,sl,dg,mota,maNCC,maPL);
					if(a)
						{
							xoaRong();
							tblModelSanPham.setValueAt(ten, 0, 1);
							tblModelSanPham.setValueAt(sl, 0, 2);
							tblModelSanPham.setValueAt(dg, 0, 3);
							tblModelSanPham.setValueAt(mota, 0, 4);
							tblModelSanPham.setValueAt(maNCC, 0, 5);
							tblModelSanPham.setValueAt(maPL, 0, 6);
							JOptionPane.showMessageDialog(contentPane, "Sửa thành công");
						}
					else
						JOptionPane.showMessageDialog(contentPane, "Có lỗi ko xd");
				}//End elsecheck rỗng
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setBounds(10, 365, 156, 44);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("X\u00F3a r\u1ED7ng field");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xoaRong();
				
			}
		});
		btnNewButton_1_1.setForeground(Color.GREEN);
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(176, 365, 156, 44);
		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(722, 311, 109, 98);
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
		
		JButton btnClose = new JButton("Đóng");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnClose.setBounds(6, 65, 97, 27);
		panel_2.add(btnClose);
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnClose.setBackground(Color.RED);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(375, 331, 337, 23);
		panel_1.add(separator);
	}

	private void suaData(String maSanPham,String tenSanPham,int soLuongTon,float donGia,String moTa,String maNhaCungCap,String tenPhanLoai) {
		System.out.println(maSanPham+""+tenSanPham+""+soLuongTon+""+donGia+""+moTa+""+maNhaCungCap+""+tenPhanLoai);
		tblModelSanPham = (DefaultTableModel) tblSanPham.getModel();
		tblModelSanPham.addRow(new Object[]{
			maSanPham, tenSanPham, soLuongTon, donGia, moTa, maNhaCungCap, tenPhanLoai
		});

	}
	private void xoaRong() {
		txtMaSanPham.setText("");
		txtTenSanPham.setText("");
		txtSoLuong.setText("");
		txtDonGia.setText("");
		txtMoTa.setText("");
		cbNhaCungCap.setSelectedItem(0);
		cbPhanLoai.setSelectedItem(0);
	}
}
