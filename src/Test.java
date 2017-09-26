import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
    	
        Scanner Input = new Scanner(System.in);

        String input;

        System.out.println("Enter a number: ");
        
        input = Input.nextLine();

        try {
            int number = Integer.parseInt(input);

            part3.fbArray(number);

        } catch (NumberFormatException e) {
        	
            System.out.println("The input was not recognized");
  
            System.exit(0);
        }


    }
}