package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        double sayi1 = scanner.nextDouble(), sonucToplam, sonucCarpim;
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        sonucToplam = sayi1 + sayi2;
        System.out.println("Girilen sayıların toplamı: " + sonucToplam);
        sonucCarpim = sayi1 * sayi2;
        System.out.println("Girilen sayıların çarpımı: " + sonucCarpim);

    }
}
