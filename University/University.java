import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University{     
    public static void main(String[] args){
        // List <Student> all=new ArrayList<>();
        
        Register rg = new Register();
        
        rg.addStudent();
        rg.addStudent();
        
        
for(int i=0;i<2;i++){
        System.out.println(rg.students.get(i).getName()+" id: "+rg.students.get(i).getId());
}


    }
} 
