package comparator.one.digitalinnovation;

public class Estudante implements Comparable<Estudante>{

    private String nome;
    private int idade;
    private final int matricula;
    private String email;

    public Estudante (String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public Estudante (String nome, int idade, int matricula, String email){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ("Matrícula: " + matricula + " Nome: " + nome +
                " Idade: " + idade + " E-mail: " + email + "\n");
    }

    @Override
    public int compareTo(Estudante o) {
        return this.getMatricula() - o.getMatricula();
    }
}
