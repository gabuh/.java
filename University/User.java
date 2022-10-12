
public class User {
    private Aluno aluno;
    private Professor professor;

    User(Aluno aluno){
        this.aluno = aluno;
    }
    User(Professor professor){
        this.professor = professor;
    }

    public String getSkill(int index){
        if(aluno!=null){
            return aluno.skill(index);
        }else if(professor!=null){
            return professor.skill(index);
        }
        return null;

    }

    public int getSkillSize(){
        if(aluno!=null){
            return aluno.skillSize();
        }else if(professor!=null){
            return professor.skillSize();
        }
        return 0;
    }

    public void addCurso(Curso curso){
        this.aluno.addCurso(curso);
    }

    public void addDiciplina(Diciplina diciplina){
        this.professor.addDiciplina(diciplina);
    }

    public void imprimeDiciplinas(){
        this.professor.imprimeDiciplinas();
    }

    public void imprimeBoletim(){
        this.aluno.imprimeBoletim();
    }

    public String getNome(){
        if(aluno!=null){
           return this.aluno.getNome();
        }else if(professor!=null){
           return this.professor.getNome();
        }
        return "No User Logged";
    }

    

}
