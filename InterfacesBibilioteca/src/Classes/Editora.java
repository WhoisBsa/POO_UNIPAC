
package Classes;

public class Editora {
    protected String nome;
    protected String cidade;
    
    public Editora(){
        
    }
    
    public Editora(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    
}
