package one.digitalinnovation;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    public double calculaImposto(){
        return this.getSalario()*0.001;
    }

}
