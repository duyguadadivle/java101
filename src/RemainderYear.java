import java.util.Scanner;
public class RemainderYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remainder;
        System.out.println("Yıl Giriniz: ");
        year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + "bir artık yıldır!");
                }
                else {
                    System.out.println(year + "bir artık yıldır değildir!");
                }
            }
            else{
                System.out.println(year + "bir artık yıldır!");
            }
        }
        else{
            System.out.println(year + "bir artık yıldır değildir!");
        }

    }
}
