package pattern.created.AbstractFactoryPattern.ConcreteProducts.SummerSy;


import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;

public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}
