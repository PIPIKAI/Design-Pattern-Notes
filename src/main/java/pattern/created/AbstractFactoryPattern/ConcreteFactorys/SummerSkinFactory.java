package pattern.created.AbstractFactoryPattern.ConcreteFactorys;

import pattern.created.AbstractFactoryPattern.AbstractFactorys.SkinFactory;
import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;
import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;
import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy.SummerButton;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy.SummerComboBox;
import pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy.SummerTextField;

public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
