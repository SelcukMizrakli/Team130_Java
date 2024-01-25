package day06_ifElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alın

        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi2;

        System.out.println("Lütfen 2 sayı giriniz");
        System.out.print("1. Sayı: ");
        sayi1 = scanner.nextInt();
        System.out.print("2. Sayı: ");
        sayi2 = scanner.nextInt();

        // 1. sayı 2. sayıdan büyükse aferin yazdırın

        if (sayi1 > sayi2) {
            System.out.println("Aferin!");
        }

        // 1. sayı çift ise çift sayılaraı severim yazdırın

        if (sayi1 % 2 == 0) {
            System.out.println("Çift sayıları severim!");
        }

        //2. sayı 50den büyükse büyük sayılarla işim olmaz yazdırın

        if (sayi2 > 50) {
            System.out.println("Büyük sayılarla işim olmaz!");
        }

        // toplamları 100den küçükse ufak sayılarla işim olmaz yazdırın

        if ((sayi1 + sayi2) < 100) {
            System.out.println("Ufak sayılarla işim olmaz!");
        }


    }
}
