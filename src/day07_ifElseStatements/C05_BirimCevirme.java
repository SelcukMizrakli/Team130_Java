package day07_ifElseStatements;

import java.util.Scanner;

public class C05_BirimCevirme {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen mesafeyi kilometre olarak giriniz: ");
        double km = scanner.nextDouble();

        System.out.print("Lütfen çevirmek istediğiniz birimi giriniz: ");

        String birim = scanner.next();

        if (birim.equalsIgnoreCase("metre")) {
            System.out.println("Mesafeniz: " + km * 1000 + " metre");
        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Mesafeniz: " + km * 100000 + " santimetre");
        } else {
            System.out.println("Geçersiz değer girdiniz.");
        }

    }
}
