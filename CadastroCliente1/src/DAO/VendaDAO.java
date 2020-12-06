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
import model.Venda;

/**
 *
 * @author Allan Aguiar
 */
public class VendaDAO {
    
    private Connection conexao;

    public VendaDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    //INSERIR UMA NOVA VENDA
    public void inserirVenda(Venda obj){
        try {
            String sql = "call inserirVenda(?)";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, obj.getIdClienteFK()); 
            
            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
    
    public Venda selecionarMaiorID(){
        try {
            String sql = "select MAX(idVenda) from tbVenda";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            
            Venda obj = new Venda();

            while (rs.next()) {
                obj.setIdVenda(rs.getInt("MAX(idVenda)"));
            }
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public void alterarPagamento(int cod, String forma){
        try {
            String sql = "UPDATE `tbvenda` SET `pagamento`= ? WHERE idVenda=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, forma);
            ps.setInt(2, cod);
            
            ps.execute();
            ps.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
    
}
