import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Course{
  List <Subject> subjects = new ArrayList<Subject>();
  Subject subject;
  String nome;
  String description;
  
  
  Course(){
    
    
  }  
    
  public String[] getSubjectsNames(){
    String[] values=new String[subjects.size()];
    for(int i=0;i<subjects.size();i++){
      values[i]=(subjects.get(i).getName());
    }
    return values;
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
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }


}