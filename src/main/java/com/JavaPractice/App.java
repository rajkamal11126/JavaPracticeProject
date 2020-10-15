package com.JavaPractice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
//log4j is used to maintain the history of debug.
public class App 
{
	private static final Logger LOG = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	String message = "hellO, wOrld";
    	LOG.debug(message + "Will be Printed on Debug");
    	LOG.info(message + "Will be Printed on Info");
    	LOG.warn(message + "Will be Printed on Warn");
    	LOG.error(message + "Will be Printed on Error");
    	LOG.fatal(message + "Will be Printed on Fatal");
    	LOG.info("Appending string: {}.", message);
        System.out.println(message);
    }
}
