
public class SumofDigis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 156;
		int rem =0;
		int sum =0;
		//num = 156
		while(num>0) 
		{
			rem = num%10;//6
			sum =sum+rem;//0+6
			num = num/10;//15
			
			System.out.println(sum);
			
		}
		
		

	}

}
