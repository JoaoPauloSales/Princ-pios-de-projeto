/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import jp.jp.reuso_por_composicao_certo.ContaCorrenteC;
import jp.jp.reuso_por_composicao_certo.ContaPoupancaC;
import jp.jp.reuso_por_composicao_errado.ContaCorrente;

/**
 *
 * @author João Paulo
 */
public class Principal {
    public static void main(String[] args){
    
        try{
            //Errado
            ContaCorrente cc = new ContaCorrente("123", "112a", 2000, "Maria Silva");
            cc.deposita(1000);
            cc.saca(300);
            //Fim errado
            
            System.out.println("\n------------------------------\n");
            
            //Certo           
            ContaPoupancaC cpc = new ContaPoupancaC("344", "dd32", 3000, "Ricardo Oliveira");
            cpc.rendimento();
            cpc.aplica(3000);
            ContaCorrenteC ccc = new ContaCorrenteC("344", "dd32", 3000, "Manoel Ribeiro");
            ccc.taxa();
            //Fim certo
        
        
        
        
        }catch(RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());      
        }
    
    
    
    }
}
