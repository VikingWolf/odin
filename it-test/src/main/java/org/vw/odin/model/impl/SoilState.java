package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;
import org.vw.odin.data.core.Mobility;
import org.vw.odin.model.MovementCostModifier;

public class SoilState extends CoreEntity implements MovementCostModifier {

	private Map<Mobility, Double> movementCostModifiers;
	
	private Double meleeModifier;
	
	public SoilState(String id, Double meleeModifier) {
		super(id);
		this.meleeModifier = meleeModifier;
		this.movementCostModifiers = new HashMap<Mobility, Double>();
	}

	public Double getMeleeModifier() {
		return meleeModifier;
	}

	public void setMeleeModifier(Double meleeModifier) {
		this.meleeModifier = meleeModifier;
	}

	@Override
	public Double getMovementCostModifier(Mobility mobility) {
		return this.movementCostModifiers.get(mobility);
	}

	public SoilState addMovementCostModifier(Mobility mobility, Double modifier){
		this.movementCostModifiers.put(mobility, modifier);
		return this;
	}

}
