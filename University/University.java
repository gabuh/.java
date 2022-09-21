// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

public class University{    
    public static void main(String[] args){
        // List <Student> all=new ArrayList<>();
        Register rg = new Register();
        
        // rg.addStudent();
        rg.showClassRooms();
        rg.addStudent();
        rg.addCourse();
        rg.addProfessor();
        
// for(int i=0;i<1;i++){
        System.out.println(rg.courses.get(0).getName());
        System.out.println(rg.students.get(0).getName());
        System.out.println(rg.professors.get(0).getName());

// }


    }
} 
