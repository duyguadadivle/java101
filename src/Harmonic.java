import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        double result = 0;
        double harmonic = 1;
        for(double i=1; i<=num; i++){
            harmonic = (1/i);
            System.out.println(harmonic);
            result += harmonic;

        }
        System.out.println("Result: " +result);

    }
}
