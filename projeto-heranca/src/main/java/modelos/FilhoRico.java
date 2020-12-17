
package modelos;

// Utilizamos a palavra 'extends' para definir que uma classe é herdeira de outra,
// exemplo:
// public class <SubClasse> extends <SuperClasse>
public class FilhoRico extends PaiRico{
    
    // Se a classe mãe(superclasse) tem um construtor cheio declarado,
    // obrigatóriamente a classe filha(subclasse) terá que implementar um construtor invocando
    // o construtor da classe mãe.
    public FilhoRico(String nome) {
        super(nome);
        // Toda vez que queremos fazer referência a superclasse para invocar métodos e construtores,
        // utilizamos a palavra "super".
    }

    // Podemos sobreescrever o comportamento padrão dos métodos da classe mãe(superclasse) para
    // adequá-la ao contexto da classe filha(subclasse)
    @Override
    public void trabalhar() {
        System.out.println(this.nome + " gastando a fortuna do pai em 'trade'");
    }
}
