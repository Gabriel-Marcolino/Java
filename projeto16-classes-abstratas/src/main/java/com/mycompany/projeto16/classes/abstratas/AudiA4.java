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
public class AudiA4 extends Carro{
    
       public AudiA4() {
        marca = "Audi";
        modelo = "A4";
        cilindradas=2200;
        velocidadeMaxima=270.0;
    }

    @Override
    public void trocarMarcha() {
                System.out.println("Trocando marcha do Audi A4 com borboletas no volante");

    }
    
}
