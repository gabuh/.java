import java.util.ArrayList;
public class Turma {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();;
    private static ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();


    public static void addTurma(Aluno aluno,Diciplina diciplina){
        alunos.add(aluno);
        diciplinas.add(diciplina);
    }

}
