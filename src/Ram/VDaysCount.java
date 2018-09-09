package Ram;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Display extends JFrame
{
	public Display()
	{
		setSize(400,300);
		this.setLayout(null);
		this.add(new JLabel("Enter the Stating date "));
		this.add(new JTextField());
		
		this.setVisible(true);
		
		
	}
}

public class VDaysCount {

	public static void main(String[] args) {
		
		new Display();
		
	}

}
