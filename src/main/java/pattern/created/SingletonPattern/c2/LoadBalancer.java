package pattern.created.SingletonPattern.c2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
//    私有静态成员，存储唯一实例
    private static LoadBalancer instance = null;
//
    private List serverlist = null;
//私有构造函数
    private LoadBalancer(){
        serverlist = new ArrayList();
    }
//    公有静态方法获取唯一实例
    public static LoadBalancer getLoadBalancer() {
        if (instance == null){
            instance = new LoadBalancer();
        }
        return instance;
    }

    //    增加服务器
    public void addServer(String server){
        serverlist.add(server);
    }
//    删除服务器
    public void delServer(String server){
        serverlist.remove(server);
    }
//    获取服务器
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverlist.size());
        return (String) serverlist.get(i);
    }

}
