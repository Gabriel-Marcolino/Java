/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto17.estaticos;

/**
 *
 * @author Aluno
 */
public class Cidadao {
    //quando um atributo é static, chamamos ele de atributo classe
   public static String NACIONALIDADE = "Brasileiro(a)";
   public static Integer IDADE_MINIMA_VOTACAO = 16;
   //marca um atributo como final torna ele imutavel, como o const(constante)
   public static final String HINO = "Ouviram no Ipiranga";
   
   //a convenção para o nome de atributo de classe é shake upper case
   
   private String nome;
   
   
   
   //metodos static nao precisam de uma instancia para serem invocados e não manipulam atributos de instancia internamente
   public static void pagarImpostoRenda() {
       System.out.println("Pagando absurdo de impostos!");
   }

    public void setNome(final String nome) {
        System.out.println("Mais um brasileiro ganhando nome: "+nome);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
   
}
