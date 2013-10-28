package org.vw.odin.monitor;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vw.odin.data.CoreData;

public class Test {
	
	protected final static Logger logger = LoggerFactory.getLogger(Test.class);
	
	public final static void main(String args[]){
		Test test = new Test();
		test.init();
	}

	public Test(){
		super();
	}
	
	public void init(){
		logger.trace("monitor test init at: " + new Date(System.currentTimeMillis()));
		setUpData();
	}
	
	public void setUpData(){
		CoreData.setUp();
	}
	
	public void movementTest(){
		
	}
}
