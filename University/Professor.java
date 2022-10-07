package Admin;

public class Professor extends Pessoa{
    private double horaAula;

    Professor(String nome, int CPF, double horaAula){
        super(nome, CPF);
        this.horaAula=horaAula;
    }
    

}
