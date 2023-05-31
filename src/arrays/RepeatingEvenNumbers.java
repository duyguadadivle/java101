package arrays;

import java.util.Arrays;

public class RepeatingEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = {11, 21, 31, 12, 12, 45, 55, 65, 21, -45, 31, 55, 456, 44, 44};
        System.out.println("Dizi: " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("Sıralı: " + Arrays.toString(numbers));

        int counter = 0;
        for(int  i = 0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.println(evenNumber);
                }
            }
        }
        if(counter == 0){
            System.out.println("Kurala uygun çift sayı bulunamadı.");
        }
    }

}
