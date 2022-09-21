/* @author Gabriel n.
 * github: https://github.com/gabuh
 * 
 * About:  
 * 
 */
public class Professor extends Person{
    int idProfessor;
    private Subject subject;
    
    Professor(int id){
        idProfessor=id;
    }
    
    public int getIdProfessor() {
        return idProfessor;
    }
}
