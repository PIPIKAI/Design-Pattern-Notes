package pattern.created.FactoryMethodPattern.v1;


import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    private final static String prefix = XMLUtil.class.getPackage().getName() + ".";
    private final static String path = "src/main/java/pattern/created/FactoryMethodPattern/v1/config.xml";

    public static Object getBean() {
        try {
            // 创建DOM文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File(path));

//            获取包含类名的文本节点
            NodeList nl = doc.getElementsByTagName("className");
            Node node = nl.item(0).getFirstChild();
            String cName = node.getNodeValue();

//            通过类名生成对象
            Class c = Class.forName(prefix + cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void TestGetBean() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        String p = XMLUtil.class.getPackage().getName();
        System.out.println(p);
        Class c = Class.forName(p + ".DatabaseLogger");
        Object obj = c.newInstance();
    }
}

