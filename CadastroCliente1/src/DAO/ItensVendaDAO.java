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
import model.ItensVenda;

/**
 *
 * @author Allan Aguiar
 */
public class ItensVendaDAO {
    
    private Connection conexao;

    public ItensVendaDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }
    
    public void inserirItem(ItensVenda obj){
        
        try {
            String sql = "call inserirItemVenda(?,?)";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            stmt.setInt(1, obj.getIdProdutoFK());
            stmt.setInt(2, obj.getQuantidade());
            
            stmt.execute();
            stmt.close();
                    
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
     //METODO DE EXCLUIR
    public void excluir(ItensVenda obj) {
        try {
            String sql = "delete from tbItensVenda where idItemVenda = ? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Pegando o codigo do item para excluir
            stmt.setInt(1, obj.getIdItemVenda());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }
    
    //Metodo Listar
    public ItensVenda listarCodigo(ItensVenda item) {

        try {           
            String sql = "select MAX(idItemVenda) from tbItensVenda";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            ItensVenda obj = new ItensVenda();

            while (rs.next()) {              

                obj.setIdItemVenda(rs.getInt("idItemVenda"));

            }
            return obj;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
    //Metodo Listar todos os itens
    public List listarTodosItens() {

        try {

            List<ItensVenda> lista = new ArrayList<>();
            String sql = "call selecionarItens";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ItensVenda obj = new ItensVenda();

                obj.setIdItemVenda(rs.getInt("idItemVenda"));
                obj.setNomeProduto(rs.getString("nomeProd"));
                obj.setQuantidade(rs.getInt("quantidade"));
                obj.setValorUnit(rs.getDouble("valorUnit"));
                obj.setValorItem(rs.getDouble("valorItem"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    
}
