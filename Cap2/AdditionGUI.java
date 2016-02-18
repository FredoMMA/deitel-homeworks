package Cap2;

import javax.swing.JOptionPane;

public class AdditionGUI 
{
	public static void main(String[] args)
	{
		int x1, x2, sum;
		String number1 = JOptionPane.showInputDialog("Enter the first number");
		x1 = Integer.parseInt(number1);
		String number2 = JOptionPane.showInputDialog("Enter the second number");
		x2 = Integer.parseInt(number2);
		sum = x1 + x2;
		String result = String.format("The sum is: %d", sum);
		JOptionPane.showMessageDialog(null, result);
		
	}
}
