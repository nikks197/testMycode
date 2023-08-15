package Practice1;

public class ReverseInteger {

	public static void main(String[] args) {

		// Using Algo
		
		long num = 123456789;
		long rev = 0 ;
		
		while( num!= 0)
		{
			rev = rev * 10 + num % 10 ;
			 num = num / 10 ;
			
		
		}
		System.out.println(" The Reverse Of provided Number is:: " + rev);
		
		// Using StringBuffer
		
		long  num1 =1010101010 ;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
	}

}
