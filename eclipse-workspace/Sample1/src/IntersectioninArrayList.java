import java.util.List;
import java.util.ArrayList;
public class IntersectioninArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
	    int[] arr2 = new int[]{3, 2, 5, 9, 11};
	  

	    List<Integer> arraylist = new ArrayList<Integer>();
	    for (int i = 0; i < arr1.length; i++) {
	        for (int j = 0; j < arr2.length; j++) {
	            if (arr1[i] == arr2[j]) {
	                arraylist.add(arr1[i]);
	            }
	        }
	    }
	    
	    
	}
	Collections.sort(arrayList);
	System.out.println("Intersection of Two arrays:"+arrayList);

}
