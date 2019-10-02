package io.danny;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {

	private static Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Hello World...! \n");
		
		logger.info("This is the information message");
		logger.error("This is an error message");
		logger.warn("This is the warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
	}

}
