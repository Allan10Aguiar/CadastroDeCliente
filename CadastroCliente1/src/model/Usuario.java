/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Allan Aguiar
 */
public class Usuario {
    
    private String NomeDeUsuario;
    private String SenhaDoUsuario;
    private int idUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeDeUsuario() {
        return NomeDeUsuario;
    }

    public void setNomeDeUsuario(String NomeDeUsuario) {
        this.NomeDeUsuario = NomeDeUsuario;
    }

    public String getSenhaDoUsuario() {
        return SenhaDoUsuario;
    }

    public void setSenhaDoUsuario(String SenhaDoUsuario) {
        this.SenhaDoUsuario = SenhaDoUsuario;
    }
    
    
    
}
