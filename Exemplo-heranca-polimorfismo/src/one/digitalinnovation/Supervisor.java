package one.digitalinnovation;

public class Supervisor extends Funcionario{

    public Supervisor(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public double calculaImposto(){
        return this.getSalario()*0.0005;
    }
}
