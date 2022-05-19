import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz: ");
        int n = input.nextInt();
        int number, min, max;

        System.out.println("1. Sayıyı giriniz: ");
        number = input.nextInt();
        max = number;
        min = number;
        for(int i=1; i<n; i++){
            System.out.println((i+1) + ".Sayıyı giriniz: ");
            number = input.nextInt();
            if(number>max){
                max=number;
            }
            if(number<min){
                min=number;
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min: " + min);*/

        int i, n, number, max = 0, min = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        n = input.nextInt();
        for(i=1; i<=n; i++){
            System.out.println(i + ".Sayıyı giriniz: ");
            number = input.nextInt();
            if(i==1){
                max = number;
                min = number;
            }
            else{
                if(max<number){
                    max = number;
                }
                else if(min>number){
                    min = number;
                }
            }
        }
        System.out.println("Max:" + max);
        System.out.println("Min: " + min);

    }
}
