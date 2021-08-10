
public class Sumofdigitsinastringusingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str[] = {"Welcome23Ch67ennai67"};
		 int sum = getSum(str);
		 System.out.println("Sum of numbers=" +sum);
	}
	private static int getSum(String[] str) {
		 
		 int sum = 0;
		 for(int i=0;i<str.length;i++) {
			 String string = str[i];
			 for(int j = 0;j<string.length();j++) {
				 if(Character.isDigit(string.charAt(j))){
					 sum = sum+Integer.parseInt(string.charAt(j)+"");
				 }
				 
			 }
		 }
		return sum;
		

	}

}
