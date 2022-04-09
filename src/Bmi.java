import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        double boy, kg, bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        kg = input.nextDouble();

        bmi = kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + bmi);
    }
}
