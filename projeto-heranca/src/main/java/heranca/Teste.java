package heranca;

import modelos.FilhoRico;
import modelos.PaiRico;

public class Teste {

    public static void main(String[] args) {

        PaiRico pai = new PaiRico("Eike Batista");
        FilhoRico filho = new FilhoRico("Thor Batista");

        pai.trabalhar();
        
        System.out.println("-".repeat(35));
        filho.trabalhar();
        
        System.out.println("-".repeat(35));
        
        PaiRico objEstranho = new FilhoRico("Diferentão");
        objEstranho.trabalhar();
    }
}
