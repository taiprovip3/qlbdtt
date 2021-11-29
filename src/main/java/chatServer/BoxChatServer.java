package chatServer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import gui.Menu;
import util.GetLocalTime;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.TextField;
import java.net.InetAddress;
import java.rmi.AccessException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BoxChatServer extends JFrame {

	private JPanel contentPane;
	private JTextArea taLog, taConnected, taMessage, taContent;
	private JTextField txtIp;
	private InetAddress IP;
	private ChatImpl chatImpl;

	/**
	 * Launch the application.
	 */
	public void loadKhoiTao() {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);
			taLog.append("- Starting serverSide chat...\n");
			registry.rebind("chatServer", new ChatImpl()); //creates the remote object and registers it
	        taLog.append("\n- ServerChat successfully started!\n");
	        
	        //IP
	        IP=InetAddress.getLocalHost();
	        txtIp.setText(IP.toString());
	        String username = IP.getHostName();
	        taConnected.append("- "+username+" (joined)");
	        chatImpl = new ChatImpl();
	        boolean a = chatImpl.login(username);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxChatServer frame = new BoxChatServer();
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
	public BoxChatServer() {
		setTitle("VNSPORT > Menu > BoxChat tr\u1EF1c tuy\u1EBFn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 854, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "N\u1ED9i dung chat:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 585, 277);
		contentPane.add(panel);
		panel.setLayout(null);
		
		taContent = new JTextArea();
		taContent.setEditable(false);
		taContent.setBounds(10, 21, 565, 245);
		panel.add(taContent);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Client \u0111ang k\u1EBFt n\u1ED1i:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(582, 0, 256, 277);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton taReload = new JButton("T\u1EA3i l\u1EA1i");
		taReload.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		taReload.setBounds(87, 243, 88, 34);
		panel_1.add(taReload);
		
		taConnected = new JTextArea();
		taConnected.setEditable(false);
		taConnected.setBounds(10, 21, 236, 220);
		panel_1.add(taConnected);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 277, 838, 229);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		taMessage = new JTextArea();
		taMessage.setBounds(10, 148, 719, 81);
		panel_2.add(taMessage);
		
		JButton btnSend = new JButton("G\u1EEDi");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(taMessage.getText().equals(""))
					JOptionPane.showMessageDialog(contentPane, "(!) Tin nhắn rỗng");
				else {
					try {
						Message message = new Message();
						message.setUsername(IP.getHostName());
						message.setMsg(taMessage.getText());
						message.setDate(new Date());
						message.setType("msg");
						message.setSmiley(":)");
						chatImpl.addMessage(message);
						taContent.append(""+message.getUsername()+":  "+message.getMsg()+"\n");
						taMessage.setText("");
					} catch (RemoteException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		btnSend.setForeground(new Color(0, 128, 128));
		btnSend.setBackground(Color.GREEN);
		btnSend.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnSend.setBounds(739, 156, 89, 41);
		panel_2.add(btnSend);
		
		JLabel lblNewLabel = new JLabel("\u0110\u1ECBa ch\u1EC9 server:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 9, 104, 16);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Logs:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 28, 46, 22);
		panel_2.add(lblNewLabel_1);
		
		taLog = new JTextArea();
		taLog.setEditable(false);
		taLog.setBounds(10, 51, 818, 94);
		panel_2.add(taLog);
		
		JLabel lblNewLabel_2 = new JLabel("(nh\u1EA5n Enter)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(739, 204, 89, 25);
		panel_2.add(lblNewLabel_2);
		
		JButton btnBack = new JButton("Quay l\u1EA1i");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu mn = new Menu();
				mn.main(null);
				dispose();
			}
		});
		btnBack.setBackground(Color.RED);
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnBack.setBounds(718, 9, 110, 34);
		panel_2.add(btnBack);
		
		JLabel lblTime = new JLabel("New label");
		lblTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTime.setBounds(536, 9, 104, 14);
		panel_2.add(lblTime);
		
		JLabel lblDate = new JLabel("New label");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDate.setBounds(536, 28, 104, 14);
		panel_2.add(lblDate);
		
		txtIp = new JTextField();
		txtIp.setEditable(false);
		txtIp.setBounds(124, 7, 261, 25);
		panel_2.add(txtIp);
		txtIp.setColumns(10);
		
		//Code tay
		GetLocalTime getLocalTime = new GetLocalTime(lblDate, lblTime);
		getLocalTime.showTime();
		getLocalTime.showDate();
		loadKhoiTao();
	}
}
