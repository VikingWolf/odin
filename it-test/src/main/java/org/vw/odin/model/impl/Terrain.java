package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;
import org.vw.odin.data.core.Mobility;
import org.vw.odin.model.MovementCostModifier;

public class Terrain extends CoreEntity implements MovementCostModifier {

	private Map<Mobility, Double> movementCostModifiers;
	
	private Double disembark;
	
	private Double filtration;
	
	private Double defenseBonus;
		
	public Terrain(final String id, Double disembark, Double filtration, Double defenseBonus) {
		super(id);
		this.disembark = disembark;
		this.filtration = filtration;
		this.defenseBonus = defenseBonus;
		this.movementCostModifiers = new HashMap<Mobility, Double>();
	}
	
	public Double getDisembark() {
		return disembark;
	}

	public void setDisembark(Double disembark) {
		this.disembark = disembark;
	}

	public Double getFiltration() {
		return filtration;
	}

	public void setFiltration(Double filtration) {
		this.filtration = filtration;
	}

	public Double getDefenseBonus() {
		return defenseBonus;
	}

	public void setDefenseBonus(Double defenseBonus) {
		this.defenseBonus = defenseBonus;
	}

	@Override
	public Double getMovementCostModifier(Mobility mobility) {
		return this.movementCostModifiers.get(mobility);
	}

	public Terrain addMovementCostModifier(Mobility mobility, Double modifier){
		this.movementCostModifiers.put(mobility, modifier);
		return this;
	}
	
}
