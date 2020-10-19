/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.main;

import jp.jp.liskov_substitution_certo.Analista;
import jp.jp.liskov_substitution_certo.Programador;
import jp.jp.liskov_substitution_errado.ProgramadorE;

/**
 *
 * @author João Paulo
 */
public class Principal {
    
    public static void main(String[] args){
    
        try{
            
            //Errado
            ProgramadorE pe = new ProgramadorE("Leandro Augusto", 2000, "A", 200);
            System.out.println(pe.toString());
            //fim errado
            
            System.out.println("\n----------------------------------\n");
        
            //Certo
            Programador p1 = new Programador("Luis Henrique", 2300, "Fox" , 100);
            System.out.println("\n"+ p1.toString());
            Analista a1 = new Analista("Maria Oliveira", 3000, "Fox, A", 300);
            System.out.println(a1.toString());
            //Fim certo
            
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    
    
    }
}
