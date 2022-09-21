/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About:  
 * 
 */
import java.util.List;
import java.util.ArrayList;
// import java.util.Scanner;

public class Course{
  List <Subject> subjects = new ArrayList<Subject>();
  Subject subject;
  String name;
  String description;
  int idCourse;


  Course(int courseBuff){
    idCourse=courseBuff;
  }  
    
  public String getSubjectsNames(){
    String item="";
    for(int i=0;i<subjects.size();i++){
      item=this.subjects.get(i).getName()+" ,"+item;
    }
    return item;
  }
  
  public Subject searchSubject(String item){
    for(int i=0;i<subjects.size();i++){ //sequential seach just to do the job right? don't judge me ;D
      if(subjects.get(i).getName().equal(item)){
        return subject;
      }
    }
  }
    
  public void addSubject(){
    subject = new Subject();
    subjects.add(subject);
  }
  // private void removeSubject(){

  // }
   
  

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public String getName() {
    return name;
  }
  public void setNome(String name) {
    this.name = name;
  }
  public int getIdCourse() {
    return idCourse;
  }


}