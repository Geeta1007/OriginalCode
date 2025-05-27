package Log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4jXMLConfiguratorExample {

	static Logger logger = Logger.getLogger(Log4jXMLConfiguratorExample.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a Debug message");
		logger.info("This is a Info message");
		logger.warn("This is a Warn message");
		logger.error("This is a Error message");
		logger.fatal("This is a Fatal message");
	}

}
