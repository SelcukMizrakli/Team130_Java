package day06_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        /*
            Soru 1-    kullanıcıdan bir sayı isteyin sayıyı kontrol edip 5 ile bölünebiliyorsa "Sayı 5'in tam katı" yazdırın
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi%5==0){
            System.out.println("Sayı 5'in tam katı");
        }



    }
}
