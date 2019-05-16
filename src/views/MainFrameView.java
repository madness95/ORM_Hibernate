package views;

import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author RR17
 */
public class MainFrameView extends javax.swing.JFrame {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    
    public MainFrameView() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCountry = new javax.swing.JMenuItem();
        menuEmployee = new javax.swing.JMenuItem();
        menuLocation = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu Utama");

        menuCountry.setText("Country");
        menuCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCountryActionPerformed(evt);
            }
        });
        jMenu1.add(menuCountry);

        menuEmployee.setText("Employee");
        menuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmployeeActionPerformed(evt);
            }
        });
        jMenu1.add(menuEmployee);

        menuLocation.setText("Location");
        menuLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLocationActionPerformed(evt);
            }
        });
        jMenu1.add(menuLocation);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCountryActionPerformed
        // TODO add your handling code here:
        JCountryView jcv = new JCountryView();
        this.jDesktopPane1.add(jcv);
        jcv.show();
    }//GEN-LAST:event_menuCountryActionPerformed

    private void menuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmployeeActionPerformed
        // TODO add your handling code here:
        JEmployeeView jev = new JEmployeeView();
        this.jDesktopPane1.add(jev);
        jev.show();
    }//GEN-LAST:event_menuEmployeeActionPerformed

    private void menuLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLocationActionPerformed
        // TODO add your handling code here:
        JLocationView jlv = new JLocationView();
        this.jDesktopPane1.add(jlv);
        jlv.show();
    }//GEN-LAST:event_menuLocationActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCountry;
    private javax.swing.JMenuItem menuEmployee;
    private javax.swing.JMenuItem menuLocation;
    // End of variables declaration//GEN-END:variables
}
