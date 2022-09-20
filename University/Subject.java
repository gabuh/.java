import java.util.Scanner;
public class Subject{
  Scanner input=new Scanner(System.in);
  private String name;
  private String description;
  // Professor professor;
  

  Subject(){
    String strInput;
    do{
      System.out.println("Subject Name ?");
      name=input.nextLine();
      System.out.println("Subject Description?");
      description=input.nextLine();
     System.out.println("Name: "+name+"Description: "+description+"Comfirm(y) Change(n)");
      strInput=input.nextLine();
    }while(strInput != "y");  
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