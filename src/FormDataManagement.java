/*
 * Julianne Wojdak
 * 18/12/18
 * Data Management Course Mark Calculator
 */

/**
 *
 * @author JuWoj8013
 */
public class FormDataManagement extends javax.swing.JFrame {

    /**
     * Creates new form FormDataManagement
     */
    public FormDataManagement() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /**
     * 
     * @param marks
     * @return 
     */
    public double[] avgBtn (double marks[])
    {
      return marks;  
    }
    
    public String[]courseBtn (String courses[])
    {
      return courses;  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        HeadingLabel = new javax.swing.JLabel();
        CoursesLabel = new javax.swing.JLabel();
        Course1Text = new javax.swing.JTextField();
        Course2Text = new javax.swing.JTextField();
        Course3Text = new javax.swing.JTextField();
        Course4Text = new javax.swing.JTextField();
        MarksLabel = new javax.swing.JLabel();
        Mark1Text = new javax.swing.JTextField();
        Mark2Text = new javax.swing.JTextField();
        Mark3Text = new javax.swing.JTextField();
        Mark4Text = new javax.swing.JTextField();
        MarksBtn = new javax.swing.JButton();
        AvgBtn = new javax.swing.JButton();
        CourseMarksLabel1 = new javax.swing.JLabel();
        AvgLabel = new javax.swing.JLabel();
        AvgDisplayLabel = new javax.swing.JLabel();
        CourseMarksLabel2 = new javax.swing.JLabel();
        CourseMarksLabel3 = new javax.swing.JLabel();
        CourseMarksLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        HeadingLabel.setFont(new java.awt.Font("Swis721 BdCnOul BT", 0, 24)); // NOI18N
        HeadingLabel.setForeground(new java.awt.Color(255, 0, 0));
        HeadingLabel.setText("Grade Calculator");

        CoursesLabel.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        CoursesLabel.setForeground(new java.awt.Color(255, 0, 0));
        CoursesLabel.setText("Enter your courses:");

        Course1Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Course2Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Course3Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Course4Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        MarksLabel.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        MarksLabel.setForeground(new java.awt.Color(255, 0, 0));
        MarksLabel.setText("Enter your marks:");

        Mark1Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Mark2Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Mark3Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        Mark4Text.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 12)); // NOI18N

        MarksBtn.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        MarksBtn.setForeground(new java.awt.Color(255, 0, 0));
        MarksBtn.setText("Show marks");
        MarksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarksBtnActionPerformed(evt);
            }
        });

        AvgBtn.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        AvgBtn.setForeground(new java.awt.Color(255, 0, 0));
        AvgBtn.setText("Calculate Average");
        AvgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvgBtnActionPerformed(evt);
            }
        });

        CourseMarksLabel1.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        CourseMarksLabel1.setForeground(new java.awt.Color(255, 0, 0));

        AvgLabel.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        AvgLabel.setForeground(new java.awt.Color(255, 0, 0));
        AvgLabel.setText("Your Average Is:");

        AvgDisplayLabel.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        AvgDisplayLabel.setForeground(new java.awt.Color(255, 0, 0));
        AvgDisplayLabel.setText("0.0%");

        CourseMarksLabel2.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        CourseMarksLabel2.setForeground(new java.awt.Color(255, 0, 0));

        CourseMarksLabel3.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        CourseMarksLabel3.setForeground(new java.awt.Color(255, 0, 0));

        CourseMarksLabel4.setFont(new java.awt.Font("Swis721Greek Cn BT", 0, 14)); // NOI18N
        CourseMarksLabel4.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HeadingLabel)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Course2Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Course4Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CoursesLabel)
                                    .addComponent(Course1Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MarksLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Mark4Text, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                            .addComponent(Mark3Text)
                                            .addComponent(Mark2Text)
                                            .addComponent(Mark1Text)))))
                            .addComponent(Course3Text, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AvgBtn)
                                    .addComponent(MarksBtn)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AvgLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AvgDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CourseMarksLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                        .addComponent(CourseMarksLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CourseMarksLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CourseMarksLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(HeadingLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CoursesLabel)
                    .addComponent(MarksLabel)
                    .addComponent(MarksBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mark1Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AvgBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mark2Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Course3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mark3Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AvgLabel)
                            .addComponent(AvgDisplayLabel))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Course4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mark4Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CourseMarksLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseMarksLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseMarksLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CourseMarksLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AvgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvgBtnActionPerformed
        //Array For Users Marks
        double [] marks = new double [4];
        marks [0] = Double.parseDouble(Mark1Text.getText());
        marks [1] = Double.parseDouble(Mark2Text.getText());
        marks [2] = Double.parseDouble(Mark3Text.getText());
        marks [3] = Double.parseDouble(Mark4Text.getText());
        
        //Variables
        double total = 0;
        double average;
        
        //Calculating Total
        for(int i = 0; i <= 3; i = i+1)
        { 
        total = total + marks[i];
        }
        //Calculations    
        average = total/4;
        average = average*10;
        average = Math.round(average);
        average = average/10;
        AvgDisplayLabel.setText(average+"%");
        avgBtn(marks);
    }//GEN-LAST:event_AvgBtnActionPerformed

    private void MarksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarksBtnActionPerformed
        //Array For User Courses
        String [] courses = new String [4];
        courses [0] = Course1Text.getText();
        courses [1] = Course2Text.getText();
        courses [2] = Course3Text.getText();
        courses [3] = Course4Text.getText();
        
        //Array For Corresponding Marks
        double [] marks = new double [4];
        marks [0] = Double.parseDouble(Mark1Text.getText());
        marks [1] = Double.parseDouble(Mark2Text.getText());
        marks [2] = Double.parseDouble(Mark3Text.getText());
        marks [3] = Double.parseDouble(Mark4Text.getText());
        
        //Marks Are Rounded
        marks[0]=Math.round(marks[0]);
        marks[1]=Math.round(marks[1]);
        marks[2]=Math.round(marks[2]);
        marks[3]=Math.round(marks[3]);
        
        //Display User Marks For Courses
        CourseMarksLabel1.setText("Your mark is " + marks[0] + "% in " + courses[0]);
        CourseMarksLabel2.setText("Your mark is " + marks[1] + "% in " + courses[1]);
        CourseMarksLabel3.setText("Your mark is " + marks[2] + "% in " + courses[2]);
        CourseMarksLabel4.setText("Your mark is " + marks[3] + "% in " + courses[3]);
    }//GEN-LAST:event_MarksBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDataManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDataManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AvgBtn;
    private javax.swing.JLabel AvgDisplayLabel;
    private javax.swing.JLabel AvgLabel;
    private javax.swing.JTextField Course1Text;
    private javax.swing.JTextField Course2Text;
    private javax.swing.JTextField Course3Text;
    private javax.swing.JTextField Course4Text;
    private javax.swing.JLabel CourseMarksLabel1;
    private javax.swing.JLabel CourseMarksLabel2;
    private javax.swing.JLabel CourseMarksLabel3;
    private javax.swing.JLabel CourseMarksLabel4;
    private javax.swing.JLabel CoursesLabel;
    private javax.swing.JLabel HeadingLabel;
    private javax.swing.JTextField Mark1Text;
    private javax.swing.JTextField Mark2Text;
    private javax.swing.JTextField Mark3Text;
    private javax.swing.JTextField Mark4Text;
    private javax.swing.JButton MarksBtn;
    private javax.swing.JLabel MarksLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
