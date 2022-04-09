import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        System.out.println("Para miktarı: ");
        double tutar;
        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();
        double kdv = (tutar*18)/100;

        double kdvTutar = tutar + kdv;

        System.out.println("Tutar: " + tutar);
        System.out.println("Kdv tutarı: " + kdv);
        System.out.println("Kdv'li tutar: " + kdvTutar);



    }
}
