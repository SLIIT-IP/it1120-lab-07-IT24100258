import java.util.Scanner;

public class IT24100258Lab7Q1B{
	public static void main(String[] args){
		//creating scanner object to get user inputs
		Scanner scanner = new Scanner(System.in);
		
		//define variables
		int stdCount = 1;
		double marks;
		double average = 0;
		String grade;
		
		//while loop for count the students
		while(stdCount < 4){
		    double total = 0;
			System.out.println("Student " + stdCount);
			System.out.print("Enter marks: ");
				
				//get user inputs from the single line and calculate total marks and average
				for(int i = 1; i <= 4; i++){
					marks = scanner.nextDouble();
        			total += marks;
        			average = total/4;
					
				}
			
			//deciding the grade according to the average	
			if(average>=75 && average<=100){
				grade = "Distinction";
			}else if(average>=50 && average<=74){
				grade = "Credit";
			}else{
				grade = "Fail";
			}
			
			//printing average and grade for each student
			System.out.println("Average is: " + average);
			System.out.println("Overall Grade is : " + grade);
			System.out.println();
			stdCount++;
		}
	}
}