package Admin;

import java.util.ArrayList;

public class Boletim {
    private ArrayList<Diciplina> diciplinas=new ArrayList<Diciplina>();
    private ArrayList<Double> notas = new ArrayList<Double>();
    private ArrayList<Integer> anos = new ArrayList<Integer>();
    private ArrayList<Integer> semestres = new ArrayList<Integer>();
    
    public void addDiciplina(Diciplina diciplinas, double notas, int anos, int semestres) {
        this.diciplinas.add(diciplinas);
        this.notas.add(notas);
        this.anos.add(anos);
        this.semestres.add(semestres);
    }

    public void imprimir(){
        if(this.diciplinas.size()!=0){
            for(int i=0;i<this.diciplinas.size();i++){
                System.out.println("Diciplina: "+diciplinas.get(i).getNome());
                System.out.println("Nota: "+notas.get(i));
                System.out.println("Ano :"+anos.get(i));
                System.out.println("Semestre: "+semestres.get(i));
            }
        }else{
            System.out.println("Nao esta cursando");
        }

    }

    
    


}
