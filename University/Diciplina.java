

public class Diciplina {
    private String nome;
    private String sigla;
    private int cargaHoraria;
    private Professor professor;
    
    public Diciplina(String nome, String sigla, int cargaHoraria) {
        this.nome = nome;
        this.sigla = sigla;
        this.cargaHoraria = cargaHoraria;
    }

    public void imprimirDiciplina(){
        System.out.println("Dic: "+nome);
        System.out.println("Sigla: "+sigla);
        if(professor!=null)
            System.out.println("Professor: "+professor.getNome());
    }

    public void setProfessor(Professor professor){
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public String getNome() {   
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    
    
}
