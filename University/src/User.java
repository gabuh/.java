import java.util.Scanner;

public class User {
    private Aluno aluno;
    private Professor professor;
    private Admin admin;
    private Scanner input = new Scanner(System.in);

    User(Aluno aluno){
        this.aluno = aluno;
    }
    User(Professor professor){
        this.professor = professor;
    }
    User(Admin admin){
        this.admin = admin;
    }


    public void addDiciplinaEmCurso(Diciplina diciplina, Curso curso){
        if(admin!=null){
            admin.addDiciplinaEmCurso(diciplina, curso);
        }else{
            System.out.println("Voce nao e Admin\n Press Enter");
            input.nextLine();
        }
    }

    public String getSkill(int index){
        if(aluno!=null){
            return aluno.skill(index);
        }else if(professor!=null){
            return professor.skill(index);
        }else if(admin!=null){
            return admin.skill(index);
        }
        return null;

    }
    public void mudarNotaAdmin(Aluno aluno){
        if(admin!=null){
            String strInput;
            System.out.println("Digite o a sigla da Diciplina");
            strInput=input.nextLine();
            aluno.mudarNota(strInput);
        }

    }

    public void mudarNota(Aluno aluno,String sigla){
        if(professor!=null){
            aluno.mudarNota(sigla);
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario professor\n Press Enter");
            input.nextLine();
        }
    }

    public int getSkillSize(){
        if(aluno!=null){
            return aluno.skillSize();
        }else if(professor!=null){
            return professor.skillSize();
        }else if(admin!=null){
            return admin.skillSize();
        }
        return 0;
    }

    public void addCurso(Curso curso){
        if(aluno!=null){
            this.aluno.addCurso(curso);
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario Aluno\n Press Enter");
            input.nextLine();
        }
    }

    public void addDiciplina(Diciplina diciplina){
        if(professor!=null){
            this.professor.addDiciplina(diciplina);
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario professor\n Press Enter");
            input.nextLine();
        }
        
    }

    public void imprimeDiciplinas(){
        if(professor!=null){
            this.professor.imprimeDiciplinas();
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario professor\n Press Enter");
            input.nextLine();
        }
    }

    public void imprimeBoletim(){
        if(aluno!=null){
            this.aluno.imprimeBoletim();
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario Aluno\n Press Enter");
            input.nextLine();
        }
    }

    public void imprimeInfo(){
        if(aluno!=null){
             this.aluno.imprime();
         }else if(professor!=null){
            this.professor.imprime();
         }else if(admin!=null){
            this.admin.imprime();
         }
         System.out.println("Press Enter");
         input.nextLine();
    }

    public void imprimeTurmas(){
        if(aluno!=null){
            Turma.imprimeTurmasDeAluno(aluno.getNome());
        }else{
            System.out.println("Negado!\n gentileza efetue o login com um usuario Aluno\n Press Enter");
            input.nextLine();
        }
    }

    public boolean verificaSigla(String sigla){
        if(professor!=null){
            return this.professor.verificaSigla(sigla);
        }
        return false;   
    }

    public String getNome(){
        if(aluno!=null){
           return this.aluno.getNome();
        }else if(professor!=null){
           return this.professor.getNome();
        }else if(admin!=null){
            return this.admin.getNome();
        }
        return "No User Logged";
    }

    

}
