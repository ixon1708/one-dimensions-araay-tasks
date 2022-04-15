public class ArrayTask5 {
    public static void main(String[] args) {
        int[] cost = {1050, 2000, 900, 1500, 895, 2700, 1000};
        double[] discount = {0.1, 0.2, 0.05, 0.15, 0.02, 0.25, 0.02};
        double[] prise = new double[cost.length];
        for (int i = 0; i < cost.length; i++) {
            prise[i] = cost[i] - cost[i] * discount[i];
        }
        double min = prise[0];
        int iMin = 0;
        for (int i = 0; i < prise.length; i++) {
            if (min > prise[i]) {
                min = prise[i];
                iMin = i;
            }
        }
        System.out.println("лучше идти в магазин №" + (iMin + 1) + ". Там вещь стоит " + min + " руб.");
    }
}
