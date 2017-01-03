package es.egc.app;

/**
 * Hello world!
 *
 */

import org.apache.log4j.*; 
public class App 
{
    public static void main( String[] args )
    {

	Logger log=Logger.getLogger(App.class); 
	log.info("Returning 1");

        System.out.println( "Hello World!" );
    }
}
