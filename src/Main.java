/**
 * Создайте сто потоков, которые будут вычислять факториал числа,
 * равного номеру этого потока, и выводить результат на экран.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("Start programm");
        double result = 1;
        for (int i = 0; i < 100; i++) {
            result = result * (i + 1);
            Thread thr = new Thread(new NewThread(),i+1 + " thr" + "-" + result);
            thr.start();
        }

        System.out.println("Stop programm");
    }
}
