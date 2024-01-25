package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int ilkSayi = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int ikinciSayi = scanner.nextInt();

        ilkSayi = ikinciSayi + ilkSayi;
        ikinciSayi = ilkSayi - ikinciSayi;
        ilkSayi = ilkSayi - ikinciSayi;

        System.out.println("İlk Sayı: " + ilkSayi + "\nİkinci Sayı: " + ikinciSayi);

    }
}
