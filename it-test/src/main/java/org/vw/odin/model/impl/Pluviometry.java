package org.vw.odin.model.impl;

import java.util.HashMap;
import java.util.Map;

import org.vw.odin.data.core.CoreEntity;

public class Pluviometry extends CoreEntity {
	
	private Map<Temperature, Map<Weather, Double>> chart;

	public Pluviometry(String id) {
		super(id);
		chart = new HashMap<Temperature, Map<Weather, Double>>();
	}

	public Pluviometry addWeather(Temperature temperature, Weather weather, Double chance){
		Map<Weather, Double> temperatureChart = chart.get(temperature);
		if (temperatureChart == null){
			temperatureChart = new HashMap<Weather, Double>();
		}
		temperatureChart.put(weather, chance);
		chart.put(temperature, temperatureChart);
		return this;
	}	

}
