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
  // List <ClassRoom> classRooms = new ArrayList<ClassRoom>()
  Scanner input=new Scanner(System.in);
  private String name;
  private String description;

  
  

  Subject(){
    int intInput;
    do{
      System.out.println("Subject Name ?");
      name=input.nextLine();
      System.out.println("Subject Description?");
      description=input.nextLine();
     System.out.println("\n\nName: "+name+" Description: "+description+" \nComfirm( Type 1 ) Change( Type 0 )");
      intInput=Integer.parseInt(input.nextLine());

    }while(intInput != 1);  
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

}