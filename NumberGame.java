//Isaiah Kowalski, this work is mine.
import java.util.*;
public class NumberGame {
	public static void main(String[] args) {

	     Random rand = new Random();
	     Scanner scan = new Scanner(System.in);
	     int randInt = rand.nextInt(10000) + 1;
	     int max=10000, min=1, counter= 0;

	     while(true){
	         try{
	             System.out.printf("Guess my number. It's between %d and %d:\n",  min, max);
	             int guess = Integer.parseInt(scan.nextLine());

	             if((guess>randInt && guess<=10000)){
	                 System.out.println(guess + " is too high! Guess lower."); 
	                 max=guess;
	             }
	             else if(guess<randInt && guess>=1){
	                 System.out.println(guess + " is too low! Guess higher."); 
	                 min=guess;
	             }
	             else if(guess==randInt){
	                 System.out.println(guess + " is the number! After " + counter + " attempts"); 
	                 break;
	            }    
	         }
	         catch(NumberFormatException e){
	             System.out.println("Please Insert Only Integers!");
	             continue;
	         }
	     }
	     scan.close();
	 }

	}


