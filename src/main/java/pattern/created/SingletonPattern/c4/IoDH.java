package pattern.created.SingletonPattern.c4;

public class IoDH {
    private IoDH() {
    }
    private static class HoldClass{
        private static IoDH getInstance = new IoDH();
    }

    public static IoDH getInstance (){
        return HoldClass.getInstance;
    }

    public static void main(String[] args) {
        IoDH s1,s2 ;
        s1= IoDH.getInstance();
        s2 = IoDH.getInstance();
        System.out.println(s1 == s2);
    }
}
