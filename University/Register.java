/* @author Gabriel n. 
 * gitHub: https://github.com/gabuh
 *
 * About: Register should keep all the users information, just to the program use as dataBase.
 * Student and Professor informations.
 * 
 * update 20/09 
 * addStudent already ok
 * addCourse in development
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Register{
    List <Student> students = new ArrayList<Student>();
        int studentBuff = 1000000;
    List <Course> courses = new ArrayList<Course>();
        int courseBuff = 1;
        
        Scanner test=new Scanner(System.in);
        Student student;
        Course course;
        
       
        
      void addStudent(){
        student = new Student(studentBuff);
        studentBuff++;
        String value;
        int valueInt=-1;

        String attributes[]={"Name","Gender","Address","CEP","Register and Exit"};
         do{         
              System.out.println("Student id: "+student.getId());        
             for(int i=0;i<attributes.length;i++){
                 System.out.print((1+i)+" > "+attributes[i]+": ");
        
                        if(i==0 && student.name!=null){
                            System.out.print(student.name);
                        }if(i==1 && student.gender != null){
                            System.out.print(student.gender);
                        }if(i==2 && student.address != null){
                            System.out.print(student.address);
                        }if(i==3 && student.cep != 0){
                            System.out.print(student.cep);
                        }
                    System.out.println();
                }
                System.out.println("Choose one option");
                valueInt=Integer.parseInt(test.nextLine());
                if(valueInt<attributes.length){
                    System.out.println(valueInt!=5?"Type the "+attributes[valueInt-1]+" ":"Bye");
                }
                if(valueInt==1){
                    value = test.nextLine();
                    student.setName(value);
                }else if(valueInt==2){
                    value = test.nextLine();
                    student.setGender(value);
                }else if(valueInt==3){
                    value = test.nextLine();
                    student.setAddress(value);
                }else if(valueInt==4){
                    valueInt=Integer.parseInt(test.nextLine());
                    student.setCep(valueInt);
                }else if(valueInt==5){
                        if(student.name==null){
                            System.out.println("You must give the student a name");
                        }else if(student.gender == null){
                            System.out.println("You must give the student a gender");
                        }else if(student.address == null){
                            System.out.println("You must give the student a address");
                        }else if(student.cep == 0){
                            System.out.println("You must give the student a cep");
                        }else{
                            valueInt=0;
                        }   
                }else{
                    valueInt=5;
                }
            

            }while(valueInt!=0);  
            students.add(student);
        }// addStudent
      
      public void addCourse(){
          String input;
          int intInput;
          System.out.println("How many subjects does the Course will have?");
              input=test.nextLine();
              intInput=Integer.parseInt(input);
        course=new Course();
        courseBuff++;
        String attributes[]={""}; //---------------------------------------------
        do{         
            System.out.println("Student id: "+student.getId());        
           for(int i=0;i<attributes.length;i++){
               System.out.print((1+i)+" > "+attributes[i]+": ");
      
                      if(i==0 && student.name!=null){
                          System.out.print(student.name);
                      }if(i==1 && student.gender != null){
                          System.out.print(student.gender);
                      }if(i==2 && student.address != null){
                          System.out.print(student.address);
                      }if(i==3 && student.cep != 0){
                          System.out.print(student.cep);
                      }
                  System.out.println();
              }
              System.out.println("Choose one option");
              intInput=Integer.parseInt(test.nextLine());
              if(intInput<attributes.length){
                  System.out.println(intInput!=5?"Type the "+attributes[intInput-1]+" ":"Bye");
              }
              if(intInput==1){
                  input = test.nextLine();
                  student.setName(input);
              }else if(intInput==2){
                  input = test.nextLine();
                  student.setGender(input);
              }else if(intInput==3){
                  input = test.nextLine();
                  student.setAddress(input);
              }else if(intInput==4){
                  intInput=Integer.parseInt(test.nextLine());
                  student.setCep(intInput);
              }else if(intInput==5){
                      if(student.name==null){
                          System.out.println("You must give the student a name");
                      }else if(student.gender == null){
                          System.out.println("You must give the student a gender");
                      }else if(student.address == null){
                          System.out.println("You must give the student a address");
                      }else if(student.cep == 0){
                          System.out.println("You must give the student a cep");
                      }else{
                          intInput=0;
                      }   
              }else{
                  intInput=5;
              }
          

          }while(intInput!=0);  
        courses.add(course);
      }//addCourse

}
