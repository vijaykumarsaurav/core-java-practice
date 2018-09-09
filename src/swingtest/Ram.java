package swingtest;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ram  extends JFrame implements ActionListener {

		static JTextField t1,t2;
		JTextArea ta;
		JButton b1;

		public Ram()
		{
			setSize(300,350);
			setLayout(new BorderLayout());
			add(new JLabel("Enter Starting date "),BorderLayout.NORTH);
			add(t1=new JTextField(),BorderLayout.NORTH);
			
			add(new JLabel("Enter ending date "),BorderLayout.LINE_END);
			add(t2=new JTextField(),BorderLayout.AFTER_LAST_LINE);
			
			add(ta = new JTextArea(5,5),BorderLayout.CENTER);
			
			add(b1=new JButton("Get Details"),BorderLayout.SOUTH);	
			setResizable(false);
			b1.addActionListener((ActionListener) this);
			setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			ta.setText(t1.getText());
		}

		public static void main(String[] args)
		{
			new Ram();
			
		}
}

