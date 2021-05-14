import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Calculate extends JFrame {

	private JPanel contentPane;
	private JTextField txtView;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculate frame = new Calculate();
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
	public Calculate() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 282, 312);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtView = new JTextField();
		txtView.setEditable(false);
		txtView.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtView.setBounds(10, 11, 185, 34);
		contentPane.add(txtView);
		txtView.setColumns(15);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSeven.setBounds(10, 56, 43, 43);
		contentPane.add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEight.setBounds(73, 56, 43, 43);
		contentPane.add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNine.setBounds(137, 56, 43, 43);
		contentPane.add(btnNine);
		
		JButton btnFour = new JButton("4");
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFour.setBounds(10, 110, 43, 43);
		contentPane.add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnFive.setBounds(73, 110, 43, 43);
		contentPane.add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSix.setBounds(137, 110, 43, 43);
		contentPane.add(btnSix);
		
		JButton btnOne = new JButton("1");
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOne.setBounds(10, 164, 43, 43);
		contentPane.add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnTwo.setBounds(73, 164, 43, 43);
		contentPane.add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnThree.setBounds(137, 164, 43, 43);
		contentPane.add(btnThree);
		
		JButton btnZero = new JButton("0");
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnZero.setBounds(10, 218, 43, 43);
		contentPane.add(btnZero);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(73, 218, 43, 43);
		contentPane.add(btnDot);
		
		JButton btnClear = new JButton("\u2190");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(205, 6, 51, 43);
		contentPane.add(btnClear);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEquals.setBounds(137, 218, 53, 43);
		contentPane.add(btnEquals);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(203, 164, 53, 43);
		contentPane.add(btnDivide);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnAdd.setBounds(203, 110, 53, 43);
		contentPane.add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMinus.setBounds(203, 56, 53, 43);
		contentPane.add(btnMinus);
		
		JButton btnMulti = new JButton("*");
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMulti.setBounds(203, 218, 53, 43);
		contentPane.add(btnMulti);
	}
}
