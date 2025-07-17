
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
    
    
    int inputCheacker;  
    
    int getValidInput(String prompt){
        Scanner keyboard = new Scanner (System.in);
        
        
        boolean needValidInput = true;
        while (needValidInput == true) {  
            try {
                System.out.println(prompt);
                int inputCheacker = keyboard.nextInt();  // Try reading the integer input
                if (inputCheacker >= 1) {
                    needValidInput = false;
                } else {
                    System.out.println("Invalid input, please input a number larger than or equal to 1");
                }
            } catch (java.util.InputMismatchException e) {
                //catch for when the user inputs a letter or special charictor
                System.out.println("Invalid input, please input a number larger than or equal to 1.");
                keyboard.nextLine();  // get rid of the invalid input so it doesnt enter a never ending loop
            }
            
        }
        return inputCheacker;
    }
    
    public user_Input_Receiver()  
    {
        Scanner keyboard = new Scanner (System.in);
        
        
        System.out.println("Welcome to the Virus Simulator.");
        
        // getting values for the width of the open space
        inputedSpaceWidth = getValidInput("Please input width of open space"); 
        
           
            
        //getting values for the length of the open space    
        inputedSpaceLength = getValidInput("Please input length of open space");
        
        
        
           
        //getting values for number of people in open space and initially infected
        System.out.println("Please input number of people in the open space");
        
       //needValidInput = true;
        while (needValidInput == true) {  
            try {
                inputCheacker = keyboard.nextInt();  // Try reading the integer input
                if (inputCheacker >= 1) {
                    inputedNumberOfPeople = inputCheacker;
                    needValidInput = false;
                } else {
                    System.out.println("Invalid input, please input a number larger than or equal to 1");
                }
            } catch (java.util.InputMismatchException e) {
                //catch for when the user inputs a letter or special charictor
                System.out.println("Invalid input, please input a number larger than or equal to 1.");
                keyboard.nextLine();  // get rid of the invalid input so it doesnt enter a never ending loop
            }
        }
            
        
        System.out.println("Please input number of people initially infected"); 
            inputedInitialyInfected = keyboard.nextInt();
        
        
        //getting virus transmission rate, infection period, and imunity durration   
        System.out.println("please input the virus transmition rate as a percentage of 100");
        System.out.println("(do not include the % sign)"); 
            virusTransmissionPercentage = keyboard.nextInt();
   
        System.out.println("please input how many rounds a person is infected for");
            infectionPeriod = keyboard.nextInt();
        
        System.out.println("please input how many rounds immunity lasts for after recovery");
            virusImunityDuration = keyboard.nextInt();
            
        
        //getting the ammount of rounds to simulate for
        System.out.println("please input how many rounds you would like to simulate");
            roundsOfSimulation = keyboard.nextInt();
            
            
        
        
        
        
        
    }    
    
}
