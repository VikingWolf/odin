package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeoMap {

	private Map<String, GeoRegion> body = new HashMap<String, GeoRegion>();
	
	public GeoMap addGeoRegion(final GeoRegion geoRegion){
		body.put(geoRegion.getId(), geoRegion);
		return this;
	}

	public GeoMap addGeoRegions(final List<GeoRegion> regions){
		for (GeoRegion region : regions){
			body.put(region.getId(), region);
		}
		return this;
	}
	
	public List<GeoRegion> getGeoRegions(){
		return (List<GeoRegion>) body.values();
	}
}
