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
public class EnderecoC {
    
    private String logradouro;
    private String bairro;
    private int num;
    private String cidade;
    private UF uf;
    
    public EnderecoC(String log, String bairro, int num, String cidade, UF uf){
        this.logradouro = log;
        this.bairro = bairro;
        this.cidade = cidade;
        this.num = num;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UF getUf() {
        return uf;
    }

    public void setUf(UF uf) {
        this.uf = uf;
    }
    
    
}
