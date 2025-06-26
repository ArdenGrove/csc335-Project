
/**
 * Write a description of class openSpace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class openSpace
{
    int spaceWidth;
    int spaceLength;
    
    public openSpace()
    {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("Welcome to the Virus Simulator.");
        
        System.out.println("Please input width of open space"); 
        spaceWidth = keyboard.nextInt();
        
        System.out.println("Please input length of open space");
        spaceLength = keyboard.nextInt(); 
        
        
    }    
    
}
