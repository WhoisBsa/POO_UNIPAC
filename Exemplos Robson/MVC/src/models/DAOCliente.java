/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author robsonresende
 */
public class DAOCliente {
    public static final String driver = "com.mysql.jdbc.Driver";
    //IP do banco, porta e o nome do banco
    public static final String url = "jdbc:mysql://localhost:3306/bdaula";
    public static final String user = "root";
    public static final String psswd = "root";
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public static java.sql.Connection conectar() {
        try {
            Class.forName(driver);
            return DriverManager.getConnection(url, user, psswd);
            
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }
    
    public static void fecharConexao(java.sql.Connection con) {
        if(con != null) {
            try {
                con.close();
            }catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public void salvar(Cliente c) {
        String sql = "insert into cliente(nome,idade,cpf) "
                + "values(?,?,?)";
        
        conexao = this.conectar();
        
        try{
            pst = conexao.prepareStatement(sql);
            pst.setString(1, c.getNome());
            pst.setString(2, c.getIdade());
            pst.setString(3, c.getCpf());
            int adicionado = pst.executeUpdate();
            
            if(adicionado > 0)
                System.out.println("Cliente cadastrado com sucesso!");
            else
                System.out.println("Não foi possível cadastrar o cliente!");
        }catch(Exception e) {
            System.out.println(e);
        }finally {
            this.fecharConexao(conexao);
        }
    }
}
