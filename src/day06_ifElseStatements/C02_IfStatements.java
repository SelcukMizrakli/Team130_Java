package day06_ifElseStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // kullanıcıdan 2 sayı alın.
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2;

        System.out.println("Lütfen 2 sayı giriniz");
        System.out.print("1. Sayı: ");
        sayi1 = scanner.nextInt();
        System.out.print("2. Sayı: ");
        sayi2 = scanner.nextInt();

        //ilk sayı 2. sayıdan büyükse büyüksün sayi1 yazdır.
        boolean sonuc1 = sayi1>sayi2;

        if (sonuc1){
            System.out.println("Büyüksün sayi1");
        }

        //ikinci sayi sıfırdan büyükse büyüksün sayi2 yazdır

        boolean sonuc2 = sayi2 > 0;

        if (sonuc2){
            System.out.println("Büyüksün sayi2");
        }

        //iki sayı toplamı 100den büyükse ikinizde büyüksünüz yazdır

        boolean sonuc3 = (sayi2 + sayi1) > 100;

        if (sonuc3){
            System.out.println("İkinizde büyüksünüz!");
        }

    }
}
