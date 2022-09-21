import java.util.List;
import java.util.ArrayList;
public class Grades{
List <Subject> subjects = new ArrayList<Subject>();
  Student student;

  Grades(Student std,List<Subject> subjects2){
    subjects = subjects2;
    student=std;  
    for(int i=0;i<subjects.size();i++){
        subjects.get(i).getName();
    }
  }
 
  

  
  // remove(){
    //subjects.clear();
  // }
  
}