
public class Armstrongnumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 345;
		int original = num;
		int quotient = 0, remainder = 0, result = 0;
		
		while(num>0) {
			
			quotient = num/10;
			remainder = num%10;
			result = result + (remainder*remainder*remainder);
			num = quotient;
			
		}
		System.out.println("Result : " + result);
		
		if(result == original) {
			System.out.println("It is an Armstrong number" + result);
		}
		else
			System.out.println("It is not an Armstrong number");
		}


	}


