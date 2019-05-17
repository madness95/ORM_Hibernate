/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;


import controllers.DepartmentController;
import controllers.EmployeeController;

import Icontrollers.IDepartmentController;
import icontrollers.IEmployeeController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Department;
import models.Employee;
import models.Location;
import tools.HibernateUtil;



/**
 *
 * @author RossaHening
 */
public class DepaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form Department
     */
    public DepaView() {
        initComponents();
        showTable("");
//        combolocation();
    }
IDepartmentController idc = new DepartmentController(HibernateUtil.getSessionFactory());
//    private void combolocation() {
//        for (Location l : new LocationControlle(db.getConnection()).getAll()) {
//            lid.addItem(l.getId() + " - " + l.getCity());
//        }
//    }
//    private void combomanager(){
//        for (Employee e : new EmployeeController(db.getConnection()).getAll()) {
//            emp.addItem(e.getId()+"");
//        }
//    }

    public void resetText() {
        id.setText("");
        name.setText("");
        mId.setText("");
        location.setText("");
        id.setEditable(true);

//        combomanager();
//        combolocation();
////        emp.setSelectedIndex(0);
//        lid.setSelectedIndex(0);
    }
    
    public void showTable(String s) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[5];
        List<Department> d = idc.getAll();
        
        for (int i = 0; i < d.size(); i++) {
            row[0] = i + 1;
            row[1] = d.get(i).getDepartmentId();
            row[2] = d.get(i).getDepartmentName();
            if (d.get(i).getManagerId() == null) {
                row[3]= "";
            }else{
                row[3] = d.get(i).getManagerId().getEmployeeId();
            }
//            row[3] = d.get(i).getManagerId();
            row[4] = d.get(i).getLocationId().getLocationId();
            model.addRow(row);
            System.out.println(row[3]);
        }
    }
//    public void showTable(String s){
//        DefaultTableModel model = (DefaultTableModel)tab.getModel();
//        Object[] row = new Object[5];
//        for (int i = 0; i < idc.search(s).size(); i++) {
//            row[0]=idc.search(s).get(i).getDepartment_id();
//            row[1]=idc.search(s).get(i).getDepartmen_name();
//            row[2]=idc.search(s).get(i).getManager_id();
//            row[3]=idc.search(s).get(i).getLocation_id();
//            model.addRow(row);
//        }
//    }
//    
//    public void updateTable(){
//        DefaultTableModel model = (DefaultTableModel)tab.getModel();
//        model.setRowCount(0);
//        showTable();
//    }

    public void updateTable(String s) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        showTable(s);
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
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        mId = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Data Department");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Department ID", "Name", "Manager ID", "Location"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("ID");

        jLabel2.setText("Name");

        jLabel3.setText("Manager ID");

        jLabel4.setText("Location");

        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");

        jButton3.setText("Delete");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id)
                            .addComponent(name)
                            .addComponent(mId)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton4)))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int SelectedRowIndex = jTable1.getSelectedRow();
        id.setEditable(false);
        id.setText(model.getValueAt(SelectedRowIndex, 1).toString());
        name.setText(model.getValueAt(SelectedRowIndex, 2).toString());
        mId.setText(model.getValueAt(SelectedRowIndex, 3).toString());
        location.setText(model.getValueAt(SelectedRowIndex, 4).toString());


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk melakukan insert?", "Confirm Insert", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, idc.insert(id.getText(), name.getText(), mId.getText(), location.getText()));
            updateTable("");
            resetText();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        resetText();
    }//GEN-LAST:event_jButton4ActionPerformed
private void deleteActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk melakukan delete?", "Confirm Update", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (confirm == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, idc.delete(id.getText()));
//            updateTable("");
//            resetText();
//        }
    }                                      

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {                                       
//        String mid = emp.getSelectedItem().toString();
//        String location = lid.getSelectedItem().toString();
//        String loc = location.substring(0, location.indexOf("-") - 1);
//        int confirm = JOptionPane.showConfirmDialog(this, "Apakah anda yakin untuk melakukan update?", "Confirm Update", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//        if (confirm == JOptionPane.YES_OPTION) {
//            JOptionPane.showMessageDialog(null, idc.save(id.getText(), name.getText(), emp.getText(), loc));
//            updateTable("");
//            resetText();
//        }
    }                                      

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {                                 
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int SelectedRowIndex = jTable1.getSelectedRow();
        id.setEditable(false);
        id.setText(model.getValueAt(SelectedRowIndex, 1).toString());
        name.setText(model.getValueAt(SelectedRowIndex, 2).toString());
        mId.setText(model.getValueAt(SelectedRowIndex, 3).toString());
        location.setText(model.getValueAt(SelectedRowIndex, 4).toString());
//        location.setSelectedItem(model.getValueAt(SelectedRowIndex, 4).toString());
//        lid.setText(model.getValueAt(SelectedRowIndex, 4).toString());
    }                                

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {                                
//        updateTable(search.getText());
    }                               

    private void lidActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
    }                             

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField mId;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}