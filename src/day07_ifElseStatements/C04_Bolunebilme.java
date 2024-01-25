package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir sayı alın,
        3 ile bölünebiliyorsa 3ün katı,
        5 ile bölünebiliyorsa 5in katı
        hem 3 hem de 5 ile bölünebiliyorsa süper sayı yazdırın

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi%3 ==0 && sayi % 5==0){
            System.out.println("Bu bir süper sayı");
        } else if (sayi%3==0){
            System.out.println("3'ün katı");
        } else if (sayi%5==0) {
            System.out.println("5'in katı");
        }else System.out.println("girdiğiniz sayı 3'e veya 5'e bölünemiyor");


    }
}
