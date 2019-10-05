/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Classes.Banco;
import Classes.ContaCorrente;
import Classes.ContaPoupanca;

/**
 *
 * @author hemilio
 */
public class Principal extends javax.swing.JFrame {
    Banco banco = new Banco();
    ContaCorrente cc;
    ContaPoupanca cp;
    int numeroConta, numeroContaDestino;
    double saldo, deposito, saque, transferir;
    
    

    /**
     * Creates new form Principa
     */
    public Principal() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtNumConta = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        btnCriar = new javax.swing.JButton();
        btnProcurar = new javax.swing.JButton();
        rbCorrente = new javax.swing.JRadioButton();
        rbPoupanca = new javax.swing.JRadioButton();
        lblDadosConta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        btnSacar = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        txtDeposito = new javax.swing.JTextField();
        txtSaque = new javax.swing.JTextField();
        txtValorTransferir = new javax.swing.JTextField();
        rbCorrenteTrans = new javax.swing.JRadioButton();
        rbPoupancaTrans = new javax.swing.JRadioButton();
        txtContaDestino = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumConta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCriar.setText("Criar Conta");
        btnCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarActionPerformed(evt);
            }
        });

        btnProcurar.setText("Procurar");
        btnProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbCorrente);
        rbCorrente.setSelected(true);
        rbCorrente.setText("Corrente");

        buttonGroup1.add(rbPoupanca);
        rbPoupanca.setText("Poupança");

        lblDadosConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDadosConta.setText("Selecione o tipo de conta antes de realizar qualquer operação.");

        jLabel1.setText("Numero:");

        jLabel2.setText("Saldo:");

        btnExcluir.setBackground(new java.awt.Color(255, 0, 51));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnSacar.setText("Sacar");
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        btnTransferir.setText("Transferir");
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbCorrenteTrans);
        rbCorrenteTrans.setSelected(true);
        rbCorrenteTrans.setText("CC");

        buttonGroup2.add(rbPoupancaTrans);
        rbPoupancaTrans.setText("CP");

        jLabel3.setText("Destino:");

        jLabel4.setText("Valor:");

        jLabel5.setText("Valor:");

        jLabel6.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel1)))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPoupanca)
                                    .addComponent(rbCorrente))
                                .addGap(168, 168, 168)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4))
                                    .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnCriar)
                                .addGap(18, 18, 18)
                                .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbCorrenteTrans)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPoupancaTrans))
                            .addComponent(btnTransferir)
                            .addComponent(txtValorTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(lblDadosConta, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCorrenteTrans)
                            .addComponent(rbPoupancaTrans)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbCorrente))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbPoupanca)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDepositar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSacar)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtValorTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTransferir))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluir)
                        .addComponent(btnProcurar)
                        .addComponent(btnCriar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDadosConta)
                .addGap(137, 137, 137))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarActionPerformed
              
        if(txtSaldo.getText().equalsIgnoreCase("") || txtNumConta.getText().equalsIgnoreCase("")){
            lblDadosConta.setText("Insira os dados corretamente!");
        }
        else{
            numeroConta = Integer.parseInt(txtNumConta.getText());
            saldo = Double.parseDouble(txtSaldo.getText());
            
            if(rbCorrente.isSelected()){
            cc = new ContaCorrente(numeroConta, saldo);
                if(banco.inserir(cc))
                    lblDadosConta.setText("Conta criada com sucesso!");
                else
                    lblDadosConta.setText("Falha ao criar a conta! Conta já existe ou número de contas excedido!");
                } 
            else{
                cp = new ContaPoupanca(numeroConta, saldo);
                if(banco.inserir(cp))
                    lblDadosConta.setText("Conta criada com sucesso!");
                else
                    lblDadosConta.setText("Falha ao criar a conta! Conta já existe ou número de contas excedido!");
            }
        }
        
        
    }//GEN-LAST:event_btnCriarActionPerformed

    private void btnProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarActionPerformed
        numeroConta = Integer.parseInt(txtNumConta.getText());
        String dados = "";
        String dadosNumConta = "";
        String dadosSaldo = "";    
        
        lblDadosConta.setText("");
        
        if(rbCorrente.isSelected()){
            cc = banco.procurarContaCorrente(numeroConta);
            if(cc.getNumConta() == -1){
                lblDadosConta.setText("Conta não existe!");
            }
            else{
                dadosNumConta = String.valueOf(cc.getNumConta());
                dadosSaldo = String.valueOf(cc.getSaldo());
                dados = "CONTA CORRENTE:\n" + " Número: " + dadosNumConta + "\n Saldo: R$" + dadosSaldo + "";
                lblDadosConta.setText(dados);
                txtSaldo.setText(String.valueOf(cc.getSaldo()));
            } 
        } 
        else{
            cp = banco.procurarContaPoupanca(numeroConta);
            if(cp.getNumConta() == -1){
                lblDadosConta.setText("Conta não existe!");
            }
            else{
                dadosNumConta = String.valueOf(cp.getNumConta());
                dadosSaldo = String.valueOf(cp.getSaldo());
                dados = "CONTA POUPANÇA:\n" + " Número: " + dadosNumConta + "\n Saldo: R$" + dadosSaldo + "";
                lblDadosConta.setText(dados);
                txtSaldo.setText(String.valueOf(cp.getSaldo()));
            }
        }
    }//GEN-LAST:event_btnProcurarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        numeroConta = Integer.parseInt(txtNumConta.getText());
        
        lblDadosConta.setText("");
        
        if(rbCorrente.isSelected()){
            cc = new ContaCorrente(numeroConta, 0);
            banco.remover(cc);
            lblDadosConta.setText("Conta corrente nº" + cc.getNumConta() + " excluida!");
            txtSaldo.setText("");
            txtNumConta.setText("");
        } 
        else{
            cp = new ContaPoupanca(numeroConta,0);
            banco.remover(cp);
            lblDadosConta.setText("Conta poupança nº" + cc.getNumConta() + " excluida!");
            txtSaldo.setText("");
            txtNumConta.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        if(txtDeposito.getText().equalsIgnoreCase("") || txtNumConta.getText().equalsIgnoreCase("") || txtSaldo.getText().equalsIgnoreCase("")){
            lblDadosConta.setText("Preencha os campos corretamente!");
            return;
        }
        else{
            deposito = Double.parseDouble(txtDeposito.getText());
            numeroConta = Integer.parseInt(txtNumConta.getText());
            saldo = Double.parseDouble(txtSaldo.getText());
        }

        int posicao;
        
        
        if(txtDeposito.getText().equalsIgnoreCase("0")){
                lblDadosConta.setText("Impossível depósito de R$0,00!");
        }
        else{
            if(rbCorrente.isSelected()){        
                cc = new ContaCorrente(numeroConta, saldo);
                posicao = banco.procurarPosicaoConta(cc);
                banco.cc[posicao].depositar(deposito);
                txtSaldo.setText(String.valueOf(banco.cc[posicao].getSaldo()));
                lblDadosConta.setText("Depositado!");
                txtDeposito.setText("");
            } 
            else{
                cp = new ContaPoupanca(numeroConta, saldo);
                posicao = banco.procurarPosicaoConta(cp);
                banco.cp[posicao].depositar(deposito);
                txtSaldo.setText(String.valueOf(banco.cp[posicao].getSaldo()));
                lblDadosConta.setText("Depositado!");
                txtDeposito.setText("");
            }
        }
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        
        if(txtSaque.getText().equalsIgnoreCase("") || txtNumConta.getText().equalsIgnoreCase("")){
            lblDadosConta.setText("Insira os dados corretamente!");
            return;
        }
        else{
            saque = Double.parseDouble(txtSaque.getText());
            numeroConta = Integer.parseInt(txtNumConta.getText());
        }
        
        
        int posicao;
        
        if(rbCorrente.isSelected()){
            cc = new ContaCorrente(numeroConta, saldo);
            posicao = banco.procurarPosicaoConta(cc);
            if(banco.cc[posicao].sacar(saque)){
                txtSaldo.setText(String.valueOf(banco.cc[posicao].getSaldo()));
                lblDadosConta.setText("Saque bem sucedido!");
                txtSaque.setText("");
            }
            else
                lblDadosConta.setText("Saldo insuficiente!");
            
        } 
        else{
            cp = new ContaPoupanca(numeroConta, saldo);
            posicao = banco.procurarPosicaoConta(cp);
            if(banco.cp[posicao].sacar(saque)){
                txtSaldo.setText(String.valueOf(banco.cp[posicao].getSaldo()));
                lblDadosConta.setText("Saque bem sucedido!");
                txtSaque.setText("");
            }
            else
               lblDadosConta.setText("Saldo insuficiente!"); 
        }
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        if(txtValorTransferir.getText().equalsIgnoreCase("") || txtContaDestino.getText().equalsIgnoreCase("") || txtNumConta.getText().equalsIgnoreCase("")){
            lblDadosConta.setText("Preencha os campos corretamente!");
            return;
        }
            
        else{
            transferir = Double.parseDouble(txtValorTransferir.getText());
            numeroContaDestino = Integer.parseInt(txtContaDestino.getText());
        }
            
        
        numeroConta = Integer.parseInt(txtNumConta.getText());
        
        saldo = 0;
        
        int posicao, posicaoDestino;
        
        if(rbCorrente.isSelected()){
            cc = new ContaCorrente(numeroConta, saldo);
            posicao = banco.procurarPosicaoConta(cc);
            
            if(rbCorrenteTrans.isSelected()){
                cc = new ContaCorrente(numeroContaDestino, saldo);
                posicaoDestino = banco.procurarPosicaoConta(cc);
                if(posicaoDestino != this.banco.cc.length && !(txtContaDestino.getText().equalsIgnoreCase("")) && !(txtValorTransferir.getText().equalsIgnoreCase(""))){
                    banco.cc[posicao].transferir(transferir, banco.cc[posicaoDestino]);
                    lblDadosConta.setText("Transferido!");
                    txtSaldo.setText(String.valueOf(banco.cc[posicao].getSaldo()));
                }
                else
                    lblDadosConta.setText("Conta de destino não existe!");
            }
            else{
                cp = new ContaPoupanca(numeroContaDestino, saldo);
                posicaoDestino = banco.procurarPosicaoConta(cp); 
                if(posicaoDestino != this.banco.cp.length && !(txtContaDestino.getText().equalsIgnoreCase("")) && !(txtValorTransferir.getText().equalsIgnoreCase(""))){
                    banco.cc[posicao].transferir(transferir, banco.cp[posicaoDestino]);
                    lblDadosConta.setText("Transferido!");
                    txtSaldo.setText(String.valueOf(banco.cc[posicao].getSaldo()));
                }  
                else
                    lblDadosConta.setText("Conta de destino não existe!");  
            }
            
            
        } 
        else{
            cp = new ContaPoupanca(numeroConta, saldo);
            posicao = banco.procurarPosicaoConta(cp);
            
            if(rbCorrenteTrans.isSelected()){
                cc = new ContaCorrente(numeroContaDestino, saldo);
                posicaoDestino = banco.procurarPosicaoConta(cc);
                
                if(posicaoDestino != this.banco.cc.length && !(txtContaDestino.getText().equalsIgnoreCase("")) && !(txtValorTransferir.getText().equalsIgnoreCase(""))){
                    banco.cp[posicao].transferir(transferir, banco.cc[posicaoDestino]);
                    lblDadosConta.setText("Transferido!");
                    txtSaldo.setText(String.valueOf(banco.cp[posicao].getSaldo()));
                }
                else{
                    lblDadosConta.setText("Conta de destino não existe!");
                }
                
            }
            else{
                cp = new ContaPoupanca(numeroContaDestino, saldo);
                posicaoDestino = banco.procurarPosicaoConta(cp); 
                if(posicaoDestino != this.banco.cp.length && !(txtContaDestino.getText().equalsIgnoreCase("")) && !(txtValorTransferir.getText().equalsIgnoreCase(""))){
                    banco.cp[posicao].transferir(transferir, banco.cp[posicaoDestino]);
                    lblDadosConta.setText("Transferido!");
                    txtSaldo.setText(String.valueOf(banco.cp[posicao].getSaldo()));
                }
                else{
                    lblDadosConta.setText("Conta de destino não existe!");
                }
                
            }
        }
    }//GEN-LAST:event_btnTransferirActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriar;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnTransferir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDadosConta;
    private javax.swing.JRadioButton rbCorrente;
    private javax.swing.JRadioButton rbCorrenteTrans;
    private javax.swing.JRadioButton rbPoupanca;
    private javax.swing.JRadioButton rbPoupancaTrans;
    private javax.swing.JTextField txtContaDestino;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextField txtNumConta;
    private javax.swing.JTextField txtSaldo;
    private javax.swing.JTextField txtSaque;
    private javax.swing.JTextField txtValorTransferir;
    // End of variables declaration//GEN-END:variables
}
