/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;
import model.DadosBoleto;

/**
 *
 * @author fabricio
 */
public interface ValidadorBoleto {

    DadosBoleto validarCodigoBarrasBoleto(String codigoDeBarras, String dataPagamento);

}
