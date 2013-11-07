package org.vw.odin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Service {

	public Logger logger(){
		return LoggerFactory.getLogger(this.getClass());
	}

}
