import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican =5.00;
        double total;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.println("Armut kaç kg? :");
        armutKg = input.nextDouble();
        System.out.println("Elma kaç kg? :");
        elmaKg = input.nextDouble();
        System.out.println("Domates kaç kg? :");
        domatesKg = input.nextDouble();
        System.out.println("Muz kaç kg? :");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan kaç kg? :");
        patlicanKg = input.nextDouble();
        total = (armut*armutKg) + (elma*elmaKg) + (domates*domatesKg) + (muz*muzKg) + (patlican*patlicanKg);
        System.out.println("Toplam tutar: " + total);
    }
}
