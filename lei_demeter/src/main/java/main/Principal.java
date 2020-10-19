/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import jp.jp.lei_demeter_certo.ClienteC;
import jp.jp.lei_demeter_errado.Cliente;
import jp.jp.lei_demeter_errado.Endereco;
import jp.jp.lei_demeter_errado.UF;

/**
 *
 * @author João Paulo
 */
public class Principal {
    public static void main(String[] args){
    
        try{
            //Errado
            Endereco end = new Endereco("Rua da flores", "Legal", 123, "Iúna", UF.ES);
            Cliente c1 = new Cliente("Joao Amado", "111.222.111-33", end);            
            System.out.println("Sem Lei de Demeter - " + c1.getEndereco().getCidade());
            //Fim errado
            
            System.out.println("\n--------------------------------\n");
            
            //Certo
            ClienteC c2 = new ClienteC("Maria Rosa", "333.333.333-33", end);
            System.out.println("Com Lei de Demeter - " + c2.getCidade());
            //Fime certo
        
        
        }catch(RuntimeException e){
            System.err.println("Falha: " + e.getMessage());       
        }
    
    
    
    
    }
}
