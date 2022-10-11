

public class Aluno extends Pessoa{
    private int matricula;
    private Boletim boletim;
    private String skill[] = {"Listar Cursos","Matricular-se em um Curso","Visualizar Boletim","Deslogar"};

    Aluno(String nome, int CPF,int matricula){
        super(nome, CPF);
        this.matricula=matricula;
        this.boletim= new Boletim();
    }

    public void addDiciplina(Diciplina diciplina,int ano,int semestre){
        this.boletim.addDiciplina(diciplina,0,ano,semestre);
    }

    public void mudarNota(String siglaDiciplina){
        this.boletim.mudarNota(siglaDiciplina);
    }

    public void imprime(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Matricula: "+this.matricula);
    }

    public void imprimeBoletim(){
        boletim.imprime();
    }

    public String skill(int index){
        if(index>skill.length){
            return null;
        }
        return skill[index];
    }

    public int skillSize(){
        return skill.length;
    }

}
