package pattern.created.FactoryMethodPattern.v1;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //  创建文件日志记录器对象
        Logger logger = new FileLogger();
//        创建文件
        return logger;
    }
}
