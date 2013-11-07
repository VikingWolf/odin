package org.vw.odin.data;

import java.awt.Point;

import org.vw.odin.model.World;
import org.vw.odin.model.impl.Game;
import org.vw.odin.model.impl.GeoMap;
import org.vw.odin.model.impl.GeoRegion;
import org.vw.odin.model.impl.Hex;

public class SoftData {
		
	
	public final static Game GAME = new Game(10.0d, 1, 0);
	
	public static void setUp(){
		setUpGame();
	}
	
	public static void setUpGame(){
		GAME.setWorld(setUpWorld());
		GAME.setMap(setUpMap());
	}
	
	public static World setUpWorld(){
		World world = new World();
		world.setSeasonDuration(91);
		world.setSeasons(4);
		world.setDefaultSoilState(CoreData.SOIL_STATES.get("Dry"));
		world.setRainfallAvg(10.0d);
		world.setRainfallStdDev(0.15d);
		return world;
	}
	
	public static GeoMap setUpMap(){
		GeoMap map = new GeoMap();		
		map.addGeoRegion(new GeoRegion("NP", "North Pole", CoreData.CLIMATES.get("Polar"))
			.addHex(new Hex(new Point(1, 0), CoreData.TERRAINS.get("Plains"), CoreData.VEGETATIONS.get("Tundra"), GAME.getWorld().getDefaultSoilState())));
		return map;
	}
	
}
