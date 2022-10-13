import java.util.ArrayList;
import java.util.Scanner;
public class Turma {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();;
    private static ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
    
    
    
    public static void addTurma(Aluno aluno,Diciplina diciplina){
        alunos.add(aluno);
        diciplinas.add(diciplina);
    }

    public static void imprimeTurmas(){
        Scanner input = new Scanner(System.in);
        if(alunos!=null && alunos.size()!=0){
            for(int i=0;i<alunos.size();i++){
                System.out.println("Aluno: "+alunos.get(i).getNome()+" Diciplina: "+diciplinas.get(i).getNome());
            }
        }else{
            System.out.println("Nao a Turmas");
        }
        System.out.print("Press Enter");
        input.nextLine();
    }
    
    public static void removeDiciplina(String nome){
        if(diciplinas!=null && diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                if(diciplinas.get(i).getNome().equalsIgnoreCase(nome)){
                   diciplinas.remove(i);
                   alunos.remove(i);
                }
            }
        }else{
            System.out.println("Nao a Turmas");
        }
    }


    public static void imprimeTurmasDeAluno(String nome){
        Scanner input = new Scanner(System.in);
        if(alunos!=null && alunos.size()!=0){
            for(int i=0;i<alunos.size();i++){
                if(alunos.get(i).getNome().equalsIgnoreCase(nome)){
                    System.out.println("Aluno: "+alunos.get(i).getNome()+" Diciplina: "+diciplinas.get(i).getNome());
                }
            }
        }else{
            System.out.println("Nao a Turmas");
        }
        System.out.print("Press Enter");
        input.nextLine();
    }

    public static String verificaAlunoAndDiciplinaGetSigla(Aluno aluno,Diciplina diciplina){
        if(diciplinas!=null && diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                if(diciplinas.get(i)==diciplina && alunos.get(i)==aluno){
                   return diciplina.getSigla();
                }
            }
        }else{
            System.out.println("Nao a Turmas");
        }
        return null;
    }   

}
