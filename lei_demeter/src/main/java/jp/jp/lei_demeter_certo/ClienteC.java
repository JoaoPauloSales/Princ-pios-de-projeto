/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.lei_demeter_certo;

import jp.jp.lei_demeter_errado.*;

/**
 *
 * @author João Paulo
 */
public class ClienteC {
    
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public ClienteC(String nome, String cpf, Endereco end){
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
    
    public String getCidade() {
        return endereco.getCidade();
    }
    
    public String getBairro() {
        return endereco.getBairro();
    }
    
    public String getLogradouro() {
        return endereco.getLogradouro();
    }

    public int getNum() {
        return endereco.getNum();  
    }
    
    public String getUF() {
        return endereco.getUf().toString();
    }    
    

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
