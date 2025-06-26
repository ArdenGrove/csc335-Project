
/**
 * Arden Grove CSC335 Slap-21 virus project
 * 
 * This class gathers the users chosen specifications for the virus simulation and stores them  
 */
import java.util.Scanner;

public class user_Input_Receiver
{
    int inputedSpaceWidth; 
    int inputedSpaceLength;
    //ints for size of space
    
    int inputedNumberOfPeople;
    int inputedInitialyInfected;
    //ints for number of people in the open space and how many are initaly infected
    
    int virusTransmissionPercentage; 
    int infectionPeriod;
    int virusImunityDuration;
    //ints for virus characteristics
    
    int roundsOfSimulation;
    
    public user_Input_Receiver()  
    {
        Scanner keyboard = new Scanner (System.in);
        
        
        System.out.println("Welcome to the Virus Simulator.");
        
        //getting values for size of space ints
        System.out.println("Please input width of open space"); 
            inputedSpaceWidth = keyboard.nextInt();
       
        System.out.println("Please input length of open space");
            inputedSpaceLength = keyboard.nextInt(); 
        
           
        //getting values for number of people in open space and initially infected
        System.out.println("Please input number of people in the open space");
            inputedNumberOfPeople = keyboard.nextInt(); 
            
        System.out.println("Please input number of people initially infected"); 
            inputedInitialyInfected = keyboard.nextInt();
        
        
        //getting virus transmission rate, infection period, and    
        System.out.println("please input the virus transmition rate as a percentage of 100");
        System.out.println("(do not include the % sign)"); 
            virusTransmissionPercentage = keyboard.nextInt();

        
    }    
    
}
