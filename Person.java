/**
 * this class is a constructor for people with there status and location cordinits 
 *
 * Arden Grove
 * 
 */
import java.util.Random;
public class Person
{
    //status for normal(1), infected(2), and imunne(3) for the constructor all people start as normal
    public int status = 1;
    
    //alows me to get ints from the user input receiver class
    UserInputReceiver UI = new UserInputReceiver();
    
    
    Random rand = new Random();
        
    public int x = rand.nextInt(UI.inputedSpaceWidth);
    public int y = rand.nextInt(UI.inputedSpaceLength);
    
    //direction for up(0), down(1), left(2), and right(3). represented by a number from 0 to 3
    //the X and Y axis start at the bottem left corrner with Y being vertical and X being horisontal
    public int direction = rand.nextInt(3);
   
   
}