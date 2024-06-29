package calculatorView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JFrame
{
	private JPanel mainPanel = new JPanel();
	private JPanel topPanel = new JPanel();
	private JPanel calculationPanel = new JPanel();
	private JPanel resultsPanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	private JPanel numbersPanel = new JPanel();
	private JPanel operationsPanel = new JPanel();
	
	private JLabel working = new JLabel();
	private JLabel results = new JLabel();
	
	private JButton plusButton = new JButton("+");
	private JButton minusButton = new JButton("-");
	private JButton timesButton = new JButton("x");
	private JButton divideButton = new JButton("/");
	
	private JButton oneButton = new JButton("1");
	private JButton twoButton = new JButton("2");
	private JButton threeButton = new JButton("3");
	private JButton fourButton = new JButton("4");
	private JButton fiveButton = new JButton("5");
	private JButton sixButton = new JButton("6");
	private JButton sevenButton = new JButton("7");
	private JButton eightButton = new JButton("8");
	private JButton nineButton = new JButton("9");
	private JButton zeroButton = new JButton("0");
	private JButton decimalPointButton = new JButton(".");
	private JButton equalButton = new JButton("=");
	
	public MainView()
	{
		initialFrame();
		initialUI();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setResizable(false);
		setVisible(true);
	}
	
	private void initialFrame()
	{
		setPreferredSize(new Dimension(600, 400));
		setTitle("Calculator");
	}
	
	private void initialUI()
	{
		mainPanel.setLayout(new GridLayout(2,1));
		addWorking();
		addButtons();
		add(mainPanel);
	}
	
	private void addWorking()
	{
		topPanel.setLayout(new BorderLayout());
		addCalculation();
		addResult();
		mainPanel.add(topPanel);
	}

	private void addCalculation()
	{
		calculationPanel.setBackground(Color.WHITE);
		calculationPanel.add(working);
		topPanel.add(calculationPanel, BorderLayout.CENTER);
	}
	
	private void addResult()
	{
		resultsPanel.setBackground(Color.WHITE);
		resultsPanel.add(results);
		topPanel.add(resultsPanel,BorderLayout.SOUTH);
	}
	
	private void addButtons()
	{
		buttonsPanel.setLayout(new GridLayout(1,2));
		addOperationButtons();
		addNumberButtons();
		mainPanel.add(buttonsPanel);
	}
	
	private void addOperationButtons()
	{
		operationsPanel.setLayout(new GridLayout(2,2));
		OperationButtonListener listener = new OperationButtonListener();
		plusButton.addActionListener(listener);
		minusButton.addActionListener(listener);
		timesButton.addActionListener(listener);
		divideButton.addActionListener(listener);
		operationsPanel.add(plusButton);
		operationsPanel.add(minusButton);
		operationsPanel.add(timesButton);
		operationsPanel.add(divideButton);
		buttonsPanel.add(operationsPanel);
	}
	
	private void addNumberButtons()
	{
		numbersPanel.setLayout(new GridLayout(4,3));
		NumberButtonListener listener = new NumberButtonListener();
		oneButton.addActionListener(listener);
		twoButton.addActionListener(listener);
		threeButton.addActionListener(listener);
		fourButton.addActionListener(listener);
		fiveButton.addActionListener(listener);
		sixButton.addActionListener(listener);
		sevenButton.addActionListener(listener);
		eightButton.addActionListener(listener);
		nineButton.addActionListener(listener);
		zeroButton.addActionListener(listener);
		decimalPointButton.addActionListener(listener);
		numbersPanel.add(oneButton);
		numbersPanel.add(twoButton);
		numbersPanel.add(threeButton);
		numbersPanel.add(fourButton);
		numbersPanel.add(fiveButton);
		numbersPanel.add(sixButton);
		numbersPanel.add(sevenButton);
		numbersPanel.add(eightButton);
		numbersPanel.add(nineButton);
		numbersPanel.add(zeroButton);
		numbersPanel.add(decimalPointButton);
		numbersPanel.add(equalButton);
		buttonsPanel.add(numbersPanel);
	}
	
	private class NumberButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String character = e.getActionCommand();
			String currentWorking = working.getText();
			currentWorking += character;
			working.setText(currentWorking);
			revalidate();
		}
		
	}
	
	private class OperationButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String character = e.getActionCommand();
			String currentWorking = working.getText();
			currentWorking += " " + character + " ";
			working.setText(currentWorking);
			revalidate();
		}
		
	}
	
	private class EqualButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			String currentWorking = working.getText();
//			char[] workingInArray = new char[currentWorking.length()];
//			for (int i = 0; i < currentWorking.length(); i++)
//			{
//				workingInArray[i] = currentWorking.charAt(i);
//			}
			int indexOfFirstSpace = currentWorking.indexOf(" ");
			int indexOfSecondSpace = currentWorking.lastIndexOf(" ");
			String number1 = "";
			
			
		}
		
	}
	
	public static void main(String[] args)
	{
		new MainView();
	}
}
