package ERROR_EXCEPTIONS.GESTION_EXCEPTIONS.Checked_Unchecked_Exceptions;

public class MyCheckedException extends Exception{    // <= CHECKED EXCEPTION

	
	
	public MyCheckedException() 
	{
	}
	
	public MyCheckedException(String message) 
	{
		super(message);   // <= J'appelle le constructeur de la classe EXCEPTION qui prend une String en Paramètre
		
	}
	


}
