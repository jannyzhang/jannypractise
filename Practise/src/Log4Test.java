

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4Test {

    private static Logger logger = Logger.getLogger(Log4Test.class);
    public static void main(String[] args)  {
//        BasicConfigurator.configure();
        PropertyConfigurator.configure("C:\\Users\\Administrator\\Desktop\\IdeaProjects\\Practise\\src\\log4j.properties");
        logger.debug("This is debug message!");
        logger.info("info");
        logger.error("This is error");
    }
}
