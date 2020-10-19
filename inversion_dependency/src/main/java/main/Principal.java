/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import jp.jp.inversion_dependency_certo.IDispositivo;
import jp.jp.inversion_dependency_certo.InterruptorC;
import jp.jp.inversion_dependency_certo.LampadaC;
import jp.jp.inversion_dependency_certo.TV;
import jp.jp.inversion_dependency_errado.Interruptor;
import jp.jp.inversion_dependency_errado.Lampada;

/**
 *
 * @author João Paulo
 */
public class Principal {
     
    public static void main(String[] args){
    
        try{
            //Errado
            Interruptor in = new Interruptor();     
            Lampada la = new Lampada();
            in.liga(la);
            in.liga(la);
            //Fim errado
        
            System.out.println("\n----------------------\n");
            //Certo
            InterruptorC inc = new InterruptorC();
            IDispositivo lac = new LampadaC();
            IDispositivo tv = new TV();
            
            inc.liga(tv);
            inc.liga(lac);
            inc.liga(tv);  
            //Fim certo
            
            
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    
    
    }
    
    
}
