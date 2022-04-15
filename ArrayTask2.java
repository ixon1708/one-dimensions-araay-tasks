import java.util.Scanner;

public class ArrayTask2 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isContains = false;
        for (int element: array) {
            if (element == num) {
                isContains = true;
                break;
            }
        }
        if (isContains) {
            System.out.println("Число " + num + " есть в массиве.");
        } else {
            System.out.println("Числа " + num + " нет в массиве.");
        }
    }
}
