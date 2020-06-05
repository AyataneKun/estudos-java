package set.one.digitalinnovation;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet { //Exemplo de HashSet

    public static void main(String[] args) {

        Set<Double> numeros = new HashSet<>(); // Criando o HashSet

        numeros.add(3.0);
        numeros.add(88.0);
        numeros.add(20.0);
        numeros.add(44.0);
        numeros.add(3.0); // Adicionando elementos, notar que elementos repetidos não são adicionados.

        for (Double num: numeros) {
            System.out.println(num); // Varredura do HashSet.
        }

        numeros.remove(20.0); //Remoção de elemento informando o objeto.

        numeros.add(null); // Adição de um novo elemento, notar que ele toma uma posição qualquer no HashSet.

        System.out.println(numeros); //Print do HashSet

        System.out.println(numeros.size()); // Tamanho do HashSet

        System.out.println(numeros.isEmpty()); //  Verificação se está vazio.
    }

}
