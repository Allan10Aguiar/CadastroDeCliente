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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;
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
    
    //Metodo alterar
    public void alterar(Usuario obj) {
        try {
            String sql = "update tbUsuario set nomeUsuario=?, senhaUsuario=? where idUsuario=? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNomeDeUsuario());            
            stmt.setString(2, obj.getSenhaDoUsuario());
            
            
            //Pegando o codigo do cliente para alterar
            stmt.setDouble(3, obj.getIdUsuario());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }
    
    //METODO DE EXCLUIR
    public void excluir(Usuario obj) {
        try {
            String sql = "delete from tbUsuario where idUsuario = ? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Pegando o codigo do cliente para excluir
            stmt.setInt(1, obj.getIdUsuario());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }
    
    //Metodo Listar todos usuários
    public List listarTodosUsuarios() {

        try {

            List<Usuario> lista = new ArrayList<>();
            String sql = "select * from tbUsuario";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Usuario obj = new Usuario();

                obj.setIdUsuario(rs.getInt("idUsuario"));
                obj.setNomeDeUsuario(rs.getString("nomeUsuario"));             
                obj.setSenhaDoUsuario(rs.getString("senhaUsuario"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
