package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizi boyutu: ");
        int lengthOfArray = input.nextInt();
        int [] numbers = new int[lengthOfArray];

        System.out.println("Dizinin elemanı: ");
        for(int i = 0; i < numbers.length; i++){
            System.out.println((i+1) + ". Elemanı Gir: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("Dizi: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sıralı: " + Arrays.toString(numbers));
    }

}
