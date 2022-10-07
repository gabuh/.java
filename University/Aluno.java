

public class Aluno extends Pessoa{
    private int matricula;
    private Boletim boletim;

    Aluno(String nome, int CPF,int matricula){
        super(nome, CPF);
        this.matricula=matricula;
        this.boletim= new Boletim();
    }

    public void addDiciplina(Diciplina diciplina){
        this.boletim.addDiciplina(diciplina,0,0,0);
    }

    public void imprimirAluno(){
        System.out.println(this.getNome());
        System.out.println(this.matricula);
    }

    public void imprimirBoletim(){
        boletim.imprimir();
    }

}
