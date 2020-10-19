/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.singleresponsibility_certo;

/**
 *
 * @author João Paulo
 */
public class Cliente {
    
    public String nome;
    public Endereco endereco;
    
    public Cliente(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }  

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
