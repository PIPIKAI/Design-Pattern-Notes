package pattern.created.FactoryMethodPattern.practices;

import org.junit.Test;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;

public class XmlUtil {
    private final static String CLASS_PREFIX = XmlUtil.class.getPackage().getName() + ".";
    private static final String CONFIG_PATH ="src/main/java/pattern/created/FactoryMethodPattern/practices/config.xml";
    public static Object getBeans(String imgPath){
        try{

            String[] splitedPath =imgPath.split("\\.");
            String imgType = splitedPath[splitedPath.length -1];


            // 1.创建Reader对象
            SAXReader reader = new SAXReader();
            // 2.加载xml
            Document document = reader.read(new File(CONFIG_PATH));
            // 3.获取根节点

            Element rootElement = document.getRootElement();

            Iterator<Element> iterator = rootElement.elementIterator();
            while (iterator.hasNext()){
                Element child = (Element) iterator.next();
                String format = child.element("format").getText();
                String cName = child.element("className").getText();
                if(format.equals(imgType)){
                    Class c = Class.forName(CLASS_PREFIX + cName);
                    Constructor constructor = c.getConstructor(String.class);
                    return constructor.newInstance(imgPath);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    @Test
    public void TestGetBeans(){
        String filePath = "C:\\Users\\Administrator\\Desktop\\result.png";
        ImageReaderFactory   factory = (ImageReaderFactory)XmlUtil.getBeans(filePath);
        factory.createImageReader(filePath);
        System.out.println();

    }
}
