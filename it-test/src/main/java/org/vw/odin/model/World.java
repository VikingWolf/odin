package org.vw.odin.model;

import org.vw.odin.model.impl.SoilState;

public class World {

	private Integer seasonDuration;					/* in turns */
	private Integer seasons;				
	private SoilState defaultSoilState;
	private Double rainfallAvg;
	private Double rainfallStdDev;
		
	public World() {
		super();
	}

	public Integer getSeasonDuration() {
		return seasonDuration;
	}

	public void setSeasonDuration(Integer seasonDuration) {
		this.seasonDuration = seasonDuration;
	}

	public Integer getSeasons() {
		return seasons;
	}

	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}

	public SoilState getDefaultSoilState() {
		return defaultSoilState;
	}

	public void setDefaultSoilState(SoilState defaultSoilState) {
		this.defaultSoilState = defaultSoilState;
	}

	public Double getRainfallAvg() {
		return rainfallAvg;
	}

	public void setRainfallAvg(Double rainfallAvg) {
		this.rainfallAvg = rainfallAvg;
	}

	public Double getRainfallStdDev() {
		return rainfallStdDev;
	}

	public void setRainfallStdDev(Double rainfallStdDev) {
		this.rainfallStdDev = rainfallStdDev;
	}

}
