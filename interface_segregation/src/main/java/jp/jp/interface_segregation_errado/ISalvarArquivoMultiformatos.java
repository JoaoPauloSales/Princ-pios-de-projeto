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
public interface ISalvarArquivoMultiformatos {
    
    public void salvarPDF(String arquivo);
    
    public void salvarJSON(String arquivo);
    
    public void salvarXML(String arquivo);
    
}
