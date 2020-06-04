package list.one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>(); //Criando um ArrayList para uma lista de nomes.

        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João"); // Adicionando os nomes.

        for(String elem: nomes){
            System.out.println("Nome:" + elem); // Percorrendo a lista e imprimindo os nomes.
        }

        nomes.set(2, "Roberto"); // Alterando o nome da terceira posição (índice 2) por "Roberto".

        System.out.println(nomes);

        String aux = nomes.get(0); // Obtendo o nome da primeira posição (índice 0).

        System.out.println(aux);

        nomes.remove(3); // Removendo o nome contido na posição 4 (índice 3).

        System.out.println(nomes);

        nomes.remove("João"); // Removendo o objeto (elemento) "João".

        System.out.println(nomes);

        int tamanho = nomes.size(); // Obtendo a quantidade de objetos (elementos) da lista.

        System.out.println(tamanho);

        boolean temJuliano = nomes.contains("Juliano"); // Verificando se existe um objeto (elemento) com o nome Juliano.

        System.out.println(temJuliano);

        List<String> novaLista = new ArrayList<>(); // Criando uma nova lista.

        novaLista.add("Ismael");
        novaLista.add("Rodrigo"); // Adicionando nomes a essa nova lista.

        nomes.addAll(novaLista); // Adiciona essa nova lista na lista anterior

        /*for (String name: novaLista) {
            nomes.add(name); // Percorrendo a nova lista e adicionando seus objetos (elementos) a lista anterior.
        }*/

        System.out.println(nomes);

        Collections.sort(nomes); // Ordenando os elementos novos e antigos da lista antiga em ordem alfabética.

        System.out.println(nomes);

        boolean vazio = nomes.isEmpty(); // Verificando se a lista "nomes" está vazia.

        System.out.println(vazio);

        boolean vazio2 = novaLista.isEmpty();

        System.out.println(vazio2); // Verificando de a lista "novaLista" está vazia


    }

}
