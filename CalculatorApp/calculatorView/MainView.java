package calculatorView;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainView extends JFrame
{
	private JPanel mainPanel = new JPanel();
	private JPanel calculationPanel = new JPanel();
	private JPanel resultsPanel = new JPanel();
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
		setPreferredSize(new Dimension(350, 400));
		setTitle("Calculator");
	}
	
	private void initialUI()
	{
		addCalculation();
		addResult();
		addNumberButtons();
		addOperationButtons();
	}

	private void addOperationButtons()
	{
		
	}

	private void addNumberButtons()
	{
		
	}

	private void addResult()
	{
		
	}

	private void addCalculation()
	{
		
	}
}
