public class IT24100258Lab7Q2C{
	public static void main(String[] args){
		//outer loop decide how many lines to print every loop it decrement by 1
		for(int i = 5; i >= 1; i--){
			
			//inner loop print the line value
			for(int j = i; j >= 1; j--){
				System.out.print(i);
			}
			
			//end of every loop go to a new line
			System.out.println();
		}
	}
}