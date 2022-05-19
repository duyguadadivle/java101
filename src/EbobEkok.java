import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        System.out.println("Küçük sayı, n1: ");
        int n1 = input.nextInt();
        System.out.println("Büyük sayı, n2: ");
        int n2 = input.nextInt();
        int ebob = 1;
        int ekok = 1;

        for(int i=1; i<=n1; i++){
            if(n1%i==0 && n2%i==0){
                // System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("Ebob: " + ebob);

        for(int j=n1; j>= 1; j-- ){
            if(n1%j==0 && n2%j==0){
                ebob = j;
                // System.out.println(j);
                break;
            }
        }

        System.out.println("Ebob: " + ebob);

        for(int i=1; i<=(n1*n2); i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("Ekok:" + i);
                break;
            }
        }
        System.out.println((n1*n2)/ebob);
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Küçük sayı, n1: ");
        int n1 = input.nextInt();
        System.out.println("Büyük sayı, n2: ");
        int n2 = input.nextInt();
        int ebob=1, ekok=1, i=1, j=1;

        while(i<=n1){
            if(n1%i==0 && n2%i==0){
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob: " +ebob);

        while (j<n1*n2){
            if(j%n1==0 && j%n2==0){
                ekok=j;
                break;
            }
            j++;
        }
        System.out.println("Ekok: " +ekok);




    }
}
