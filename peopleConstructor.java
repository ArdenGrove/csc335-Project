/**
 * this class is a constructor for people with there status and location cordinits 
 *
 * Arden Grove
 * 
 */
import java.util.Random;
public class peopleConstructor
{
    //status for normal(1), infected(2), and imunne(3) for the constructor all people start as normal
    public int status = 1;
    
    //alows me to get ints from the user input receiver class
    user_Input_Receiver UI = new user_Input_Receiver();
    
    
    Random rand = new Random();
        
    public int x = rand.nextInt(UI.inputedSpaceWidth);
    public int y = rand.nextInt(UI.inputedSpaceLength);
    
    //direction for up, down, left, and right. represented by a number from 0 to 3
    public int direction = rand.nextInt(3);
    public peopleConstructor()
    {
              
    }

   
}