package exceptions;

public class AgeException extends RuntimeException{

	public String toString()
	{
		return getClass()+" : age should in between 18 and 22";
	}
}
