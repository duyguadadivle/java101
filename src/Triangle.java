import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("1. kenar: ");
        a = input.nextInt();
        System.out.println("2. kenar: ");
        b = input.nextInt();

        int alan = (a * b)/2;
        System.out.println("Alan: " + alan);
    }
}
