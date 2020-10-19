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
public class Lampada {
    
    private boolean ligada = true;
    
    public void ligar(){
        this.ligada = true;
        System.out.println("Ligada!");
    }
    
    public void desligar(){
        this.ligada = false;
        System.out.println("Desligada!");
    }

    public boolean getLigada() {
        return ligada;
    }
    
}
