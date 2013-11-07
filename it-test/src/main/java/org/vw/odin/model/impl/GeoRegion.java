package org.vw.odin.model.impl;

import java.util.ArrayList;
import java.util.List;

import org.vw.odin.data.core.CoreEntity;

public class GeoRegion extends CoreEntity {

	private String name;
	
	private List<Hex> body;
	
	private Climate climate;

	public GeoRegion(String id, String name, Climate climate) {
		super(id);
		this.name = name;
		this.climate = climate;
		body = new ArrayList<Hex>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Hex> getBody() {
		return body;
	}

	public void setBody(List<Hex> body) {
		this.body = body;
	}
	
	public Climate getClimate() {
		return climate;
	}

	public void setClimate(Climate climate) {
		this.climate = climate;
	}

	public GeoRegion addHex(final Hex hex){
		body.add(hex);
		return this;
	}
	
}
