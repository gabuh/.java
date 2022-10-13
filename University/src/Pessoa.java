

public class Pessoa{
    private String nome;
    private int cpf;

    public Pessoa(String nome, int cPF) {
        this.nome = nome;
        this.cpf = cPF;
    }
    public int getCPF() {
        return this.cpf;
    }
    public String getNome() {
        return this.nome;
    }

}
