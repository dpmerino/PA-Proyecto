/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication56;

/**
 *
 * @author marco
 */
public class RegistrarMatricula extends javax.swing.JPanel {

    /**
     * Creates new form RegistrarMatricula
     */
    public RegistrarMatricula() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLnombre = new javax.swing.JLabel();
        jLapellido = new javax.swing.JLabel();
        jLgrado = new javax.swing.JLabel();
        jLsecciones = new javax.swing.JLabel();
        jLparalelo = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jCgrado = new javax.swing.JComboBox<>();
        jCparalelo = new javax.swing.JComboBox<>();
        jRmatutina = new javax.swing.JRadioButton();
        jRvespertina = new javax.swing.JRadioButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Registrar Matricula");

        jLnombre.setText("Nombres:");

        jLapellido.setText("Apellidos:");

        jLgrado.setText("Grado:");

        jLsecciones.setText("Seccion:");

        jLparalelo.setText("Paralelo:");

        jTnombre.setText("jTextField1");
        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jTapellido.setText("jTextField2");

        jCgrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ero", "2do", "3ero", "4to", "5to", "6to", "7tmo" }));
        jCgrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCgradoActionPerformed(evt);
            }
        });

        jCparalelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        buttonGroup1.add(jRmatutina);
        jRmatutina.setText("Matutina");
        jRmatutina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRmatutinaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRvespertina);
        jRvespertina.setText("Vespertina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLgrado)
                            .addComponent(jLparalelo)
                            .addComponent(jLsecciones))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLapellido)
                            .addComponent(jLnombre))
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCgrado, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTapellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCparalelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jRmatutina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jRvespertina)
                                .addGap(8, 8, 8))
                            .addComponent(jTnombre))))
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLapellido)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLgrado)
                    .addComponent(jCgrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLparalelo)
                    .addComponent(jCparalelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLsecciones)
                    .addComponent(jRmatutina)
                    .addComponent(jRvespertina))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jCgradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCgradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCgradoActionPerformed

    private void jRmatutinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmatutinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRmatutinaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jCgrado;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jCparalelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLapellido;
    private javax.swing.JLabel jLgrado;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLparalelo;
    private javax.swing.JLabel jLsecciones;
    private javax.swing.JRadioButton jRmatutina;
    private javax.swing.JRadioButton jRvespertina;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
