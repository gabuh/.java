import java.util.ArrayList;
import java.util.Scanner;

public class Registro {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Aluno> alunos= new ArrayList<Aluno>();
    private ArrayList<Diciplina> diciplinas = new ArrayList<Diciplina>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>(); 
    Curso curso;
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private int buffMatricula=10000;

    Registro(){
        Diciplina diciplina1 = new Diciplina("Logica II", "LGA2", 30);
        diciplinas.add(diciplina1);
        Diciplina diciplina = new Diciplina("Sistemas Operacionais", "SOPA1", 90);
        diciplinas.add(diciplina);
        Curso curso1 = new Curso("Analise e desenvolvimento de Sistemas", "Superior");
        curso1.addDiciplina(diciplina1);
        curso1.addDiciplina(diciplina);
        cursos.add(curso1);
        Aluno aluno1=new Aluno("Gabriel", 451451,98);
        alunos.add(aluno1);
        Aluno aluno2=new Aluno("Daniel",90121,2);
        alunos.add(aluno2);
        Professor professor1=new Professor("Leo",343421,30.0);
        professores.add(professor1);
        Professor professor2=new Professor("Beletti",872387,90.0);
        professores.add(professor2);
    }


  

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


    public void imprimeCursos(){
        int count;
        int intInput;
        String strInput;
        char in[];
        if(!cursos.isEmpty()){
            do{
                count=0;
                for(int i=0;i<cursos.size();i++){
                       System.out.println("["+(i+1)+"]"+cursos.get(i).getNome());
                }
                
               System.out.println("Digite o numero referente ao curso ou digite 0 para sair");
               strInput=input.nextLine();
               in = strInput.toCharArray();
               for(int i=0;i<in.length;i++){
                   if(Character.isDigit(in[i])){
                        count++;
                    }
               }
               if(count==in.length){
                intInput = Integer.parseInt(strInput);
                    if(intInput-1<cursos.size()&& intInput-1>-1){
                        cursos.get(intInput-1).imprimirCurso();
                        System.out.print("Pressione Enter");
                        input.nextLine();
                    }
                }


            }while(strInput.equals("0")==false);

            System.out.println("");


        }else{
            System.out.println("Nao a curso registrado na instituicao");
        }
    }

    public Curso imprimeCursosAndGetCurso(){
        int count;
        int intInput;
        String strInput;
        char in[];
        if(!cursos.isEmpty()){
            do{
                count=0;
                for(int i=0;i<cursos.size();i++){
                       System.out.println("["+(i+1)+"]"+cursos.get(i).getNome());
                }
                
               System.out.println("Digite o numero referente ao curso ou digite 0 para sair");
               strInput=input.nextLine();
               in = strInput.toCharArray();
               for(int i=0;i<in.length;i++){
                   if(Character.isDigit(in[i])){
                        count++;
                    }
               }
               if(count==in.length){
                intInput = Integer.parseInt(strInput);
                    if(intInput-1<cursos.size()&& intInput-1>-1){
                        cursos.get(intInput-1).imprimirCurso();
                        //confirma?
                        System.out.println("Confirma? Sim(s) Nao(n)");
                        strInput=input.nextLine();
                        if(strInput.equalsIgnoreCase("s")){
                            return cursos.get(intInput-1);
                        }else{
                            System.out.print("Pressione Enter");
                            input.nextLine();
                        }

                    }
                }


            }while(strInput.equals("0")==false);
            
        }else{
            System.out.println("Nao a curso registrado na instituicao");
        }
        return null;
    }

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
                         professores.add(professor);
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
    
    public void imprimeDiciplinas(){
        int count;
        int intInput;
        String strInput;
        char in[];
        if(!diciplinas.isEmpty()){
            do{
                count=0;
                for(int i=0;i<diciplinas.size();i++){
                       System.out.println("["+(i+1)+"]"+diciplinas.get(i).getNome());
                }
                
               System.out.println("Digite o numero referente ao diciplina ou digite 0 para sair");
               strInput=input.nextLine();
               in = strInput.toCharArray();
               for(int i=0;i<in.length;i++){
                   if(Character.isDigit(in[i])){
                        count++;
                    }
               }
               if(count==in.length){
                intInput = Integer.parseInt(strInput);
                    if(intInput-1<diciplinas.size()&& intInput-1>-1){
                        diciplinas.get(intInput-1).imprimirDiciplina();
                        System.out.print("Pressione Enter");
                        input.nextLine();
                    }
                }


            }while(strInput.equals("0")==false);

            System.out.println("");


        }else{
            System.out.println("Nao a diciplina registrada na instituicao");
        }
    }
    
    public Diciplina imprimeDiciplinasAndGetDiciplina(){
        int count;
        int intInput;
        String strInput;
        char in[];
        if(!diciplinas.isEmpty()){
            do{
                count=0;
                for(int i=0;i<diciplinas.size();i++){
                       System.out.println("["+(i+1)+"]"+diciplinas.get(i).getNome());
                }
                
               System.out.println("Digite o numero referente ao diciplina ou digite 0 para sair");
               strInput=input.nextLine();
               in = strInput.toCharArray();
               for(int i=0;i<in.length;i++){
                   if(Character.isDigit(in[i])){
                        count++;
                    }
               }
               if(count==in.length){
                intInput = Integer.parseInt(strInput);
                    if(intInput-1<diciplinas.size()&& intInput-1>-1){
                        diciplinas.get(intInput-1).imprimirDiciplina();
                        //confirma?
                        System.out.println("Confirma? Sim(s) Nao(n)");
                        strInput=input.nextLine();
                        if(strInput.equalsIgnoreCase("s")){
                            return diciplinas.get(intInput-1);
                        }else{
                            System.out.print("Pressione Enter");
                            input.nextLine();
                        }

                    }
                }


            }while(strInput.equals("0")==false);
            
        }else{
            System.out.println("Nao a diciplina registrado na instituicao");
        }
        return null;
    }


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

    public User searchPessoa(int cpf){
        int i;
        if(professores.size()!=0 || alunos.size()!=0){
            for(i=0;i<professores.size();i++){
                if(professores.get(i).getCPF()==cpf){
                    return new User(professores.get(i));
                }
            }
            for(i=0;i<alunos.size();i++){
                if(alunos.get(i).getCPF()==cpf){
                    return new User(alunos.get(i));
                }
            }
        }
        return null;
            
    }


}
