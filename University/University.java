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
        String options[]={"Show Courses","Add Course","Show Students","Add Student","Roll a Course","Add Professor","Show Professors","Create ClassRoom","Show All Classrooms","Show Aavailable Classrooms","List Available Courses","List Rolled Courses"};
        do{

            for(int i=0;i<options.length;i++){
                System.out.println((i+1)+" "+options[i]);
            }
            
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
                //add a student in a course
            }else if(value.equals("6")){
                rg.addProfessor();
            }else if(value.equals("7")){
                rg.showProfessors();
            }else if(value.equals("8")){
                rg.addClassRoom();
            }else if(value.equals("9")){
                rg.showAllClassRooms();
                System.out.println("press[Enter]");
                input.nextLine();
            }else if(value.equals("10")){
                rg.showClassRoomsAvailable();
                System.out.println("press[Enter]");
                input.nextLine();
            }

            
            //temp
            intInput=Integer.parseInt(value);
        }while(intInput!=0);




   

















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
