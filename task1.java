import java.util.*;
import java.util.Scanner;

public class task1{

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Welcome to the number game");
    int n=0;
    int target=55;
    while(n<5)
    {
    	System.out.println("Enter the no. in the range of 1 to 100");
    	System.out.println("Enter your guess");
    	int guess=sc.nextInt();
    	 if(guess==target) 
    	 {
    		 System.out.println("Your guess is correct");
    		 n++;
    		 break; 
    	 }
    	 else if(guess>=50 && guess<=60) 
    	 {
    	      System.out.println("Your guess is close");
    	      
    	 }
    	 else if(guess>0 && guess<50)
    	 {
    		 System.out.println("Your guess is too low");
    	 }
    	 else if(guess>60 && guess<100)
    	 {
    		 System.out.println("Your guess is too high");
    		 
    	 }
    	 else 
    	 {
    		 System.out.println("You entered a number beyond limit");
    		 continue;
    	 }
    	 n++;
    	 
    }
    	
    int score=n;
    switch(score) {
    case 1:
    	System.out.println("Your score is 5/5");
    	break;
    	
    case 2:
    	System.out.println("your score is 4/5");
    	break;
    	
    case 3:
    	System.out.println("Your score is 3/5");
    	break;
    	
    case 4:
    	System.out.println("Your score is 2/5");
    	break;
    	
    case 5:
    	System.out.println("Your score is 1/5");
    	break;
    	 default:
    		 System.out.println("Your score is 0/5");
    		 
    }
    System.out.println("Thanks for playing");
        
    }

}
