package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UsingPropertyFile {
	
	static Logger logger = Logger.getLogger(UsingPropertyFile.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");		


	}

}
