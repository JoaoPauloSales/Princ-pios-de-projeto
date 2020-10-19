/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.singleresponsibility.main;

import jp.jp.singleresponsibility_certo.Cliente;
import jp.jp.singleresponsibility_certo.Conta;
import jp.jp.singleresponsibility_certo.Endereco;
import jp.jp.singleresponsibility_errado.ContaE;

/**
 *
 * @author João Paulo
 */
public class Principal {
    public static void main(String[] args) {
        try{
            //Errado
            String endErrado = "Rua João da Silva, nº 22, Bairro Azul, Alegre-ES";
            String nome = "Jorge de Souza";            
            ContaE conta1 = new ContaE(nome, endErrado, 1000);            
            conta1.sacar(200);
            conta1.depositar(330);            
            System.out.println(conta1.toString());
            //Fim errado
            
            System.out.println("\n-------------------------------------------------\n");
            
            //Certo
            Endereco endCerto = new Endereco("Rua Maria Lima", "ES", "Saudade", "Alegre", "232", "29200-299");
            Cliente cliente = new Cliente("Marcelo Nova", endCerto);
            Conta contaC = new Conta(cliente, 1220);
            contaC.depositar(200);
            contaC.sacar(900);
            System.out.println(contaC.toString());
            //Fim certo
            
        
        
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    }
    
}
