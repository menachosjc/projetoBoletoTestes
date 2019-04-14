/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Calendar;
import model.DadosBoleto;
import model.ValidadorBoleto;

/**
 *
 * @author GabrielMenacho
 */
public class Teste implements ValidadorBoleto {



    
    
    @Override
    public DadosBoleto validarCodigoBarrasBoleto(String codigoDeBarras, String dataPagamento) {
        
            DadosBoleto dadosBoleto = new DadosBoleto();

            if(codigoDeBarras != null){
                dadosBoleto.setBanco("0001");
            }
            
            
            return dadosBoleto;
    }

}
