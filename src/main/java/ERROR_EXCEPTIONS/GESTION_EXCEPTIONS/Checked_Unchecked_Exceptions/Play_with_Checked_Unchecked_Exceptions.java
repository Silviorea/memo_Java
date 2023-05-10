package ERROR_EXCEPTIONS.GESTION_EXCEPTIONS.Checked_Unchecked_Exceptions;

public class Play_with_Checked_Unchecked_Exceptions {

	public static void main(String[] args) {
		
		String info = "no information";
		
		
		// getOtherInformation = Unchecked_Exception => Pas d'obligation de la gérer
		info = getOtherInformation();
		
		
		
		// getInformation = Checked_Exception => Obligation de la gérer via Try/Catch
		try 
		{
			info = getInformation();
			System.out.println(info);
			
			createExceptionTest(false);
			
		} 
		
		catch (MyCheckedException e) 
		{
			e.printStackTrace();
		}

	}
	
	
	
	
	
	// La méthode fait remonter une MyCheckedException => Cheked Exception => Obligation de la gérer
	
	public static String getInformation () throws MyCheckedException
	{
		return "une information";
	}
	
	// La méthode fait remonter une MyUncheckedException => Uncheked Exception => Pas d'obligation de la gérer
	public static String getOtherInformation () throws MyUncheckedException
	{
		return "une autre information";
	}
	
	
	
	// Exemple d'utilisation du constructeur d'une exception créée: 
	
	public static String createExceptionTest (boolean test) throws MyCheckedException
	{
		if (test == false)
		{
			throw new MyCheckedException ("Voici le message qui s'affiche en cas de MyCheckedException");
		}
		
		
		return "Tout s'est bien passé";
	}
	
	

}
