public class NewThread implements Runnable {
    @Override
    public void run() {
        int result = 1;
        for (int i = 0; i < 100; i++) {
            result = result * (i + 1);
            System.out.println(Thread.currentThread().getName() + " - " + result);
        }
    }
}