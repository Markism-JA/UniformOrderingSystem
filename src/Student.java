
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class Student extends javax.swing.JFrame {

    
    
    public Student() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        studentInfo = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        studentNo = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameLabel2 = new javax.swing.JLabel();
        studentCourse = new javax.swing.JLabel();
        nameLabel3 = new javax.swing.JLabel();
        studentDis = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        check = new javax.swing.JButton();
        place = new javax.swing.JButton();
        status = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Uniform Ordering System");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Uniform Ordering System");

        studentInfo.setBackground(new java.awt.Color(153, 153, 153));

        nameLabel.setText("Name:");

        studentName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentName.setText("Name");

        studentNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentNo.setText("Name");

        nameLabel1.setText("Student No:");

        nameLabel2.setText("Course:");

        studentCourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentCourse.setText("Name");

        nameLabel3.setText("Scholarship Discount:");

        studentDis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        studentDis.setText("Name");

        logOutBtn.setText("Log Out");
        logOutBtn.setFocusable(false);
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentInfoLayout = new javax.swing.GroupLayout(studentInfo);
        studentInfo.setLayout(studentInfoLayout);
        studentInfoLayout.setHorizontalGroup(
            studentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(studentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentNo, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addGroup(studentInfoLayout.createSequentialGroup()
                        .addGroup(studentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(nameLabel1)
                            .addComponent(nameLabel2)
                            .addComponent(nameLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(studentCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(studentDis, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn)
                .addGap(16, 16, 16))
        );
        studentInfoLayout.setVerticalGroup(
            studentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studentDis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutBtn)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));

        check.setText("Check Available Uniforms");
        check.setFocusable(false);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        place.setText("Place An Order");
        place.setFocusable(false);
        place.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeActionPerformed(evt);
            }
        });

        status.setText("Order Status");
        status.setFocusable(false);
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(place, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(place, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
       
        int logOut = JOptionPane.showConfirmDialog(this, "Are you sure?", "Log Out Confirmation", JOptionPane.YES_NO_OPTION);
        
        if(logOut == 0){
            this.dispose();
            //open new window
        
            StudentLogIn student = new StudentLogIn();
            student.setVisible(true);
            student.pack();
            student.setLocationRelativeTo(null);
        }
        
        
        
    }//GEN-LAST:event_logOutBtnActionPerformed

    
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        //dailyTable();
        this.dispose();
        //open new window
        checking check = new checking();
        check.setVisible(true);
        check.pack();
        check.setLocationRelativeTo(null);
    }//GEN-LAST:event_checkActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        studentNo.setText(StudentLogIn.studentNo);
        studentName.setText(StudentLogIn.studentName);
        studentCourse.setText(StudentLogIn.studentCourse);
        studentDis.setText(StudentLogIn.studentDis+"%");
    }//GEN-LAST:event_formWindowOpened

    private void placeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeActionPerformed
        this.dispose();
        //open new window
        placeOrder place = new placeOrder();
        place.setVisible(true);
        place.pack();
        place.setLocationRelativeTo(null);
    }//GEN-LAST:event_placeActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        this.dispose();
        //open new window
        status student = new status();
        student.setVisible(true);
        student.pack();
        student.setLocationRelativeTo(null);
    }//GEN-LAST:event_statusActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton check;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameLabel2;
    private javax.swing.JLabel nameLabel3;
    private javax.swing.JButton place;
    private javax.swing.JButton status;
    public static javax.swing.JLabel studentCourse;
    public static javax.swing.JLabel studentDis;
    private javax.swing.JPanel studentInfo;
    public static javax.swing.JLabel studentName;
    public static javax.swing.JLabel studentNo;
    // End of variables declaration//GEN-END:variables

    //myVars
    
    public boolean found = false;
    public void studentLogIn(String studentNum) {
		String currentLine;
		
		//System.out.print("Enter your student number: ");
		//String studentNum = input.nextLine();
		

		try {
			BufferedReader reader = new BufferedReader(new FileReader("StudentsSheet1.csv"));
			
			while((currentLine = reader.readLine()) != null) {
				String row [] = currentLine.split(",");
				if(row[0].equals(studentNum)) {
					System.out.println("Successfully logged in...\n\n");
                                        //  logInPanel.setVisible(false);
                                        found = true;
					
				}
			}
			if(!found) {
				System.out.println("Student not Found.");
                                JOptionPane.showMessageDialog(this,"Student not Found. Please Try Again","Error",JOptionPane.ERROR_MESSAGE);
                                //logIntxt.setText("");
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

