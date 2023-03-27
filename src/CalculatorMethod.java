import java.util.Scanner;

public class CalculatorMethod {
    static void plus(){
        String isContinue = "y";
        Scanner input = new Scanner(System.in);
        int number, result = 0, i=1;
        while (true){
            System.out.println(i++ + ". sayı");
            number = input.nextInt();
            if(number == 0){
                break;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);

    }
    static void minus(){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int counter = input.nextInt();
        int number, result = 0;
        for(int i=1; i<=counter; i++){
            System.out.println(i + ".sayı");
            number = input.nextInt();
            if(i==1){
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }
    static void times(){
        Scanner input = new Scanner(System.in);
        int number, result = 0, i=1;
        while (true){
            System.out.println(i++ + ".sayı");
            number = input.nextInt();
            if(number==0){
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Sonuç: " + result);
    }
    static void divided(){

    }
    static void power(){

    }
    static void factorial(){

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1-Toplama\n"
                + "2-Çıkarma İşlemi\n"
                + "3-Çarpma İşlemi\n"
                + "4-Bölme İşlemi\n"
                + "5-Üssü İşlemi\n"
                + "6-Mod İşlemi\n"
                + "7-Dikdörtgen Alan ve Çevre\n"
                + "8-Çıkış\n";
        do{
            System.out.println(menu);
            System.out.println("Lütfen bir işlem seçiniz ");
            select = input.nextInt();

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
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz, tekrar deneyiniz.");

            }
        }
        while (select != 0);

    }

}
