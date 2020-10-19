/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.lei_demeter_errado;

/**
 *
 * @author João Paulo
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public Cliente(String nome, String cpf, Endereco end){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = end;    
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
