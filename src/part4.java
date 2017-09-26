import java.util.List;
import java.util.ArrayList;

public class part4 {

    public static List<String> fbList(int n) {

        if (n >= 1) {
        	
            List<String> list = new ArrayList<String>();

            for (int i = 1; i <= n; i++) {
            	
                int f = i % 3;
                int b = i % 5;
                
                if (f == 0 && b != 0) {
                	
                   list.add("fizz");
                   
                } else 
                	 	
                	if (f != 0 && b == 0) {
                		
                    list.add("buzz");
                    
                } else 
                	    
                	if (f == 0 && b == 0) {
                	
                   list.add("fizzbuzz");
                   
                } else {
                	
                    list.add(String.valueOf(i));
                    
                }
            }

            System.out.println(list);

            return list;

        } else {
        	
            System.out.println("Invalid Number");
            return null;
            
        }


    }

}