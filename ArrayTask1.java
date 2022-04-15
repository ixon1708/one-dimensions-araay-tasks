public class ArrayTask1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
