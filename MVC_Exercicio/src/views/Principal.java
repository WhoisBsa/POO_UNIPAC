/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author hemilio
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarPacientes = new javax.swing.JButton();
        btnCadastrarConsulta = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFerramentas = new javax.swing.JMenu();
        menuCadCon = new javax.swing.JMenuItem();
        menuCadPac = new javax.swing.JMenuItem();
        menuVisPac = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarPacientes.setText("Cadastrar Pacientes");
        btnCadastrarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPacientesActionPerformed(evt);
            }
        });

        btnCadastrarConsulta.setText("Cadastrar Consulta");
        btnCadastrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarConsultaActionPerformed(evt);
            }
        });

        menuFerramentas.setText("Ferramentas");

        menuCadCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.SHIFT_MASK));
        menuCadCon.setText("Cadastrar Paciente");
        menuCadCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadConActionPerformed(evt);
            }
        });
        menuFerramentas.add(menuCadCon);

        menuCadPac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuCadPac.setText("Cadastrar Consulta");
        menuCadPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadPacActionPerformed(evt);
            }
        });
        menuFerramentas.add(menuCadPac);

        menuVisPac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        menuVisPac.setText("Visualiza Paciente");
        menuVisPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisPacActionPerformed(evt);
            }
        });
        menuFerramentas.add(menuVisPac);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem3.setText("Visualiza Consultas");
        menuFerramentas.add(jMenuItem3);

        jMenuBar1.add(menuFerramentas);

        menuAjuda.setText("Ajuda");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("Sobre");
        menuAjuda.add(jMenuItem1);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCadastrarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnCadastrarPacientes)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarConsulta)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPacientesActionPerformed
        CadastroPaciente cp = new CadastroPaciente();
        cp.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCadastrarPacientesActionPerformed

    private void btnCadastrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarConsultaActionPerformed
        CadastroConsulta cc = new CadastroConsulta();
        cc.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnCadastrarConsultaActionPerformed

    private void menuCadConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadConActionPerformed
        CadastroPaciente cp = new CadastroPaciente();
        cp.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_menuCadConActionPerformed

    private void menuCadPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadPacActionPerformed
        CadastroConsulta cc = new CadastroConsulta();
        cc.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_menuCadPacActionPerformed

    private void menuVisPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisPacActionPerformed
        VisualizaPaciente vp = new VisualizaPaciente();
        vp.setVisible(true);
    }//GEN-LAST:event_menuVisPacActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarConsulta;
    private javax.swing.JButton btnCadastrarPacientes;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenuItem menuCadCon;
    private javax.swing.JMenuItem menuCadPac;
    private javax.swing.JMenu menuFerramentas;
    private javax.swing.JMenuItem menuVisPac;
    // End of variables declaration//GEN-END:variables
}
