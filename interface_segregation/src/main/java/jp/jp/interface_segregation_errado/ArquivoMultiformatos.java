/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.interface_segregation_errado;

/**
 *
 * @author João Paulo
 */
public class ArquivoMultiformatos implements ISalvarArquivoMultiformatos{
    
    @Override
    public void salvarPDF(String arquivo){
        System.out.println("Arquivo pdf geraco com sucesso! " + arquivo + ".pdf");
    }

    @Override
    public void salvarJSON(String arquivo) {
        System.out.println("Arquivo json gerado com sucesso! " + arquivo + ".json");
    }

    @Override
    public void salvarXML(String arquivo) {
        System.out.println("Arquivo xml gerado com sucesso! " + arquivo + ".xml");
    }
    
    
    
}
