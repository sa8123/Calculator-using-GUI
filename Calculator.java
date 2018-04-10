package Calculators;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnP;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnSub;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnMul;
	private JButton btn0;
	private JButton btnDot;
	private JButton btnPM;
	private JButton btnEqual;
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;
	private JButton btnC;
	private JMenuBar menuBar;
	private JMenuItem mntmNew;
	private JMenuItem mntmExit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try 
				{
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 235, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 16, 218, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//------------Row 1---------------//
		btn7 = new JButton("7");
		btn7.setToolTipText("Number 7");
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setToolTipText("Number 8");
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
				
			}
		});
		btn8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn8.setBounds(66, 54, 50, 50);
		frame.getContentPane().add(btn8);
		
		
		btn9 = new JButton("9");
		btn9.setToolTipText("Number 9");
		btn9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn9.setBounds(122, 54, 50, 50);
		frame.getContentPane().add(btn9);
		
		
		btnP = new JButton("+");
		btnP.setToolTipText("Plus");
		btnP.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnP.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnP.setBounds(178, 54, 50, 50);
		frame.getContentPane().add(btnP);
		
		//-------------------Row 2----------------------//
		btn4 = new JButton("4");
		btn4.setToolTipText("Number 4");
		btn4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setToolTipText("Number 5");
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn5.setBounds(66, 110, 50, 50);
		frame.getContentPane().add(btn5);
		
		
		btn6 = new JButton("6");
		btn6.setToolTipText("Number 6");
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn6.setBounds(122, 110, 50, 50);
		frame.getContentPane().add(btn6);
		
		
		btnSub = new JButton("-");
		btnSub.setToolTipText("Minus");
		btnSub.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnSub.setBounds(178, 110, 50, 50);
		frame.getContentPane().add(btnSub);
		//----------------Row 3------------------//
		
		btn1 = new JButton("1");
		btn1.setToolTipText("Number 1");
		btn1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn1.setBounds(10, 166, 50, 50);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setToolTipText("Number 2");
		btn2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn2.setBounds(66, 166, 50, 50);
		frame.getContentPane().add(btn2);
		
		
		btn3 = new JButton("3");
		btn3.setToolTipText("Number 3");
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn3.setBounds(122, 166, 50, 50);
		frame.getContentPane().add(btn3);
		
		
		btnMul = new JButton("*");
		btnMul.setToolTipText("Multiply");
		btnMul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnMul.setBounds(178, 166, 50, 50);
		frame.getContentPane().add(btnMul);
		
		//-------------Row 4------------//
		
		btn0 = new JButton("0");
		btn0.setToolTipText("Number 0");
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btn0.setBounds(10, 222, 50, 50);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.setToolTipText("point");
		btnDot.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnDot.setBounds(66, 222, 50, 50);
		frame.getContentPane().add(btnDot);
		
		
		btnPM = new JButton("/");
		btnPM.setToolTipText("Divide");
		btnPM.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnPM.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnPM.setBounds(122, 222, 50, 50);
		frame.getContentPane().add(btnPM);
		
		
		btnEqual = new JButton("=");
		btnEqual.setToolTipText("Divide");
		btnEqual.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				secondNum = Double.parseDouble(textField.getText());
				if (operations == "+")
				{
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "-")
				{
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if (operations == "*")
				{
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/")
				{
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqual.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		btnEqual.setBounds(178, 222, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		btnC = new JButton("C");
		btnC.setToolTipText("Reset");
		btnC.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		btnC.setBounds(10, 276, 218, 50);
		frame.getContentPane().add(btnC);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(213, 18, 15, 22);
		frame.getContentPane().add(scrollBar);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(66, 291, 146, 20);
		frame.getContentPane().add(progressBar);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
			}
		});
		mnFile.add(mntmNew);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		mntmExit = new JMenuItem("exit");
		mntmExit.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		mnExit.add(mntmExit);
	}
}
