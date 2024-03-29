
package Classes;

public class ContaPoupanca extends ContaBancaria{
    protected double limite = -50.0;
    
    public ContaPoupanca(){
        
    }
    
    public ContaPoupanca(int numConta, double saldo){
        super(numConta, saldo);
    }
    
    @Override
    public boolean sacar(Double saque) {
        if((this.getSaldo() - saque) >= limite){
            double saldoAtual = this.getSaldo();
            this.setSaldo((saldoAtual - saque));
            return true;
        }
        return false;
    }

    @Override
    public void depositar(Double deposito) {
        if(deposito > 0){
            this.setSaldo(deposito + this.getSaldo());
        }
        else{
            //JOptionPane.showMessageDialog(rootPane, "Impossível depositar R$0,00");
            System.out.println("Impossível depositar R$0,00");
        }
    }
    
    @Override
    public void transferir(Double valor, ContaCorrente cc) {
        this.sacar(valor);
        cc.depositar(valor);
    }
    
    @Override
    public void transferir(Double valor, ContaPoupanca cp) {
        this.sacar(valor);
        cp.depositar(valor);
    }

    @Override
    public String mostrarDados() {
        String dados;
        
        dados = "Número da conta poupança: " + this.getNumConta() + "\n Saldo da conta: " + this.getSaldo();
        
        return dados;
    }
    
}
