/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.singleresponsibility_errado;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author João Paulo
 */
public class ContaE {
    
    private String cliente;
    private String endereco;
    private double saldo;
    private ArrayList<String> extrato = new ArrayList<>();
    private LocalDate data;
    
    public ContaE(String nome, String edereco, double saldo){
        this.cliente = nome;
        this.endereco = endereco;
        this.saldo = saldo;
        extrato(saldo, '+');
    }
    
    public void depositar(double valor){
        this.saldo += valor;
        extrato(valor, '+');
    }
    
    public void sacar(double valor){
        this.saldo -= valor;
        extrato(valor, '-');
    }
    
    public void extrato(double valor, char sinal){
        String data = this.data.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.extrato.add("Data: "+ data + " Transação: " + sinal + valor);        
    }

    public String getCliente() {
        return cliente;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    @Override
    public String toString(){
        String retorno = "Extrato bancário\n";
        retorno += "Cliente: " + this.cliente + "\n";
        for(String ext : extrato){
            retorno += ext.toString() + "\n";
        }
        retorno += "Saldo atual: R$" + getSaldo();
        return retorno;
    } 
}
