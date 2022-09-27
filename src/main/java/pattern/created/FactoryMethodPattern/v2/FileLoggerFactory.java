package pattern.created.FactoryMethodPattern.v2;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {
        //  创建文件日志记录器对象
        Logger logger = new FileLogger();
//        创建文件
        return logger;
    }

    @Override
    public Logger createLogger(String args) {
        Logger logger = new FileLogger();
        return logger;
    }

    @Override
    public Logger createLogger(Object obj) {
        Logger logger = new FileLogger();
        return logger;
    }
}
