import java.util.Scanner;
public class UcVeDordeTamBolunenOrtalama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum=0, count=0;
        double avg;
        System.out.println("SAyı giriniz.");
        n = input.nextInt();

        for(int i=0; i<=n; i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
        avg = sum / count;
        System.out.println("Ortalama: " + avg);
    }

}
