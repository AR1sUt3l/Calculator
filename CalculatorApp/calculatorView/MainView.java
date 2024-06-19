package calculatorView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame
{
	private JPanel mainPanel = new JPanel();
	private JPanel calculationPanel = new JPanel();
	private JPanel resultsPanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	private JPanel numbersPanel = new JPanel();
	private JPanel operationsPanel = new JPanel();
	
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
		mainPanel.setLayout(new GridLayout(3,1));
		addCalculation();
		addResult();
		addOperationButtons();
		addNumberButtons();
		add(mainPanel);
	}

	private void addCalculation()
	{
		calculationPanel.setBackground(Color.WHITE);
		mainPanel.add(calculationPanel);
	}
	
	private void addResult()
	{
		resultsPanel.setBackground(Color.WHITE);
		mainPanel.add(resultsPanel);
	}
	
	private void addOperationButtons()
	{
		operationsPanel.setLayout(new GridLayout(2,2));
		operationsPanel.add(new JButton("+"));
		operationsPanel.add(new JButton("-"));
		operationsPanel.add(new JButton("x"));
		operationsPanel.add(new JButton("/"));
		buttonsPanel.add(operationsPanel);
	}
	
	private void addNumberButtons()
	{
		numbersPanel.setLayout(new GridLayout(4,3));
		numbersPanel.add(new JButton("1"));
		numbersPanel.add(new JButton("2"));
		numbersPanel.add(new JButton("3"));
		numbersPanel.add(new JButton("4"));
		numbersPanel.add(new JButton("5"));
		numbersPanel.add(new JButton("6"));
		numbersPanel.add(new JButton("7"));
		numbersPanel.add(new JButton("8"));
		numbersPanel.add(new JButton("9"));
		numbersPanel.add(new JButton("0"));
		numbersPanel.add(new JButton("."));
		numbersPanel.add(new JButton("="));
		buttonsPanel.add(numbersPanel);
		mainPanel.add(buttonsPanel);
	}
	
	private class NumberButtonListener extends ActionListener
	{
		
	}
	
	public static void main(String[] args)
	{
		new MainView();
	}
}
