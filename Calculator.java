
public class Calculator {
	
	
	public int add(int num1, int num2, int num3) {
		  int sum = num1 + num2 + num3;
		  return sum;
	}
		  
    public int sub(int num1, int num2)  {
    	   int sub = num1 - num2;
    	   return sub;	   
    }
    
    public double mul(double num1, double num2)  {
    	   double mul = num1 * num2;
    	   return mul;
    }
    	   
    public double div(double num1, double num2)  {
    	   double div = num1/num2;
    	   return div;
    }
   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calculator calc = new Calculator();
		 
		 System.out.println(calc.add(10,20,30));
		 System.out.println(calc.sub(10,20));
		 System.out.println(calc.mul(10.25,12.25));
		 System.out.println(calc.div(10.25,12.25));
		 
		 
		 
		 
		 

	}

}
