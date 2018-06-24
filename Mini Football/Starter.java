import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Starter extends JFrame {
	JRadioButton Box1,Box2,Box3,Box4,Box5,Box6,Box7,Box8,Box9,Box10,Box11,Box12,Box13,Box14;
	private int B_WIDTH=700;
	private int B_HEIGHT=1030;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static ButtonGroup myButtonGroup1;
	private static ButtonGroup myButtonGroup2;
	//default character is Bob
	public String character1="Spongebob";
	public String character2="Spongebob";
	public static final int getNumberOfGoals() {
		try {
        	return Integer.parseInt(textField_2.getText());	
		}catch(NumberFormatException ex) {
			return 10;
		}	
	}
	public static String getNameOfPlayer1() {
		return textField.getText();
	}
	public   static String getNameOfPlayer2() {
		return textField_1.getText();
	}
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Starter frame = new Starter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});		
	}
	public Starter() {
		getContentPane().setEnabled(false);
		setResizable(false);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		getContentPane().setBackground(new Color(222, 184, 135));
		setBackground(new Color(128, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(96, 40, 200, 49);
		getContentPane().add(lblNewLabel);
		
		JLabel lblPlayer = new JLabel("Player 2");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPlayer.setBounds(408, 40, 200, 49);
		getContentPane().add(lblPlayer);
		
		JLabel lblName = new JLabel("Enter your names");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(36, 100, 170, 25);
		getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(96, 140, 140, 34);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(408, 140, 140, 34);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		//labels:
		JLabel lblChoseYourAvatar = new JLabel("Choose your avatar");
		lblChoseYourAvatar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblChoseYourAvatar.setBounds(36, 190, 187, 25);
		getContentPane().add(lblChoseYourAvatar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("img\\1spong.png"));
		label.setBounds(36, 220, 102, 80);
		getContentPane().add(label);
		
		JLabel label2 = new JLabel("");
		label2.setIcon(new ImageIcon("img\\2spong.png"));
		label2.setBounds(506, 220, 102, 80);
		getContentPane().add(label2);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon("img\\1patric.jpg"));
		label3.setBounds(36, 320, 102, 80);
		getContentPane().add(label3);
		
		JLabel label4 = new JLabel("");
		label4.setIcon(new ImageIcon("img\\1patric.png"));
		label4.setBounds(506, 320, 102, 80);
		getContentPane().add(label4);
		
		JLabel label5 = new JLabel("");
		label5.setIcon(new ImageIcon("img\\1kalamar.jpeg"));
		label5.setBounds(36, 420, 102, 80);
		getContentPane().add(label5);
		
		JLabel label6 = new JLabel("");
		label6.setIcon(new ImageIcon("img\\1kalamar.jpeg"));
		label6.setBounds(506, 420, 102, 80);
		getContentPane().add(label6);
		
		JLabel label7 = new JLabel("");
		label7.setIcon(new ImageIcon("img\\1garys.png"));
		label7.setBounds(36, 520, 102, 80);
		getContentPane().add(label7);
		
		JLabel label8 = new JLabel("");
		label8.setIcon(new ImageIcon("img\\2garys.png"));
		label8.setBounds(506, 520, 102, 80);
		getContentPane().add(label8);
		
		JLabel label9 = new JLabel("");
		label9.setIcon(new ImageIcon("img\\1sandy.png"));
		label9.setBounds(36, 620, 102, 80);
		getContentPane().add(label9);
		
		JLabel label10 = new JLabel("");
		label10.setIcon(new ImageIcon("img\\2sandy.png"));
		label10.setBounds(506, 620, 102, 80);
		getContentPane().add(label10);
		
		JLabel label11 = new JLabel("");
		
		label11.setIcon(new ImageIcon("img\\1mrkrab.jpg"));
		label11.setBounds(36, 720, 102, 80);
		getContentPane().add(label11);
		
		JLabel label12 = new JLabel("");
		label12.setIcon(new ImageIcon("img\\2mrkrab.jpg"));
		label12.setBounds(506, 720, 102, 80);
		getContentPane().add(label12);
		
		JLabel label13 = new JLabel("");
		label13.setIcon(new ImageIcon("img\\1plankton.png"));
		label13.setBounds(36, 820, 102, 80);
		getContentPane().add(label13);
		
		JLabel label14 = new JLabel("");
		label14.setIcon(new ImageIcon("img\\2plankton.png"));
		label14.setBounds(506, 820, 102, 80);
		getContentPane().add(label14);
		//end labels
		
		//check box
		Box1 = new JRadioButton("Spongebob",true);
		Box1.setBounds(146, 250, 100, 30);
		getContentPane().add(Box1);
		Box1.addActionListener ( new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							character1="Spongebob";
					}});
		
		Box2= new JRadioButton("Spongebob",true);
		Box2.setBounds(398, 250, 100, 30);
		getContentPane().add(Box2);
		Box2.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Spongebob";
			}});
		
		Box3= new JRadioButton("Patrick Star");
		Box3.setBounds(146, 350, 100, 30);
		getContentPane().add(Box3);
		Box3.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Patrick Star";
			}});
		Box4= new JRadioButton("Patrick Star");
		Box4.setBounds(398, 350, 100, 30);
		getContentPane().add(Box4);
		Box4.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Patrick Star";
			}});
		Box5= new JRadioButton("Skalmar");
		Box5.setBounds(146, 450, 100, 30);
		getContentPane().add(Box5);
		Box5.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Skalmar";
			}});
		Box6= new JRadioButton("Skalmar");
		Box6.setBounds(398, 450, 100, 30);
		getContentPane().add(Box6);
		Box6.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Skalmar";
			}});

		Box7= new JRadioButton("Gary");
		Box7.setBounds(146, 550, 100, 30);
		getContentPane().add(Box7);
		Box7.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Gary";
			}});
		Box8= new JRadioButton("Gary");
		Box8.setBounds(398, 550, 100, 30);
		getContentPane().add(Box8);
		Box8.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Gary";
			}});

		Box9= new JRadioButton("Sandy");
		Box9.setBounds(146, 650, 100, 30);
		getContentPane().add(Box9);
		Box9.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Sandy";
			}});
		Box10= new JRadioButton("Sandy");
		Box10.setBounds(398, 650, 100, 30);
		getContentPane().add(Box10);
		Box10.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Sandy";
			}});
		Box11= new JRadioButton("Mr krab");
		Box11.setBounds(146, 750, 100, 30);
		getContentPane().add(Box11);
		Box11.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Mr krab";
			}});
		Box12= new JRadioButton("Mr krab");
		Box12.setBounds(398, 750, 100, 30);
		getContentPane().add(Box12);
		Box12.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Mr krab";
			}});
		Box13= new JRadioButton("Plankton");
		Box13.setBounds(146, 850, 100, 30);
		getContentPane().add(Box13);
		Box13.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character1="Plankton";
			}});
		Box14= new JRadioButton("Plankton");
		Box14.setBounds(398, 850, 100, 30);
		getContentPane().add(Box14);
		Box14.addActionListener ( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					character2="Plankton";
			}});
		//SetUp a ButtonGroup to ensure  exclusive selection for avatar 1
				myButtonGroup1 = new ButtonGroup();
		        myButtonGroup1.add(Box1);
		        myButtonGroup1.add(Box3);
		        myButtonGroup1.add(Box5);
		        myButtonGroup1.add(Box7);
		        myButtonGroup1.add(Box9);
		        myButtonGroup1.add(Box11);
		        myButtonGroup1.add(Box13);
		        
		//SetUp a ButtonGroup to ensure  exclusive selection for avatar 2
				myButtonGroup2 = new ButtonGroup();
		        myButtonGroup2.add(Box2);
		        myButtonGroup2.add(Box4);
		        myButtonGroup2.add(Box6);
		        myButtonGroup2.add(Box8);
		        myButtonGroup2.add(Box10);
		        myButtonGroup2.add(Box12);
		        myButtonGroup2.add(Box14);
		JButton btnNewButton = new JButton("Start Game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 //EventQueue.invokeLater(() -> {
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
			        public void run() {
				    	FootballX ex = new FootballX(character1,character2);
				        ex.setVisible(true);
			        }
			    });
			}
		});
		btnNewButton.setForeground(new Color(128, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(494, 904, 200, 91);
		getContentPane().add(btnNewButton);
		
		JLabel lblNumberOfGoals = new JLabel("Number of goals");
		lblNumberOfGoals.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNumberOfGoals.setBounds(36, 926, 160, 25);
		getContentPane().add(lblNumberOfGoals);
		
		textField_2 = new JTextField();
		textField_2.setText("10");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setBounds(227, 922, 140, 34);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		pack();
	}
}
