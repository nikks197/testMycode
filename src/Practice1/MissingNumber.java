package Practice1;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a [] = { -1,0,1,2,3,5,6,7,8,9,10 } ;
		int Sum = 0 ;
		
		for ( int i = 0; i< a.length; i++ )
		{
			Sum = Sum + a[i] ;
		}
		System.out.println("The Sum is:" + Sum );
		
		
		int Sum1 = 0 ;
		
		for ( int j = -1; j<= 10; j++ )
		{
			Sum1 = Sum1 + j ;
		}	
		System.out.println("The Sum1 is:" + Sum1 );
		
		System.out.println("The Missing Number is:" + ( Sum1 - Sum ));
		

	}

}
