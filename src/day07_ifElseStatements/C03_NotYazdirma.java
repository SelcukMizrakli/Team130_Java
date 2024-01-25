package day07_ifElseStatements;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {
        //kullanıcıdan 100 üzerinden not alın
        // negatif veya 100'den büyük değer girerse "Geçersiz Not",
        // 85 ile 100 arasında ise (sınırlar dahil ) AA
        // 65 dahil büyük ve 85ten küçük ise BB
        // 50 dahil büyük ve 65ten küçükse CC
        // 50den küçükse DD Kaldın yazsın

        Scanner scanner = new Scanner(System.in);

        System.out.print("Notunu gir: ");
        double not = scanner.nextDouble();

        if (not > 100 || not < 0) {
            System.out.println("Geçersiz not girdiniz!");
        } else if (not >= 85) {
            System.out.println("Notunuz: AA");
        } else if (not >= 65) {
            System.out.println("Notunuz: BB");
        } else if (not >= 50) {
            System.out.println("Notunuz: CC");
        } else {
            System.out.println("Notunuz: DD, Kaldın!");
        }


    }
}
