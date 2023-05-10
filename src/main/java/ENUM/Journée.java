package ENUM;

public enum Journée {
	MATIN (8, "on se lève"), 
	MIDI (12, "on mange"), 
	SOIR (20, "au lit");
	
	
	int hour;
	String toSay;
	
	private Journée(int hour, String toSay) {
		this.hour = hour;
		this.toSay = toSay;
	}


	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public String getToSay() {
		return toSay;
	}


	public void setToSay(String toSay) {
		this.toSay = toSay;
	}

}
