import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void iterateCubes(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    System.out.println("i: " + i + ", j: " + j + ", k: " + k);
                }
            }
        }
    }

    public static void iterateSquares(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }

    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> list = new ArrayList<>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1000000));
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(generateRandomArray(10000));
        ArrayList<Integer> array2 = new ArrayList<>(array1);

        Runnable task3 = () -> Sort.bubbleSort1(array1);
        Runnable task4 = () -> Sort.bubbleSort2(array2);

        PerformanceMetrics.measureRuntime(task3);
        System.out.println(" ");
        PerformanceMetrics.measureRuntime(task4);
    }

}
