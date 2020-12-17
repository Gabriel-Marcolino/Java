/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto16.classes.abstratas;

/**
 *
 * @author Aluno
 */
public class FiatUno extends Carro {

    public FiatUno() {
        marca = "FIAT";
        modelo = "Uno";
        cilindradas=1000;
        velocidadeMaxima=130.0;
    }

    
    
    @Override
    public void trocarMarcha() {
        System.out.println("Trocando marcha no uno e puxando para ré");
    }
    
}
