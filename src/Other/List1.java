import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class List1 extends JFrame implements  ActionListener

{
	private static final int EAST = 0;
	private static final int CENTER = 0;
	Label lb;
	JTextArea ta,res;
	int row,col;
	 String s1,s2,resstr="";Scrollbar redSlider;
	public List1()
	{
		setBounds(100,10,1000,700);
		setVisible(true);
		setLayout(new FlowLayout());
		redSlider=new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 255);
		 add(redSlider);
		// setExtendedState(MAXIMIZED_BOTH);
		 
		 lb= new Label("Enter or paste the test");
		// add(lb, BorderLayout.NORTH); 
		// add(new Label("Check and conform ",CENTER), BorderLayout.SOUTH);  
		 Button bb=new Button("Remove Space");
		 bb.addActionListener(this);
		 
		 ta= new JTextArea(30,10);
		 add(ta);
		 //, BorderLayout.WEST
		 add(bb);
		 //, BorderLayout.NORTH
		 res= new JTextArea(30,10);
		 
		 add(res);
		 //, BorderLayout.EAST
		 	setTitle("Space Removeal");
	}
	public void actionPerformed(ActionEvent arg0) 
	{	
	s1 = ta.getText();
	s1=s1+'\n';
	row = ta.getRows();
	col = ta.getColumns();
	s2="Row :"+row;
	lb.setText(s2);
	String join="",line="";
	for(int i=0;i<s1.length();i++)
	{
		char ch=s1.charAt(i);
		if(ch !='\n')
		{
		join=join+ch;
		}
		else 
		{
			for(int j=0;j<join.length();j++)
			{
				char sp=join.charAt(j);
				if(sp != ' ')
					line=line+sp;
			}			
			resstr=resstr+line+'\n';
///			JOptionPane.showMessageDialog(null, "Hi"+line, "Joined line without space", JOptionPane.DEFAULT_OPTION);
			line="";
	//	JOptionPane.showMessageDialog(null, join, "Show Data", JOptionPane.DEFAULT_OPTION);
		join="";
		
		}
	}
	res.setText(resstr);
		
	
	
//	ta.append("++++++");
//	ta.insert("Gautam Kumar",50);
	//JOptionPane.showMessageDialog(null, "Vijay Kumar" , "Show Data", JOptionPane.DEFAULT_OPTION);
	}

	
	public static void main(String a[])
	{
		new List1();
	}

	
	
}
