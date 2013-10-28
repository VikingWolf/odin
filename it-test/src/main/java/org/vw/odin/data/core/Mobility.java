package org.vw.odin.data.core;

public enum Mobility {
	
	INFANTRTY("Infantry", "Inf"),
	CAVALRY("Cavalry", "Cav"),
	WAGONS("Wagons", "Wag");

	private String id;
	
	private String abreviation;
	
	private Mobility(final String id, final String abreviation){
		this.id = id;
		this.abreviation = abreviation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAbreviation() {
		return abreviation;
	}

	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	
}
