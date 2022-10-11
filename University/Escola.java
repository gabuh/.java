
import java.util.Scanner;
public class Escola{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String strInput;
        Registro rg= new Registro();
        Authentication aut = new Authentication(rg);
        
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

        // rg.addCurso();
        // rg.addDiciplina();
        rg.addProfessor();
        rg.addAluno();
        do{
            System.out.println("Escolha a opcao digitando:\n[1] logar\n[exit] sair");
            strInput=input.nextLine();
            String option[]={
                "ADC Professor",
                "ADC Aluno",
                "Listar Cursos",
                "Matricular-se em um Curso",
                "Visualizar Boletim",
                "Deslogar",
                "ADC Diciplina",
            };

            if(strInput.equals("1")){
                aut.login();
                if(aut.user != null){

                    int opSize = option.length;
                    int skillSize = aut.user.getSkillSize();
                do{
                aut.user.getNome();
                for(int i=0;i<skillSize;i++){
                    //try tosolve it
                    for(int j=0;j<opSize;j++){
                        if(aut.user.getSkill(i).equals(option[j])){
                                System.out.println(option[i]);
                            }  
                    }
                } 
                strInput=input.nextLine();
                switch (strInput) {
                    case "1":
                        rg.addProfessor();
                        break;
                    case "2":
                        rg.addAluno();
                        break;
                    case "3":
                        // rg.imprmirCursos();
                        break;
                    case "4":
                    // rg.matricula();
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
                        // case "2":
                        
                        //     break;
                        // case "2":
                        
                        //     break;
                        // case "2":
                        
                        // break;
                        default:
                        System.out.println("Trying");
                        break;
                    }       
                    
                }while(aut.loginStatus!=false); 
            }
        }
            
        }while(strInput.equalsIgnoreCase("exit"));

    }
} 
