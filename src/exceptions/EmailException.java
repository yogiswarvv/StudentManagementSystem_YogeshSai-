package exceptions;

public class EmailException extends RuntimeException{
	
	public String toString()
	{
		return getClass()+" : email should contains @ and digits and character and also ends with gmail.com and also email should contains lower case chars only";
	}

}
