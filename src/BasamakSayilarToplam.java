import java.util.Scanner;

public class BasamakSayilarToplam {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n = input.nextInt();
        int result = 0;
        int basVal;
        while(n != 0){
            basVal = n % 10;
            n /= 10;
            result += basVal;
        }
        System.out.println("Basamak toplamları: " +result);
    }
}
