package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyFileConfiguratorExample {

	static Logger logger = Logger.getLogger(PropertyFileConfiguratorExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a Debug message");
		logger.info("This is a Info message");
		logger.warn("This is a Warn message");
		logger.error("This is a Error message");
		logger.fatal("This is a Fatal message");
		
	}

}
