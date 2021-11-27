package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import entity.NhaCungCap;
import entity.PhanLoai;
import entity.SanPham;
import javassist.bytecode.analysis.Frame;
import util.GetLocalTime;
import util.HibernateUtil;

import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class QuanLyKhoHang_them extends JFrame {

	private JPanel contentPane;
	private JTextField txtMaSanPham;
	private JTextField txtName;
	private JTextField txtAmount;
	private JTextField txtPrice;
	private JLabel lblMaSanPham;
	private final JTextPane tpOutputMaSP;
	private JTextField txtDes;
	private JComboBox<String> cbSup, cbCate; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyKhoHang_them frame = new QuanLyKhoHang_them();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
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
	public QuanLyKhoHang_them() {
		setTitle("VNSPORT > menu > Qu\u1EA3n l\u00FD kho h\u00E0ng > th\u00EAm m\u1EDBi");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "M\u00E3 s\u1EA3n ph\u1EA9m:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(0, 0, 762, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ho\u1EB7c");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(10, 34, 166, 32);
		panel.add(lblNewLabel);
		
		txtMaSanPham = new JTextField();
		txtMaSanPham.setEditable(false);
		txtMaSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtMaSanPham.setBounds(10, 13, 355, 23);
		panel.add(txtMaSanPham);
		txtMaSanPham.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Output", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(668, 13, 90, 71);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		tpOutputMaSP = new JTextPane();
		tpOutputMaSP.setEditable(false);
		tpOutputMaSP.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		tpOutputMaSP.setBounds(6, 16, 78, 44);
		panel_1.add(tpOutputMaSP);
		
		JButton btnGetMaSP = new JButton("");
		btnGetMaSP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tpOutputMaSP.setText(txtMaSanPham.getText());
			}
		});
		btnGetMaSP.setIcon(new ImageIcon("F:\\Hoc ki 3\\Java Phan Tan\\Project-JavaPT\\qlbdtt_artifact\\data\\icon\\arrow.png"));
		btnGetMaSP.setBounds(386, 13, 33, 23);
		panel.add(btnGetMaSP);
		
		final JCheckBox chkMaSanPham = new JCheckBox("Tự động nhận mã liền cuối:");
		chkMaSanPham.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chkMaSanPham.isSelected())
				{
					txtMaSanPham.setEditable(false);
					tpOutputMaSP.setText(lblMaSanPham.getText());
				}
				else
				{
					txtMaSanPham.setEditable(true);
					tpOutputMaSP.setText("");
				}
			}
		});
		chkMaSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chkMaSanPham.setBounds(10, 62, 223, 23);
		panel.add(chkMaSanPham);
		chkMaSanPham.setSelected(true);
		
		JLabel lblNewLabel_1 = new JLabel("Nh\u1EADp t\u00EAn s\u1EA3n ph\u1EA9m:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 99, 355, 20);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setBounds(10, 117, 355, 27);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nh\u1EADp s\u1ED1 l\u01B0\u1EE3ng:");
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 143, 355, 20);
		contentPane.add(lblNewLabel_1_1);
		
		txtAmount = new JTextField();
		txtAmount.setColumns(10);
		txtAmount.setBounds(10, 161, 355, 27);
		contentPane.add(txtAmount);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nh\u1EADp \u0111\u01A1n gi\u00E1");
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 190, 97, 20);
		contentPane.add(lblNewLabel_1_2);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(10, 208, 355, 27);
		contentPane.add(txtPrice);
		
		JLabel lblNewLabel_2 = new JLabel("Kh\u00F4ng th\u00EAm c\u00E1c k\u00FD t\u1EF1 nh\u01B0 \".\" v\u00E0 \",\"");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_2.setBounds(113, 190, 252, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Môn chuyên Dụng:");
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 236, 139, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ch\u1ECDn nh\u00E0 cung c\u1EA5p:");
		lblNewLabel_1_4.setForeground(Color.BLUE);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(10, 327, 355, 20);
		contentPane.add(lblNewLabel_1_4);
		
		final JComboBox cbSup = new JComboBox();
		cbSup.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbSup.setModel(new DefaultComboBoxModel(new String[] {"NCC1", "NCC2", "NCC3", "NCC4", "NCC5", "NCC6", "NCC7", "NCC8", "NCC9", "NCC10"}));
		cbSup.setBounds(10, 345, 355, 27);
		contentPane.add(cbSup);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Ph\u00E2n lo\u1EA1i cho SP:");
		lblNewLabel_1_4_1.setForeground(Color.BLUE);
		lblNewLabel_1_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_4_1.setBounds(10, 372, 355, 20);
		contentPane.add(lblNewLabel_1_4_1);
		
		final JComboBox cbCate = new JComboBox();
		cbCate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbCate.setModel(new DefaultComboBoxModel(new String[] {"Bán lẽ", "Bán sỉ", "Hàng tặng", "Đặc biệt", "For sale", "Dễ vỡ", "Nguy hiểm", "Thịnh hành", "Điện tử", "Gia công"}));
		cbCate.setBounds(10, 389, 355, 27);
		contentPane.add(cbCate);
		
		JButton btnNewButton_1 = new JButton("Th\u00EAm s\u1EA3n ph\u1EA9m");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//**THÊM				
				if(kiemTraNhapLieu())
				{
					System.out.println("Mã SP ok");
					SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
					Session session = sessionFactory.getCurrentSession();
					
					Transaction tr = session.getTransaction(); 
					try {
						tr.begin();
							String maSP = tpOutputMaSP.getText();
							NhaCungCap getNCC = new NhaCungCap();
							getNCC = session.createNativeQuery("SELECT * FROM NhaCungCap WHERE  maSanPham",NhaCungCap.class).getSingleResult();
							System.out.println(getNCC);
							
							
//							String tenSP = txtName.getText();
//							int soLuong = Integer.parseInt(txtAmount.getText());
//							Float donGia = Float.parseFloat(txtPrice.getText());
//							List<String> lsTheThao = Arrays.asList("Bóng đá", "Bóng chuyền");
//							String moTa = txtDes.getText();
//							String maNcc = cbSup.getSelectedItem().toString();
//							String maPl = cbCate.getSelectedItem().toString();
//							NhaCungCap ncc = new NhaCungCap(maNcc, "ten doi tac", "quoc gia", "0338188506", Arrays.asList("Gậy bóng chày", "Gậy cầu lông", "Banh tenis", "Bóng da", "Đồ bơm bóng"));
//							PhanLoai pl = new PhanLoai(maPl, "ten Phan Loai", "mo ta");
//							SanPham sp = new SanPham(maSP, tenSP, soLuong, donGia, lsTheThao, moTa, ncc, pl);
//							session.save(sp);
						tr.commit();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}else 
					System.out.println("Dữ liệu nhập vào có chỗ sai định dạng hoặc bỏ trống");
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBounds(10, 440, 156, 44);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 427, 655, 12);
		contentPane.add(separator);
		
		JButton btnNewButton_1_1 = new JButton("X\u00F3a r\u1ED7ng field");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaSanPham.setText("");
				chkMaSanPham.setSelected(false);
				txtName.setText("");
				txtAmount.setText("");
				txtPrice.setText("");
				txtDes.setText("");
				cbSup.setSelectedIndex(0);
				cbCate.setSelectedIndex(0);
				tpOutputMaSP.setText("");
			}
		});
		btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1_1.setForeground(Color.GREEN);
		btnNewButton_1_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1_1.setBounds(176, 440, 156, 44);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("\u0110\u00F3ng");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//Tải lại table QLKHmenu
			}
		});
		btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1_2.setForeground(new Color(255, 255, 255));
		btnNewButton_1_2.setBackground(new Color(255, 0, 0));
		btnNewButton_1_2.setBounds(665, 468, 97, 27);
		contentPane.add(btnNewButton_1_2);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(665, 440, 97, 20);
		contentPane.add(lblDate);
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setBounds(665, 419, 97, 20);
		contentPane.add(lblTime);
		//code tay
		GetLocalTime getLocalTime = new GetLocalTime(lblDate, lblTime);
		getLocalTime.showTime();
		getLocalTime.showDate();
		//code tay
		
		lblMaSanPham = new JLabel("SP11");
		lblMaSanPham.setForeground(Color.GREEN);
		lblMaSanPham.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMaSanPham.setBounds(239, 63, 65, 23);
		panel.add(lblMaSanPham);
		tpOutputMaSP.setText(lblMaSanPham.getText());
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Thêm mô tả:");
		lblNewLabel_1_3_1.setForeground(Color.BLUE);
		lblNewLabel_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_3_1.setBounds(10, 278, 93, 20);
		contentPane.add(lblNewLabel_1_3_1);
		
		txtDes = new JTextField();
		txtDes.setColumns(10);
		txtDes.setBounds(10, 296, 355, 27);
		contentPane.add(txtDes);
		
		JComboBox cbChuyenMon = new JComboBox();
		cbChuyenMon.setModel(new DefaultComboBoxModel(new String[] {"Bóng đá", "Bóng rỗ", "Bóng chày", "Quần vợt", "Bóng bàn", "Bóng chuyền", "Cầu lông", "Bóng bầu dục", "Golf", "Không xác định"}));
		cbChuyenMon.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		cbChuyenMon.setBounds(10, 255, 355, 27);
		contentPane.add(cbChuyenMon);
	}
	private boolean kiemTraNhapLieu() {
		String maSP = tpOutputMaSP.getText();
		String tenSP = txtName.getText();
		String soLuong = txtAmount.getText();
		String donGia = txtPrice.getText();
		String moTa = txtDes.getText();
		
//		String 
		if(!maSP.matches("(SP|sp)[0-9]{1,}"))
		{
			JOptionPane.showMessageDialog(contentPane, "Mã ko đc rỗng & theo mẫu: 'SP99'");
			return false;
		}
		if(tenSP.length() <= 0)
		{
			JOptionPane.showInternalMessageDialog(contentPane, "Tên sản phẩm ko đc rỗng");
			return false;
		}
		if(donGia.length() <= 0 || !donGia.matches("[0-9]{1,}"))
		{
			JOptionPane.showMessageDialog(contentPane, "Đơn giá ko đc rỗng & chỉ toàn là con số!");
			return false; 
		}
		if(moTa.length() <= 0)
		{
			JOptionPane.showMessageDialog(contentPane, "Vui lòng nhập mô tả cho SP");
			return false;
		}
		return true;
	}
}
