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
public class ProgramadorE extends FuncionarioE{
    
    private String nome;
    private double salario;
    private String equipe;
    private double abono;
    
    
    public ProgramadorE(String name, double sal, String equipe, double abono){
        super(name, sal);
        
        nome = name;
        salario = sal;
        this.equipe = equipe;
        this.abono = abono;
    
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getEquipe() {
        return equipe;
    }

    public double getAbono() {
        return abono;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }
    
    
    public String toString(){
        return nome + " - Equipe: " + equipe + " - Salário - " + salario + " Abono: " + abono;
    }
    
}
