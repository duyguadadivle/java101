import java.util.Scanner;

public class YildizlarElmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 7;
        int m, n;

        for (m = 1; m <= number; m++) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (m = number - 1; m > 0; m--) {
            for (n = 1; n <= number - m; n++) {
                System.out.print(" ");
            }
            for (n = 1; n <= m * 2 - 1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
