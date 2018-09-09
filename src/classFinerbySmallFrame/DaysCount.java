package swingtest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.*;

public class DaysCount extends JFrame implements ActionListener {

	 JTextField t1;
	JButton b1;

	public DaysCount()
	{
		setBounds(500,200, 300,130);
		setTitle("Find Class Details");
		setLayout(new BorderLayout());
		add(new JLabel("Enter the full java class name "),BorderLayout.NORTH);
		add(t1=new JTextField(),BorderLayout.CENTER);
		//t1.addKeyListener((KeyListener) this);
		add(b1=new JButton("Get Found"),BorderLayout.SOUTH);	
		setResizable(false);
		b1.addActionListener((ActionListener) this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		try {
			GetMembers.showAPI(t1.getText());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}


