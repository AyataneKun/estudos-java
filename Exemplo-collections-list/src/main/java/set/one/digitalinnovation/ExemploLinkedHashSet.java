package set.one.digitalinnovation;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet { // Exemplo de LinkedHashSet

    public static void main(String[] args) {

        Set<Double> numeros = new LinkedHashSet<>(); // Criação do LinkedHashSet

        numeros.add(3.0);
        numeros.add(88.0);
        numeros.add(20.0);
        numeros.add(44.0);
        numeros.add(3.0); // Adição dos elementos na LinkedHashSet, note que elementos repetidos não são adicionados.

        for (Double num: numeros) {
            System.out.println(num); // Varredura do LinkedHashSet
        }

        numeros.remove(3.0); // Remoção de um elemento.

        numeros.add(23.0); // Adição de um novo elemento, note que ele será colocado no final, respeitando a ordem de inserção.

        System.out.println(numeros); // Print do LinkedHashSet

        System.out.println(numeros.size()); // Tamanho do LinkedHashSet

        System.out.println(numeros.isEmpty()); // Verificação se o LinkedHashSet está vazio.

        System.out.println(numeros.hashCode()); // Impressão do HashCode deste LinkedHashSet.
    }
}
