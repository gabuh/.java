import java.util.Scanner;

import java.util.ArrayList;

public class Boletim {
    private ArrayList<Diciplina> diciplinas=new ArrayList<Diciplina>();
    private ArrayList<Double> notas = new ArrayList<Double>();
    private ArrayList<Integer> anos = new ArrayList<Integer>();
    private ArrayList<Integer> semestres = new ArrayList<Integer>();
    Scanner input=new Scanner(System.in);
    public void addDiciplina(Diciplina diciplinas, double notas, int anos, int semestres) {
        this.diciplinas.add(diciplinas);
        this.notas.add(notas);
        this.anos.add(anos);
        this.semestres.add(semestres);
    }

    public void mudarNota(String siglaDiciplina){
        double dInput;
        String strInput;
        char in[];
        int flag;

        if(diciplinas.size()!=0){
            for(int i=0;i<diciplinas.size();i++){
                if(siglaDiciplina.equals(diciplinas.get(i).getSigla())){
                    System.out.println("Nota anterior "+notas.get(i));
                    double notaPassada=notas.get(i);
                    do{
                        dInput=0;
                        flag=0;
                        System.out.print("Digite a nota para alterar: ");
                        strInput=input.nextLine();
                        in=strInput.toCharArray();
                        for(int j=0;j<in.length;j++){
                            if(Character.isDigit(in[j])){
                                flag++;
                            }else if(in[j]=='.'){
                                flag++;
                            }
                        }
                        if(in.length==flag){
                           dInput=Double.parseDouble(strInput);
                        }
                    }while(dInput>11 || dInput<=0);
                    notas.set(i, dInput);
                    System.out.println("Alterado "+notaPassada+" para "+dInput);
                }
            }
        }else{
            System.out.println("Nao esta Cursando\n Press Enter");
            input.nextLine();
        }

    }

    public void imprime(){
        if(this.diciplinas.size()!=0){
            for(int i=0;i<this.diciplinas.size();i++){
                System.out.println("Diciplina: "+diciplinas.get(i).getNome());
                System.out.println("Nota: "+notas.get(i));
                System.out.println("Ano :"+anos.get(i));
                System.out.println("Semestre: "+semestres.get(i));
            }
            System.out.print(" Press Enter");
            input.nextLine();
        }else{
            System.out.println("Nao esta cursando\n Press Enter");
            input.nextLine();
        }
    }  


    public ArrayList<Diciplina> getDiciplinas(){
        return this.diciplinas;
    }

}
