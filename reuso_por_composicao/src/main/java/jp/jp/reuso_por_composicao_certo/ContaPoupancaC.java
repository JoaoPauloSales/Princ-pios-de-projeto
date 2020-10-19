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
public class ContaPoupancaC{
    
    private double rendimento;
    
    ContaC conta = new ContaC();
    
    public ContaPoupancaC(String num, String agencia, double saldo, String titular){
        conta.setNumConta(num);
        conta.setAgencia(agencia);
        conta.setSaldo(saldo);
        conta.setTitular(titular);
    
    }
    
    public void aplica(double valor){
        conta.aplica(valor);
    }
    
    public void rendimento(){
        this.rendimento = conta.getSaldo()*0.02;
        System.out.println("O rendimento atual é de R$" + rendimento);
    }
}
