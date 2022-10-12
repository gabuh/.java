import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Aluno extends Pessoa{
    private int matricula;
    private Boletim boletim;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
    Date date = new Date();
    private String skill[] = {
    "Listar Todos os Cursos",
    "Matricular-se em um Curso",
    "Visualizar Boletim",
    "Deslogar"};

    Aluno(String nome, int CPF,int matricula){
        super(nome, CPF);
        this.matricula=matricula;
        this.boletim= new Boletim();
    }

    public void addDiciplina(Diciplina diciplina,int ano,int semestre){
        this.boletim.addDiciplina(diciplina,0,ano,semestre);
    }

    public void addCurso(Curso curso){
        ArrayList<Diciplina> diciplinas = curso.getAllDiciplinas();
        ArrayList<Integer> semestres = curso.getAllSemestres();
        if(!diciplinas.isEmpty()){
            for(int i=0;i<diciplinas.size();i++){
                addDiciplina(diciplinas.get(i),Integer.parseInt(formatter.format(date)),semestres.get(i));
            }
        }
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
