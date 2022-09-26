package pattern.created.SimpleFactoryPattern;

public  class Client {
    public static void main(String[] args) {
        Chart c =ChartFactory.getChart("line");
        c.display();
    }

}
