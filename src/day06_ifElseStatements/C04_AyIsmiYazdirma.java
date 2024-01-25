package day06_ifElseStatements;

import java.util.Scanner;

public class C04_AyIsmiYazdirma {
    public static void main(String[] args) {

        /*
        Soru 2- Kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.

        NOT: büyük harf, küçük harf hassasiyeti olmasın.
        Kullanıcı o veya O yazdığında output Ocak olsun.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
        }

        if (harf == 'ş' || harf == 'Ş') {
            System.out.println("Şubat");
        }

        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart\tMayıs");

        }

        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
        }

        if (harf == 'h' || harf == 'H') {
            System.out.println("Haziran");
        }

        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
        }

        if (harf == 'a' || harf == 'A') {
            System.out.println("Ağustos\tAralık");
        }

        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül\tEkim");
        }

        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
        }


    }
}
