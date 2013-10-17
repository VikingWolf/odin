package org.vw.odin.data;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;
import org.vw.odin.data.core.Mobility;
import org.vw.odin.model.impl.Pluviometry;
import org.vw.odin.model.impl.SoilState;
import org.vw.odin.model.impl.Temperature;
import org.vw.odin.model.impl.Terrain;
import org.vw.odin.model.impl.TerrainFeatureType;
import org.vw.odin.model.impl.Vegetation;
import org.vw.odin.model.impl.Weather;

public class CoreData {
	
	private static CoreDataHolder<Terrain> TERRAINS = new CoreDataHolder<Terrain>();	
	private static CoreDataHolder<Vegetation> VEGETATIONS = new CoreDataHolder<Vegetation>();
	private static CoreDataHolder<TerrainFeatureType> TERRAIN_FEATURE_TYPES = new CoreDataHolder<TerrainFeatureType>();
	private static CoreDataHolder<SoilState> SOIL_STATES = new CoreDataHolder<SoilState>();
	private static CoreDataHolder<Temperature> TEMPERATURES = new CoreDataHolder<Temperature>();
	private static CoreDataHolder<Weather> WEATHERS = new CoreDataHolder<Weather>();
	private static CoreDataHolder<Pluviometry> PLUVIOMETRIES = new CoreDataHolder<Pluviometry>();
		
	public static void setUp(){
		setUpTerrains();
		setUpVegetations();
		setUpTerrainFeatureTypes();
		setUpSoilStates();
		setUpTemperatures();
		setUpWeathers();
		setUpPluviometries();
	}
	
	/* public Terrain(Double disembark, Double filtration, Double defenseBonus) */
	public static void setUpTerrains(){
		TERRAINS.put(new Terrain("Plains", 1.00d, 0.20d, 1.00d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.20d));
		TERRAINS.put(new Terrain("Hills", 0.50d, 0.40d, 1.25d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.50d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.50d)
			.addMovementCostModifier(Mobility.WAGONS, 		2.00d));
		TERRAINS.put(new Terrain("Swamp", 0.00d, 0.80d, 1.50d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	5.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		4.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		7.00d));		
		TERRAINS.put(new Terrain("Mountains", 0.00d, 0.60d, 1.75d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	6.0d)
			.addMovementCostModifier(Mobility.CAVALRY, 		6.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		9.00d));
	}
	
	/* public Vegetation(String id, Double forraging, Double filtration, Double cover) */
	public static void setUpVegetations(){
		VEGETATIONS.put(new Vegetation("Urban", 0.0d, 0.3d, 1.90d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.00d));
		VEGETATIONS.put(new Vegetation("Jungle", 0.6d, 0.5d, 1.80d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	3.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		4.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		7.00d));
		VEGETATIONS.put(new Vegetation("Forest", 0.9d, 0.4d, 1.70d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.40d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.60d)
			.addMovementCostModifier(Mobility.WAGONS, 		2.00d));
		VEGETATIONS.put(new Vegetation("Taiga", 0.7d, 0.4d, 1.60d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.25d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.35d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.75d));
		VEGETATIONS.put(new Vegetation("Farmlands", 1.5d, 0.3d, 1.50d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.10d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.05d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.20d));
		VEGETATIONS.put(new Vegetation("Bushes", 0.8d, 0.3d, 1.40d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.15d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.10d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.25d));
		VEGETATIONS.put(new Vegetation("Tundra", 0.4d, 0.2d, 1.30d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.10d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.20d));		
		VEGETATIONS.put(new Vegetation("Sand", 0.3d, 0.8d, 1.20d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.15d));
		VEGETATIONS.put(new Vegetation("Arid", 0.5d, 0.1d, 1.10d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.30d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.15d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.80d));
		VEGETATIONS.put(new Vegetation("Grass", 1.0d, 0.4d, 1.00d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.00d));
	}
	
	public static void setUpTerrainFeatureTypes(){
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("Road")
			.addMovementCostModifier(Mobility.INFANTRTY, 	0.50d)
			.addMovementCostModifier(Mobility.CAVALRY, 		0.40d)
			.addMovementCostModifier(Mobility.WAGONS, 		0.30d));
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("Stream")
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.20d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.40d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.60d));
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("Ford")
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.10d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.20d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.30d));
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("River")
			.addMovementCostModifier(Mobility.INFANTRTY, 	99.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		99.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		99.00d));
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("Bridge")
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.10d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.20d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.30d));
		TERRAIN_FEATURE_TYPES.put(new TerrainFeatureType("Mountain Pass")
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.10d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.10d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.20d));
	}
	
	/* SoilState(String id, Double meleeModifier) */
	public static void setUpSoilStates(){
		SOIL_STATES.put(new SoilState("Dry", 1.0d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.00d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.00d));
		SOIL_STATES.put(new SoilState("Mud", 0.9d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.20d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.20d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.50d));
		SOIL_STATES.put(new SoilState("Flood", 0.6d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	2.50d)
			.addMovementCostModifier(Mobility.CAVALRY, 		2.00d)
			.addMovementCostModifier(Mobility.WAGONS, 		3.00d));
		SOIL_STATES.put(new SoilState("Snow", 0.8d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.25d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.20d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.30d));
		SOIL_STATES.put(new SoilState("Ice", 0.7d)
			.addMovementCostModifier(Mobility.INFANTRTY, 	1.40d)
			.addMovementCostModifier(Mobility.CAVALRY, 		1.60d)
			.addMovementCostModifier(Mobility.WAGONS, 		1.80d));
	}
	
	/* Temperature(String id, Double meleeModifier, Double attritionModifier, Double evaporationModifier) */
	public static void setUpTemperatures(){
		TEMPERATURES.put(new Temperature("Polar", 		0.70d, 3.00d, 0.20d));
		TEMPERATURES.put(new Temperature("Severe", 		0.70d, 1.75d, 0.40d));
		TEMPERATURES.put(new Temperature("Cold", 		0.70d, 1.20d, 0.60d));
		TEMPERATURES.put(new Temperature("Fresh", 		0.70d, 1.00d, 0.80d));
		TEMPERATURES.put(new Temperature("Temperate", 	0.70d, 1.00d, 1.00d));
		TEMPERATURES.put(new Temperature("Warm", 		0.70d, 1.20d, 1.50d));
		TEMPERATURES.put(new Temperature("Hot", 		0.70d, 2.00d, 2.00d));		
	}

	/* Weather(String id, Double meleeModifier, Double fireModifier, Double evaporationModifier) */
	public static void setUpWeathers(){
		WEATHERS.put(new Weather("Clear", 		1.00d, 1.00d, 1.00d));
		WEATHERS.put(new Weather("Overcast",	0.90d, 0.80d, 0.80d));
		WEATHERS.put(new Weather("Rain", 		0.90d, 0.80d, 0.60d));
		WEATHERS.put(new Weather("Snow", 		0.80d, 0.70d, 0.40d));
		WEATHERS.put(new Weather("Ice", 		0.70d, 0.90d, 0.20d));
	}
	
	/* Pluviometry(String id) */
	public static void setUpPluviometries(){
		PLUVIOMETRIES.put(new Pluviometry("Extr. Wet")
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Snow"), 			0.85d)
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Overcast"), 		0.10d)
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Ice"), 			0.05d)			
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Snow"), 			0.55d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Rain"), 			0.30d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Overcast"), 		0.05d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Ice"), 			0.05d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Clear"), 			0.05d)			
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Snow"), 			0.35d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Rain"), 			0.50d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Ice"), 				0.05d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Overcast"), 		0.03d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Clear"), 			0.07d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Snow"), 			0.15d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Rain"), 			0.70d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Overcast"), 		0.08d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Clear"), 			0.07d)			
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Rain"), 		0.80d)
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Overcast"), 	0.10d)
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Clear"), 		0.10d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Rain"), 			0.90d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Overcast"), 		0.05d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Clear"), 			0.05d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Rain"), 				0.94d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Overcast"), 			0.04d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Clear"), 			0.02d));
		
		PLUVIOMETRIES.put(new Pluviometry("Very Wet")
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Snow"), 			0.70d)
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Overcast"), 		0.20d)
			.addWeather(TEMPERATURES.get("Polar"), WEATHERS.get("Ice"), 			0.10d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Snow"), 			0.45d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Rain"), 			0.25d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Overcast"), 		0.10d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Ice"), 			0.10d)
			.addWeather(TEMPERATURES.get("Severe"), WEATHERS.get("Clear"), 			0.10d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Snow"), 			0.25d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Rain"), 			0.45d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Ice"), 				0.10d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Overcast"), 		0.05d)
			.addWeather(TEMPERATURES.get("Cold"), WEATHERS.get("Clear"), 			0.15d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Snow"), 			0.12d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Rain"), 			0.55d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Overcast"), 		0.17d)
			.addWeather(TEMPERATURES.get("Fresh"), WEATHERS.get("Clear"), 			0.16d)
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Rain"), 		0.68d)
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Overcast"),	0.16d)
			.addWeather(TEMPERATURES.get("Temperate"), WEATHERS.get("Clear"), 		0.16d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Rain"), 			0.76d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Overcast"), 		0.16d)
			.addWeather(TEMPERATURES.get("Warm"), WEATHERS.get("Clear"), 			0.08d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Rain"), 				0.79d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Overcast"), 			0.16d)
			.addWeather(TEMPERATURES.get("Hot"), WEATHERS.get("Clear"), 			0.05d));
	}



}

class CoreDataHolder<T extends CoreEntity> {
	
	private Map<String, T> body = new HashMap<String, T>();
	
	public T get(final String key){
		return body.get(key);
	}
	
	public void put(final T item){
		body.put(item.getId(), item);
	}
}
