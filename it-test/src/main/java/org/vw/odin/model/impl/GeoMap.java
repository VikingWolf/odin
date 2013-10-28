package org.vw.odin.model.impl;

import java.util.Map;

public class GeoMap {

	private Map<String, GeoRegion> body;
	
	public GeoMap addGeoRegion(final GeoRegion geoRegion){
		body.put(geoRegion.getId(), geoRegion);
		return this;
	}

}
