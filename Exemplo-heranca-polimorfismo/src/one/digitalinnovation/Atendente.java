package one.digitalinnovation;

public class Atendente extends Funcionario{

    public Atendente(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public double calculaImposto(){
        return this.getSalario()*0.0001;
    }
}
