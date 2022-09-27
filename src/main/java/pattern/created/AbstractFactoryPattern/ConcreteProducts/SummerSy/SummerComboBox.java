package pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy;

import pattern.created.AbstractFactoryPattern.AbstractProducts.ComboBox;

public class SummerComboBox implements ComboBox {

    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
