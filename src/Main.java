
public class Main {

	public static void fb(int n) {
		
		if( n >= 1) {
			
			 for (int i = 1; i <= n; i++) {
	                if ((i % 3 == 0) && (i % 5 == 0)) {
	                    System.out.println("fizzbuzz");
	                } else if (i % 3 == 0) {
	                    System.out.println("fizz");

	                } else if (i % 5 == 0) {
	                    System.out.println("buzz");

	                } else {
	                    System.out.println(i);

	                }

	            }
			
		} else 
			System.out.println("invalid number");
		
			System.exit(0);
		
	}
	
}
