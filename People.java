
/**
 * Write a description of class People here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class People
{
    //alows me to get ints from the user input receiver class
    UserInputReceiver UI = new UserInputReceiver();  
    
    
    ArrayList<Person> everyBody = new ArrayList <Person>();   
    
    
    
    public People()
    {
        for (int i = UI.inputedNumberOfPeople; i >0; i --){
            Person p = new Person(); 
        }
          
        
    }
}