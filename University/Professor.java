import java.util.ArrayList;
import java.util.Scanner;
public class Professor extends Pessoa{
    private double horaAula;
    private ArrayList<String> siglasDeDiciplinas = new ArrayList<String>();
    private String skill[]={
        "Listar Todos os Cursos",
        "Ministrar uma Diciplina",
        "Mostrar Diciplinas",
        "Deslogar",
        "Listar Todas as Diciplinas"
    };
    private Scanner input = new Scanner(System.in);

    Professor(String nome, int CPF, double horaAula){
        super(nome, CPF);
        this.horaAula=horaAula;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Hora Aula: "+horaAula);
    }

    public void imprimeDiciplinas(){
        for(int i=0;i<siglasDeDiciplinas.size();i++){
            System.out.println(siglasDeDiciplinas.get(i));
        }
        System.out.println("Pressione Enter");
        input.nextLine();
    }


    public void addDiciplina(Diciplina diciplina){
        siglasDeDiciplinas.add(diciplina.getSigla());
        diciplina.setProfessor(this);
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

 