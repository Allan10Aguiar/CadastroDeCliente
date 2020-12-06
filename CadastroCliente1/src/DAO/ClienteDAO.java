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

    //Metodo alterar
    public void alterar(Pessoa obj) {
        try {
            String sql = "update tbCliente set nome=?, sexo=?, cpf=? where id=? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getSexo());
            stmt.setString(3, obj.getCpf());

            //Pegando o codigo do cliente para alterar
            stmt.setDouble(4, obj.getId());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //METODO DE EXCLUIR
    public void excluir(Pessoa obj) {
        try {
            String sql = "delete from tbCliente where id = ? ";

            //organizar o cmd sql
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //Pegando o codigo do cliente para excluir
            stmt.setInt(1, obj.getId());

            stmt.execute();
            stmt.close();

        } catch (Exception erro) {

            throw new RuntimeException(erro);

        }
    }

    //Metodo Listar todos clientes
    public List listarTodosClientes() {

        try {

            List<Pessoa> lista = new ArrayList<>();
            String sql = "select * from tbCliente";
            PreparedStatement ps = conexao.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pessoa obj = new Pessoa();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setSexo(rs.getString("sexo"));
                obj.setCpf(rs.getString("cpf"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    //Metodo Listar todos clientes
    public List listarClientesPorNome(Pessoa p) {

        try {

            List<Pessoa> lista = new ArrayList<>();
            String sql = "select * from tbCliente where nome like ?";
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1, p.getNome());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Pessoa obj = new Pessoa();

                obj.setId(rs.getInt("id"));
                obj.setNome(rs.getString("nome"));
                obj.setSexo(rs.getString("sexo"));
                obj.setCpf(rs.getString("cpf"));

                lista.add(obj);
            }
            return lista;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public Pessoa buscarNomeCpf(int id) {
        try {

            String sql = "select nome, cpf from tbCliente where id=?";

            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Pessoa p = new Pessoa();

            while (rs.next()) {
                p.setNome(rs.getString("nome"));
                p.setCpf(rs.getString("cpf"));
            }
            return p;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
