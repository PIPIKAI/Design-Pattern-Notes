package pattern.created.AbstractFactoryPattern.ConcreteFactorys;

import pattern.created.AbstractFactoryPattern.AbstractFactorys.SkinFactory;
import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;
import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;
import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy.SpringButton;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy.SpringComboBox;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy.SpringTextField;

public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
