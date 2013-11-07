package utils;

import java.util.ArrayList;
import java.util.List;

public class StatisticalSample {

	private List<Double> body = new ArrayList<Double>();

	private Double max = Double.NEGATIVE_INFINITY;
	private Double min = Double.POSITIVE_INFINITY;
	private Double sum = 0.0d;
	
	public List<Double> getBody() {
		return body;
	}

	public void setBody(List<Double> body) {
		this.body = body;
	}

	public StatisticalSample addValue(final Double value){
		body.add(value);
		sum += value;
		if (value > max) max = value;
		else if (value < min) min = value;
		return this;
	}

	public Double getMax() {
		return max;
	}

	public Double getMin() {
		return min;
	}

	public Double getAverage() {
		return sum / body.size();
	}
	
	public Double stdDeviation(){
		double sum = 0.0d;
		for (Double value : body){
			sum += Math.pow(value - getAverage(), 2);
		}
		return Math.sqrt(sum / body.size());
	}

	@Override
	public String toString() {
		return "StatisticalSample [getMax()=" + getMax() + ", getMin()="
				+ getMin() + ", getAverage()=" + getAverage()
				+ ", stdDeviation()=" + stdDeviation() + "]";
	}

	
}
