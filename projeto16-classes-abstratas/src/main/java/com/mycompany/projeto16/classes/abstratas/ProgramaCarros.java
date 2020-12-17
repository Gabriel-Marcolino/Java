
package com.mycompany.projeto16.classes.abstratas;

public class ProgramaCarros {
    public static void main(String[] args) {
        //classes abstratas não podem ser instanciadas
        //o codigo não ira compilar
       // Carro carro1 = new Carro();
       
       //uma classe concreta, lógico pode ser instanciada
       Carro uno1 = new FiatUno();
       
       //podemos declarar como abstrata, porem instanciar como concreta
       FiatUno uno2 = new FiatUno();

       //novamente não podemos instanciar classe abstrata
       //FiatUno uno3 = new Carro();
       
       uno1.trocarMarcha();
       uno2.trocarMarcha();
       
       Carro meuA4 = new AudiA4();
       meuA4.trocarMarcha();
       
       uno1.abastrcer();
       uno2.abastrcer();
       meuA4.abastrcer();
    }
}
