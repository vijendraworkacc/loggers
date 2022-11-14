package com.te.learnlogger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class LearnLog4j {
	private static final Logger logger = Logger.getLogger(LearnLog4j.class);

	public static void m1() {
		logger.debug("In m1() method!");
	}

	public static void main(String[] args) {
		BasicConfigurator.configure();
		logger.debug("Some debug message!");
		logger.info("Some info message!");
		logger.warn("Some warn message!");
		logger.error("Some error message!");
		logger.fatal("Some fatal message!");

		m1();
	}
}
