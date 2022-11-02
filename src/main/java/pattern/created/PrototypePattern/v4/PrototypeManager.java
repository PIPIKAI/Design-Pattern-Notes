package pattern.created.PrototypePattern.v4;

import java.util.Hashtable;

public class PrototypeManager {
    //    定义一个HashTable 存储原型对象
    private Hashtable ht = new Hashtable();
    //    使用懒汉式 单例模式
    private static PrototypeManager pm = new PrototypeManager();

    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    //    增加新的对象
//增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }

}
