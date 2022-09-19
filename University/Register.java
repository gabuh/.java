/* @author Gabriel n. 
 * gitHub: https://github.com/gabuh
 *
 * About: Register should keep all the users information, just to the program use as dataBase.
 * Student and Professor informations.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register{
    List <Student> students = new ArrayList<Student>();
        int studentBuff = 1000000;
    List <Course> courses = new ArrayList<Course>();
        int courseBuff = 1;
        
        Scanner test=new Scanner(System.in);
        Student student;
        Course course;
        
       
        
      void addStudent(){
        student = new Student(studentBuff);
        studentBuff++;
        String value;
        int valueInt;

        String atributes[]={"Name","Gender","Address","CEP"};
          for(int i=0;i<atributes.length;i++){
              System.out.println(atributes[i]);
              if(i==0){
                  value = test.nextLine();
                  student.setName(value);
              }else if(i==1){
                  value = test.nextLine();
                  student.setGender(value);
              }else if(i==2){
                  value = test.nextLine();
                  student.setAddress(value);
              }else if(i==3){
                  valueInt=Integer.parseInt(test.nextLine());
                  student.setCep(valueInt);
              }     
          }
            students.add(student);
        }// addStudent
      
      public void addCourse(){
        courseBuff++;
        String input;
        int intInput;
        for(){
          
        }
      }//addCourse

}
