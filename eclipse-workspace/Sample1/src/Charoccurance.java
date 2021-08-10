
public class Charoccurance {
	// Function to get the specific character
    public static char
    getCharFromString(String str, int index)
    {
        return str.toCharArray()[index];
    }
  
    // Driver code
    public static void main(String[] args)
    {
        // Get the String
        String str = "Most Welcome";
  
        // Get the index
        int index = 6;
        int ind= 11;
  
        // Get the specific character
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           +"at index" +ind
                           + " is " + ch);
    }
}


