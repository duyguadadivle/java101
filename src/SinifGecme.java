import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, turkce, kimya, muzik;
        double total = 0, avg = 0, counter = 0;
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();

        if(mat >= 0 && mat <= 100){
            total += mat;
            counter++;
        }
        if(fizik >= 0 && fizik <= 100){
            total += fizik;
            counter++;
        }
        if(turkce >= 0 && turkce <= 100){
            total += turkce;
            counter++;
        }
        if(kimya >= 0 && kimya <= 100){
            total += kimya;
            counter++;
        }
        if(muzik >= 0 && muzik <= 100){
            total += muzik;
            counter++;
        }

        avg = total/counter;

        System.out.println("Ortalama: " + avg);

        if(avg >= 55){
            System.out.println("Geçtiniz");
        }
        else{
            System.out.println("Kaldınız");
        }

    }
}
