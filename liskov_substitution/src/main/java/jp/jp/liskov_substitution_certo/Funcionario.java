/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.liskov_substitution_certo;

/**
 *
 * @author João Paulo
 */
public abstract class Funcionario {
    
    private String nome;
    private double salario;
    private double abono;
    private String equipe;
    
    Funcionario(String nome, double salario, String equipe, double abono){
        this.nome = nome;
        this.salario = salario;    
        this.equipe = equipe;
        this.abono = abono;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getAbono() {
        return abono;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    
    public String toString(){
        return nome + " - Equipe: " + equipe + " - Salário - " + salario + " Abono: " + abono;
    }
    
}
