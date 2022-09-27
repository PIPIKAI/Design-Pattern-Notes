package pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy;

import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;

public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("显示Summer样式按钮");
    }
}
