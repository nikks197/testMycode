package Practice1;

public class ReverseString {
	

	public static void main (String [] args)
	{
		// using for Loop
		// Using StringBuffer class
		// diff bet String and StringBuffer class
		// do we have reverse func in String---no as String is immutable object
		String s = "Hello World" ;
		 String rev = "" ;
		 
		 for ( int i= s.length()-1 ; i>=0 ; i-- )
		 {
			rev = rev + s.charAt(i);
		 }
		
		System.out.println(rev);
	
	
	// Using StringBuffer class
	
	StringBuffer sf = new StringBuffer (s);
	
	System.out.println(sf.reverse());
	
	}
	
}