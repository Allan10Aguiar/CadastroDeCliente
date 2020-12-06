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
public class Venda {
    
    private int idVenda;
    private int idClienteFK;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIdClienteFK() {
        return idClienteFK;
    }

    public void setIdClienteFK(int idClienteFK) {
        this.idClienteFK = idClienteFK;
    }
    
    
    
}
