import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısı: ");
        int n = input.nextInt();

        for (int i=1;i<=n;i++){

            for (int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for (int m=1;m<=2*(n-i+1)-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
