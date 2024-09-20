public class IT24100258Lab7Q2B{
	public static void main (String[] args){
		//variable for counting lines
		int lineCount = 1;
		
		//outer loop count the lines
		for(int i = 1; i <= 5; i++){
			//print line number and the '-'
			System.out.print(lineCount + " - ");
			
			//inner loop print stars line value is equal to the number of stars print
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			
			//line count increase in every loop and println line will be go to the new line after every loop
			lineCount++;
			System.out.println();
		}
	}
}