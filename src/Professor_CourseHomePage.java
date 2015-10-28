
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rishi
 */
public class Professor_CourseHomePage extends javax.swing.JFrame {

    /**
     * Creates new form Professor_CourseHomePage
     */
    Gradiance gradianceInstance;
    int count;
    public Select_Homework selectHomeworkInstance;
    public AddRemove_Question addRemoveQuestionInstance;
    public Professor_EditHomeWork editHomeWorkInstance;
    public Professor_Report professorReportInstance;
    public Professor_ViewHomeWork viewhomeworkInstance;
    public Professor_CourseHomePage(Frame parent, boolean modal) {
        gradianceInstance = (Gradiance)parent;
        gradianceInstance.globalProfessor_CourseHomePage = this;
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

        addRemoveQuestionButton = new javax.swing.JButton();
        editHomeWorkButton = new javax.swing.JButton();
        viewHomeWorkButton = new javax.swing.JButton();
        viewNotificationName = new javax.swing.JButton();
        reportsButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        addHomeWorkButton = new javax.swing.JButton();
        TAComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        addTAButton = new javax.swing.JButton();
        removeTAButton = new javax.swing.JButton();
        TAUserIdText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        addRemoveQuestionButton.setText("Add/Remove Question");
        addRemoveQuestionButton.setEnabled(Gradiance.isProfessorMode);
        addRemoveQuestionButton.setName("addRemoveQuestionButton"); // NOI18N
        addRemoveQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRemoveQuestionButtonActionPerformed(evt);
            }
        });

        editHomeWorkButton.setText("EditHomeWork");
        editHomeWorkButton.setEnabled(Gradiance.isProfessorMode);
        editHomeWorkButton.setName("editHomeWorkButton"); // NOI18N
        editHomeWorkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editHomeWorkButtonActionPerformed(evt);
            }
        });

        viewHomeWorkButton.setText("ViewHomeWork");
        viewHomeWorkButton.setName("viewHomeWorkButton"); // NOI18N
        viewHomeWorkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHomeWorkButtonActionPerformed(evt);
            }
        });

        viewNotificationName.setText("ViewNotification");
        viewNotificationName.setEnabled(Gradiance.isProfessorMode);
        viewNotificationName.setName("viewNotificationButton"); // NOI18N
        viewNotificationName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewNotificationNameActionPerformed(evt);
            }
        });

        reportsButton.setText("Reports");
        reportsButton.setName("reportsButton"); // NOI18N
        reportsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.setName("backButton"); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addHomeWorkButton.setText("AddHomeWork");
        addHomeWorkButton.setEnabled(Gradiance.isProfessorMode);
        addHomeWorkButton.setName("addHomeWorkButton"); // NOI18N
        addHomeWorkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHomeWorkButtonActionPerformed(evt);
            }
        });

        TAComboBox.setEnabled(Gradiance.isProfessorMode);

        jLabel1.setText("TAs");

        addTAButton.setText("AddTA");
        addTAButton.setEnabled(Gradiance.isProfessorMode);
        addTAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTAButtonActionPerformed(evt);
            }
        });

        removeTAButton.setText("RemoveTA");
        removeTAButton.setEnabled(Gradiance.isProfessorMode);
        removeTAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTAButtonActionPerformed(evt);
            }
        });

        TAUserIdText.setEnabled(Gradiance.isProfessorMode);

        jLabel2.setText("UserId:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addRemoveQuestionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(viewNotificationName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(editHomeWorkButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewHomeWorkButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addHomeWorkButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(TAComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(96, 96, 96)
                            .addComponent(removeTAButton))
                        .addComponent(addTAButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TAUserIdText)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addHomeWorkButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TAComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addRemoveQuestionButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(removeTAButton)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(editHomeWorkButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewHomeWorkButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewNotificationName)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TAUserIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(addTAButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(reportsButton)
                .addGap(18, 18, 18)
                .addComponent(backButton)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addRemoveQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRemoveQuestionButtonActionPerformed
        selectHomeworkInstance = new Select_Homework(gradianceInstance,true,"addremove");
        this.setVisible(false);   
        selectHomeworkInstance.setVisible(true);
    }//GEN-LAST:event_addRemoveQuestionButtonActionPerformed

    private void editHomeWorkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editHomeWorkButtonActionPerformed
        selectHomeworkInstance = new Select_Homework(gradianceInstance,true,"edit");
        this.setVisible(false);
        selectHomeworkInstance.setVisible(true);
    }//GEN-LAST:event_editHomeWorkButtonActionPerformed

    private void viewHomeWorkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHomeWorkButtonActionPerformed
        selectHomeworkInstance = new Select_Homework(gradianceInstance,true,"view");
        this.setVisible(false);
        selectHomeworkInstance.setVisible(true);
    }//GEN-LAST:event_viewHomeWorkButtonActionPerformed

    private void viewNotificationNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewNotificationNameActionPerformed
        this.setVisible(false);
           final JFrame jf = new JFrame();
           JPanel p=new JPanel(new GridBagLayout());
           GridBagConstraints gb = new GridBagConstraints();
           JButton Back =new JButton("Back");
           JButton clear_Messages =new JButton("Clear Messages");
           Back.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtn_CourseHomePageActionPerformed(evt,jf);
            }
            });
          
           int j= 0;

           final JLabel jb1[] = new JLabel[1000];
            
           try
            {

            String sql ="{call RetrieveNotifications(?,?,?)}";
            Connection conn = Gradiance.conn;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1,gradianceInstance.UserName);
            callableStatement.setString(2,gradianceInstance.globalProfessor_Home.CurrentCourseToken.toString());
            callableStatement.registerOutParameter(3,OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(3);
            

            while(result.next()){
                
                
                
                jb1[j]=new JLabel(result.getString(1)+"    ");
                jb1[j].setVisible(true);
                j++;
             }
            count =j;
            }
           catch (SQLException ex) {
            Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
        }
            
             JLabel Notifications = new JLabel("Notifications    ");
                     
             Font font = new Font("Courier", Font.BOLD,12);
            Notifications.setFont(font);
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = 0;
            //Notifications.
            p.add(Notifications,gb);

             
           jf.add(p);

           for(int i=0;i<j;i++) {
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = 1+i;
            p.add(jb1[i],gb);
      
        
           
           }

            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 2;
            gb.gridy = j+3;
            p.add(Back,gb);
            
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 3;
            gb.gridy = j+3;
            p.add(clear_Messages,gb);
           jf.setVisible(true);
           jf.setSize(600,600);
           
           try{
          String sql ="{call UpdateNotifications(?,?)}";
            Connection conn = Gradiance.conn;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1,gradianceInstance.UserName);
            callableStatement.setString(2,gradianceInstance.globalProfessor_Home.CurrentCourseToken.toString());
            callableStatement.execute();
           }
           catch(SQLException ex) {
            Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           clear_Messages.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear_MessagesActionPerformed(evt,jf,jb1,count);
            }
            });
    }//GEN-LAST:event_viewNotificationNameActionPerformed

    private void reportsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsButtonActionPerformed
        this.setVisible(false);
        professorReportInstance = new Professor_Report(gradianceInstance, true);
        professorReportInstance.setVisible(true);
    }//GEN-LAST:event_reportsButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.setVisible(false);
        gradianceInstance.globalProfessor_Home.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addHomeWorkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHomeWorkButtonActionPerformed
        Professor_AddHomeWork profAddHomeWork = new Professor_AddHomeWork(gradianceInstance,true);
        this.setVisible(false);
        profAddHomeWork.setVisible(true);
    }//GEN-LAST:event_addHomeWorkButtonActionPerformed

    private void addTAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTAButtonActionPerformed
        int userId = Integer.parseInt(TAUserIdText.getText());
        String courseToken = gradianceInstance.globalProfessor_Home.CurrentCourseToken;
        
        try
        {  
            String sql ="{call ADD_TA(?,?,?)}";
            Connection conn =Gradiance.conn ;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1, courseToken);
            callableStatement.setInt(2, userId);
            
            callableStatement.registerOutParameter(3,java.sql.Types.INTEGER);
            callableStatement.execute();
            
            int ret_Value = callableStatement.getInt(3);
            
            if(ret_Value == 1)
            {
                JOptionPane.showMessageDialog(this, "TA Added Successfully!");
            
            }
            else if (ret_Value == -1)
            {
                
                JOptionPane.showMessageDialog(this, "TA eitheer exists or not Valid!");
            }
        }
        catch (Exception ex)
        {
            
        }
    }//GEN-LAST:event_addTAButtonActionPerformed

    private void removeTAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTAButtonActionPerformed
        String loginId = TAComboBox.getSelectedItem().toString();
        String courseToken = gradianceInstance.globalProfessor_Home.CurrentCourseToken;
        
        try
        {  
            String sql ="{call REMOVE_TA(?,?,?)}";
            Connection conn =Gradiance.conn ;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1, courseToken);
            callableStatement.setString(2, loginId);
            
            callableStatement.registerOutParameter(3,java.sql.Types.INTEGER);
            callableStatement.execute();
            
            int ret_Value = callableStatement.getInt(3);
            
            if(ret_Value == 1)
            {
                JOptionPane.showMessageDialog(this, "TA Removed Successfully!");
                this.setVisible(false);
                this.setVisible(true);
            }
            else if (ret_Value == -1)
            {
                
                JOptionPane.showMessageDialog(this, "TA not deleted!");
                
            }
        }
        catch (Exception ex)
        {
            
        }
    }//GEN-LAST:event_removeTAButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String courseToken = gradianceInstance.globalProfessor_Home.CurrentCourseToken;
        
        try
        {  
            String sql ="{call LIST_TA(?,?)}";
            Connection conn =Gradiance.conn ;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1, courseToken);
            
            callableStatement.registerOutParameter(2,OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(2);
            
            while(result.next())
            {
                TAComboBox.addItem(result.getString(1));
            }
            
            
        }
        catch (Exception ex)
        {
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void Clear_MessagesActionPerformed(java.awt.event.ActionEvent evt,JFrame jf, JLabel[] jb,int j) { 
     
            for(int i=0;i<j;i++)   
                jb[i].setVisible(false);
            
            
               //globalParent.globalHomePage.globalcourse_homepage.setVisible(true);
                
     
    }
    
    private void BackBtn_CourseHomePageActionPerformed(java.awt.event.ActionEvent evt,JFrame jf) { 
     
                jf.dispose();
               gradianceInstance.globalProfessor_CourseHomePage.setVisible(true);
                
     
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
            java.util.logging.Logger.getLogger(Professor_CourseHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Professor_CourseHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Professor_CourseHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Professor_CourseHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Professor_CourseHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox TAComboBox;
    private javax.swing.JTextField TAUserIdText;
    private javax.swing.JButton addHomeWorkButton;
    private javax.swing.JButton addRemoveQuestionButton;
    private javax.swing.JButton addTAButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editHomeWorkButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton removeTAButton;
    private javax.swing.JButton reportsButton;
    private javax.swing.JButton viewHomeWorkButton;
    private javax.swing.JButton viewNotificationName;
    // End of variables declaration//GEN-END:variables
}
