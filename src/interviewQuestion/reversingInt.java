package interviewQuestion;

public class reversingInt{

	public static void main(String[] args) {
		
		
	        // Break time for 20 minute, till 8:55 PM EST.      
			int number = 365412; 
	        int swapped = 0; 
	        while (number != 0) {
	            //          0 * 10 + 3 = 3       
	        	//          3 * 10 + 2 = 32         
	        	//  `       32 * 10 + 1 = 321
	        	swapped = swapped *10+ number % 10;
	        	number = number / 10;
	        }
	        System.out.println(swapped);

	}

}
