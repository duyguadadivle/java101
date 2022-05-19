import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir index giriniz: ");
        int index = input.nextInt();
        int number1 = 0, number2 = 1;
        int sum = 0;

        for(int i=1; i<index; i++){
            sum = number1 + number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
            number1 = number2;
            number2 = sum;
        }

    }
}
