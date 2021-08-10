import java.util.Arrays;
import java.util.Collections;

public class FindLargestElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNum = {34, 203, 5, 78, 100, 1000, 1};
		
		// Step 1: sort the array
		Arrays.sort(arrNum);
		
		//step2: Print the last element of the array
        System.out.println("Largest element in he array:" +arrNum[arrNum.length-1]);
        
        //step 3: Print the second largest element in an array
        System.out.println("Largest element in he array:" +arrNum[arrNum.length-2]);
         
        //step4: Print the second smallest element of the array
        Collections.reverse(arrNum);;
}
}
