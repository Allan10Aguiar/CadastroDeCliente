/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import connectionFactory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Pessoa;

/**
 *
 * @author Allan Aguiar
 */
public class ClienteDAO {
    
     private Connection conexao;

    public ClienteDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    //Metodo cadastrar
    public void cadastrar(Pessoa obj) {
        try {
            String sql = "insert into tbCliente (nome, sexo, cpf) values (?,?,?) ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNome());           
            stmt.setString(2, obj.getSexo());
            stmt.setString(3, obj.getCpf());
            
          
            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
}
