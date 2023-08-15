package Practice1;

public class RemoveJunk {
	public static void main (String [] args)
	{

	String s = " %$^%^$&^%&!#$)*() Hamara :><:< Bajaj ";
			// Regular Expression = [^a-zA-Z1-9]
			s= s.replaceAll("[^a-zA-Z1-9]", "");
			System.out.println(s);

	
			
	}		
			
}
