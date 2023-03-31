import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban: ");
        int taban = scanner.nextInt();
        System.out.println("Üs: ");
        int us = scanner.nextInt();

        System.out.println(exponent(taban, us));

    }
    public static int exponent(int taban, int us){
        if(us == 0)
            return 1;
        else if(taban == 1)
            return 1;
        else
            return taban * us;
    }

}
