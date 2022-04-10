import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Birinci sayi: ");
        number1 = input.nextInt();
        System.out.println("İkinci sayi: ");
        number2 = input.nextInt();
        System.out.println("Üçüncü sayi: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("number1 > number2 > number3");
            }
            else{
                System.out.println("number1 > number3 > number2");
            }
        }
        else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("number2 > number1 > number3");
            }
            else{
                System.out.println("number2 > number3 > number1");
            }
        }
        else if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println("number3 > number1 > number2");
            }
            else{
                System.out.println("number3 > number2 > number1");
            }
        }*/

        Scanner input = new Scanner(System.in);
        int number1, number2, number3;
        System.out.println("Birinci sayi: ");
        number1 = input.nextInt();
        System.out.println("İkinci sayi: ");
        number2 = input.nextInt();
        System.out.println("Üçüncü sayi: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println("number3 > number2 > number1");
            }
            else{
                System.out.println("number2 > number3 > number1");
            }
        }
        else if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.println("number3 > number1 > number2");
            }
            else{
                System.out.println("number1 > number3 > number2");
            }
        }
        else if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.println("number2 > number1 > number3");
            }
            else{
                System.out.println("number1 > number2 > number3");
            }
        }




    }
}
