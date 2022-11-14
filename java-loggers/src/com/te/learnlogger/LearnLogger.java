package com.te.learnlogger;

import java.util.logging.Logger;

public class LearnLogger {
	private final static Logger logger = Logger.getLogger(LearnLogger.class.getName());

	public static void main(String[] args) {
		logger.info("Some info message!");
		logger.warning("Some warning message!");
		logger.severe("Some severe message!");
	}
}
