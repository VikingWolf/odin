package org.vw.odin.monitor;

import java.util.Date;

import utils.Calculus;

public class ClimateTest extends Test {
	
	
	public final static void main(String args[]){
		ClimateTest test = new ClimateTest();
		test.init();
		test.test();
	}

	public ClimateTest(){
		super();
	}

	@Override
	public void init(){
		logger().error("monitor climate test init at: " + new Date(System.currentTimeMillis()));
	}
	
	@Override
	public void test(){ 
		logger().error(Calculus.getGaussianSampleOpenMin(10d, 0.4d, 0.0d, 1000000L).toString());
	}
		
}
