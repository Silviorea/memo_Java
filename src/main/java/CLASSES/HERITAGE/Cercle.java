package CLASSES.HERITAGE;

public class Cercle {


		
		private int rayon;
		
		

		public Cercle(int rayon) {
			super();
			this.rayon = rayon;
		}

	    
	    // Methodes
	    public double surface ()
	    {
			return this.rayon * this.rayon * Math.PI;
			
	    	
	    }
	    
	    
	    public double perimetre ()
	    {
			return this.rayon *2 * Math.PI;
	    	
	    }
	    
	    
	    
	    public int getRayon() {
			return rayon;
		}

		public void setRayon(int rayon) {
			this.rayon = rayon;
		}
	    
	    

}
