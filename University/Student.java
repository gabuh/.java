/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About:  
 * 
 */

public class Student extends Person{
    Grades grade;
    Course course;
    int idStudent;
    
    
    Student(int studentSize){
      idStudent = studentSize;   
      grade = new grade(this);
    }

public void addCourse(Course crs,){
  
}    
    
public int getId(){
  return idStudent;
}


} 
