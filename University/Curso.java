
import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
    private String nome;
    private String nivel;
    Scanner input = new Scanner(System.in);
    private ArrayList<Diciplina> diciplinas=new ArrayList<Diciplina>();
    private ArrayList<Integer> semestres = new ArrayList<Integer>();
    Curso(String nome,String nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    public void addDiciplina(Diciplina diciplina){
        if(!diciplinas.contains(diciplina)){
            diciplinas.add(diciplina);
            semestres.add(semesterRequest());
        }else{
            System.out.println("Esta diciplina ja fora adicionada");
            input.nextLine();
        }
        
    }

    
    public void imprimirCurso(){
        System.out.println("Curso: "+nome);
        System.out.println("Nivel: "+nivel);
        if(diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                System.out.println("Diciplina: "+diciplinas.get(i).getNome()+" Sigla: "+diciplinas.get(i).getSigla());
            }
        }else{
            System.out.println("Nao tem Diciplina");
            input.nextLine();
        }

    }


    public Diciplina getDiciplinas(String sigla) {
        if(diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                if(diciplinas.get(i).getSigla()==sigla){
                    return diciplinas.get(i);
                }
            }
        }
        System.out.println("not found");
        return null;
    }

    public ArrayList<Diciplina> getAllDiciplinas(){
        return this.diciplinas;
    }
    public ArrayList<Integer> getAllSemestres(){
        return this.semestres;
    }
    

    public int semesterRequest(){
        int intInput;
        String strInput;
        char in[];
        int flag;
        do{
            flag=0;
            System.out.print("Digite o semestre: ");
            strInput=input.nextLine();
            in=strInput.toCharArray();
            for(int i=0;i<in.length;i++){
                if(Character.isDigit(in[i])){
                    flag++;
                }
            }
            if(flag==in.length && flag!=0){
                intInput = Integer.parseInt(strInput);
                return intInput;
            }else if(strInput.equalsIgnoreCase("default")){
                flag=-1;
            }

        }while(flag!=-1);
            
        return 0;
    }
    
    public String getNome(){
        return this.nome;
    }


}
