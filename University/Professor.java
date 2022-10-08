

public class Professor extends Pessoa{
    private double horaAula;

    Professor(String nome, int CPF, double horaAula){
        super(nome, CPF);
        this.horaAula=horaAula;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Hora Aula: "+horaAula);
    }

}

 