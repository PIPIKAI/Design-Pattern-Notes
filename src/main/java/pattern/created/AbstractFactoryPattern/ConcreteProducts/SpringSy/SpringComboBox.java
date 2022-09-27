package pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy;

import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;

public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}
