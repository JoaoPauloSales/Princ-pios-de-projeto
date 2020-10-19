/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.singleresponsibility_certo;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author João Paulo
 */
public class Conta {
    
    private Cliente cliente;
    private double saldo;
    private ArrayList<String> extrato = new ArrayList<>();
    private LocalDate data;
    
    public Conta(Cliente cliente, double saldo){
        this.cliente = cliente;
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

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    @Override
    public String toString(){
        String retorno = "Extrato bancário\n";
        retorno += "Cliente: " + this.cliente.nome + "\n";
        for(String ext : extrato){
            retorno += ext.toString() + "\n";
        }
        retorno += "Saldo atual: R$" + getSaldo();
        return retorno;
    } 
}
