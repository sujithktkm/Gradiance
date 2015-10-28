
import java.awt.Frame;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sree
 */
public class Select_Homework extends javax.swing.JFrame {

    /**
     * Creates new form Select_Homework
     */
    public Select_Homework globalSelectHomework;
    public AddRemove_Question globalAddRemoveQuestion;
    public Professor_CourseHomePage globalProfCHP;
    String redirect;
    public int hw_id; 
    ArrayList al2 = new ArrayList();
    
    Gradiance grad;
    public Select_Homework(Frame parent, boolean modal, String val ) {
        initComponents();
        grad = (Gradiance)parent;
        this.globalSelectHomework = this;
        grad.globalSelect_Homework = this;
        this.globalProfCHP = grad.globalProfessor_CourseHomePage;
        redirect=val;
        
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
        homeworkSelector = new javax.swing.JComboBox();
        Go_button = new javax.swing.JButton();
        Goback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Select Homework :");

        Go_button.setText("Go");
        Go_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go_buttonActionPerformed(evt);
            }
        });

        Goback.setText("Go Back");
        Goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Go_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Goback))
                    .addComponent(homeworkSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(homeworkSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Go_button)
                    .addComponent(Goback))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
        String current_UserName = grad.UserName;
        String current_coursetoken = grad.globalProfessor_Home.CurrentCourseToken;
        String sql ="{call PROFHW_LIST(?,?,?)}";
            Connection conn =Gradiance.conn ;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1, current_UserName);
            callableStatement.setString(2, current_coursetoken);
            
            callableStatement.registerOutParameter(3,OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(3);
            
            int i = 0;
            
            while(result.next()){
            homeworkSelector.addItem(result.getString(1));
             //al2.add(i,result.getString(2));
             i++;
            }
        //ResultSet courselist = zadanie.executeQuery(sql);
                } catch (SQLException ex) {
            Logger.getLogger(GridLayoutDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void GobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GobackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        globalProfCHP.setVisible(true);
    }//GEN-LAST:event_GobackActionPerformed

    private void Go_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        hw_id = Integer.parseInt(homeworkSelector.getSelectedItem().toString());
        switch(redirect)
        {
            case "edit":
                new Professor_EditHomeWork(grad, true);
                grad.globalProfessor_CourseHomePage.editHomeWorkInstance.setVisible(true);
                break;
            case "view":
                new Professor_ViewHomeWork(grad, true);
                grad.globalProfessor_CourseHomePage.viewhomeworkInstance.setVisible(true);
                break;
            case "addremove":
                new AddRemove_Question(grad, true);
                grad.globalProfessor_CourseHomePage.addRemoveQuestionInstance.setVisible(true);
        }
                
    }//GEN-LAST:event_Go_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Select_Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Select_Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Select_Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Select_Homework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
     //           new Select_Homework().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Go_button;
    private javax.swing.JButton Goback;
    private javax.swing.JComboBox homeworkSelector;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
