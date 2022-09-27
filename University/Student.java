/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About:  
 * 
 */

public class Student extends Person{
    Grades grades;
    Course course;
    int idStudent;

    
    Student(int studentSize){
      idStudent = studentSize;   
    }
    
    public void addCourse(Course crs){
      course = crs;
      grades = new Grades(this ,course.subjects);
    }    
    
    public int getId(){
      return idStudent;
    }
    
    public Course getCourse() {
        return course;
    }


} 
