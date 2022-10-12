
import java.util.Scanner;
public class Escola{
    public static void main(String[] args){
        Curso curso;
        Diciplina diciplina;
        Aluno aluno;
        Scanner input = new Scanner(System.in);
        String strInput;
        int intInput;
        char in[];
        int flag;
        Registro rg= new Registro();
        Authentication aut = new Authentication(rg);


        do{
            System.out.println("Escolha a opcao digitando:\n[1] logar\n[exit] sair");
            strInput=input.nextLine();
            String option[]={
                "Adicionar Professor",
                "Adicionar Aluno",
                "Listar Todos os Cursos",
                "Matricular-se em um Curso",
                "Visualizar Boletim",
                "Deslogar", 
                "Adicionar Diciplina",
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

            if(strInput.equals("1")){
                aut.login();
                if(aut.user != null){
                    int opSize = option.length;
                    int skillSize = aut.user.getSkillSize();
                    while(aut.loginStatus!=false){
                        flag=0;
                        System.out.println(">>"+aut.user.getNome()+"<<");
                        for(int i=0;i<skillSize;i++){
                            //try tosolve it
                            for(int j=0;j<opSize;j++){
                                if(aut.user.getSkill(i).equals(option[j])){
                                        System.out.println("["+(j+1)+"]"+option[j]);
                                    }  
                            }
                        } 
                        System.out.print("Escolha a opcao digitando o numero: ");
                        strInput=input.nextLine();
                        in=strInput.toCharArray();
                        for(int i=0;i<in.length;i++){
                            if(Character.isDigit(in[i])){
                                flag++;
                            }
                        }
                        if(in.length==flag && flag != 0){
                            flag=0;
                            intInput = Integer.parseInt(strInput);  
                            if(intInput<22 && intInput!=0){
                                for(int i=0;i<skillSize;i++){
                                    if(!aut.user.getSkill(i).equals(option[intInput-1])){
                                        flag++;
                                    }
                                }
                                if(flag != skillSize -1){
                                    strInput="false";
                                }
                            }

                        }

                            switch (strInput) {
                                case "false":
                                    break;
                                case "1":
                                    rg.addProfessor();
                                    break;
                                case "2":
                                    rg.addAluno();
                                    break;
                                case "3":
                                    rg.imprimeCursos();
                                    break;
                                case "4":
                                        curso = rg.imprimeCursosAndGetCurso();
                                        if(curso!=null)
                                            aut.user.addCurso(curso);
                                    break;
                                case "5":
                                        aut.user.imprimeBoletim();
                                    break;
                                case "6":
                                        aut.loginStatus=false;
                                    break;
                                case "7":
                                        rg.addDiciplina();
                                    break;
                                case "8":
                                        aut.user.imprimeDiciplinas();
                                        break;
                                case "9":
                                        diciplina = rg.imprimeDiciplinasAndGetDiciplina();
                                        if(diciplina!=null)
                                            aut.user.addDiciplina(diciplina);
                                        break;
                                case "10":
                                        rg.imprimeDiciplinas();
                                    break;
                                case "11":
                                        aut.user.imprimeInfo();
                                    break;
                                case "12":
                                        Turma.imprimeTurmas();
                                    break;
                                case "13":
                                        rg.imprimeCursosAndRemoveCurso();
                                    break;
                                case "14":
                                        aut.user.imprimeTurmas();
                                    break;
                                case "15":
                                        curso = rg.imprimeCursosAndGetCurso();
                                        diciplina = rg.imprimeDiciplinasAndGetDiciplina();
                                        if(diciplina != null && curso != null)
                                            aut.user.addDiciplinaEmCurso(diciplina, curso);
                                    break;
                                case "16":
                                        rg.imprimeAlunosAndRemoveAluno();
                                    break;
                                case "17":
                                        rg.imprimeProfessoresAndRemoveProfessor();
                                    break;
                                case "18":
                                        rg.imprimeDiciplinasAndRemoveDiciplina();
                                    break;
                                case "19":
                                        rg.imprimeAlunos();
                                    break;  
                                case "20":
                                        rg.imprimeProfessores();
                                    break;
                                case "21":
                                    String sigla=null;
                                    diciplina = rg.imprimeDiciplinasAndGetDiciplina();
                                    aluno = rg.imprimeAlunosAndGetAluno();
                                    if(aluno!=null){
                                        sigla = Turma.verificaAlunoAndDiciplinaGetSigla(aluno, diciplina);
                                    }
                                    aut.user.mudarNotaAdmin(aluno);
                                    boolean verify = aut.user.verificaSigla(sigla);
                                    if(aluno!=null && verify == true){
                                        aut.user.mudarNota(aluno,sigla);
                                    }
                                    break; 
                                    default:
                                    System.out.println("Trying");
                                    break;
                                }       //switch
                            
                    }  // if
                } //if
            }//if
            
        }while(!strInput.equalsIgnoreCase("exit"));
        input.close();
    }
} 
