/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.main;

import jp.jp.open_closed_errado.PagamentoE;
import jp.jp.open_cosed_certo.PagamentoComDinheiro;

/**
 *
 * @author João Paulo
 */
public class Principal {
    
    public static void main(String[] args){
        
        try{
            //Errado
            PagamentoE pag = new PagamentoE();            
            pag.pagarComDinheiro(2200);
            //Fim errado
            
            
            System.out.println("\n-------------------------------------\n");
            
            //Certo           
            PagamentoComDinheiro pagDin = new PagamentoComDinheiro();
            pagDin.pagar(2000);            
            //Fim certo
        
        
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    }
    
}
