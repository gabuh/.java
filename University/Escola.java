

public class Escola{
    public static void main(String[] args){
        
        Curso curso1 = new Curso("Analise e desenvolvimento de Sistemas", "Superior");
        Aluno aluno1=new Aluno("Gabriel", 12121,98);
        Aluno aluno2=new Aluno("Daniel",90121,2);
        Professor professor1=new Professor("Leo",343421,30.0);
        Professor professor2=new Professor("Beletti",872387,90.0);

        Diciplina diciplina1 = new Diciplina("Logica II", "LGA2", 30);

        diciplina1.setProfessor(professor1);
        
        curso1.addDiciplina(diciplina1);

        aluno1.addDiciplina(curso1.getDiciplinas("LGA2"),2022,1);        

        aluno1.imprime();
        aluno2.imprime();
        aluno1.imprimeBoletim();
        aluno2.imprimeBoletim();
        aluno1.mudarNota("LGA2");

        

        System.out.println(diciplina1.getProfessor().getNome());
        
        professor2.imprime();

    }
} 
