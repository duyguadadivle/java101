import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n,k, result=1;
        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("Üs: ");
        k=input.nextInt();

        int i=1;
        for(i=1; i<=k; i++){
            result *= n;
        }

        System.out.println("Result: " +result);
    }
}
