package comparator.one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploComparator {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Aluisio", 25, 32006, "aluisiomeloni@gmail.com"));
        estudantes.add(new Estudante("Tulio", 23, 2016008741, "tulio@gmail.com"));
        estudantes.add(new Estudante("Carlos", 29, 18745));
        estudantes.add(new Estudante("Filipe", 26, 20014));
        estudantes.add(new Estudante("Heverton", 25, 30284, "heverton@meuemail.com"));

        System.out.println("Ordem natural da inserção: ");
        System.out.println(estudantes);

        System.out.println("Organizados por matrícula usando Comparable: Crescente");
        Collections.sort(estudantes);
        System.out.println(estudantes);

        System.out.println("Organizados por matrícula usando Comparator: Decrescente");
        Collections.sort(estudantes, new EstudanteReverseComparator());
        System.out.println(estudantes);

        System.out.println("Organizando por matrícula usando lambda: Crescente");
        estudantes.sort((first, second) -> first.getMatricula() - second.getMatricula());
        System.out.println(estudantes);

        System.out.println("Organizando por matrícula usando lambda: Decrescente");
        estudantes.sort((first, second) -> second.getMatricula() - first.getMatricula());
        System.out.println(estudantes);

    }
}
