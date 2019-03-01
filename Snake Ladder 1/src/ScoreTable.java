
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author EZIO
 */
public class ScoreTable extends javax.swing.JFrame {

    /**
     * Creates new form ScoreTable
     */
    public ScoreTable() {
        initComponents();
        insertdata();
        jTable1.setOpaque(false);
        jTable1.setShowGrid(false);

        jTable1.getTableHeader().setFont(new Font("Charlemagne Std", Font.BOLD, 15));

        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

        nextbtn.setOpaque(false);
        nextbtn.setContentAreaFilled(false);
        nextbtn.setBorderPainted(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nextbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(0, 204, 0));
        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 0)));
        jTable1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player 1", "Player 2", "Winner", "Playing Time", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jTable1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jTable1.setPreferredSize(new java.awt.Dimension(1366, 768));
        jTable1.setRowHeight(50);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 62, 1040, 510);

        nextbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bk3.png"))); // NOI18N
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });
        getContentPane().add(nextbtn);
        nextbtn.setBounds(70, 650, 153, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/XmGOHt.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -110, 1570, 980);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_nextbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    final void insertdata() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        StudentDaoImpl sdi = new StudentDaoImpl();

        List<Score> scrList = new ArrayList<Score>();

        scrList = sdi.selectAll();

        for (Score sr1 : scrList) {

            //System.out.println(sr1.getTimeStamp() + " " + sr1.getWinner());
            model.addRow(new Object[]{sr1.getP1(), sr1.getP2(), sr1.getWinner(), sr1.getTimeStamp(), sr1.getDuration()});

        }

    }

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
            java.util.logging.Logger.getLogger(ScoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScoreTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScoreTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nextbtn;
    // End of variables declaration//GEN-END:variables
}