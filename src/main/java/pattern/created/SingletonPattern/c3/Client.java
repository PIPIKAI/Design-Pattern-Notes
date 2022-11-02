package pattern.created.SingletonPattern.c3;

public class Client extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {

    }
}
