package org.vw.odin.model.impl;

import org.vw.odin.data.core.CoreEntity;

public class Temperature extends CoreEntity {

	private Double meleeModifier;
	
	private Double attritionModifier;
	
	private Double evaporationModifier;
	
	public Temperature(String id, Double meleeModifier, Double attritionModifier, Double evaporationModifier) {
		super(id);
		this.meleeModifier = meleeModifier;
		this.attritionModifier = attritionModifier;
		this.evaporationModifier = evaporationModifier;
	}
	
	public Double getMeleeModifier() {
		return meleeModifier;
	}
	
	public void setMeleeModifier(Double meleeModifier) {
		this.meleeModifier = meleeModifier;
	}
	
	public Double getAttritionModifier() {
		return attritionModifier;
	}
	
	public void setAttritionModifier(Double attritionModifier) {
		this.attritionModifier = attritionModifier;
	}
	
	public Double getEvaporationModifier() {
		return evaporationModifier;
	}
	
	public void setEvaporationModifier(Double evaporationModifier) {
		this.evaporationModifier = evaporationModifier;
	}

}
