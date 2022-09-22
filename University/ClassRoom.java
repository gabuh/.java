import java.util.List;
import java.util.ArrayList;

public class ClassRoom{
    
    private int classRoom;
    private Boolean use=false;
  
    List <Student> students = new ArrayList<Student>();

    public ClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }
    
    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public Boolean getUse() {
        return use;
    }

    public void setUse(Boolean use) {
        this.use = use;
    }


    public void addStudent(Student std){
        students.add(std);
    }

    public void showAllStudents(){
        if(!students.isEmpty()){
            for(int i=0;i<students.size();i++){
                System.out.println(students.get(i).getName());
            }
        }else{
            System.out.println("There is no Student here");
        }
    }
    
    public void removeStudent(int studentId){
        if(!students.isEmpty()){
            for(int i=0;i<students.size();i++){
                if(students.get(i).getId()==studentId){
                    System.out.println(students.get(i).getName()+", was found and removed. ");
                    students.remove(i);
                }
            }
        }else{
            System.out.println("There is no Student here");
        }
    }

}
