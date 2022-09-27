package pattern.created.FactoryMethodPattern.v1;

public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
