import java.util.Map;
import java.util.HashMap;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Most Welcome" ;
		Map<Character,Integer> map = new HashMap<Character,Integer>();
       char[] ch = text.toCharArray();
       for(char c:ch) {
    	   if(map.containsKey(c)) {
    		   map.put(c, map.get(c) +1);
    	   
    		   
    	   }
       }
    	   
       
      
	}

	
}
