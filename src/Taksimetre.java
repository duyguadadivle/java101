import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double perKm = 2.2;
        double total = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        total += (km * perKm);

        if(total < 20)
            System.out.println("Tutar: 20 " );
        else if(total > 20)
            System.out.println("Tutar: " + total);
    }
}
