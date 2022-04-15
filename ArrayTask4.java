public class ArrayTask4 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        for (int element: array) {
            System.out.print(element + " ");
        }
        for (int i = 0; i < array.length; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println();
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
}
