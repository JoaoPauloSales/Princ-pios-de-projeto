/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.inversion_dependency_errado;

/**
 *
 * @author João Paulo
 */
public class Interruptor {
    
    public void liga(Lampada lampada){
        if(!lampada.getLigada())
            lampada.ligar();
        else
            lampada.desligar(); 
    }
    
    
}
