package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;
import org.vw.odin.data.core.Mobility;
import org.vw.odin.model.MovementCostModifier;

public class TerrainFeatureType extends CoreEntity implements MovementCostModifier {

	private Map<Mobility, Double> movementCostModifiers;

	public TerrainFeatureType(String id) {
		super(id);
		movementCostModifiers = new HashMap<Mobility, Double>();
	}

	@Override
	public Double getMovementCostModifier(Mobility mobility) {
		return this.movementCostModifiers.get(mobility);
	}

	public TerrainFeatureType addMovementCostModifier(Mobility mobility, Double modifier){
		this.movementCostModifiers.put(mobility, modifier);
		return this;
	}
	
}
