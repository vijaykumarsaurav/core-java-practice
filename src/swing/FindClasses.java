/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.plugin2.message.ShowDocumentMessage;

/**
 *
 * @author Vijay
 */
public class FindClasses extends javax.swing.JFrame {

    /**
     * Creates new form FindClasses
     */
    public FindClasses() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Finder");
        setBounds(new java.awt.Rectangle(250, 20, 0, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Enter full class name");

        t1.setBackground(new java.awt.Color(153, 153, 255));
        t1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 153));
        t1.setText("java.lang.String");
        t1.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        t1.setSelectionColor(new java.awt.Color(255, 255, 51));
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                t1MouseEntered(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        ta.setBackground(new java.awt.Color(255, 153, 255));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ta.setForeground(new java.awt.Color(0, 0, 153));
        ta.setRows(5);
        ta.setAlignmentX(200.0F);
        ta.setAlignmentY(200.0F);
        ta.setDisabledTextColor(new java.awt.Color(255, 0, 51));
        ta.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ta.setSelectionColor(new java.awt.Color(255, 255, 102));
        jScrollPane1.setViewportView(ta);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Get Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Developed by :-  Vijay Kumar : iamvijay101@gmail.com");
        jLabel2.setMaximumSize(new java.awt.Dimension(500, 14));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("Show with word");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 51));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        error.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 String filename = null;
 File dr ;
 String pack=null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                   try {
            Class c = null;
          
            File df[] =  dr.listRoots();
            dr =  new File(df[2].toString()+"Finder Classes\\");
            
             error.setText("");
             ta.setText("");
            try
            {
                String clas = t1.getText();
                c = Class.forName(clas);
                  	
               StringTokenizer st = new StringTokenizer(clas,".");
                while(st.hasMoreElements())
                {
                    for(int i=0;i<st.countTokens()-2;i++)
                        st.nextToken();             
                 
                    pack =  st.nextToken();             
                    filename = st.nextToken();
                    
                }
            }
            catch (ClassNotFoundException e)
            {   	
            	System.out.println("Class not found :");
         //   	JOptionPane.showMessageDialog(null,"Please enter appropiate class name with package ","Wrong", JOptionPane.ERROR);
                e.printStackTrace();
                error.setText("Please enter full class name  Example : java.lang.System ");
            }

            System.out.println("\nConstructors :\n============= ");
            //	Constructor cons[] =  c.getConstructors(); //only public constructor show
            Constructor cons[] = c.getDeclaredConstructors();
         
            OutputStreamWriter fout = null;
            try {
                fout = new FileWriter(dr+"\\"+filename+".doc");
            } catch (IOException ex) {
                Logger.getLogger(FindClasses.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            if(c.isInterface())
            {
             ta.append("Interface : "+filename+" \n\n");
             fout.write("Interface : "+filename+" \n\n");
            }
             else
             {
            	 ta.append("Class : "+filename+" \n\n");
            	 fout.write("Class : "+filename+" \n\n");
             }
                
             fout.write("\nConstructors :\n============= \n");
            ta.append("\nConstructors :\n============= \n");
            for (int i=0;i<cons.length;i++)
            {
                String constr =(i+1)+". "+cons[i]+"\n\n";
                System.out.println((i+1)+". "+cons[i]+"\n");
                ta.append(constr);
                String str = cons[i].toString();
                String sb = (i+1)+". " + str +"\n\n\n";
                fout.write(sb);
            }
            System.out.println("\nMethods : \n===========");
            
            
            //		Method md[] =  c.getMethods(); //only public method and all object methods
            Method md[] =  c.getDeclaredMethods();
            fout.write("\nMethods :\n============= \n");
            ta.append("\nMethods :\n============= \n");
            for (int i=0;i<md.length;i++)
            {       
                String msstr =(i+1)+". "+md[i]+"\n\n";
                
                System.out.println((i+1)+". "+md[i]+"\n");
                ta.append(msstr);
                String str = md[i].toString();
                String sb = (i+1)+". " + str +"\n\n\n";
                fout.write(sb);
            }
            
            
            System.out.println("\nFields : \n===========\n");
            fout.write("\nFields :\n============= \n");
            Field fld[] = c.getDeclaredFields();
            ta.append("\nFields : \n===========\n");
            for (int i=0;i<fld.length;i++)
            {
                String fistr = (i+1)+". "+fld[i]+"\n\n";
                System.out.println((i+1)+". "+fld[i]+"\n");
                ta.append(fistr);
                String str = fld[i].toString();
                String sb = (i+1)+". " + str +"\n\n\n";
                fout.write(sb);
            }
            ta.append("\n\n\n\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n\n You can also find from "+df[2].toString()+"Finder Classes\\"+filename+".doc");
            fout.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Please enter appropiate class name with package ","Wrong", JOptionPane.ERROR);
            Logger.getLogger(FindClasses.class.getName()).log(Level.SEVERE, null, ex);
        }		
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1KeyPressed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
    jButton1ActionPerformed(evt);        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseEntered

    private void t1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t1MouseClicked
t1.setText("java."+pack+".");        // TODO add your handling code here:
    }//GEN-LAST:event_t1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if(Desktop.isDesktopSupported())
{
    try
    {
      Desktop.getDesktop().open(new File(dr+"\\"+filename+".doc"));
    } catch (IOException ex) 
    {
        Logger.getLogger(FindClasses.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null,"Please enter appropiate class name with package ","Wrong", JOptionPane.ERROR);
                
    }
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
System.exit(1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args  the command line arguments
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
            java.util.logging.Logger.getLogger(FindClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindClasses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindClasses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables
}
