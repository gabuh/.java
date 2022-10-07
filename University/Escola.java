package Admin;

public class Escola{
    public static void main(String[] args){
        
        Curso curso1 = new Curso("Analise e desenvolvimento de Sistemas", "Superior");


        Aluno aluno1=new Aluno("Gabriel", 2121,98);
        Aluno aluno2=new Aluno("Daniel",2121,2);
        


        Diciplina diciplina1 = new Diciplina("Logica II", "LGA2", 30);
        
        curso1.addDiciplina(diciplina1);

        aluno1.addDiciplina(curso1.getDiciplinas("LGA2"));        

        aluno1.imprimirAluno();
        aluno2.imprimirAluno();


    }
} 
