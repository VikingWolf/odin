package org.vw.odin.model.impl;

import org.vw.odin.data.core.CoreEntity;

public class Weather extends CoreEntity {

	private Double meleeModifier;
	
	private Double fireModifier;
	
	private Double evaporationModifier;

	public Weather(String id, Double meleeModifier, Double fireModifier, Double evaporationModifier) {
		super(id);
		this.meleeModifier = meleeModifier;
		this.fireModifier = fireModifier;
		this.evaporationModifier = evaporationModifier;
	}

	public Double getMeleeModifier() {
		return meleeModifier;
	}

	public void setMeleeModifier(Double meleeModifier) {
		this.meleeModifier = meleeModifier;
	}

	public Double getFireModifier() {
		return fireModifier;
	}

	public void setFireModifier(Double fireModifier) {
		this.fireModifier = fireModifier;
	}

	public Double getEvaporationModifier() {
		return evaporationModifier;
	}

	public void setEvaporationModifier(Double evaporationModifier) {
		this.evaporationModifier = evaporationModifier;
	}

}
