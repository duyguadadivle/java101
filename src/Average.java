import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int math, fizik, geo;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        math = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Geometri notunuz: ");
        geo = input.nextInt();
        double avg = (math+fizik+geo)/3;
        System.out.println("Average:" + avg);


        System.out.println((avg > 60)? "geçti" : "kaldı");
    }
}
