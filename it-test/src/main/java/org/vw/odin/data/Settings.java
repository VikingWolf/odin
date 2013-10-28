package org.vw.odin.data;

import org.vw.odin.model.impl.SoilState;

public class Settings {

	public static class Game {
		public final static Double HEX_RADIUS 			= 	10.0d; /* in km */
		public final static Byte TURN_DURATION 			= 		1; /* in days */
		
	}
	
	public static class World {
		public final static Integer SEASON_DURATION		=	91; /* in days */
		public final static Integer SEASONS				=	4;
		public final static SoilState DEFAULT_SOIL_STATE		=	CoreData.SOIL_STATES.get("Dry");
	}
}
