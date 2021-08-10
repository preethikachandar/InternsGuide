import java.util.ArrayList;
public class AddArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> List = new ArrayList<String>();
		
		List.add("Java");
		List.add("Python");
		List.add("Ruby");
		List.add("javascript");
		
		System.out.println(List);
		
		List.remove(2);
		
		System.out.println(List);

	}

}
