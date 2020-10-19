/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.interface_segregation_certo;

/**
 *
 * @author João Paulo
 */
public class ArquivoPDF implements ISalvarArquivoPDF{

    @Override
    public void salvarPDF(String arquivo) {
        System.out.println("Arquivo pdf gerado com sucesso! " + arquivo + ".pdf");
    }
    
    
    
}
