
public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		num[6] = 78;
		
		for (int i=0; i<num.length;i++)
		{
			num[i] = 7;
			System.out.println(num[i]);
		}
		String[] name = {"mega", "raj"};
    //array of objects
		
		Object data[]  = new Object[7];
		data[0] = "Hello";
		data[1] = "name";
		
		for(int i=0; i<data.length; i++) {
			System.out.println(data[i]);
		}
	}

}