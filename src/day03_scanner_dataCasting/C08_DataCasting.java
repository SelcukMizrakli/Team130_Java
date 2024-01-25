package day03_scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {
        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1 / sayi2); // 6.6666666... ==> 6 değerini verir.

        double sayi3 = 3;

        System.out.println( sayi1 / sayi3); //6.66666666 değerini verir.

        //kullanıcıdan 2 tam sayı alıp 1. sayıyı 2. sayıya bölün, sonucu ondalıklı olarak yazdırın.

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Tam sayıyı giriniz: ");        //40
        int sayi4 = scanner.nextInt();
        System.out.print("2. Tam sayıyı giriniz: ");        //7
        int sayi5 = scanner.nextInt();

        double sonuc = (double)sayi4/sayi5;

        System.out.println("İşlem sonucu: " + (double)(sayi4/sayi5) + " & " + sonuc); //5.0 & 5.714285714285714

    }
}
