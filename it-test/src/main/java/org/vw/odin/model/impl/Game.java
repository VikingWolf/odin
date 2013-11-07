package org.vw.odin.model.impl;

import org.vw.odin.model.World;

public class Game {

	private Double hexRadius;			/* in km */
	private Integer turnDuration;		/* in days */
	private Integer currentTurn;
	
	private World world;
	
	private GeoMap map;
		
	public Game(Double hexRadius, Integer turnDuration, Integer currentTurn) {
		super();
		this.hexRadius = hexRadius;
		this.turnDuration = turnDuration;
		this.currentTurn = currentTurn;
	}
	
	public Double getHexRadius() {
		return hexRadius;
	}
	public void setHexRadius(Double hexRadius) {
		this.hexRadius = hexRadius;
	}
	public Integer getTurnDuration() {
		return turnDuration;
	}
	public void setTurnDuration(Integer turnDuration) {
		this.turnDuration = turnDuration;
	}
	public Integer getCurrentTurn() {
		return currentTurn;
	}
	public void setCurrentTurn(Integer currentTurn) {
		this.currentTurn = currentTurn;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public GeoMap getMap() {
		return map;
	}

	public void setMap(GeoMap map) {
		this.map = map;
	}
	
	public int getSeason(){
		return (currentTurn / world.getSeasonDuration() ) % world.getSeasons();
	}
		

		

}
