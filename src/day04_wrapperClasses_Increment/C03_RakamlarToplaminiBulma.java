package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanıcıdan 4 bas. bir tam sayı alın
        // sayının rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt(),result=0;

        for (int i =0;i<4; i++){

            result = (number%10)+ result;
            number = number/10;
        }
        System.out.println("Girilen sayının rakamlar toplamı: "+result);
    }
}
