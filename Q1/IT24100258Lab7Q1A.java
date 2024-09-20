import java.util.Scanner;

public class IT24100258Lab7Q1A{
	public static void main(String[] args){
		//creating scanner object to get user inputs
		Scanner scanner = new Scanner(System.in);
		
		//define variables
		double subs = 0;
		double total = 0;
		String grade;
		int subCount = 1;
		double average = 0;
		
		System.out.println("Enter marks for four subjects:");
		
		while(subCount < 5){
			//getting user inputs
			System.out.print("Enter Subject Mark " + subCount + ": ");
			subs = scanner.nextDouble();
			
			//calculating the total marks and average
			total += subs;
			average = total/4;
			subCount++;
		}
		
		//deciding the grade based on the average
		if(average>=75 && average<=100){
			grade = "Distinction";
		}else if(average>=50 && average<=74){
			grade = "Credit";
		}else{
			grade = "Fail";
		}
		
		//printing the average and grade
		System.out.println();
		System.out.println("Average is: " + average);
		System.out.println("Overall Grade is: " + grade);
	}
}