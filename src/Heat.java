import java.util.Scanner;
public class Heat {
    public static void main(String[] args) {
        /*int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklığı giriniz: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak");
        }
        else if(heat <= 25){
            if(heat <= 15){
                System.out.println("Sinema");
            }
            if(heat >= 10){
                System.out.println("Piknik");
            }
        }
        else{
            System.out.println("Yüzme");
        }*/

        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık: ");
        heat = input.nextInt();
        if(heat < 5){
            System.out.println("Kayak");
        }
        else if (heat <= 15){
            System.out.println("Sinema");
        }
        else if(heat <= 25){
            System.out.println("Piknik");
        }
        else {
            System.out.println("Yüzme");
        }
    }
}
