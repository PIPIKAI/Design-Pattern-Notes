package pattern.created.AbstractFactoryPattern;

import pattern.created.AbstractFactoryPattern.AbstractFactorys.SkinFactory;
import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;
import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;
import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;

public class Client {
    public static void main(String[] args) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}
