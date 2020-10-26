/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

/**
 *
 * @author Allan Aguiar
 */
public class UsuarioDAO {
    
    private Connection conexao;

    public UsuarioDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    public boolean efetuarLogin(Usuario obj){
        boolean auth = false;
        try {
            String sql = "SELECT nomeUsuario, senhaUsuario FROM tbUsuario WHERE nomeUsuario=? and senhaUsuario=?";
            
            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNomeDeUsuario());           
            stmt.setString(2, obj.getSenhaDoUsuario());
            
            ResultSet rs;
            rs = stmt.executeQuery();

            if (rs.next()) {
                String user = rs.getString("nomeUsuario");
                String pass = rs.getString("senhaUsuario");
                
                auth = true;
            } else {
                //JOptionPane.showMessageDialog(this, "Acesso Negado \nInforme o setor de Inventário");
                stmt.close();
                return auth;
            }
            
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
        
        return auth;
        
    }
    
    public void cadastrarUsuario(Usuario obj){
         try {
            String sql = "insert into tbUsuario (nomeUsuario, senhaUsuario) values (?,?) ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNomeDeUsuario());           
            stmt.setString(2, obj.getSenhaDoUsuario());
                        
          
            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
    
    
}
