package Admin;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private String nivel;
    private ArrayList<Diciplina> diciplinas=new ArrayList<Diciplina>();

    public Curso(String nome,String nivel){
        this.nome = nome;
        this.nivel = nivel;
    }

    public Curso(String nome,String nivel ,Diciplina diciplinas ){
        Curso(nome, nivel);
        this.diciplinas.add(diciplinas);
    }

    public void addDiciplina(Diciplina diciplina){
        diciplinas.add(diciplina);
    }
    
    public void imprimirCurso(){
        System.out.println("Curso: "+nome);
        System.out.print("Nivel: "+nivel);
        if(diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                System.out.println("Diciplina: "+diciplinas.get(i).getNome()+" Sigla: "+this.diciplinas.get(i).getSigle());
            }
        }else{
            System.out.println("Nao tem Diciplina");
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
    


}