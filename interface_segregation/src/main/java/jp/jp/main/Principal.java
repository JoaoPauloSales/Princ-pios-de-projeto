/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.jp.main;

import jp.jp.interface_segregation_certo.ArquivoMultiformatosC;
import jp.jp.interface_segregation_certo.ArquivoPDF;
import jp.jp.interface_segregation_errado.ArquivoMultiformatos;

/**
 *
 * @author João Paulo
 */
public class Principal {
    public static void main(String[] args){
    
        try{
            //Errado
            ArquivoMultiformatos arq1 = new ArquivoMultiformatos();
            String arquivo = "teste";
            arq1.salvarJSON(arquivo);
            arq1.salvarPDF(arquivo);
            arq1.salvarXML(arquivo);
            //Fim errado
            
            System.out.println("\n-------------------------\n");
            
            //Certo
            ArquivoMultiformatosC arq2 = new ArquivoMultiformatosC();
            arq2.salvarJSON(arquivo);
            arq2.salvarPDF(arquivo);
            arq2.salvarXML(arquivo);
            
            ArquivoPDF arqPdf = new ArquivoPDF();
            arqPdf.salvarPDF(arquivo);      
            //Fim certo
            
        
        
        }catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());       
        }
    }
}
