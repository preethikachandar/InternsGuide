
public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345;
		int quotient = 0, remainder = 0, result = 0;
		
		while(num>0) {
			
			quotient = num/10;
			remainder = num%10;
			result = result + remainder;
			num = quotient;
			
		}
		System.out.println("Result : " + result);

	}

}
