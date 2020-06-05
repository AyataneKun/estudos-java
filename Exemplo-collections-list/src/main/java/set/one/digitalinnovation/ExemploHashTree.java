package set.one.digitalinnovation;

import java.util.TreeSet;

public class ExemploHashTree { // Exemplo de TreeSet

    public static void main(String[] args) {

        TreeSet<Double> numeros = new TreeSet<>(); // Criação da TreeSet

        numeros.add(3.0);
        numeros.add(88.0);
        numeros.add(20.0);
        numeros.add(44.0);
        numeros.add(3.0); // Adição dos elementos na TreeSet, note que elementos repetidos não são adicionados.

        for (Double num: numeros) {
            System.out.println(num); // Varredura da TreeSet
        }

        numeros.add(23.0); // Adição de novo elemento, note que ele será ordenado.

        System.out.println(numeros); // Print da TreeSet

        System.out.println(numeros.size()); // Tamanho da TreeSet

        System.out.println(numeros.first()); // Retorna o primeiro elemento da TreeSet;

        System.out.println(numeros.last()); // Retorna o ultimo elemento da TreeSet.

        System.out.println(numeros.isEmpty()); // Verifica se a TreeSet esrá vazia.

        System.out.println(numeros.pollFirst()); // Retorna e remove o primeiro elemento da TreeSet.

        System.out.println(numeros.pollLast()); // Retorna e remove o ultimo elemento da TreeSet.

        System.out.println(numeros); // Print

        System.out.println(numeros.floor(57.0)); // Verifica o primeiro elemento que é MENOR que o valor chave informado.
                                                        // Ambos os métodos retornaram "null" caso não exista um valor.
        System.out.println(numeros.ceiling(60.0)); // Verifica o primeiro elemento que é MAIOR que o valor chave informado.

        System.out.println(numeros); // Print
    }
}
