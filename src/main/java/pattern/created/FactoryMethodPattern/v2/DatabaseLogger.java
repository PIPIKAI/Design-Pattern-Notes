package pattern.created.FactoryMethodPattern.v2;


public class DatabaseLogger implements Logger {
    @Override
    public void writeLog(){
        System.out.println("数据库日志记录。");
    }
}
