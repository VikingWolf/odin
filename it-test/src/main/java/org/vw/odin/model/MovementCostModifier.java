package org.vw.odin.model;

import org.vw.odin.data.core.Mobility;

public interface MovementCostModifier {

	public Double getMovementCostModifier(final Mobility mobility);
}
