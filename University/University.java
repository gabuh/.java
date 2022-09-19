import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University{     
    public static void main(String[] args){
        // List <Student> all=new ArrayList<>();
        

        Register rg1 = new Register();
        
        rg1.addStudent();

        System.out.println(rg1.students.get(0).getName());
        
        


    }
} 
