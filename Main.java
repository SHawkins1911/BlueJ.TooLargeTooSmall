
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class Main
{
    // instance variables - replace the example below with your own
    private int randNum;
    private int guesses;
    private int userNum;
    private int currGuess;
    private int prevGuess;
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
        
        // initialise instance variables
         
        
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void gameTime()
     {
         //put your code here
         Random rand = new Random();
        int randNum = rand.nextInt(30);
        // initialise instance variables
        prevGuess = 0;
        guesses = 0;
        randNum += 1; 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positve whole number between 0 and 30");
        
        while(userNum != randNum){
                userNum = in.nextInt();
             
                if(userNum < randNum && userNum != prevGuess){
                    guesses++;
                    prevGuess = userNum;
                    System.out.println("Too small. Try again.");
               
               
                }
                else if(userNum > randNum && userNum != prevGuess){
                    guesses++;
                    prevGuess = userNum;
                    System.out.println("Too large. Try again");
                
                }
                
        
    };
        guesses++;
        
        System.out.println("Good job! It only took you " + guesses + " guesses!");
    }}
