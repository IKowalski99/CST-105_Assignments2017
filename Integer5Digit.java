// Isaiah Kowalski, this is my own work
public class Integer5Digit {
	public static void main(String[] args){
		System.out.println("Enter a 5 digit integer");
		//Example 12345
		
		//Enter positive 5 digit integer for int num
		int num = 34567;
		int sum = 0;
		while (num > 0){
			sum = sum + num % 10;
			num = num / 10;
			
		// Enter the 5 digit integer you chose
		// Example "5 digit integer: 12345"
		System.out.println("5 digit integer: 34567" );
		
		//Compute the total of all integers combined
		System.out.println("sum = " + sum);
		}
	}
}
