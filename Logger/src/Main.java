
import org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;


public class Main {
    public static final Logger logger =  LogManager.getLogger(Main.class);
    public static void main(String[] args) {

        logger.info("this is an info log");
        logger.error("this is an error log");
        logger.debug("this is a debugging log");
        logger.fatal("this is a fatal log");

    }

}