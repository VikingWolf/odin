package org.vw.odin.model.impl;

import java.util.List;

import org.vw.odin.data.core.CoreEntity;


public class Climate extends CoreEntity {
		
	private String name;
	
	private List<Temperature> temperatures;
	
	private List<Pluviometry> pluviometries;

	public Climate(String code, String name) {
		super(code);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public List<Temperature> getTemperatures() {
		return temperatures;
	}

	public void setTemperatures(List<Temperature> temperatures) {
		this.temperatures = temperatures;
	}

	public List<Pluviometry> getPluviometries() {
		return pluviometries;
	}

	public void setPluviometries(List<Pluviometry> pluviometries) {
		this.pluviometries = pluviometries;
	}
	
	public Climate addSeason(final Temperature temperature, final Pluviometry pluviometry){
		this.temperatures.add(temperature);
		this.pluviometries.add(pluviometry);
		return this;
	}
	
}
