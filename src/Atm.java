import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right=3;
        int choice, price;
        int balance = 1500;

        while (right>0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password = input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz");

            do{
                System.out.println("1-Para yatırma\n"+"2-Para Çekme\n"+"3-Bakiye sorgulama\n"+"4-Çıkış yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Para miktarı: ");
                        price = input.nextInt();
                        balance += price;
                        System.out.println("Güncel bakiyeniz: " +balance);
                        break;
                    case 2:
                        System.out.println("Para miktarı: ");
                        price =input.nextInt();
                        if(price>balance){
                            System.out.println("Bakiyeniz yetersiz.");
                        }
                        else{
                            balance-=price;
                            System.out.println("Güncel bakiyeniz: " +balance);
                        }
                        break;
                    case 3:
                        System.out.println("Güncel bakiyeniz: " +balance);
                }

            }while (choice!=4);
            System.out.println("Tekrar görüşmek üzere");
            break;
            }
            else {
                right--;
                System.out.println("Bilgileri hatalı girdiniz lütfen tekrar deneyiniz");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen bankanız ile iletişime geçiniz...");
                }else{
                    System.out.println("Kalan hakkınız: "+right);
                }
            }

        }

    }
}
