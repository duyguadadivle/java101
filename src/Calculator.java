import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayı: ");
        n1 = input.nextInt();
        System.out.println("İkinci sayı: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = input.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1/n2));
                break;
        }
    }
}
