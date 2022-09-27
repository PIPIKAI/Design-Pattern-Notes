package pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy;

import pattern.created.AbstractFactoryPattern.AbstractProducts.Button;

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示Spring样式按钮");
    }
}
