/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About:  
 * 
 */
public class Professor extends Person{
    private int idProfessor;
    Subject subject;

    
    Professor(int id){
        idProfessor=id;
    }
    
    public int getIdProfessor() {
        return idProfessor;
    }

    public String getSubjectName(){
        if(subject!=null){
            return subject.getName();
        }
        return null;
    }
}
