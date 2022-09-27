package pattern.created.FactoryMethodPattern.v1;

public class DatabaseLoggerFactory implements LoggerFactory{
    @Override
    public Logger createLogger() {
//        连接数据库
        Logger logger = new DatabaseLogger();
        return logger;
    }

}
