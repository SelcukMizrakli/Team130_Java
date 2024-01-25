package day15_methodOlusturma;

import java.util.Scanner;

public class C02_AsalSayiMethodu {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
        // Girilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” yazdiran bir method olusturun.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        asalsayiMi(sayi);

    }

    public static void asalsayiMi(int sayi) {

        int flag = 10;
        //“asal sayi” veya “asal sayi degil” yazdiran

        for (int i = 2; i < sayi - 1; i++) {

            if (sayi % i == 0) {
                flag++;
            }
        }

        if (flag == 10) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }

    }

}
