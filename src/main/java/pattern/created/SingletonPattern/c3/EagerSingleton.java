package pattern.created.SingletonPattern.c3;

// 饿汉模式
public class EagerSingleton {
//    其特点是在类创建的时候就把实例给创建
    private static final EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}
    public EagerSingleton getInstance(){
        return instance;
    }
}
