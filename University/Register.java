/* @author Gabriel n. 
 * gitHub: https://github.com/gabuh
 *
 * About: Register should keep all the users information, just to the program use as dataBase.
 * Student and Professor informations.
 * 
 * update 20/09 
 * addStudent already ok
 * addCourse already ok
 * 
 * 
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Register{
    List <Student> students = new ArrayList<Student>();
        int Buff = 1000000;
    List <Professor> professors = new ArrayList<Professor>();
    List <Course> courses = new ArrayList<Course>();
    List <ClassRoom> classRooms = new ArrayList<ClassRoom>();

        int courseBuff = 1;
        int classRoombuff=100;
        Scanner test=new Scanner(System.in);
        Student student;
        Course course;
        Professor professor;
        ClassRoom classRoom;
        
      public void addStudent(){
        student = new Student(Buff);
        Buff++;
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
                value=test.nextLine();
                // TREAT ERROR
                if(value.equals("1") || value.equals("2") || value.equals("3") || value.equals("4") || value.equals("5") ||value.equals("5")){
                    valueInt=Integer.parseInt(value);
                    System.out.println(value.equals("5")?"Exiting":"Type the "+attributes[valueInt-1]+" ");
                }
                // 
                if(value.equals("1")){
                    value = test.nextLine();
                    student.setName(value);
                }else if(value.equals("2")){
                    value = test.nextLine();
                    student.setGender(value);
                }else if(value.equals("3")){
                    value = test.nextLine();
                    student.setAddress(value);
                }else if(value.equals("4")){
                    valueInt=Integer.parseInt(test.nextLine());
                    student.setCep(valueInt);
                }else if(value.equals("5")){
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

        public void showStudents(){ //show all the rooms
            if(students.isEmpty()){
                  System.out.println("There is no Students registered.");
            }else{
                System.out.println("There are:");
                for(int i=0;i<students.size();++i){
                        System.out.println(students.get(i).getCourse()==null?"id: "+students.get(i).getId()+"> "+students.get(i).getName()+" There is not Course Registered":"id: "+students.get(i).getId()+"> "+students.get(i).getName()+" "+students.get(i).getCourse().getName());
                    
                }

            }
        }

      
      public void addCourse(){
          course=new Course(courseBuff);
          String input;
          int intInput;
          boolean found=false;
          courseBuff++;        
        
        String attributes[]={"Nome","Description","Subjects (*)","Register and Exit"}; //---------------------------------------------
        do{         
            System.out.println("Course Id :"+course.getIdCourse());        
           for(int i=0;i<attributes.length;i++){
               System.out.print((1+i)+" > "+attributes[i]+": ");
      
                      if(i==0 && course.getName() != null){
                          System.out.print(course.getName());
                      }if(i==1 && course.getDescription() != null){
                          System.out.print(course.getDescription());
                      }if(i==2 && course.getSubjectsNames() != null){
                          System.out.print(course.getSubjectsNames());
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
                  course.setNome(input); // nameCourse
              }else if(intInput==2){
                  input = test.nextLine();
                  course.setDescription(input);  //courDescription
              }else if(intInput==3){
                //   input = test.nextLine();
                    do{
                        showClassRoomsAvailable();
                        System.out.println("Choose one Room (type its id)");
                        intInput=Integer.parseInt(test.nextLine());
                        
                        if(getClassRoom(intInput)==null){
                            continue;
                        }else{
                            classRoom=getClassRoom(intInput);
                            course.addSubject(classRoom);  //addSubject
                            found=true;
                        }
                       
                    }while(found==false);
                    found=false;

              }else if(intInput==4){
                      if(course.getName()==null){
                          System.out.println("You must give the course a name");
                      }else if(course.getDescription() == null){
                          System.out.println("You must give the course a description");
                      }else if(course.subjects.isEmpty()){
                          System.out.println("You must give the course at least one subject");
                      }else{
                          intInput=0;
                      }   
              }else{
                  intInput=4;
              }
          

          }while(intInput!=0);  
        courses.add(course);

      }//addCourse

      public void showCourses(){ //show all the rooms
        if(courses.isEmpty()){
              System.out.println("There is no Courses registered.");
        }else{
            String value;
            char in[];
            int count;
            
            System.out.println("There are:");
           do{
                count=0;
               for(int i=0;i<courses.size();++i){
                       System.out.println("id: "+courses.get(i).getIdCourse()+"> "+courses.get(i).getName());
                   
               }
               System.out.println("Type the Course id to get details or 0 to exit");
               value=test.nextLine();
               in = value.toCharArray();
               for(int i=0;i<in.length;i++){
                   if(Character.isDigit(in[i])){
                        count++;
                    }
               }
               if(count==in.length){
                    searchCourseDetails(Integer.parseInt(value));
                }


            }while(value.equals("0")==false);

        }
    }


    public void searchCourseDetails(int id){
        for(int i=0;i<courses.size();i++){
            if(courses.get(i).getIdCourse()==id){
                System.out.println("Name: "+courses.get(i).getName());
                System.out.println("Subjects: "+courses.get(i).getSubjectsNames());
                System.out.println("Description: "+courses.get(i).getDescription());
                // System.out.println(courses.get(i)); //rolled students maybe
                // System.out.println(courses.get(i));
            }
        }
    }

      public void addProfessor(){
        professor = new Professor(Buff);
        Buff++;
        String value;
        int valueInt=-1;

        String attributes[]={"Name","Gender","Address","CEP","Register and Exit"};
         do{         
              System.out.println("Professors id: "+professor.getIdProfessor());        
             for(int i=0;i<attributes.length;i++){
                 System.out.print((1+i)+" > "+attributes[i]+": ");
        
                        if(i==0 && professor.name!=null){
                            System.out.print(professor.name);
                        }if(i==1 && professor.gender != null){
                            System.out.print(professor.gender);
                        }if(i==2 && professor.address != null){
                            System.out.print(professor.address);
                        }if(i==3 && professor.cep != 0){
                            System.out.print(professor.cep);
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
                    professor.setName(value);
                }else if(valueInt==2){
                    value = test.nextLine();
                    professor.setGender(value);
                }else if(valueInt==3){
                    value = test.nextLine();
                    professor.setAddress(value);
                }else if(valueInt==4){
                    valueInt=Integer.parseInt(test.nextLine());
                    professor.setCep(valueInt);
                }else if(valueInt==5){
                        if(professor.name==null){
                            System.out.println("You must give the professor a name");
                        }else if(professor.gender == null){
                            System.out.println("You must give the professor a gender");
                        }else if(professor.address == null){
                            System.out.println("You must give the professor a address");
                        }else if(professor.cep == 0){
                            System.out.println("You must give the professor a cep");
                        }else{
                            valueInt=0;
                        }   
                }else{
                    valueInt=5;
                }
            

            }while(valueInt!=0);  
            professors.add(professor);
        }// addProfessor

        public void addClassRoom(){
                classRoom=new ClassRoom(classRoombuff);
                classRooms.add(classRoom);
                System.out.println(classRoom.getClassRoom()+" Created");
        }

        public void showClassRoomsAvailable(){ //show all the rooms available
            String input;
            if(classRooms.isEmpty()){
              System.out.println("There is no classroom available\nWould you like to create? Yes(y) No(n)");
                input=test.nextLine();
                if(input.equals("y")){
                    addClassRoom();
                }else{
                    showClassRooms();
                }
            }else{
                showClassRooms();
                System.out.println("Would you like to create more? (y) (n)");
                input=test.nextLine();
                if(input.equals("y")){
                    addClassRoom();
                }
            }
        }

        public void showClassRooms(){ //show all the rooms
            if(classRooms.isEmpty()){
                System.out.println("There is no classroom available");
            }else{
                System.out.println("There are:");
                for(int i=0;i<classRooms.size();++i){
                        System.out.println(classRooms.get(i).getUse()!=false?i+"> id"+classRooms.get(i).getClassRoom()+"Busy":i+"> id"+classRooms.get(i).getClassRoom()+"Avaiable");
                }

            }
        }

        public ClassRoom getClassRoom(int idClassRoom){ 
            int intInput;
            boolean found=false;
            for(int i=0;i<classRooms.size();i++){
                if(classRooms.get(i).getClassRoom()==idClassRoom && classRooms.get(i).getUse()!=false){
                    classRoom=classRooms.get(i);
                    found=true;
                }
    
            }
                if(found!=true){
                    return null;
                }
            if(classRoom.getClassRoom()!=idClassRoom){
                showClassRoomsAvailable();
                System.out.println("Choose one Room");
                intInput=Integer.parseInt(test.nextLine());
                getClassRoom(intInput);
            }
            return classRoom;
        }
        
}
