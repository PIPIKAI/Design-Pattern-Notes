package pattern.created.AbstractFactoryPattern.AbstractFactorys;

import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;
import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;
import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;


//界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
