package exceptions;

public class InvaliIdException extends RuntimeException{
	
	public String toString()
	{
		return getClass()+" : invalid Id you entered which not present in our data base";
	}

}
