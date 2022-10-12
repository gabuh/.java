
public class Admin extends Pessoa{
    private String skill[]={
        "ADC Professor",
        "ADC Aluno",
        "Listar Todos os Cursos",
        "Matricular-se em um Curso",
        "Visualizar Boletim",
        "Deslogar", 
        "ADC Diciplina",
        "Mostrar suas Diciplinas",
        "Ministrar uma Diciplina",
        "Listar Todas as Diciplinas",
        "Informacoes do Usuario",
        "Lista Turmas",
        "Remover Cursos",
        "Listar suas Turmas",
        "Adicionar Diciplinas em um Curso",
        "Remover Alunos",
        "Remover Professors",
        "Remover Diciplinas",
        "Listar Todos os Alunos",
        "Listar Todos os Professores",
        "Alterar nota de Aluno"
    };

    Admin(String nome,int CPF){
        super(nome, CPF);
    }

    public void imprime(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("CPF: "+this.getCPF());
    }

    public void addDiciplinaEmCurso(Diciplina diciplina,Curso curso){
        curso.addDiciplina(diciplina);
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
