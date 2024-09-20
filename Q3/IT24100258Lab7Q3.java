import java.util.Scanner;

public class IT24100258Lab7Q3{
	public static void main(String[] args){
		//creating Scanner object to get user inputs
		Scanner scanner = new Scanner(System.in);
		
		//defining variables
		int customerNum = 1;
		
		//create a constatnt for the discount precentage
		final double precentage = 0.05;
		
		double total = 0;
		double discount = 0;
		double payment = 0;
		char paymentMethod;
		
		//while loop for 5 customers
		while(customerNum<6){
			System.out.println("Customer " + customerNum);
			
			//get the total bill amount from the user
			System.out.print("Enter total bill amount: ");
			total = scanner.nextDouble();
			
			//get the payment method info fromthe user
			System.out.print("Enter mode of payment: ");
			paymentMethod = scanner.next().charAt(0);
			
			//validate inputs for the payment method
			if(paymentMethod == 'C' || paymentMethod == 'c'){
				//give the discount if the payment method is cash
				discount = total * precentage;
				System.out.println("Discount is : " + discount);
				payment = total - discount;
			}else if(paymentMethod == 'O' || paymentMethod == 'o'){
				System.out.println("No discount applicable");
				payment = total;
			}else{
				//if user enter other character for payment method print error and skip to the next loop
				System.out.println("Payment Mode is Not Valid");
				System.out.println();
				customerNum++;
				continue;
			}
			
		    System.out.println("Amount to be paid: " + payment);
		    System.out.println();
		    customerNum++;
		}
	}
}