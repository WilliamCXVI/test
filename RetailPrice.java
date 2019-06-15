import javax.swing.*;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.*;
public class RetailPrice extends JFrame{
	private final int WINDOW_WIDTH =700;
	private final int WINDOW_HEIGHT=500;
	
	private JPanel panel;
	private JLabel promptPrice;
	private JLabel promptPercent;
	private JTextField price;
	private JTextField percent;
	private JButton calcButton;
	
	public RetailPrice()
	{
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	private void buildPanel()
	{
		promptPrice = new JLabel("Enter a price"+
								 " in dollars.");
		promptPercent = new JLabel("Enter a "+
								 	"markup percent");
		price = new JTextField(10);
		percent = new JTextField(10);
		
		calcButton = new JButton("Calculate");
		calcButton.addActionListener(new CalcButtonListener() );
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.add(promptPrice);
		panel.add(price);
		panel.add(promptPercent);
		panel.add(percent);
		panel.add(calcButton);
		
		for (Component comp : panel.getComponents())
		{
			changeFont(comp,new Font("TimesRoman", Font.PLAIN, 28));
		}
	}
	
	private class CalcButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			double theprice = Double.parseDouble( price.getText() );
			double thepercent = Double.parseDouble( percent.getText() );
			double output = 0.01*theprice*thepercent;
			JOptionPane.showMessageDialog(null, "The item worth $"+theprice+
												" of a markup percent of "+thepercent+
												"% is "+(theprice+output));		
		}

	}
	
	public static void changeFont ( Component component, Font font )
	{
	    component.setFont ( font );
	    if ( component instanceof Container )
	    {
	        for ( Component child : ( ( Container ) component ).getComponents () )
	        {
	            changeFont ( child, font );
	        }
	    }
	}
	
	public static void main(String[] args) {
		UIManager.put("OptionPane.messageFont", new Font("TimesRoman", Font.PLAIN, 28));
		new RetailPrice();
	}
}
