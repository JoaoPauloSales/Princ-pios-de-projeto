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
public class ContaPoupanca extends Conta{
    
    private double rendimento;
    
    public void rendimento(){
        this.rendimento = this.getSaldo()*0.02;
        System.out.println("O rendimento atual é de R$" + rendimento);
    }
}
