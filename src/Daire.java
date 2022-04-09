import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        double r, a, alan;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        r = input.nextDouble();
        System.out.println("Açıyı giriniz: ");
        a = input.nextDouble();

        alan = (pi*(r*r)*a)/360;
        System.out.println("Alan: " + alan);
    }
}
