import java.util.TreeSet;

public class StringsortusingTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Naveen" , "Priya" , "Rajesh" , "Arun"};
				TreeSet<String> data = new TreeSet<String>();
				for(String str:names) {
					data.add(str);
				}
			  System.out.println(data);
				

	}

}