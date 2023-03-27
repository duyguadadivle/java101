import java.util.Scanner;

public class AdvancedCalculator {

    static void plus(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while(true){
            System.out.println(i++ + ".sayı: ");
            number = scanner.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void minus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz");
        int counter = scanner.nextInt();
        int number, result = 0;

        for(int i=1; i<=counter; i++){
            System.out.println(i + ".sayı: ");
            number = scanner.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);

    }

    static void times(){

        Scanner scanner = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true){
            System.out.println(i++ + ".sayı: ");
            number = scanner.nextInt();

            if (number ==1)
                break;
            if(number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divide(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for(int i = 1; i<= counter ; i++){
            System.out.println(i + ".sayı: ");
            number = scanner.nextDouble();
            if(i != 1 && number == 0){
                System.out.println("Bölen 0 olamaz");
                continue;
            }
            if(i == 1){
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç: " + result);
    }

    static void power(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değer: ");
        int base = scanner.nextInt();
        System.out.println("Üs değer girin: ");
        int exponent = scanner.nextInt();
        int result = 1;

        for(int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç: " + result);

    }

    static void factorial(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı: ");
        int number = scanner.nextInt();
        int result = 1;

        for(int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Modunu girmek istediğiniz sayıyı giriniz: ");
        int number = scanner.nextInt();
        System.out.println("Modu giriniz:");
        int mod = scanner.nextInt();
        int result = number % mod;
        System.out.println("Mod: " + result);

    }
    static void rectangleAreaandPerimeter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdörtgenin uzun kenarı: ");
        int n1 = scanner.nextInt();
        System.out.println("Dikdörtgenin kısa kenarı: ");
        int n2 = scanner.nextInt();

        int rectangleArea = n1 * n2;
        int rectanglePerimeter = 2 * (n1 + n2);

        System.out.println("Alan: " + rectangleArea);
        System.out.println("Çevre: " + rectanglePerimeter);

    }


    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     int select;
     String menu = "1-Toplama\n"
             + "2-Çıkarma\n"
             + "3-Çarpma\n"
             + "4-Bölme\n"
             + "5-Üs\n"
             + "6-Faktöriyel\n"
             + "7-Mod\n"
             + "8-Dikdörtgen Alan ve Çevre\n"
             + "0-Çıkış\n";

     do {
         System.out.println(menu);
         System.out.println("Lütfen bir işlem seçiniz: ");
         select = scanner.nextInt();
         switch (select){
             case 1:
                 plus();
                 break;
             case 2:
                 minus();
                 break;
             case 3:
                 times();
                 break;
             case 4:
                 divide();
                 break;
             case 5:
                 power();
                 break;
             case 6:
                 factorial();
                 break;
             case 7:
                 mod();
                 break;
             case 8:
                 rectangleAreaandPerimeter();
                 break;
             //case 0:
             //    break;
             default:
                 System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");

         }

     }
     while (select != 0);

    }
}
