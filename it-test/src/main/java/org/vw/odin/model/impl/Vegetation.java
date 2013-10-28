package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;
import org.vw.odin.data.core.Mobility;
import org.vw.odin.model.MovementCostModifier;

public class Vegetation extends CoreEntity implements MovementCostModifier {

	private Map<Mobility, Double> movementCostModifiers;

	private Double forraging;
	
	private Double filtration;
	
	private Double cover;
	
	public Vegetation(String id, Double forraging, Double filtration, Double cover) {
		super(id);
		this.forraging = forraging;
		this.filtration = filtration;
		this.cover = cover;
		this.movementCostModifiers = new HashMap<Mobility, Double>();
	}

	public Double getForraging() {
		return forraging;
	}

	public void setForraging(Double forraging) {
		this.forraging = forraging;
	}

	public Double getFiltration() {
		return filtration;
	}

	public void setFiltration(Double filtration) {
		this.filtration = filtration;
	}

	public Double getCover() {
		return cover;
	}

	public void setCover(Double cover) {
		this.cover = cover;
	}

	public Map<Mobility, Double> getMovementCostModifiers() {
		return movementCostModifiers;
	}

	public void setMovementCostModifiers(Map<Mobility, Double> movementCostModifiers) {
		this.movementCostModifiers = movementCostModifiers;
	}

	@Override
	public Double getMovementCostModifier(Mobility mobility) {
		return this.movementCostModifiers.get(mobility);
	}

	public Vegetation addMovementCostModifier(Mobility mobility, Double modifier){
		this.movementCostModifiers.put(mobility, modifier);
		return this;
	}	

}
