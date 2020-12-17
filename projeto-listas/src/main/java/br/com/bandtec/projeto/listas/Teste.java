package br.com.bandtec.projeto.listas;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        // Declaração padrão para listas
        // Observer que a lista abaixo não possui um tipo genérico
        // Portanto, aceitará qualquer tipo de informação.
        List listaAleatoria = new ArrayList();

        listaAleatoria.add("Texto qualquer...");
        listaAleatoria.add(2);
        listaAleatoria.add(10.0);
        listaAleatoria.add(true);

        // É extremamente recomendado utilizar os tipos genéricos em listas.
        // Exemplo:
        List<String> coresTexto = new ArrayList();

        coresTexto.add("Azul");
        coresTexto.add("Vermelho");
        coresTexto.add("Verde");
        coresTexto.add("Amarelo");

        // No caso acima criamos uma lista de "texto" que representa nomes de cores,
        // nesse caso poderiamos inclusive criar uma lista de cores "efetivamente" usando a classe Color, lembra dela?
        List<Color> cores = new ArrayList<>();

        cores.add(Color.BLUE);
        cores.add(Color.RED);
        cores.add(Color.GREEN);
        cores.add(Color.YELLOW);
        cores.add(Color.decode("#00ff00"));

        // Vale lembrar que também é possível criar listas com o tipo de classes criadas por nós,
        // Exemplo:
        List<Carro> carros = new ArrayList();

        Carro carro1 = new Carro("Verde", "Chevett", "kfz3e55");
        Carro carro2 = new Carro("Amarelo", "Corsinha", "cpt4y66");
        Carro carro3 = new Carro("Azul", "Ford Ka", "kfe4e52");

        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(new Carro("Preto", "BMW", "rff2p47"));

        // existem algumas formas de iterar em uma lista, a mais clássica:
        System.out.println("Usando o 'for' clássico:");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        System.out.println("");

        // podemos também utilizar o "enhanced for" ou "for aprimorado"
        System.out.println("-".repeat(20));
        System.out.println("Usando o 'enhanced for':");
        for (Carro carro : carros) {
            System.out.println(carro);
        }
        System.out.println("");

        // Podemos também usar o forEach, que é bem semelhante ao enhanced for,
        // mas com uma "cara" mais funcional:
        System.out.println("-".repeat(20));
        System.out.println("Usando o 'forEach':");
        carros.forEach(carro -> System.out.println(carro));
        // Como só estou exibindo o carro posso fazer tudo na mesma linha sem {},
        // caso eu precise realizar mais de uma operação é necessário abrir {},
        // exemplo:
        System.out.println("-".repeat(20));
        System.out.println("Usando o 'forEach' com mais de uma instrução:");
        carros.forEach(carro -> {
            System.out.println("\n" + carro.getModelo());
            System.out.println(carro.getPlaca());
        });
        System.out.println("");
        // Comandos básicos de lista:
        // ADD
        // Adiciona um elemento no lista
        carros.add(new Carro("Branco", "Fusca", "str3e43"));

        //REMOVE
        //Remove um elemento da lista
        // Utilizando índice
        carros.remove(2);
        // Utiliando objeto
        carros.remove(carro1);

        //CONTAINS
        // Devolve um boolean, caso exista o elemento na lista devolve true.
        System.out.println(carros.contains(carro2) ? "Está na lista" : "Não está na lista");

        //Clear
        // Remove todos os elementos da lista
        carros.clear();

        //isEmpty
        // Retorna um booleano, caso a lista esteja vazia devolve true.
        System.out.println(carros.isEmpty() ? "Está vazia" : "Não está vazia");

        //size
        // Devolve o tamamnho da lista
        System.out.println(carros.size());
    }
}
