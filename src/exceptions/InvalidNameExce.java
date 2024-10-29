package exceptions;

public class InvalidNameExce extends RuntimeException{
	
	public String toString()
	{
		return getClass()+" : invalid name you entered which not present in our data base";
	}


}
