import java.util.Scanner;

public class ArrayTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] company = new char[] {'i','t','g','e','n','i','o'};
        char symbol = scanner.next().charAt(0);
        company[6] = symbol;
        System.out.println(company);
    }
}
