/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.reuso_por_composicao_errado;

/**
 *
 * @author João Paulo
 */
public abstract class Conta {
    
    private String nunConta;
    private String agencia;
    private double saldo;
    private String titular;

    
    public void aplica(){
        this.saldo *= 0.1;
    }
    
    public void deposita(double valor){
        this.saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado!");
    }
    
    public void saca(double valor){
        if(this.saldo >= valor )
            this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado!");        
    }
    
    public void resgata(double valor){
        if(valor <= this.saldo * 0.1)
            this.saldo -= valor;
        System.out.println("Resgate de R$" + valor + " realizado!");
    }

    public String getNunConta() {
        return nunConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setNunConta(String nunConta) {
        this.nunConta = nunConta;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
