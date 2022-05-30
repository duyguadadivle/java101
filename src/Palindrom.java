import java.util.Scanner;

public class Palindrom {
    static String isPalidrom(int number){
        int temp = number, reverseNum = 0, lastNum;
        while (temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }

        return reverseNum==number ? number+ " sayısı palindromdur" : number + " sayısı palindrom değildir.";

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();
        System.out.println(isPalidrom(number));
        //isPalidrom(247);

    }
}
