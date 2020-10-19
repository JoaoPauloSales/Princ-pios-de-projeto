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
public class AnalistaE extends FuncionarioE{
    
    private String nome;
    private double salario;
    private double abono;
    
    
    public AnalistaE(String name, double sal, double abono){
        super(name, sal);
        
        nome = name;
        salario = sal;
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

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }
    
    
    public String toString(){
        return nome + " - Salário - " + salario + " Abono: " + abono;
    }
    
}
