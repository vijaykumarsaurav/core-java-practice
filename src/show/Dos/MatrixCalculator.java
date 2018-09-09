package Dos;

/* ---------------------------------------------------------------------------
 *  Matrix Calculator - Java Application Version
 *  Original Date: October 1997
 *  Updated Swing GUI: June 2002
 *
 *  Version      : $Revision: 1.5 $
 *  Last Modified: $Date: 2002/06/14 06:28:10 $
 *
 *  Author: Marcus Kazmierczak
 *          marcus@mkaz.com
 *          http://www.mkaz.com/math/
 *
 *  Copyright (c) 1997-2002 mkaz.com
 *  Published under a BSD Open Source License
 *  More Info: http://mkaz.com/software/mklicense.html
 *
 *  --------------------------------------------------------------------------- 
 */
import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;


public class MatrixCalculator  
{

private boolean DEBUG = false;
private boolean INFO = true;

private static int max = 100;
private static int decimals = 3;

private JLabel statusBar;
private JTextArea taA, taB, taC;
private int iDF = 0;
private int n = 4;
private static NumberFormat nf;


public Component createComponents() 
{
    
    /*== MATRICES ==*/
    taA = new JTextArea();
    taB = new JTextArea();
    taC = new JTextArea();
    
   
    JPanel paneMs = new JPanel();
    paneMs.setLayout(new BoxLayout(paneMs, BoxLayout.X_AXIS));
    paneMs.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    paneMs.add(MatrixPane("Matrix A", taA));
    paneMs.add(Box.createRigidArea(new Dimension(10, 0)));
    paneMs.add(MatrixPane("Matrix B", taB));
    paneMs.add(Box.createRigidArea(new Dimension(10, 0)));
    paneMs.add(MatrixPane("Matrix C", taC));
   

    /*== OPERATION BUTTONS ==*/
    JPanel paneBtn = new JPanel();
    paneBtn.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    paneBtn.setLayout(new GridLayout(3,3));
    JButton btnApB = new JButton("A + B = C");
    JButton btnAmB = new JButton("A * B = C");
    JButton btnBmA = new JButton("B * A = C");
    JButton btnAdjA = new JButton("adjoint(A) = C");
    JButton btnInvA = new JButton("inverse(A) = C");
    JButton btnInvB = new JButton("inverse(B) = C");
    JButton btnTrnsA = new JButton("transpose(A) = C");
    JButton btnDetA = new JButton("determ(A) = C");
    JButton btnDetB = new JButton("determ(B) = C");
    paneBtn.add(btnApB);
    paneBtn.add(btnAmB);
    paneBtn.add(btnBmA);
    paneBtn.add(btnAdjA);
    paneBtn.add(btnInvA);
    paneBtn.add(btnInvB);
    paneBtn.add(btnTrnsA);
    paneBtn.add(btnDetA);
    paneBtn.add(btnDetB);
    
    /*== ADD BUTTON Listeners ==*/
    btnApB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(AddMatrix(ReadInMatrix(taA), ReadInMatrix(taB)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); }
        }
    });
    
    btnAmB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(MultiplyMatrix(ReadInMatrix(taA), ReadInMatrix(taB)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); }  
        }
    });

    btnBmA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt)
        { 
            try { DisplayMatrix(MultiplyMatrix(ReadInMatrix(taB), ReadInMatrix(taA)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); }
        }
    });

    btnInvA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(Inverse(ReadInMatrix(taA)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); } 
        }
    });

    btnInvB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(Inverse(ReadInMatrix(taB)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); }
        }
    });

    btnAdjA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(Adjoint(ReadInMatrix(taA)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); } 
        }
    });       
    
    btnTrnsA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { DisplayMatrix(Transpose(ReadInMatrix(taA)), taC); }
            catch(Exception e) { System.err.println("Error: " + e); } 
        }
    }); 

    btnDetA.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { taC.setText("Determinant A: " + nf.format(Determinant(ReadInMatrix(taA)))); }
            catch(Exception e) { System.err.println("Error: " + e); } 
        }
    }); 
    
    btnDetB.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) 
        { 
            try { taC.setText("Determinant B: " + nf.format(Determinant(ReadInMatrix(taB)))); }
            catch(Exception e) { System.err.println("Error: " + e); } 
        }
    });     
    

    /*== MAIN PANEL ==*/
    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder(5,5, 5, 5));
    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
    pane.add(paneMs);
    pane.add(paneBtn);
    
    JPanel fpane = new JPanel();
    fpane.setLayout(new BorderLayout());
    fpane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    fpane.add("Center", pane);
    statusBar = new JLabel("Ready");
    fpane.add("South", statusBar);
    
    return fpane;
}

/*== Setup Invidual Matrix Panes ==*/
private JPanel MatrixPane(String str, JTextArea ta)
{
    JScrollPane scrollPane= new JScrollPane(ta);
    int size = 200;
        
    scrollPane.setPreferredSize(new Dimension(size, size));
    JLabel label = new JLabel(str);
    label.setLabelFor(scrollPane);
    
    JPanel pane = new JPanel();
    pane.setBorder(BorderFactory.createEmptyBorder(5,5, 5, 5));
    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
    pane.add(label);
    pane.add(scrollPane);
    
    return pane;
}    

public static void main(String[] args) 
{
    JFrame frame = new JFrame("Matrix Calculator");
    frame.setSize(new Dimension(725,200));
    MatrixCalculator app = new MatrixCalculator();  
    
    Component contents = app.createComponents();
    frame.getContentPane().add(contents, BorderLayout.CENTER);
    frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    });
    frame.pack();
    frame.setVisible(true);
    
    nf = NumberFormat.getInstance();
    nf.setMinimumFractionDigits(1);
    nf.setMaximumFractionDigits(decimals); 
    
}


// ------------------------------------------------------------------------------ 
// ------------------------------------------------------------------------------ 

/*== NO MORE GUI CRAP -- LET'S DO SOME REAL WORK ==*/

// ------------------------------------------------------------------------------ 
// ------------------------------------------------------------------------------ 


public float[][] ReadInMatrix(JTextArea ta) throws Exception
{
    if (DEBUG) { System.out.println("Reading In Matrix"); }

    /*== Parse Text Area ==*/
    String rawtext = ta.getText();
    String val = "";
    int i=0; int j=0;
    int[] rsize = new int[max];
    
    /*== Determine Matrix Size/Valid ==*/
    StringTokenizer ts = new StringTokenizer(rawtext, "\n");
    while (ts.hasMoreTokens()) 
    {
        StringTokenizer ts2 = new StringTokenizer(ts.nextToken());
        while (ts2.hasMoreTokens()) { ts2.nextToken(); j++; }
        rsize[i] = j; i++; j=0;
    }
    statusBar.setText("Matrix Size: " + i);
    if ((DEBUG) || (INFO)) { System.out.println("Matrix Size: " + i); }
    
    for (int c=0; c < i; c++)
    {
        if (DEBUG) { System.out.println("i="+i+ "  j="+rsize[c] + "   Column: "+c); }
            
        if (rsize[c] != i) { 
            statusBar.setText("Invalid Matrix Entered. Size Mismatch."); 
            throw new Exception("Invalid Matrix Entered. Size Mismatch.");
        }
    }
    /*== set matrix size ==*/
    n = i;
     
    float matrix[][] = new float[n][n];
    i = j = 0; val="";
      
    /*== Do the actual parsing of the text now ==*/
    StringTokenizer st = new StringTokenizer(rawtext, "\n");
    while (st.hasMoreTokens()) 
    {
        StringTokenizer st2 = new StringTokenizer(st.nextToken());
        while (st2.hasMoreTokens())
        {
            val = st2.nextToken();
            try { matrix[i][j] = Float.valueOf(val).floatValue(); }
            catch (Exception exception) { statusBar.setText("Invalid Number Format"); }
            j++;
        }
        i++; j=0;
    }
 
    if (DEBUG)
    {
        System.out.println("Matrix Read::");
        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
                { System.out.print("m["+i+"]["+j+"] = " + matrix[i][j] + "   "); }
            System.out.println();
        }
    }
 
    return matrix;
}

//--------------------------------------------------------------
// Display Matrix in TextArea
//--------------------------------------------------------------
public void DisplayMatrix(float[][] matrix, JTextArea ta)
{

/*== TODO: Better Formatting of Resultant Matrix ==*/

    if (DEBUG) { System.out.println("Displaying Matrix"); }
    int tms = matrix.length;
    
    String rstr = ""; String dv = "";
    
    for (int i=0; i < tms; i++)
    {
        for (int j=0; j < tms; j++)
        {
            dv = nf.format(matrix[i][j]);
            rstr = rstr.concat(dv + "  ");
        }
        
        rstr = rstr.concat("\n");
    }
    
    ta.setText(rstr);
}



public float[][] AddMatrix(float[][] a, float[][] b) throws Exception
{
    int tms = a.length; int tmsB = b.length;
    if (tms != tmsB) { statusBar.setText("Matrix Size Mismatch"); }
    
    float matrix[][] = new float[tms][tms];

    for (int i=0; i < tms; i++)
    for (int j=0; j < tms; j++)
    {
        matrix[i][j] = a[i][j] + b[i][j];
    }

    return matrix;
}

//--------------------------------------------------------------
public float[][] MultiplyMatrix(float[][] a, float[][] b) throws Exception
{

    int tms = a.length; int tmsB = b.length;
    if (tms != tmsB) { statusBar.setText("Matrix Size Mismatch"); }
    
    float matrix[][] = new float[tms][tms];

    for (int i=0; i < tms; i++)
    for (int j=0; j < tms; j++) matrix[i][j]=0;

    for (int i=0; i < tms; i++)
    for (int j=0; j < tms; j++)
    {
        for (int p=0; p < tms; p++)
        matrix[i][j] += a[i][p]*b[p][j];
    }

    return matrix;
}
//--------------------------------------------------------------

public float[][] Transpose(float[][] a)
{
    if (INFO) { System.out.println("Performing Transpose..."); }
    int tms = a.length;
    
    float m[][] = new float[tms][tms];

    for (int i=0; i<tms; i++)
    for (int j=0; j<tms; j++)
    {
        m[i][j] = a[j][i];
    }

    return m;
}

//--------------------------------------------------------------

public float[][] Inverse(float[][] a) throws Exception
{
    // Formula used to Calculate Inverse:
    // inv(A) = 1/det(A) * adj(A)
    if (INFO) { System.out.println("Performing Inverse..."); }
    int tms = a.length;

    float m[][] = new float[tms][tms];
    float mm[][] =  Adjoint(a);

    float det = Determinant(a);
    float dd = 0;

    if (det == 0) 
    { 
        statusBar.setText("Determinant Equals 0, Not Invertible."); 
        if (INFO) { System.out.println("Determinant Equals 0, Not Invertible."); }
    }
    else
    {
        dd = 1/det;
    }
    
    for (int i=0; i < tms; i++)
    for (int j=0; j < tms; j++)
    {   m[i][j] = dd * mm[i][j]; }

    return m;
}

//--------------------------------------------------------------

public float[][] Adjoint(float[][] a) throws Exception
{
    if (INFO) { System.out.println("Performing Adjoint..."); }
    int tms = a.length;
    
    float m[][] = new float[tms][tms];

    int ii, jj, ia, ja;
    float det;

    for (int i=0; i < tms; i++)
    for (int j=0; j < tms; j++)
    {
        ia = ja = 0;

        float ap[][] = new float[tms-1][tms-1];

        for (ii=0; ii < tms; ii++)
        {
            for (jj=0; jj < tms; jj++)
            {
    
                if ((ii != i) && (jj != j))
                {
                    ap[ia][ja] = a[ii][jj];
                    ja++;
                }

            }
            if ((ii != i ) && (jj != j)) { ia++; } 
            ja=0; 
        }

        det = Determinant(ap);
        m[i][j] = (float)Math.pow(-1, i+j) * det;
    }

    m = Transpose(m);

    return m;
}

//--------------------------------------------------------------

public float[][] UpperTriangle(float[][] m)
{
    if (INFO) { System.out.println("Converting to Upper Triangle..."); }

    float f1 = 0;   float temp = 0;
    int tms = m.length;  // get This Matrix Size (could be smaller than global)
    int v=1;

    iDF=1;


    for (int col=0; col < tms-1; col++)
    {
        for (int row=col+1; row < tms; row++)
        {
            v=1;
    
            outahere:
            while(m[col][col] == 0)             // check if 0 in diagonal
            {                                   // if so switch until not
                if (col+v >= tms)               // check if switched all rows
                {   iDF=0;
                    break outahere; 
                }
                else
                {
                    for(int c=0; c < tms; c++)
                    {  temp = m[col][c];
                       m[col][c]=m[col+v][c];       // switch rows
                       m[col+v][c] = temp;   
                    }
                    v++;                            // count row switchs
                    iDF = iDF * -1;                 // each switch changes determinant factor
                }
            }

            if ( m[col][col] != 0 )
            {
                if (DEBUG) { System.out.println("tms = " + tms + "   col = " + col + "   row = " + row); }

try {
                f1 = (-1) * m[row][col] / m[col][col];
                for (int i=col; i < tms; i++) { m[row][i] = f1*m[col][i] + m[row][i]; }
}
catch(Exception e) { System.out.println("Still Here!!!"); }

            }
            
        }
    }

    return m;
}

//--------------------------------------------------------------

public float Determinant(float[][] matrix)
{
    if (INFO) { System.out.println("Getting Determinant..."); }
    int tms = matrix.length;
    
    float det=1;

    matrix = UpperTriangle(matrix);

    for (int i=0; i < tms; i++)
    {  det = det * matrix[i][i]; }      // multiply down diagonal

    det = det * iDF;                    // adjust w/ determinant factor

    if (INFO) { System.out.println("Determinant: " + det); }
    return det;
}


}


/*  Just some Test Matrices I use to copy and paste for testing

1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1

1 2 3 4
2 3 1 2
1 2 1 5
3 3 3 1


*/


