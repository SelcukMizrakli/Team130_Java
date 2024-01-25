package day10_StringManipulation;

import java.util.Scanner;

public class C07_EmailControl {
    public static void main(String[] args) {

        // Kullanicidan email isteyin
        // eğer @ işareti içermiyorsa "Yanlış Giriş!"
        // eğer @gmail.com içermiyorsa "Girilen mail gmail olmalı"
        // email @gmail.com ile bitmiyorsa "Geçersiz mail"
        // email boşluk içeriyorsa "Yazim hatasi" yazdirin.
        // eğer hata yoksa "mailiniz kaydedildi" yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen email adresinizi giriniz: ");

        String email = scanner.nextLine();

        if (!email.contains("@")) {
            System.out.println("Yanlış Giriş!");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Girilen mail gmail olmalı");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Geçersiz mail");
        } else if (email.contains(" ")) {
            System.out.println("Yazim hatasi");
        } else if (email.startsWith("@")) {
            System.out.println("Email boş bırakılamaz");
        } else {
            System.out.println("Mailiniz kaydedildi.");
        }


    }
}
