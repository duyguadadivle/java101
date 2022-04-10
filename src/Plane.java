import java.util.Scanner;
public class Plane {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     double distance, age, type;
     double price, discountPrice = 0;
     System.out.println("Distance: ");
     distance = input.nextDouble();
     System.out.println("Age: ");
     age = input.nextDouble();
     System.out.println("Type: ");
     type = input.nextDouble();

     if((age > 0 && distance > 0) && (type == 1 || type == 2)){
         price = distance * 0.1;

         if(age < 12){
             discountPrice = price * 50/100;

         }
         else if(age >= 12 && age <= 24){
             discountPrice = price * 90/100;

         }
         else if(age > 65){
             discountPrice = price * 70/100;

         }
         else{
             discountPrice = price;
         }

         if(type == 2){
             discountPrice = ((discountPrice*2) * 80/100);
         }


     }
     else {
         System.out.println("Hatalı veri girdiniz. ");
     }

     System.out.println("Toplam tutar: " + discountPrice);

    }
}

// TODO 1: Gerekli tanımlamaları yap. double age, distance, type
// TODO 2: Kullanıcıdan distance, age, type değerlerini al
// TODO 3: distance, age pozitif type 1 veya 2 mi kontrol eden if else yapısı oluştur
// TODO 4: age 12, 12-24, 65 üstü duruma göre geçerli indirimler sırasıyla %50 %10 %30
// TODO 5: type kontrol gidiş dönüş "2" ise 2 bilet üzerinde %20 indirim daha uygula
// TODO 6: price, discountPrice, discountAmount ekrana yazdır
// TODO 7:
