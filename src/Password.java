import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        String userPassword;
        String newPassword;
        String password = "java101";
        boolean check = true;
        int choice;
        Scanner input = new Scanner(System.in);

        System.out.println("Şifreniz: ");
        userPassword = input.nextLine();

        if(userPassword.equals(password)){
            System.out.println("Başarılı");
        }
        else if(!userPassword.equals(password)){
            System.out.println("Şifre yanlış");
            System.out.println("Şifrenizi değiştirmek ister misiniz?\n 1-Evet\n2-Haır");
            choice = input.nextInt();
            if(choice == 1){
                while (check){
                    System.out.println("Yeni şifre: ");
                    newPassword = input.next();
                    if(newPassword.equals(password)){
                        System.out.println("Şifreler aynı");
                    }
                    else {
                        System.out.println("Şifreniz değiştirildi");
                        newPassword = newPassword;
                        check = false;
                    }
                }
            }
            else if(choice == 2){

            }
            else{
                System.out.println("Yanlış tıklama");
            }

        }



    }
}
