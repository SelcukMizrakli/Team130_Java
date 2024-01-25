package day06_ifElseStatements;

import java.util.Scanner;

public class C05_AyIsmiYazdirma2 {
    public static void main(String[] args) {
        /*
        Soru 2- Kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.

        Eğer girilen harf ile başlayan ay yoksa
        "Girdiğiniz harf ile başlayan ay yok" yazdırın.

        NOT: büyük harf, küçük harf hassasiyeti olmasın.
        Kullanıcı o veya O yazdığında output Ocak olsun.

         */

        Scanner scanner = new Scanner(System.in);

        int flag = 29;


        System.out.print("Lütfen bir harf giriniz: ");
        char harf = scanner.next().charAt(0);

        if (harf == 'o' || harf == 'O') {
            System.out.println("Ocak");
            flag++;
        }

        if (harf == 'ş' || harf == 'Ş') {
            System.out.println("Şubat");
            flag++;
        }

        if (harf == 'm' || harf == 'M') {
            System.out.println("Mart\tMayıs");
            flag++;

        }

        if (harf == 'n' || harf == 'N') {
            System.out.println("Nisan");
            flag++;
        }

        if (harf == 'h' || harf == 'H') {
            System.out.println("Haziran");
            flag++;
        }

        if (harf == 't' || harf == 'T') {
            System.out.println("Temmuz");
            flag++;
        }

        if (harf == 'a' || harf == 'A') {
            System.out.println("Ağustos\tAralık");
            flag++;
        }

        if (harf == 'e' || harf == 'E') {
            System.out.println("Eylül\tEkim");
            flag++;
        }

        if (harf == 'k' || harf == 'K') {
            System.out.println("Kasım");
            flag++;
        }
        if (flag == 29) {
            System.out.println("Girdiğiniz harf ile başlayan ay yok");
        }
    }
}
