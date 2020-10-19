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
public class Analista extends Funcionario{
    
    private String nome;
    private double salario;
    private String equipe;
    private double abono;
    
    
    public Analista(String name, double sal, String equipe, double abono){
        super(name, sal, equipe, abono);
    
        this.nome = name;
        this.salario = sal;
        this.equipe = equipe;
        this.abono = abono;
    
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public String getEquipe() {
        return equipe;
    }

    @Override
    public double getAbono() {
        return abono;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public void setAbono(double abono) {
        this.abono = abono;
    }
    
    @Override
    public String toString(){
        return nome + " - Equipe: " + equipe + " - Salário - " + salario + " Abono: " + abono;
    }

}
