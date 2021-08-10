import java.util.Arrays;
import java.util.Scanner;

public class pyramidofnumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:");
        String input = scanner.nextLine();
     
       int integerArray[] = new int[input.length()];
       String inputStringArray[] = input.split("");
       for (int i = 0; i < inputStringArray.length; i++) {
    	   integerArray[i] = Integer.parseInt(inputStringArray[i]);
       
       }
       Arrays.sort(integerArray);
       int len = integerArray.length;
       for (int i = 0; i < len; i++) {

    
            
            
           for (int j = 0; j < ((6-j)/2); j++) {

               System.out.print(" ");

           } 
           for (int j = 0; j < i + 1; j++) {
        	   
               System.out.print(integerArray[i]);

           }
            
            

           System.out.println();

       }
	}
}
