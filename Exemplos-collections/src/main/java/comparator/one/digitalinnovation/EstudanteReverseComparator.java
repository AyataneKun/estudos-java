package comparator.one.digitalinnovation;

import java.util.Comparator;

public class EstudanteReverseComparator implements Comparator<Estudante> {


    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getMatricula() - o1.getMatricula();
    }

}
