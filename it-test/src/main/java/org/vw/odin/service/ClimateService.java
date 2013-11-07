package org.vw.odin.service;

import org.vw.odin.model.impl.Game;
import org.vw.odin.model.impl.GeoRegion;
import org.vw.odin.model.impl.Hex;
import org.vw.odin.model.impl.Pluviometry;
import org.vw.odin.model.impl.Temperature;

public class ClimateService extends Service {

	public void computeClimate(final Game game){
		for (GeoRegion region : game.getMap().getGeoRegions()){
			Temperature temperature = region.getClimate().getTemperature(game.getSeason());
			Pluviometry pluviometry = region.getClimate().getPluviometry(game.getSeason());
			for (Hex hex : region.getBody()){
				applyClimate(hex, temperature, pluviometry);
			}
		}				
	}
	
	private void applyClimate(final Hex hex, final Temperature temperature, final Pluviometry pluviometry){
				
	}
	
}
