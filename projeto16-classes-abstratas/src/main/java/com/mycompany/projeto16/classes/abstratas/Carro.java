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
public abstract class Carro {
    protected String marca;
    protected String modelo;
    protected Integer cilindradas;
    protected Double velocidadeMaxima;
    
    public abstract void trocarMarcha();
    //em classes abstratas podemos ter metodos concretos sem problemas
    public void abastrcer(){
        System.out.println("Injetando combustivel no tanque");
    }
}
