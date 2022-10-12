import java.util.Scanner;

public class Authentication{
    Scanner input = new Scanner(System.in);
    Registro rg;
    public User user;
    boolean loginStatus=false;
    
    Authentication(Registro rg){
        this.rg=rg;
    }

    public void login(){
        String strInput;
        int intInput=0;
        char in[];
        int flag=0;
        do{
            flag=0;
            System.out.println("Digite o seu CPF");
            strInput=input.nextLine();
            in=strInput.toCharArray();
            for(int i=0;i<in.length;i++){
                if(Character.isDigit(in[i])){
                    flag++;
                }
            }
            if(flag==in.length){
                intInput=Integer.parseInt(strInput);
            }
                user=rg.searchPessoa(intInput);
            if(user!=null){
                flag=1;
                loginStatus=true;
            }else{
                flag=0;
            }

        }while(flag!=1);

    }

    public boolean verifyLogin(){
        if(loginStatus!=true){
            this.user=null;
        }
        return loginStatus;
    }

}


