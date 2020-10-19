/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.reuso_por_composicao_certo;

/**
 *
 * @author João Paulo
 */
public class ContaCorrenteC{
    
    private double tax;
    
    ContaC conta = new ContaC();
    
    public ContaCorrenteC(String num, String agencia, double saldo, String titular){
        conta.setNumConta(num);
        conta.setTitular(titular);
        conta.setSaldo(saldo);
        conta.setAgencia(agencia);
    }
    
    public void taxa(){
        this.tax = (conta.getSaldo() * 1.03) - conta.getSaldo();
        System.out.println("A taxa cobrada é de R$" + this.tax);
    }
    
}
