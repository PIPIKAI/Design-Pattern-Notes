package pattern.created.AbstractFactoryPattern.ConcreteProducts.SpringSy;


import pattern.created.AbstractFactoryPattern.AbstractProducts.TextField;

public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}
