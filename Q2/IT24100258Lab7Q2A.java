public class IT24100258Lab7Q2A{
	public static void main(String[] args){
		//variables for length and width of the square
		int length = 5;
		int width = 4;
		
		//outer loop for deciding the line
		for(int i = 0; i < width; i++){
			//inner loop for printing $ mark in the line
		    for(int j = 0; j < length; j++){
    			System.out.print("$ ");
		    }
		    
		    System.out.println();
		}
	}
}