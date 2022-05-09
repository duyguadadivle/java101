import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r;
        System.out.println("n:");
        n = input.nextInt();
        System.out.println("r:");
        r = input.nextInt();
        int a=1, b=1, c=1;
        int fark = n-r;
        int result;

        for(int i=1; i<=n; i++){
            a*=i;
        }
        for(int i=1; i<=r; i++){
            b*=i;
        }
        for(int i=1; i<=fark; i++){
            c*=i;
        }

        result = a/(b*c);

        System.out.println("Result: " +result);


    }
}
