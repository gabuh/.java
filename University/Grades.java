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
    //I must do general calculation about the grade here.
    // create all the subject points and get a mean.
    // I cannot understand this.
    
    
//  public void showAllGrade(){
//    String value;
//    if(subjects.isEmpty()){
//       System.out.println("There isn't Course");
//    }else {
//     for(int i=0;i<subjects.size();i++){
//         System.out.println(subjects.get(i).getName()+" "+subjects.get(i).getGradePoint());
//     }
//    }
// 
//  }
 

  
  // remove(){
    //subjects.clear();
  // }
  
}