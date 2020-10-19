/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.open_closed_errado;

/**
 *
 * @author João Paulo
 */
public class PagamentoE {
    
    private double divida = 2000;
    private double resto;
   
    
    public void pagarComDinheiro(double valor){
        this.resto = valor - this.divida;
        if(this.resto < 0)
            System.out.println("Valor insuficiente!");
        else if(this.resto > 0)
            System.out.println("Obrigado! Seu troco é: RS" + resto);
        else
            System.out.println("Pagamento efetuado com sucesso!");
            
    }
    public void pagarComCartao(double valor){
        this.resto = valor - this.divida;
        if(this.resto < 0)
            System.out.println("Valor insuficiente!");
        else if(this.resto > 0)
            System.out.println("Obrigado! Seu troco é: RS" + resto);
        else
            System.out.println("Pagamento efetuado com sucesso!"); 
    }
    
    public void pagarComCheque(double valor){
        this.resto = valor - this.divida;
        if(this.resto < 0)
            System.out.println("Valor insuficiente!");
        else if(this.resto > 0)
            System.out.println("Obrigado! Seu troco é: RS" + resto);
        else
            System.out.println("Pagamento efetuado com sucesso!"); 
    }
    
}
