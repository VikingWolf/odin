package org.vw.odin.model.impl;

import java.awt.Point;

import org.vw.odin.data.Settings;


public class Hex {

	private Point location;
	
	private Terrain terrain;
	
	private Vegetation vegetation;
	
	private SoilState soilState;
	
	

	Hex(Point location, Terrain terrain, Vegetation vegetation) {
		super();
		this.location = location;
		this.terrain = terrain;
		this.vegetation = vegetation;
		this.soilState = Settings.World.DEFAULT_SOIL_STATE;
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public Terrain getTerrain() {
		return terrain;
	}

	public void setTerrain(Terrain terrain) {
		this.terrain = terrain;
	}

	public Vegetation getVegetation() {
		return vegetation;
	}

	public void setVegetation(Vegetation vegetation) {
		this.vegetation = vegetation;
	}

	public SoilState getSoilState() {
		return soilState;
	}

	public void setSoilState(SoilState soilState) {
		this.soilState = soilState;
	}
	
}
