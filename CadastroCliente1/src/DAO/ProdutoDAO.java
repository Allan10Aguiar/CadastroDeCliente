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
import model.Produto;

/**
 *
 * @author Allan Aguiar
 */
public class ProdutoDAO {

    private Connection conexao;

    public ProdutoDAO() {
        this.conexao = new ConnectionFactory().getConnection();
    }

    //Metodo cadastrar
    public void cadastrar(Produto obj) {
        try {
            String sql = "insert into tbProduto (nomeProduto, descricao, precoCusto, precoVenda) values (?,?,?,?) ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNomeProduto());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getCusto());
            stmt.setDouble(4, obj.getVenda());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }

    //Metodo alterar
    public void alterar(Produto obj) {
        try {
            String sql = "update tbProduto set nomeProduto=?, descricao=?, precoCusto=?, precoVenda=? where idProduto=? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNomeProduto());
            stmt.setString(2, obj.getDescricao());
            stmt.setDouble(3, obj.getCusto());
            stmt.setDouble(4, obj.getVenda());

            //Pegando o codigo do cliente para alterar
            stmt.setInt(5, obj.getIdProduto());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //METODO DE EXCLUIR
    public void excluir(Produto obj) {
        try {
            String sql = "delete from tbProduto where idProduto = ? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Pegando o codigo do produto para excluir
            stmt.setInt(1, obj.getIdProduto());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //Metodo Listar todos produtos
    public List listarTodosProdutos() {

        try {

            List<Produto> lista = new ArrayList<>();
            String sql = "select * from tbProduto";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto obj = new Produto();

                obj.setIdProduto(rs.getInt("idProduto"));
                obj.setNomeProduto(rs.getString("nomeProduto"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setCusto(rs.getDouble("precoCusto"));
                obj.setVenda(rs.getDouble("precoVenda"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    //Metodo Listar todos produtos
    public List listarTodosProdutosPorID(Produto obj) {

        try {

            List<Produto> lista = new ArrayList<>();
            String sql = "select * from tbProduto where idProduto=?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            //Pegando o codigo do produto para excluir
            ps.setInt(1, obj.getIdProduto());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();

                p.setIdProduto(rs.getInt("idProduto"));
                p.setNomeProduto(rs.getString("nomeProduto"));
                p.setDescricao(rs.getString("descricao"));
                p.setCusto(rs.getDouble("precoCusto"));
                p.setVenda(rs.getDouble("precoVenda"));

                lista.add(p);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Produto buscarDados(int id) {
        try {

            String sql = "select nomeProduto, precoVenda from tbProduto where idProduto=?";

            PreparedStatement ps = conexao.prepareStatement(sql);
            
            //Pegando o codigo do produto para buscar
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            Produto obj = new Produto();

            while (rs.next()) {                
                obj.setNomeProduto(rs.getString("nomeProduto"));                
                obj.setVenda(rs.getDouble("precoVenda"));
            }

            return obj;
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
