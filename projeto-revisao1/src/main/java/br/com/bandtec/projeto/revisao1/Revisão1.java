/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.revisao1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Revisão1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o login?");
        String login = leitor.nextLine();
        //! é negação
        if(!login.equals("teste")) {
            System.out.println("Deu certo!");
        }else{
            System.out.println("Deu errado:(");
        }
        //exiba todos os pares de 1 a 100
        
       for(int i=1;i<=100; i++){   
           if (i % 2 == 0){

        System.out.println(+ i);  
            
        }
    }
    //sem if
    
    for (Integer i=2; i<=100; i+=2){
        System.out.println(i);
    }
    Integer numeroTal=0;
       Integer sorte = 0;
       
       for(Integer sorteio = 0; sorteio<500; sorteio++){
           Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0,1001);
           if(numeroSorteado.equals(numeroTal)){
               sorte++;
               System.out.println(""+sorte);
           }
       }
}
}