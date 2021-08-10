import java.util.LinkedHashSet;

public class GindIntersectionusingset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] data1 = {3,2,4,6,7};
		int[] data2 = {1,2,8,4,7};
		
		LinkedHashSet<Integer> data = new LinkedHashSet<Integer>();
		
		for(int i=0;i<data1.length;i++) {
			for(int j=0;j<data2.length;j++) {
				   if(data1[i] == data2[j])
						   {
							   System.out.println(data1[i]);
						   }
			}
				
		
		

	}

}
}

