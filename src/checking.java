
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author BOSS
 */
public class checking extends javax.swing.JFrame {
    
    public static String tabTitle;
    
    public checking() {
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkPanel = new javax.swing.JTabbedPane();
        dailyPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dailyTable = new javax.swing.JTable();
        othersPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        otherTable = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uniform Ordering System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        checkPanel.setBackground(new java.awt.Color(153, 153, 153));
        checkPanel.setToolTipText("");

        dailyPanel.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        dailyTable.setBackground(new java.awt.Color(204, 204, 204));
        dailyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        dailyTable.setColumnSelectionAllowed(true);
        dailyTable.setEnabled(false);
        dailyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dailyTable);

        javax.swing.GroupLayout dailyPanelLayout = new javax.swing.GroupLayout(dailyPanel);
        dailyPanel.setLayout(dailyPanelLayout);
        dailyPanelLayout.setHorizontalGroup(
            dailyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dailyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        dailyPanelLayout.setVerticalGroup(
            dailyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dailyPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        checkPanel.addTab("Daily Uniform", dailyPanel);

        othersPanel.setBackground(new java.awt.Color(153, 153, 153));

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));

        otherTable.setBackground(new java.awt.Color(204, 204, 204));
        otherTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        otherTable.setEnabled(false);
        otherTable.setRowSelectionAllowed(false);
        otherTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(otherTable);

        javax.swing.GroupLayout othersPanelLayout = new javax.swing.GroupLayout(othersPanel);
        othersPanel.setLayout(othersPanelLayout);
        othersPanelLayout.setHorizontalGroup(
            othersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(othersPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        othersPanelLayout.setVerticalGroup(
            othersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, othersPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        checkPanel.addTab("PE & NSTP", othersPanel);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uniform Ordering System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(checkPanel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        checkPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        //open new window
        Student student = new Student();
        student.setVisible(true);
        student.pack();
        student.setLocationRelativeTo(null);
    }//GEN-LAST:event_backActionPerformed

    private void dailyTable() {                                              
        
        String filePath = StudentLogIn.studentDailyUniform;
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)checking.dailyTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            
            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
    private void otherTable() {                                              
        
        String filePath = "uniform stocks//PE & NSTP.csv";
        File file = new File(filePath);
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            // get the first line
            // get the columns name from the first line
            // set columns name to the jtable model
            String firstLine = br.readLine();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel)otherTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            // get lines from txt file
            Object[] tableLines = br.lines().toArray();
            
            // extratct data from lines
            // set data to jtable model
            for(int i = 0; i < tableLines.length; i++)
            {
                String line = tableLines[i].toString();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //sizes();
        dailyTable();
        otherTable();
        dailyPanel.add(new JLabel(tabTitle));
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTabbedPane checkPanel;
    private static javax.swing.JPanel dailyPanel;
    public static javax.swing.JTable dailyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable otherTable;
    private javax.swing.JPanel othersPanel;
    // End of variables declaration//GEN-END:variables


   /** public static String[][] readCSV(String filePath) throws IOException {
        List<String[]> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                data.add(fields);
            }
        }
        if (data.isEmpty()) {
            return null;
        }
        return data.toArray(new String[0][]);
    }
	
	public static void sizes() {
            StudentLogIn.fileSearch();
            try {
            String[][] data = readCSV(StudentLogIn.studentDailyUniform);
            if (data != null) {
                String[] columnNames = data[0]; 
                String[][] tableData = new String[data.length - 1][];
                System.arraycopy(data, 1, tableData, 0, data.length - 1);
                JTable DailyUniformTable = new JTable(tableData, columnNames);
                JScrollPane scroll = new JScrollPane(DailyUniformTable);
                dailyPanel.add(scroll);
                
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		
	}
**/
}

