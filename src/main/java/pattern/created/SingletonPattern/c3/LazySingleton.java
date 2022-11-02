package pattern.created.SingletonPattern.c3;

public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}

    /**
     * 这种具有线程安全问题
     * 当多线程同时进入到if判断里
     * 会创建多个instance
     * */
//    public LazySingleton getInstance(){
//        if(instance == null){
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    /**
     * 这种虽然解决了线程安全问题
     * 但是每次调用getInstance()时都需要进行线程锁定判断
     * 在多线程高并发访问环境中，将会导致系统性能大大降低。
     * */
    synchronized  public LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
