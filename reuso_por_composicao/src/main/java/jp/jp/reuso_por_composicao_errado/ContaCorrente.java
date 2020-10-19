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
public class ContaCorrente extends Conta{
    
    private double tax;
    
    public ContaCorrente(String num, String agencia, double saldo, String titular){
        this.setNunConta(num);
        this.setTitular(titular);
        this.setSaldo(saldo);
        this.setAgencia(agencia);
    }
    
    public void taxa(){
        this.tax = (this.getSaldo() * 0.07) - this.getSaldo();
        System.out.println("A taxa cobrada é de R$" + tax);
    }
    
}
