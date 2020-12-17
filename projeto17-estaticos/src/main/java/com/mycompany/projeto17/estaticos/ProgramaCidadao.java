/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto17.estaticos;

public class ProgramaCidadao {
    public static void main(String[] args) {
        
        //atributos estaticos podem ser obtidos diretamente da classe
        String MinhaNacionalidade = Cidadao.NACIONALIDADE;
        
        Cidadao brazuca = new Cidadao();
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        Cidadao.NACIONALIDADE = "HAvaiano do sul";
        Cidadao.IDADE_MINIMA_VOTACAO = 14;
        
        
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        Cidadao.pagarImpostoRenda();
        
        System.out.println(Cidadao.HINO);
        
        brazuca.setNome("José Silva");
        System.out.println(brazuca.getNome());
        
        brazuca.setNome("João Souza");
        System.out.println(brazuca.getNome());
        
        
    }
  
}
