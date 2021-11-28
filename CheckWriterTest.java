package ch9java6thedition;
import javax.swing.JOptionPane;
/**
 * This tests the CheckWriter class.
 * 
 * @author craig
 */
public class CheckWriterTest {
	public static void main(String[]args) {
		String name, date, amount;

		name = JOptionPane.showInputDialog(null, "Enter the name on the check:");
		date = JOptionPane.showInputDialog(null, "Enter the date of the check:");
		amount = JOptionPane.showInputDialog(null, "Enter the amount of the check:");	
/*
		CheckWriter cw = new CheckWriter(name, date, amount); 
			
		JOptionPane.showMessageDialog(null, "---------------------------------------------------------------------------------------\n"
					     + "| Date:                                                                            " + cw.getDate() + "   |\n"
					     + "| Pay to the order of: 	" + cw.getName() + "                                        $" + cw.getAmount() + "     |\n"  
					     + "| "+ cw.wordAmount(amount) + "                      |\n"
					     + "----------------------------------------------------------------------------------------");	
*/
	}	
}
