
import java.io.*;
import javax.swing.*;




public class StudentLogIn extends javax.swing.JFrame {
    
    public static String course = "";
    public static String studentDailyUniform, tabTitle, pricePath;
    public static String studentNo, studentName, studentCourse, studentDis;
    public boolean found = false;
    
    public StudentLogIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logInPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        logIntxt = new javax.swing.JTextField();
        logInbtn = new javax.swing.JButton();

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

        logInPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Log in using your Student No.");

        logIntxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        logInbtn.setText("Log In");
        logInbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logInPanelLayout = new javax.swing.GroupLayout(logInPanel);
        logInPanel.setLayout(logInPanelLayout);
        logInPanelLayout.setHorizontalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logInbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logIntxt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap())
        );
        logInPanelLayout.setVerticalGroup(
            logInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logInPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logIntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logInbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 144, Short.MAX_VALUE)
                        .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(logInPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInbtnActionPerformed

        String studentNum = logIntxt.getText();
        studentLogIn(studentNum);

    }//GEN-LAST:event_logInbtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel logInPanel;
    private javax.swing.JButton logInbtn;
    private javax.swing.JTextField logIntxt;
    // End of variables declaration//GEN-END:variables

    //myVars
    public static void fileSearch() {
		String uniform = "uniform stocks//";
		
		if (course.equals("BSCS") || course.equals("BSIT") || course.equals("BSCPE")) {
			studentDailyUniform = uniform + "ICT & ENGINEERING.csv";
                        checking.tabTitle = "ICT & ENGINEERING";
                        pricePath = "prices//ICT-ENGINEERINGin.csv";
                        
		}else if (course.equals("BACOMM")|| course.equals("BMMA")) {
			studentDailyUniform = uniform + "ARTS & SCIENCES.csv";
                        checking.tabTitle = "ART & SCIENCES";
                        pricePath = "prices//ART-SCIENCESin.csv";
                        
		}else if (course.equals("BSA")|| course.equals("BSBAOM")) {
			studentDailyUniform = uniform + "BSAIS DAILY.csv";
                        checking.tabTitle = "BSAIS";
                        pricePath = "prices//BSAIS-DAILYin.csv";
                        
		}else if (course.equals("BSHM")) {
			studentDailyUniform = uniform + "BSHM DAILY.csv";
                        checking.tabTitle = "BSHM";
                        pricePath = "prices//BSHM-DAILYin.csv";
                        
		}else if (course.equals("BSTM")) {
			studentDailyUniform = uniform + "BSTM.csv";
                        checking.tabTitle = "BSTM";
                        //pricePath = "prices//ICT & ENGINEERINGin.csv";
                        
		}
		
		
	}
    
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
                                        
                                        course = row[2];
                                        fileSearch();
                                        System.out.println(course);
                                        found = true;
                                        
                                        this.dispose();
                                        //open new window
                                        Student student = new Student();
                                        student.setVisible(true);
                                        student.pack();
                                        student.setLocationRelativeTo(null);
                                        
                                        
                                        studentNo = row[0];
                                        studentName =row[1];
                                        studentCourse = row[2];
                                        studentDis = row[3];
                                        
                                       
					
				}
			}
			if(!found) {
				System.out.println("Student not Found.");
                                JOptionPane.showMessageDialog(this,"Student not Found. Please Try Again","Error",JOptionPane.ERROR_MESSAGE);
                                logIntxt.setText("");
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}


}

