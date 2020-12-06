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
public class ItensVenda extends Produto {
    
    private int idItemVenda;
    private int idVendaFK;
    private int idProdutoFK;
    private int quantidade;
    private double valorUnit;
    private double valorItem;

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public int getIdItemVenda() {
        return idItemVenda;
    }

    public void setIdItemVenda(int idItemVenda) {
        this.idItemVenda = idItemVenda;
    }

    public int getIdVendaFK() {
        return idVendaFK;
    }

    public void setIdVendaFK(int idVendaFK) {
        this.idVendaFK = idVendaFK;
    }

    public int getIdProdutoFK() {
        return idProdutoFK;
    }

    public void setIdProdutoFK(int idProdutoFK) {
        this.idProdutoFK = idProdutoFK;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
