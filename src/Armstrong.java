import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tempNum = num;
        int basNum=0;
        int basVal;
        int basPow;
        int result=0;

        //basamak sayısı
        while(tempNum != 0){
            tempNum /= 10;
            basNum++;
        }
        tempNum = num;
        while (tempNum != 0){
            basVal = tempNum % 10;
            basPow = 1;
            for(int i=1; i<=basNum; i++){
                basPow *= basVal;
            }
            result += basPow;
            tempNum /= 10;

        }

        if(result==num){
            System.out.println(num+ "sayısı bir armstrong sayıdır");
        }
        else{
            System.out.println(num+ "sayısı bir armstrong değildir");
        }
    }
}
