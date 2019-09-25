package Telas;

import Classes.Jogador;
import Classes.Perguntas;
import javax.swing.JOptionPane;

public class TelaPerguntas extends javax.swing.JFrame {
    private int numPerguntas = 12;
    private int posicao = 0;
    protected int resposta;
    protected int pontos[] = {0, 1000, 2500, 5000, 10000, 25000, 50000, 100000, 250000, 500000, 1000000};
    protected int posicaoPonto = 0;
    protected Jogador jogador = new Jogador();
    Perguntas perguntas[] = new Perguntas[numPerguntas];
    
    public TelaPerguntas() {
        initComponents();    
    }
    
    public TelaPerguntas(Jogador jogador) {
        initComponents();
        this.jogador = jogador;
        lblNomeJogador.setText(this.jogador.getNome());
        lblPontos.setText("R$" + String.valueOf(this.jogador.getPontos()));
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNomeJogador = new javax.swing.JLabel();
        btnConfirmar = new javax.swing.JButton();
        btnPular = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        radioResposta2 = new javax.swing.JRadioButton();
        radioResposta1 = new javax.swing.JRadioButton();
        radioResposta3 = new javax.swing.JRadioButton();
        radioResposta4 = new javax.swing.JRadioButton();
        lblPergunta = new javax.swing.JLabel();
        lblPontos = new javax.swing.JLabel();

        jRadioButton3.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeJogador.setText("jLabel1");

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnPular.setText("Pular");

        btnParar.setText("Parar");

        buttonGroup1.add(radioResposta2);
        radioResposta2.setText("jRadioButton1");

        buttonGroup1.add(radioResposta1);
        radioResposta1.setText("jRadioButton1");

        buttonGroup1.add(radioResposta3);
        radioResposta3.setText("jRadioButton1");

        buttonGroup1.add(radioResposta4);
        radioResposta4.setText("jRadioButton1");

        lblPergunta.setText("jLabel1");
        lblPergunta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblPerguntaAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lblPontos.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblNomeJogador))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioResposta1)
                                    .addComponent(radioResposta3))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnParar))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioResposta2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioResposta4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblPergunta)))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPontos)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeJogador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPontos)
                .addGap(13, 13, 13)
                .addComponent(lblPergunta)
                .addGap(18, 18, 18)
                .addComponent(radioResposta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioResposta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioResposta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioResposta4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar)
                    .addComponent(btnPular)
                    .addComponent(btnParar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        resposta = 0;
        
        if(radioResposta1.isSelected()){
            resposta = 1;
        }
        else if(radioResposta2.isSelected()){
            resposta = 2;
        }
        else if(radioResposta3.isSelected()){
            resposta = 3;
        }
        else if(radioResposta4.isSelected()){
            resposta = 4;
        }
        
        if(resposta == 0){
            JOptionPane.showMessageDialog(rootPane, "Glu glu faltou responder!!!");
        }
        else if(resposta == perguntas[posicao].getAlternativaCorreta()){
            JOptionPane.showMessageDialog(rootPane, "Glu glu ahhhhhhhhhh ié ié!!!");
            posicao += 1;
            posicaoPonto += 1;
            this.jogador.setPontos(pontos[posicaoPonto]);
            setPerguntas();
        }
        else{
            this.jogador.setPontos(pontos[posicaoPonto] / 2);
            System.out.println(this.jogador.getPontos());
            JOptionPane.showMessageDialog(rootPane, "Glu glu salsi fu fu!!!");
            this.dispose();
        }
        
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void lblPerguntaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblPerguntaAncestorAdded
        perguntas[0] = new Perguntas("1+1","1","2","3","4",2);
        perguntas[1] = new Perguntas("1+2","1","2","3","4",3);
        perguntas[2] = new Perguntas("1+3","1","2","3","4",4);
        perguntas[3] = new Perguntas("1+4","5","2","3","4",1);
        perguntas[4] = new Perguntas("1+5","1","6","3","4",2);
        perguntas[5] = new Perguntas("1+6","1","2","7","4",3);
        perguntas[6] = new Perguntas("1+7","1","2","3","8",4);
        perguntas[7] = new Perguntas("1+8","9","2","3","4",1);
        perguntas[8] = new Perguntas("1+9","1","10","3","4",2);
        perguntas[9] = new Perguntas("1+10","1","2","11","4",3);
        perguntas[10] = new Perguntas("1+11","1","2","3","12",4);
        perguntas[11] = new Perguntas("1+12","1","13","3","4",2);
        setPerguntas();
    }//GEN-LAST:event_lblPerguntaAncestorAdded
    
    public void setPerguntas(){
        lblPergunta.setText(perguntas[posicao].getPergunta());
        radioResposta1.setText(perguntas[posicao].getAlternativaA());
        radioResposta2.setText(perguntas[posicao].getAlternativaB());
        radioResposta3.setText(perguntas[posicao].getAlternativaC());
        radioResposta4.setText(perguntas[posicao].getAlternativaD());
        lblPontos.setText("R$" + String.valueOf(this.jogador.getPontos()));
        buttonGroup1.clearSelection();
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
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnPular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JLabel lblNomeJogador;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPontos;
    private javax.swing.JRadioButton radioResposta1;
    private javax.swing.JRadioButton radioResposta2;
    private javax.swing.JRadioButton radioResposta3;
    private javax.swing.JRadioButton radioResposta4;
    // End of variables declaration//GEN-END:variables
}
