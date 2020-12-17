
package modelos;

public class PaiRico {
    
    // Utilizamos o nível protected afim de facilitar o desenvolvimento.
    // Ele permite acesso direto em subclasses e classes no mesmo pacote.
    protected String nome;

    public PaiRico(String nome) {
        this.nome = nome;
    }
    
    public void trabalhar(){
        System.out.println(this.nome + " rico acumulando fortuna");
    }
}
