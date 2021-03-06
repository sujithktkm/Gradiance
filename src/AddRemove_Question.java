import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
import oracle.sql.ARRAY;
import oracle.sql.ArrayDescriptor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sree
 */
public class AddRemove_Question extends javax.swing.JFrame {
    
    
    public Gradiance gradianceInstance;
    int pass;
    JCheckBox cb[];
    JLabel jb[];
    JCheckBox cb1[];
    JLabel jb1[];
    int[] arrayCourses;
    /**
     * Creates new form Remove_Question
     */
    
    public AddRemove_Question(Frame parent, boolean modal) {
        gradianceInstance = (Gradiance)parent;
        gradianceInstance.globalProfessor_CourseHomePage.addRemoveQuestionInstance = this;
        initComponents();
        gradianceInstance.globalAddRemove = this;
        
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
        remove_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        add_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Questions - ");

        remove_button.setText("Remove Questions");
        remove_button.setActionCommand("removequestion_remove");
        remove_button.setMaximumSize(new java.awt.Dimension(74, 23));
        remove_button.setMinimumSize(new java.awt.Dimension(74, 23));
        remove_button.setPreferredSize(new java.awt.Dimension(74, 23));
        remove_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_buttonActionPerformed(evt);
            }
        });

        back_button.setText("Back");
        back_button.setMaximumSize(new java.awt.Dimension(74, 23));
        back_button.setMinimumSize(new java.awt.Dimension(74, 23));
        back_button.setPreferredSize(new java.awt.Dimension(74, 23));
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        add_button.setText("Add Questions");
        add_button.setMaximumSize(new java.awt.Dimension(74, 23));
        add_button.setMinimumSize(new java.awt.Dimension(74, 23));
        add_button.setPreferredSize(new java.awt.Dimension(74, 23));
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(remove_button, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        gradianceInstance.globalProfessor_CourseHomePage.setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed

    private void remove_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_buttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
           final JFrame jf = new JFrame();
           JPanel p=new JPanel(new GridBagLayout());
           GridBagConstraints gb = new GridBagConstraints();
           
           JButton remove=new JButton("Remove");
           
                       remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeActionPerformed(evt,jf);
            }

        });

           
           JButton appear=new JButton("Quit");
            
                       appear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            appearActionPerformed(evt,jf);
            }

        });

           
           int j= 0;
           
             
            
            
            try
            {
//            coursetopics array 
//                    hwid
                            
            String sql ="{call FETCH_QUESTIONS(?,?,?,?)}";
            Connection conn = Gradiance.conn;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1,gradianceInstance.globalProfessor_Home.CurrentCourseToken);
            callableStatement.setInt(2,gradianceInstance.globalSelect_Homework.hw_id);
            callableStatement.setInt(3,0);
            callableStatement.registerOutParameter(4,OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(4);
            
            int rowcount = 0;
            while (result.next()) 
            {
                    rowcount++;
            }

            cb1=new JCheckBox[rowcount];
            jb1 = new JLabel[rowcount];
            callableStatement.execute();
            result = ((OracleCallableStatement)callableStatement).getCursor(4);
            
            while(result.next()){
                cb1[j]=new JCheckBox(result.getString(2));
                cb1[j].setVisible(true);
                jb1[j]=new JLabel(result.getString(1));
                jb1[j].setVisible(true);
                j++;
            }
            }
           catch (SQLException ex) {
            Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
           
           jf.add(p);
           
           for(int i=0;i<j;i++) {
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = i; 
          
             p.add(cb1[i],gb);
             
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 1;
            gb.gridy = i; 
            p.add(jb1[i],gb);

           }
           
           
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 1;
            gb.gridy = ++j;
           p.add(remove,gb);
           
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 2;
            gb.gridy = j; 
           p.add(appear,gb);
           
           jf.setVisible(true);
           jf.setSize(2000,2000);
    }//GEN-LAST:event_remove_buttonActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
            // TODO add your handling code here
        this.setVisible(false);
           final JFrame jf = new JFrame();
           JPanel p=new JPanel(new GridBagLayout());
           GridBagConstraints gb = new GridBagConstraints();
           
           JButton save=new JButton("Save");
           
                       save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveActionPerformed(evt,jf);
            }

        });

           
           JButton appear=new JButton("Quit");
            
                       appear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            appearActionPerformed(evt,jf);
            }

        });

           
           int j= 0;
           
            //JCheckBox cb[]=new JCheckBox[1000]; 
            
            
            try
            {
            String sql ="{call FETCH_QUESTIONS(?,?,?,?)}";
            Connection conn = Gradiance.conn;
            CallableStatement callableStatement = conn.prepareCall(sql);
            callableStatement.setString(1,gradianceInstance.globalProfessor_Home.CurrentCourseToken);
            callableStatement.setInt(2,gradianceInstance.globalSelect_Homework.hw_id);
            callableStatement.setInt(3,1);
            callableStatement.registerOutParameter(4,OracleTypes.CURSOR);
            callableStatement.execute();
            ResultSet result = ((OracleCallableStatement)callableStatement).getCursor(4);
            
          int rowcount = 0;
            while (result.next()) 
            {
                    rowcount++;
            }

            cb=new JCheckBox[rowcount];
            jb = new JLabel[rowcount];
            callableStatement.execute();
            result = ((OracleCallableStatement)callableStatement).getCursor(4);
            
            while(result.next()){
                cb[j]=new JCheckBox(result.getString(2));
                cb[j].setVisible(true);
                jb[j]= new JLabel(result.getString(1));
                jb[j].setVisible(false);
                
                j++;
            }
            }
           catch (SQLException ex) {
            Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           
           
           jf.add(p);
           
           for(int i=0;i<j;i++) {
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = i; 
          
             p.add(cb[i],gb);
             
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 1;
            gb.gridy = i; 
            p.add(jb[i],gb);

           }
           
           pass = j;
           
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = ++j;
           p.add(save,gb);
           
            gb.fill = GridBagConstraints.HORIZONTAL;
            gb.gridx = 0;
            gb.gridy = ++j; 
           p.add(appear,gb);
           
           jf.setVisible(true);
           jf.setSize(2000,2000);
    }//GEN-LAST:event_add_buttonActionPerformed

            private void saveActionPerformed(ActionEvent evt, JFrame jf) {
          //To change body of generated methods, choose Tools | Templates.
        ARRAY arrayQuestionsList = null;
        
        try
        {
        int i = 0,len=0,counter=0;
        while(i < cb.length)
        {
            if(cb[i].isSelected())
                counter++;
            i++;
        }
        arrayCourses = new int[counter];
        i=0;
        while(i < cb.length)
        {
            if(cb[i].isSelected())
                arrayCourses[len++] = Integer.parseInt(jb[i].getText());
            i++;
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
  
        
        ArrayDescriptor arrayDescQuestionsList;
        try {
            arrayDescQuestionsList = ArrayDescriptor.createDescriptor("QUESTION_LIST", Gradiance.conn);
            arrayQuestionsList = new ARRAY(arrayDescQuestionsList,Gradiance.conn,arrayCourses);
        
        } catch (SQLException ex) {
            Logger.getLogger(AddRemove_Question.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
            try
            {
                String sql ="{call INSERT_QUESTIONS(?,?,?)}";
                Connection conn = Gradiance.conn;
                CallableStatement callableStatement = conn.prepareCall(sql);
                callableStatement.setArray(1,arrayQuestionsList);
                callableStatement.setInt(2,gradianceInstance.globalSelect_Homework.hw_id);
                callableStatement.registerOutParameter(3,java.sql.Types.INTEGER);
                callableStatement.execute();
                
                int result = ((OracleCallableStatement)callableStatement).getInt(3);
            
                if(result == 1)
                {
                    JOptionPane.showMessageDialog(gradianceInstance.globalProfessor_CourseHomePage.addRemoveQuestionInstance,
                            "Questions Added");
                }
                
            }
            catch (SQLException ex) 
            {
                Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            jf.setVisible(false);
            jf.dispose();
            gradianceInstance.globalAddRemove.setVisible(true);
            }

                    private void removeActionPerformed(ActionEvent evt, JFrame jf) {
                  //To change body of generated methods, choose Tools | Templates.
        
             ARRAY arrayQuestionsList = null;
        
        try
        {
        int i = 0,len=0,counter=0;
        while(i < cb1.length)
        {
            if(cb1[i].isSelected())
                counter++;
            i++;
        }
        arrayCourses = new int[counter];
        i=0;
        while(i < cb1.length)
        {
            if(cb1[i].isSelected())
                arrayCourses[len++] = Integer.parseInt(jb1[i].getText());
            i++;
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
  
        
        ArrayDescriptor arrayDescQuestionsList;
        try {
            arrayDescQuestionsList = ArrayDescriptor.createDescriptor("QUESTION_LIST", Gradiance.conn);
            arrayQuestionsList = new ARRAY(arrayDescQuestionsList,Gradiance.conn,arrayCourses);
        
        } catch (SQLException ex) {
            Logger.getLogger(AddRemove_Question.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
            try
            {
                String sql ="{call DELETE_QUESTIONS(?,?,?)}";
                Connection conn = Gradiance.conn;
                CallableStatement callableStatement = conn.prepareCall(sql);
                callableStatement.setArray(1,arrayQuestionsList);
                callableStatement.setInt(2,gradianceInstance.globalSelect_Homework.hw_id);
                callableStatement.registerOutParameter(3,java.sql.Types.INTEGER);
                callableStatement.execute();
                
                int result = ((OracleCallableStatement)callableStatement).getInt(3);
            
                if(result == 1)
                {
                    JOptionPane.showMessageDialog(gradianceInstance.globalProfessor_CourseHomePage.addRemoveQuestionInstance,
                            "Questions Added");
                }
                this.setVisible(false);
                jf.setVisible(false);
                jf.dispose();
                gradianceInstance.globalAddRemove.setVisible(true);
                
                
            }
            catch (SQLException ex) {
            Logger.getLogger(Gradiance.class.getName()).log(Level.SEVERE, null, ex);
            }
        
                }
                    
                private void appearActionPerformed(ActionEvent evt, JFrame jf) {
                  //To change body of generated methods, choose Tools | Templates.
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
            java.util.logging.Logger.getLogger(AddRemove_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRemove_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRemove_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRemove_Question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AddRemove_Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JButton back_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton remove_button;
    // End of variables declaration//GEN-END:variables
}
