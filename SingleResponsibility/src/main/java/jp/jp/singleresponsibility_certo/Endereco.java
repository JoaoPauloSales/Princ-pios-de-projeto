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
public class Endereco {
    private String logradouro;
    private String numero;
    private String UF;
    private String cidade;
    private String bairro;
    private String CEP;
    
    public Endereco(String log, String uf, String bairro, String cidade, String num, String cep){
        this.logradouro = log;
        this.UF = uf;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = num;    
        this.CEP = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getUF() {
        return UF;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCEP() {
        return CEP;
    }
    
    
    
}
