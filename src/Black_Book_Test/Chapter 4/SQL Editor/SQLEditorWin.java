/*SQLEditorWin.java*/

package com.santosh.jdbc;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
/**
 * @author  Santosh
 */
public class SQLEditorWin extends Frame {
    
    /** Creates new form SQLEditorWin */
    public SQLEditorWin() {
        try{
			prepareConnection();
			initComponents();
        }catch(Exception e)
        {
            System.out.println("Problem while getting connection");
            System.exit(0);
        }//catch
    }
    
    void prepareConnection()throws Exception
    {
        Driver d=(Driver) Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();

		Properties p= new Properties();
		p.put("user", "scott");
		p.put("password", "tiger");

		Connection con=d.connect("jdbc:oracle:thin:@mysys:1521:sandb",p);
		st=con.createStatement();
    }//prepareConnection

    private void initComponents() {
        label1 = new Label();
        input = new TextField();
        label2 = new Label();
        output = new TextArea();

        setLayout(null);
        setTitle("SQL Editor");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setAlignment(Label.CENTER);
        label1.setFont(new Font("Arial", 1, 14));
        label1.setText("SQL Editor");
        add(label1);
        label1.setBounds(0, 40, 640, 40);

        input.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        add(input);
        input.setBounds(70, 100, 590, 30);

        label2.setAlignment(Label.RIGHT);
        label2.setText("SQL>");
        add(label2);
        label2.setBounds(0, 100, 70, 30);

        output.setBackground(new Color(255, 255, 255));
        output.setEditable(false);
        add(output);
        output.setBounds(10, 140, 660, 290);

        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new Dimension(670, 432));
        setLocation((screenSize.width-670)/2,(screenSize.height-432)/2);
		setResizable(false);
    }

    private void inputActionPerformed(ActionEvent evt) {
        try {
            if (input.getText().equals(""))
                throw new Exception("Invalid Query");
            boolean flag=st.execute(input.getText());
            if (flag)
            {
                displayResults();
            }//if
            else
            {
                output.setText(st.getUpdateCount()+" rows have been effected");
            }//else
        }//try
        catch(Exception e)
        {
            output.setText("");
            output.setText("Invalid Query");
            output.setText(e.getMessage());
            e.printStackTrace();
        }//catch
    }
    
    private void displayResults()throws SQLException
    {
		StringBuffer sb=new StringBuffer();
        rs=st.getResultSet();
        ResultSetMetaData rmd=rs.getMetaData();
        int count=rmd.getColumnCount();
        for (int i=1;i<=count;i++)
        {
			System.out.println(rmd.getColumnDisplaySize(i));

            sb.append(getString(rmd.getColumnName(i),rmd.getColumnDisplaySize(i)));
        }
        sb.append("\n");
        for (int i=1;i<=count;i++)
        {
            sb.append(getLines(rmd.getColumnDisplaySize(i)));
        }
        sb.append("\n");
        
        while (rs.next())
        {
            for (int i=1;i<=count;i++)
            {
                sb.append(getString(rs.getString(i),rmd.getColumnDisplaySize(i)));				
            }
            sb.append("\n");
        }//while
        
        sb.append(count+" rows selected");
		output.setText(sb.toString());
    }//displayresults
    
    private String getString(String s,int len)
    {
		if (s==null)
		{
			s="";
		}
        for(int i=s.length();i<=(len+5);i++)
        {
            s+=" ";
        }//for
        return s;
    }//getString
    
    private String getLines(int len)
    {
        String s="";
        for(int i=s.length();i<=(len);i++)
        {
            s+="-";
        }//for
        return s+"     ";
    }//getLines
    
    /** Exit the Application */
    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }
    
    public static void main(String args[]) {
        new SQLEditorWin().show();
    }//main
    
    // Variables declaration 
    private TextField input;
	private TextArea output;
    private Label label2,label1;
    
	private Connection con;
    private Statement st;
    private ResultSet rs;
	// End of variables declaration    
}//class