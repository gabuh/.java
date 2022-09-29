// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class University{    
    public static void main(String[] args){
        // List <Student> all=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        Register rg = new Register();
        String value;
        int intInput;
        String options[]={
        "Show Courses",
        "Show Students",
        "Show Professors",
        "Add Course",
        "Add Student",
        "Add Professor",
        "Create ClassRoom",
        "Show All Classrooms",
        "Show Available Classrooms",
        "List Available Courses"
        };

        do{

            for(int i=0;i<options.length;i++){
                System.out.println((i+1)+" "+options[i]);
            }
            System.out.println("[0] to exit");
            
            value=input.nextLine();
            if(value.equals("1")){
                rg.showCourses();
            }else if(value.equals("2")){
                rg.addCourse();
            }else if(value.equals("3")){
                rg.showStudents();
            }else if(value.equals("4")){
                rg.addStudent();
            }else if(value.equals("5")){
                rg.addProfessor();
            }else if(value.equals("6")){
                rg.showProfessors();
            }else if(value.equals("7")){
                rg.addClassRoom();
            }else if(value.equals("8")){
                rg.showAllClassRooms();
                System.out.println("press[Enter]");
                input.nextLine();
            }else if(value.equals("9")){
                rg.showClassRoomsAvailable();
                System.out.println("press[Enter]");
                input.nextLine();
            }

            
        }while(!value.equals("0"));




   

















        // rg.addStudent();
//         rg.showClassRooms();
//         rg.addStudent();
//         rg.addCourse();
//         rg.addProfessor();
        
// // for(int i=0;i<1;i++){
//         System.out.println(rg.courses.get(0).getName());
//         System.out.println(rg.students.get(0).getName());
//         System.out.println(rg.professors.get(0).getName());

// }


    }
} 
