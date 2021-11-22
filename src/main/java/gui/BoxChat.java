package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class BoxChat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxChat frame = new BoxChat();
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
	public BoxChat() {
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
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(10, 21, 565, 245);
		panel.add(textArea_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Client \u0111ang k\u1EBFt n\u1ED1i:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(582, 0, 256, 277);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("T\u1EA3i l\u1EA1i");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(87, 243, 88, 34);
		panel_1.add(btnNewButton);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(10, 21, 236, 220);
		panel_1.add(textArea_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 277, 838, 229);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 148, 719, 81);
		panel_2.add(textArea);
		
		JButton btnNewButton_1 = new JButton("G\u1EEDi");
		btnNewButton_1.setForeground(new Color(0, 128, 128));
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(739, 156, 89, 41);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\u0110\u1ECBa ch\u1EC9 server:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 9, 104, 16);
		panel_2.add(lblNewLabel);
		
		TextField textField = new TextField();
		textField.setEditable(false);
		textField.setBounds(120, 11, 241, 22);
		panel_2.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Logs:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 28, 46, 22);
		panel_2.add(lblNewLabel_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(10, 51, 818, 94);
		panel_2.add(textArea_2);
		
		JLabel lblNewLabel_2 = new JLabel("(nh\u1EA5n Enter)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_2.setBounds(739, 204, 89, 25);
		panel_2.add(lblNewLabel_2);
		
		JButton btnNewButton_2 = new JButton("Quay l\u1EA1i");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(718, 9, 110, 34);
		panel_2.add(btnNewButton_2);
	}
}
