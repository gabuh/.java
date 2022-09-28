/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About: Subject, the Course should have differents subjects, so it's constructor do the job adding name and description
 * but we need to add classroom, the environment for the students and professors.
 */

import java.util.Scanner;
// import java.util.List;
// import java.util.ArrayList;

public class Subject{

  Scanner input=new Scanner(System.in);
  private String name;
  private String description;
  private int gradePoint;



  ClassRoom classRoom;


  Subject(){
    String value;
    do{
      System.out.println("Subject Name ?");
      name=input.nextLine();
      System.out.println("Subject Description?");
      description=input.nextLine();
     System.out.println("\n\nName: "+name+" Description: "+description+" \nComfirm( Type 1 ) Change( Type 0 )");
      value=input.nextLine();
      
      
    }while(value.equals("1"));  
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getGradePoint() {
    return gradePoint;
  }

  public void setGradePoint(int gradePoint) {
    this.gradePoint = gradePoint;
  }
  public ClassRoom getClassRoom() {
    return classRoom;
  }

  public void setClassRoom(ClassRoom classRoom) {
    this.classRoom = classRoom;
  }


}