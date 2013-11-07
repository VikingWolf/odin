package org.vw.odin.monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.vw.odin.data.CoreData;
import org.vw.odin.data.SoftData;

public abstract class Test {
	
	public Test(){
		setUpModel();
	}

	public void setUpModel(){
		CoreData.setUp();
		SoftData.setUp();
	}

	public abstract void init();	
	
	public abstract void test();
	
	public Logger logger(){
		return LoggerFactory.getLogger(this.getClass());
	}

}
