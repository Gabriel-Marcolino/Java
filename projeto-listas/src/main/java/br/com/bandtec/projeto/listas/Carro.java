
package br.com.bandtec.projeto.listas;

public class Carro {
    
    private String cor;
    private  String modelo;
    private String placa;

    public Carro(String cor, String modelo, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Sobreescrita do método toString()
    // Quando implementamos isso em nossas classes,
    // podemos mandar imprimir diretamente o objeto e como resultado aparecerá
    // o que colocarmos nessa sobreescrita, geralmente os valores dos atributos e
    // não mais aquele "hash" estranho conforme vimos em aula.
    @Override
    public String toString() {
        return "\nCarro" + "\nCor: " + cor + "\nModelo: " + modelo + "\nPlaca: " + placa;
    }
}
