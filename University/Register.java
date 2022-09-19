/* @author Gabriel n. 
 * gitHub: https://github.com/gabuh
 *
 * About: Register should keep all the users information, just to the program use as data format.
 * Student and Professor informations.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register{
//    public static void main(String[] args){ // main
    List <Student> students = new ArrayList();
        
        
        
        Scanner test=new Scanner(System.in);
        Student student;
        
       
        
        void addStudent(){

        student = new Student(students.size());
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
                valueInt=test.nextInt();
                student.setCep(valueInt);

            }     
            students.add(student);
        }
        test.close();
    // } //main
    
    
    }


}
