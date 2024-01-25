package day03_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz : ");
        int ilkSayi = scanner.nextInt();

        System.out.print("Lütfen ikinci sayıyı giriniz : ");
        int ikinciSayi = scanner.nextInt();

        int gcc = ilkSayi;
        ilkSayi = ikinciSayi;
        ikinciSayi = gcc;

        System.out.println("İlk sayı: " + ilkSayi + "\nİkinci sayı: " + ikinciSayi);
    }
}
