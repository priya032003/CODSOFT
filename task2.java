import java.util.*;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc=  new Scanner (System.in);
		 
		System.out.println("Enter your marks in all 5 subjects");
		System.out.println("Enter your marks in physics");
		int physics= sc.nextInt();
		
		System.out.println("Enter your chemistry marks");
		int chemistry= sc.nextInt();

		System.out.println("Enter yoyur maths in maths");
		int maths = sc.nextInt();
		 
		System.out.println("Enter your english marks");
		int english =sc.nextInt();
		 
		System.out.println("Enter you IT marks");
		int IT =sc.nextInt();
		
		
		
		double sum=physics+chemistry+maths+english+IT;
		double per=(sum)/500*100;
		
		System.out.println("Your total  marks  are" +sum);
		System.out.println("your percentage is" +per);
		
		char grade;
		if(per>=90) {
			grade ='A';
		} else if(per>=80) 
		{
			grade ='B';
			
		}
		else if(per>=70)
		{
			grade ='C';
		}
		else if(per>=60)
		{
			grade='D';
			
		}
		else if(per>=40)
		{
			grade='E';
		}
		else{
			grade='F';
		
		}
		System.out.println("Your grade is"+grade);
		
		
	}

}
