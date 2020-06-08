package streams.one.digitalinnovation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Aluisio", 25));
        estudantes.add(new Estudante("Tulio", 23));
        estudantes.add(new Estudante("Jãozinho", 44));
        estudantes.add(new Estudante("Flávia", 51));
        estudantes.add(new Estudante("Gregory", 17));
        estudantes.add(new Estudante("Isabella", 15));
        estudantes.add(new Estudante("Bruno", 18));

        System.out.println("Retorna uma lista com o 'nome - idade' de cada estudante: " +
                estudantes.stream().map(estudante -> estudante.getNome().concat(" - ")
                        .concat(String.valueOf(estudante.getIdade()))).collect(Collectors.toList()));

        System.out.println("Número de estudantes na coleção: " + estudantes.stream().count());

        System.out.println("Estudantes 18+: " + estudantes.stream().filter((estudante) -> (estudante.getIdade() >= 18))
                .map(estudante -> estudante.getNome().concat(" - ").concat(String.valueOf(estudante.getIdade())))
                    .collect(Collectors.toList()));

        System.out.println("Todos os objetos: ");
        estudantes.forEach(System.out::println);

        System.out.println("Estudantes com a letra B maiúscula no nome: " + estudantes.stream().filter(estudante ->
                estudante.getNome().contains("B")).map(Estudante::getNome).collect(Collectors.toList()));

        System.out.println("Existe estudante com a letra D maiúscula no nome: " + estudantes.stream()
                .anyMatch(estudante -> estudante.getNome().contains("D")));

        System.out.println("Estudante mais velho: " + estudantes.stream().max(Comparator
                .comparingInt(Estudante::getIdade)).map(Estudante::getNome));

        System.out.println("Estudante mais novo: " + estudantes.stream().min(Comparator
                .comparingInt(Estudante::getIdade)).map(Estudante::getNome));
    }
}
