import java.util.Scanner;

public class CiftVeDordunKati {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int sum=0;
        do{
            System.out.println("Sayi giriniz");
            n = input.nextInt();
            if(n%4==0){
                sum += n;
            }
            System.out.println("Sonuç: " + sum);
        }
        while(n%2 == 0);
    }
}
