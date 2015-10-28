
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rishi
 */
public class Professor_Report extends javax.swing.JFrame {

    Gradiance gradianceInstance;
    public Professor_Report(java.awt.Frame parent,boolean modal) {
        gradianceInstance = (Gradiance)parent;
        gradianceInstance.globalProfessor_CourseHomePage.professorReportInstance = this;
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

        querySelectorCmbBox = new javax.swing.JComboBox();
        selectQueryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customQueryTextArea = new javax.swing.JTextArea();
        customQueryLabel = new javax.swing.JLabel();
        getReportButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        querySelectorCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select any", "Students who did not take homework1", "Students who score maximum on first attempt for homework1", "Students who scored the maximum score on the first attempt for each homework.", "Total score for each homework and average score across all homeworks for each student", "Average number of attempts for each homework" }));

        selectQueryLabel.setText("Select Query:");

        customQueryTextArea.setColumns(20);
        customQueryTextArea.setRows(5);
        jScrollPane1.setViewportView(customQueryTextArea);

        customQueryLabel.setText("Custom Query:");

        getReportButton.setText("Get Report");
        getReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getReportButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        resultTextArea.setColumns(20);
        resultTextArea.setRows(5);
        jScrollPane2.setViewportView(resultTextArea);

        jLabel1.setText("Result:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(customQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectQueryLabel)
                        .addGap(27, 27, 27)
                        .addComponent(querySelectorCmbBox, 0, 1, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(getReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(querySelectorCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(customQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getReportButton)
                    .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getReportButtonActionPerformed
        String sql = null;
        int columnCount = 0;
        try
        {
            Connection con = Gradiance.conn;
            PreparedStatement statement = null;
            switch(querySelectorCmbBox.getSelectedIndex() + 1)
            {
                case 1:
                    sql = customQueryTextArea.getText();
                    break;
                case 2:
                    sql = "SELECT USERID FROM " +
                          "(select USERID,count(attemptid) AS C1 from studentattempt where exerciseid = " +
                          "(select min(exerciseid) from exerciselist where coursetokenid=? " +
                          "group by coursetokenid having count(EXERCISEID) >0) " +
                          "GROUP BY USERID) Temptable " +
                          "WHERE TempTable.C1 < 2";
                    statement = con.prepareStatement(sql);
                    statement.setString(1, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    break;
                case 3:
                    sql = "SELECT DISTINCT USERID,MARKSOBTAINED FROM " +
                    "(SELECT S1.MARKSOBTAINED,S1.USERID FROM " +
                    "STUDENTATTEMPT S1,EXERCISELIST EL " +
                    "WHERE S1.EXERCISEID = EL.EXERCISEID " +
                    "AND EL.COURSETOKENID = ? " + "AND S1.ATTEMPTID =1" +
                    "AND S1.EXERCISEID = (SELECT MIN(EL1.exerciseid) " +
                    "FROM exerciselist EL1 WHERE EL1.coursetokenid=? " +
                    "GROUP BY EL1.coursetokenid HAVING COUNT(EL1.EXERCISEID) >0)) TempTable " +
                    "WHERE TempTable.MARKSOBTAINED = " +
                    "(select MAX(S2.MARKSOBTAINED) FROM STUDENTATTEMPT S2,EXERCISELIST EL2 " +
                    "WHERE S2.EXERCISEID = EL2.EXERCISEID " +
                    "AND EL2.COURSETOKENID = ? " + "AND S2.ATTEMPTID =1" +
                    "AND S2.EXERCISEID = (SELECT MIN(EL3.exerciseid) FROM exerciselist EL3 WHERE EL3.coursetokenid=? " +
                    "GROUP BY EL3.coursetokenid HAVING COUNT(EL3.EXERCISEID) >0))";
                    statement = con.prepareStatement(sql);
                    statement.setString(1, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    statement.setString(2, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    statement.setString(3, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    statement.setString(4, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    break;
                case 4:
                    sql =   "select distinct S2.USERID,TempTable.EXERCISEID,TempTable.MAXMARKS from " +
                            "(select S.EXERCISEID,MAX(S.MARKSOBTAINED) AS MAXMARKS " +
                            "FROM STUDENTATTEMPT S,EXERCISELIST E " +
                            "WHERE S.EXERCISEID = E.EXERCISEID " +
                            "AND E.COURSETOKENID = ? " +
                            "AND S.ATTEMPTID = 1 " +
                            "GROUP BY S.EXERCISEID) TempTable,STUDENTATTEMPT S2 " +
                            "WHERE S2.EXERCISEID = TempTable.EXERCISEID " +
                            "AND S2.MARKSOBTAINED = TempTable.MAXMARKS";
                    statement = con.prepareStatement(sql);
                    statement.setString(1, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    break;
                case 5:
                    sql = "select TempTable2.UserId,TempTable2.TOTAL_SCORE,TempTable2.ExerciseID FROM " +
                        "(select TempTable.UserId,NVL(Max(TempTable.MarksObtained),0) as TOTAL_SCORE,TempTable.ExerciseID " +
                        "FROM (select S.USERID,S.ATTEMPTID,S.EXERCISEID,S.MARKSOBTAINED " +
                        "from StudentAttempt S,ExerciseList EL,Exercises E " +
                        "where S.EXERCISEID = EL.EXERCISEID " +
                        "and S.EXERCISEID = E.EXERCISEID " +
                        "and EL.COURSETOKENID = ? " +
                        "and E.SCORINGTYPE = 'Max') TempTable " +
                        "group by TempTable.UserId,Temptable.ExerciseId " +
                        "UNION " +
                        "select TempTable.UserId,NVL(AVG(TempTable.MarksObtained),0) as TOTAL_SCORE,TempTable.ExerciseID " +
                        "FROM (select S.USERID,S.ATTEMPTID,S.EXERCISEID,S.MARKSOBTAINED " +
                        "from StudentAttempt S,ExerciseList EL,Exercises E " +
                        "where S.EXERCISEID = EL.EXERCISEID " +
                        "and S.EXERCISEID = E.EXERCISEID " +
                        "and EL.COURSETOKENID = ? " +
                        "and E.SCORINGTYPE = 'Average') TempTable " +
                        "group by TempTable.UserId,Temptable.ExerciseId " +
                        "UNION " +
                        "select S.USERID,NVL(S.MARKSOBTAINED,0) AS TOTAL_SCORE,S.EXERCISEID " +
                        "from StudentAttempt S,ExerciseList EL,Exercises E " +
                        "where S.EXERCISEID = EL.EXERCISEID " +
                        "and S.EXERCISEID = E.EXERCISEID " +
                        "and EL.COURSETOKENID = ? " +
                        "and E.SCORINGTYPE = 'Average' " +
                        "and S.ATTEMPTID = (select MAX(S2.AttemptId) FROM StudentAttempt S2 " +
                        "WHERE S2.EXERCISEID = S.EXERCISEID and S2.USERID = S.USERID " +
                        "GROUP BY S2.USERID,S2.EXERCISEID)) TempTable2 " +
                        "ORDER BY TempTable2.UserId,TempTable2.ExerciseID";
                    statement = con.prepareStatement(sql);
                    statement.setString(1, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    statement.setString(2, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    statement.setString(3, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    break;
                case 6:
                    sql = "SELECT TEMPTab.EXERCISEID,avg(TEMPTab.CountAttempts) as AVGATTEMPTS from " +
                          "(select S.EXERCISEID,COUNT(*) as CountAttempts " +
                          "from ExerciseList E,StudentAttempt S " +
                          "where E.COURSETOKENID = ? " +
                          "and S.EXERCISEID = E.EXERCISEID " +
                          "and S.ATTEMPTID > 0 " +
                          "group by S.USERID,S.EXERCISEID) TEMPTab " +
                          "GROUP BY EXERCISEID";
                    statement = con.prepareStatement(sql);
                    statement.setString(1, gradianceInstance.globalProfessor_Home.CurrentCourseToken);
                    break;

            }
            if(sql == null)
            {
                JOptionPane.showMessageDialog(this, "Please either select query or type a new query");
            }
            else
            {
                    String reportString = "";
                    ResultSet rs = statement.executeQuery();
                    ResultSetMetaData rsMetaDate = rs.getMetaData();
                    columnCount = rsMetaDate.getColumnCount();
                    for(int i = 1; i<=columnCount; i++)
                    {
                        reportString = reportString + rsMetaDate.getColumnName(i).toString() + "\t";
                    }
                    reportString = reportString + "\n";
                    while(rs.next())
                    {
                        for(int i = 1; i<=columnCount; i++)
                        {
                            if(rs.getObject(i) != null)
                            reportString = reportString + rs.getObject(i).toString() + "\t";
                        }
                        reportString = reportString + "\n";
                    }
                    resultTextArea.setText(reportString);
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_getReportButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        gradianceInstance.globalProfessor_CourseHomePage.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Professor_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Professor_Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel customQueryLabel;
    private javax.swing.JTextArea customQueryTextArea;
    private javax.swing.JButton getReportButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox querySelectorCmbBox;
    private javax.swing.JTextArea resultTextArea;
    private javax.swing.JLabel selectQueryLabel;
    // End of variables declaration//GEN-END:variables
}