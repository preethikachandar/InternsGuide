import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingElementbygivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {4,2,0,5,1,6,7};
         Arrays.sort(arr);
         for(int i=2;i<=arr.length-1;i++)
 		{
        	 int j=i+1;
 			if(!(arr[i]==j)){
 				
 			{
 				System.out.println("The Missing Element is" +(i+1));
 			break;
 				
 			}
         
	}

 		}
	}
}

