package exceptions;

public class nameexception extends RuntimeException{

	public String toString()
	{
		return getClass()+" : name should contains first character as captial";
	}
}
