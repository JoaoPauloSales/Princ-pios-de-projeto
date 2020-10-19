/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.liskov_substitution_errado;

/**
 *
 * @author João Paulo
 */
public abstract class FuncionarioE {
    
    private String nome;
    private Double salario;
    
    FuncionarioE(String nome, double salario){
        this.nome = nome;
        this.salario = salario;        
    }
    

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
