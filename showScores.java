

import java.awt.Color;
import java.awt.event.KeyEvent;


public class showScores extends javax.swing.JFrame {

 
     Score sc = new Score();
    public showScores() 
    {
        initComponents();
        sc.fillShowScoreJTable(jTableShowScore);
        jTableShowScore.setRowHeight(40);
        jTableShowScore.setShowGrid(true);
        jTableShowScore.setGridColor(Color.YELLOW);
        jTableShowScore.setSelectionBackground(Color.BLUE);
        jTableShowScore.setSelectionForeground(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableShowScore = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 904));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel6.setText("All Scores");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 160, -1));

        jTableShowScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_Id", "FirstName", "LastName", "CourseName", "Score"
            }
        ));
        jTableShowScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableShowScoreMouseClicked(evt);
            }
        });
        jTableShowScore.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableShowScoreKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableShowScore);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 650, 630));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableShowScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableShowScoreMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableShowScore.getSelectedRow();
        Double score  = Double.valueOf(jTableShowScore.getValueAt(rowIndex,4).toString());
        if(score < 50)
        {
            jTableShowScore.setSelectionBackground(Color.RED);
            
        }
        else if(score >= 50.00 && score < 70.00)
        {
            jTableShowScore.setSelectionBackground(Color.YELLOW);
            
        }
        else if(score > 70.00)
        {
            jTableShowScore.setSelectionBackground(Color.GREEN);
            
        }
    }//GEN-LAST:event_jTableShowScoreMouseClicked

    private void jTableShowScoreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableShowScoreKeyReleased
        
        int rowIndex = jTableShowScore.getSelectedRow();
        Double score  = Double.valueOf(jTableShowScore.getValueAt(rowIndex,4).toString());
        if(evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN)
        {
           if(score < 50)
        {
            jTableShowScore.setSelectionBackground(Color.RED);
            
        }
        else if(score >= 50.00 && score < 70.00)
        {
            jTableShowScore.setSelectionBackground(Color.YELLOW);
            
        }
        else if(score > 70.00)
        {
            jTableShowScore.setSelectionBackground(Color.GREEN);
            
        }
        }
    }//GEN-LAST:event_jTableShowScoreKeyReleased

    
    
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(showScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showScores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new showScores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableShowScore;
    // End of variables declaration//GEN-END:variables
}
