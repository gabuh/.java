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
      return this.aluno.skill(index);
    }

    public int getSkillSize(){
        return aluno.skillSize();
    }

    public void imprimeBoletim(){
        this.aluno.imprimeBoletim();
    }

    public void getNome(){
        this.aluno.getNome();
    }

}
