package ERROR_EXCEPTIONS.GESTION_EXCEPTIONS.Checked_Unchecked_Exceptions;

public class MyUncheckedException extends RuntimeException{ // <= UNCHECKED_EXCEPTION
	
	public MyUncheckedException()
	{
		
	}

	public MyUncheckedException(String message)
	{
		super(message);		// <= J'appelle le constructeur de la classe RUNTIME_EXCEPTION qui prend une String en Paramètre
	}

}
