import java.util.HashSet;

public class Printduplicatesusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {14,12,13,11,14,16,20};
         HashSet<Integer> data = new HashSet<Integer>();
         System.out.println("Duplicate values found are:");
         for(int i:arr) {
        	 if(data.add(i)==false)
        	 {
        		 System.out.
        		 
        		 println(i);
        	 }
         }
         
        		 
	}

}
