package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanimi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 tam sayi alın,
        eğer sayi1, sayi2den büyükse sayi1'i 1 azaltıp sayi2'yi 1 artırın.

        sayi1, sayi2den büyük değilse sayi1'i 3 ile çarpın, sayi2'yi 2 ile çarpın
        sayi1 ile sayi2'nin son değerlerini yazdırın.


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tamsayı giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1 > sayi2) {
            sayi1--;
            sayi2++;
        } else {
            sayi1 *= 3;
            sayi2 *= 2;
        }
        System.out.println("Sayi1: " + sayi1 + ", Sayi2: " + sayi2);
    }
}
