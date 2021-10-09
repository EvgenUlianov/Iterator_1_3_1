public class Main {
    public static void main(String[] args) {
        System.out.println("Задача Бесконечная итерация");
        final int MAX_ITERATIONS = 1000;
        int iteration = 0;
        for (int r : new Randoms(90, 100)) {
            iteration++;

            System.out.println("Случайное число: " + r);
            if (iteration > MAX_ITERATIONS) {
                System.out.println("BREAK PROCESS");
                break;
            }
        }
    }
 }
