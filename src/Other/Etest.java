package Other;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Databases.mysql.DB;

/**
 *
 * @author Vijay
 */
public class Etest extends javax.swing.JFrame {

    public Etest() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MySql Editor");
        setBounds(new java.awt.Rectangle(300, 100, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MySql Editor");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("SQL>");

        input.setBackground(new java.awt.Color(204, 255, 204));
        input.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        input.setForeground(new java.awt.Color(0, 0, 204));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });
        input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputKeyTyped(evt);
            }
        });

        output.setBackground(new java.awt.Color(255, 204, 204));
        output.setColumns(20);
        output.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        output.setForeground(new java.awt.Color(0, 0, 153));
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Developed by : Vijay Kumar Mobile No  : 7204563432 ");
        jLabel3.setOpaque(true);

        jButton1.setText("History");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(input, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)))
        );

        pack();
    }// </editor-fold>                        

    private void inputKeyPressed(java.awt.event.KeyEvent evt) {                                 
    }                                

    private void inputKeyTyped(java.awt.event.KeyEvent evt) {                               

        
    }                              

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
    	File dr = null ;
    	String filename = null;
    	File df[] =  dr.listRoots();

    	dr =  new File(df[0].toString()+"MySql History\\");
    	System.out.println(dr);
    	Date d = new Date();
    	SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
    	String dat = sdf.format(d);
    	filename =dat;
    	OutputStreamWriter fout = null;
    	try {
    		fout = new FileWriter(dr+"\\"+filename+".doc");
    	} catch (IOException ex) {
    		//JOptionPane.showMessageDialog(null,"File not created ","Something Wrong", JOptionPane.ERROR);
    		output.append("File not created");
    	}

    	Connection con = null;
    	Statement 	st = null;
    	String tablename=null,name = null;
    	double salary = 0;		
    	try {
    		con = DB.openConnecion();
    		st = con.createStatement();
    		try {
    			fout.write("Our SQL editor connected to Mysql Database  ");
    		} catch (IOException ex) {
    		}
    		output.append("Our SQL editor connected to Mysql Database  ");
    	} catch (SQLException e1) 
    	{
    		e1.printStackTrace();
    		output.append("Connection error........  ");
    	}

    	//	System.out.println("Our SQL editor connected to Database  ");

    	try 
    	{	
    		output.setText("");
    		//System.out.print("\nSQL>");
    		String sql =input.getText();//new  Scanner(System.in).nextLine();		
    		if(st.execute(sql))
    		{
    			ResultSet rs2 =	st.getResultSet();
    			ResultSetMetaData rsm =  rs2.getMetaData();
    			System.out.println();
    			for(int i=1; i<=rsm.getColumnCount();i++)
    			{
    				//System.out.print(rsm.getColumnName(i)+"\t\t");
    				output.append(rsm.getColumnName(i)+"\t\t");
    				try {
    					fout.write(rsm.getColumnName(i)+"\t\t");
    				} catch (IOException ex) {
    				}
    			}
    			//System.out.println();
    			output.append("\n");
    			try {
    				fout.write("\n");
    			} catch (IOException ex) {
    			}
    			for(int i=1; i<=rsm.getColumnCount();i++)
    			{
    				//System.out.print("=================================");
    				output.append("========================");
    				try {
    					fout.write("========================");
    				} catch (IOException ex) {
    				}
    			}
    			//System.out.println();
    			output.append("\n");
    			try {
    				fout.write("\n");
    			} catch (IOException ex) {
    			}

    			while(rs2.next())
    			{
    				for (int ii=1;ii<=rsm.getColumnCount();ii++)
    				{
    					output.append(rs2.getString(ii)+"\t\t");
    					try {
    						fout.write(rs2.getString(ii)+"\t\t");
    						//System.out.print(rs2.getString(ii)+"\t\t");
    					} catch (IOException ex) {
    					}
    				}

    				output.append("\n\n");
    				try {
    					fout.write("\n\n");
    					//System.out.print(rs2.getString(ii)+"\t\t");
    				} catch (IOException ex) {
    				}
    			}
    		}
    		else
    		{
    			//System.out.println("No. of rows affected :"+st.getUpdateCount());
    			output.append("Number of rows affected :"+st.getUpdateCount());
    			fout.write("Number of rows affected :"+st.getUpdateCount());

    		}
    	}
    	catch (SQLException e) 
    	{
    		//	System.out.println(e.getMessage());
    		output.append(e.getMessage());
    		try {
    			fout.write(e.getMessage());

    			//	e.printStackTrace();
    		} catch (IOException ex) {
    		}
    	} catch (IOException ex) {
    	}

        // TODO add your handling code here:
    }                                     

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         

        


// TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Etest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Etest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Etest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Etest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Etest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea output;
    // End of variables declaration                   
}
