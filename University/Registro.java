import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Aluno> alunos= new ArrayList<Aluno>();
    private ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>(); 
    Curso curso;
    private ArrayList<Professor> professors = new ArrayList<Professor>();
    private int buffMatricula=10000;

    public void addCurso(){
        String nome;
        String nivel[]={"Superior","Tecnico"};
        int flag=0;
        char in[];
        String strInput;
        int intInput=0;
            do{

                System.out.println("Criar Curso");
                System.out.println("Digite o nome do Curso");
                nome=input.nextLine();
                System.out.println("Escolha o nivel do curso");
                for(int i=0;i<nivel.length;i++){ //imprimindo niveis
                    System.out.println((i+1)+" "+nivel[i]);
                }
                strInput=input.nextLine();
                
                in=strInput.toCharArray();
                for(int i=0;i<in.length;i++){
                    if(Character.isDigit(in[i])){
                        flag++;
                    }
                }
                if(flag==in.length){ 
                   intInput =  (Integer.parseInt(strInput)) -1;
                   flag=1;
                 }else{
                    flag=0;
                 }
                 if(flag==1){
                     System.out.println("Nome: "+nome +"Nivel: " +nivel[intInput]+"\nDigite sim(s) pra confirmar ,nao(n) pra editar");    
                     strInput=input.nextLine();
                     
                     if(strInput.equalsIgnoreCase("s")){
                         curso= new Curso(nome, nivel[intInput]);
                         cursos.add(curso);
                         System.out.println("Registrado!");
                     }else{
                        flag=0;
                     }
                 }

            }while(flag!=1);
    }

    // imprimeCursos(){

    // }

    public void addProfessor(){
        String nome;
        double horaAula;
        int cpf=0;
        int flag=0;
        char in[];
        String strInput;
            do{

                System.out.println("Cadastrar Professor");
                System.out.println("Digite o nome");
                nome=input.nextLine();
                System.out.println("Digite o CPF com 9 Digitos");
                strInput = input.nextLine();
                in=strInput.toCharArray();
                for(int i = 0; i<in.length;i++){
                    if(Character.isDigit(in[i])){
                        flag++;
                    }
                }
                if(flag==in.length){
                    cpf = Integer.parseInt(strInput); 
                }
                flag=0;
               

                System.out.println("Digite a hora aula:");;
                strInput=input.nextLine();
                in=strInput.toCharArray();
                for(int i=0;i<in.length;i++){
                    if(Character.isDigit(in[i])){
                        flag++;
                    }else if(in[i]=='.'){
                        flag++;
                    }
                }
                if(flag==in.length){ 
                   horaAula =  Double.parseDouble(strInput);
                   flag=1;
                 }else{
                    flag=0;
                    continue;
                 }
                 if(flag==1){
                     System.out.println("Nome: "+nome +"CPF: " +cpf+"Hora Aula: "+horaAula+"\nDigite sim(s) pra confirmar ,nao(n) pra editar");    
                     strInput=input.nextLine();
                     
                     if(strInput.equalsIgnoreCase("s")){
                         Professor professor = new Professor(nome, cpf,horaAula);
                         professors.add(professor);
                         System.out.println("Registrado!");
                     }else{
                        flag=0;
                     }  
                 }

            }while(flag!=1);
    }

    // imprimeProfessores(){

    // }

    public void addDiciplina(){
        String nome;
        String sigla;
        int cargaHoraria;
        int flag=0;
        char in[];
        String strInput;
            do{
                flag=0;
                System.out.println("Criar Diciplina");
                System.out.println("Digite o nome");
                    nome=input.nextLine();
                System.out.println("Digite a sigla");
                    sigla = input.nextLine();
            
                System.out.println("Digite a Carga horaria:");;
                    strInput=input.nextLine();
                in=strInput.toCharArray();
                for(int i=0;i<in.length;i++){
                    if(Character.isDigit(in[i])){
                        flag++;
                    }
                }
                if(flag==in.length){ 
                   cargaHoraria = Integer.parseInt(strInput);
                   flag=1;
                 }else{
                    continue;
                 }
                 if(flag==1){
                     System.out.println("Nome: "+nome +"Sigla: " +sigla+"Carga horaria: "+cargaHoraria+"\nDigite sim(s) pra confirmar ,nao(n) pra editar");    
                     strInput=input.nextLine();
                     
                     if(strInput.equalsIgnoreCase("s")){
                         Diciplina diciplina = new Diciplina(nome, sigla,cargaHoraria);
                         diciplinas.add(diciplina);
                         System.out.println("Registrado!");
                     }else{
                        flag=0;
                     }  
                 }

            }while(flag!=1);
        
    }
    // imprimeDiciplinas(){

    // }
    public void addAluno(){
        String nome;
        int cpf=0;
        int flag=0;
        char in[];
        String strInput;
            do{
                flag=0;
                System.out.println("Cadastrar Aluno");
                System.out.println("Digite o nome");
                nome=input.nextLine();
                System.out.println("Digite o CPF com 9 Digitos");
                strInput = input.nextLine();
                in=strInput.toCharArray();

                    for(int i = 0; i<in.length;i++){
                        if(Character.isDigit(in[i])){
                            flag++;
                        }
                    }

                    if(flag==in.length){
                        cpf = Integer.parseInt(strInput);    
                        flag=1;
                        }else{
                            flag=0;
                        }


                 if(flag==1){
                     System.out.println("Nome: "+nome +"CPF: " +cpf+"Matricula: "+buffMatricula+"\nDigite sim(s) pra confirmar ,nao(n) pra editar");    
                     strInput=input.nextLine();
                     if(strInput.equalsIgnoreCase("s")){
                         Aluno aluno = new Aluno(nome, cpf,buffMatricula);
                         buffMatricula++;
                         alunos.add(aluno);
                         System.out.println("Registrado!");
                     }else{
                        flag =0;
                     }  
                 }

            }while(flag!=1);
    }
    // imprimeAlunos(){

    // }


}
