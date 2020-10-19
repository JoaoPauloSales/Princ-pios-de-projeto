/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.inversion_dependency_certo;

/**
 *
 * @author João Paulo
 */
public class InterruptorC {
    
    public void liga(IDispositivo dispositivo){
        if(!dispositivo.getLigada()){
            dispositivo.ligar();
            System.out.println(dispositivo + " ON");
        }    
        else{
            dispositivo.desligar(); 
            System.out.println(dispositivo + " OFF");
        }
    }
    
    
}
