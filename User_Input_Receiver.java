
/**
 * Arden Grove CSC335 Slap-21 virus project
 * 
 * This class gathers the users chosen specifications for the virus simulation and stores them  
 */
import java.util.Scanner;

public class User_Input_Receiver
{
    
    //ints for size of space
    int inputedSpaceWidth; 
    int inputedSpaceLength;

    //ints for number of people in the open space and how many are initaly infected
    int inputedNumberOfPeople;
    int inputedInitialyInfected;

    //ints for virus characteristics
    int virusTransmissionPercentage; 
    int infectionPeriod;
    int virusImunityDuration;

    //int for chosen ammount of rounds the sim will run 
    int roundsOfSimulation;

    //int to tempareraly store any input from the user so that it can be checked
    int inputCheacker;  
        
    //function to validate inputs from the user
    int getValidInput(String prompt){
        Scanner keyboard = new Scanner (System.in);
        
        boolean needValidInput = true;
        while (needValidInput == true) {  
            try {
                System.out.println(prompt);
                inputCheacker = keyboard.nextInt();  
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

    public User_Input_Receiver()  
    {
       
        
        System.out.println("Welcome to the Virus Simulator.");

        // getting values for the width of the open space
        inputedSpaceWidth = getValidInput("Please input width of open space"); 

        
        //getting values for the length of the open space    
        inputedSpaceLength = getValidInput("Please input length of open space");

        
        //getting values for number of people in open space and initially infected
        inputedNumberOfPeople = getValidInput("Please input number of people in the open space"); 

        inputedInitialyInfected = getValidInput("Please input number of people initially infected"); 

        
        //getting virus transmission rate, infection period, and imunity durration   
        virusTransmissionPercentage = getValidInput("please input virus transmition rate as a percentage of 100 (don't include % sign)");

        infectionPeriod = getValidInput("please input how many rounds a person is infected for");

        virusImunityDuration = getValidInput("please input how many rounds immunity lasts for after recovery");

        
        //getting the ammount of rounds to simulate for
        roundsOfSimulation = getValidInput("please input how many rounds you would like to simulate");

        
        
        
    }    

}