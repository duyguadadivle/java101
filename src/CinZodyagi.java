import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, burc;
        System.out.println("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        burc = year % 12;

        switch (burc){
            case 0:
                System.out.println("Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.println("Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.println("Geçersiz ay girdiniz. ");
        }

    }
}
