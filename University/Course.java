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
  public List <Subject> subjects = new ArrayList<Subject>();
  private Subject subject;
  private String name;
  private String description;
  public int idCourse;


  Course(int courseBuff){
    this.idCourse=courseBuff;
  }  
    
  public String getSubjectsNames(){
    String item="";
    for(int i=0;i<subjects.size();i++){
      item=i+" "+this.subjects.get(i).getName()+" ,"+item;
    }
    return item;
  }
  
  // public Subject searchSubject(String item){
  //   for(int i=0;i<subjects.size();i++){ //sequential seach just to do the job right? don't judge me ;D
  //     if(subjects.get(i).getName().equals(item)){
  //       return subject;
  //     }
  //   }
  //   return;
  // }
    
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