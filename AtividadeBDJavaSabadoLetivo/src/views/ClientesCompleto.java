package views;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sql.DBconn;

public class ClientesCompleto extends javax.swing.JFrame {

    protected int id;
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String endereco;
    protected String telefone;
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public ClientesCompleto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        lblId = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnVisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Id:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Idade:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblId.setText(" ");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel7.setText("Id:");

        btnSalvar.setText("Atualizar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setForeground(new java.awt.Color(255, 0, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnVisualizar.setText("Visualizar");
        btnVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBuscar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnVisualizar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir))
                .addGap(35, 35, 35)
                .addComponent(btnVisualizar)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtBuscar.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Você não informou nenhum ID!");
        }
        else{
            id = Integer.parseInt(txtBuscar.getText());
            String sql = "select * from cliente where id = ?";

            conexao = DBconn.conectar();

            try {
                pst = conexao.prepareStatement(sql);
                pst.setInt(1, id);

                rs = pst.executeQuery();
                if(rs.next()){
                    id = Integer.parseInt(rs.getString("id"));
                    nome = rs.getString("nome");
                    idade = Integer.parseInt(rs.getString("idade"));
                    cpf = rs.getString("cpf");
                    endereco = rs.getString("endereco");
                    telefone = rs.getString("telefone");

                    lblId.setText(String.valueOf(id));
                    txtNome.setText(nome);
                    txtIdade.setText(String.valueOf(idade));
                    txtCPF.setText(cpf);
                    txtEndereco.setText(endereco);
                    txtTelefone.setText(telefone);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Nenhum item com este id!");
                }

            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
                
        id = Integer.parseInt(txtBuscar.getText());
        String sql = "delete from cliente where id = ?";

        conexao = DBconn.conectar();

        try {
            btnBuscarActionPerformed(evt);
            
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, id);

            pst.executeUpdate();

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String sql = "insert into cliente (nome, idade, cpf, endereco, telefone) values (?, ?, ?, ?, ?)";

        conexao = DBconn.conectar();

        if(txtNome.getText().isEmpty()
                || txtIdade.getText().isEmpty()
                || txtCPF.getText().isEmpty()
                || txtEndereco.getText().isEmpty()
                || txtTelefone.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos corretamente!");
        }
        else{
            try {
                nome = txtNome.getText();
                idade = Integer.parseInt(txtIdade.getText());
                cpf = txtCPF.getText();
                endereco = txtEndereco.getText();
                telefone = txtTelefone.getText();

                pst = conexao.prepareStatement(sql);
                pst.setString(1, nome);
                pst.setInt(2, idade);
                pst.setString(3, cpf);
                pst.setString(4, endereco);
                pst.setString(5, telefone);

                pst.executeUpdate();

            }
            catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarActionPerformed
        ClientesVisualizar clientesVisualizar = new ClientesVisualizar();
        clientesVisualizar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVisualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        id = Integer.parseInt(lblId.getText());
        String sql = "update cliente "
                + "set nome = ?, idade = ?, cpf = ?, endereco = ?, telefone = ?"
                + "where id = ?";

        conexao = DBconn.conectar();

        try {         
            nome = txtNome.getText();
            idade = Integer.parseInt(txtIdade.getText());
            cpf = txtCPF.getText();
            endereco = txtEndereco.getText();
            telefone = txtTelefone.getText();

            pst = conexao.prepareStatement(sql);
            pst.setString(1, nome);
            pst.setInt(2, idade);
            pst.setString(3, cpf);
            pst.setString(4, endereco);
            pst.setString(5, telefone);
            pst.setInt(6, id);

            pst.executeUpdate();

        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ClientesCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesCompleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVisualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
