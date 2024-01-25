package aProject;

import java.util.Scanner;

public class bankAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bu projedeki amacımız kullanıcının banka hesabına girip farklı işlemler yapması.
        // Bunu While döngüsü kullanarak yapacağız.
        System.out.print("E-Mailinizi giriniz: ");
        String eMail = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String password = scanner.nextLine();

        String emailKayit = eMail;

        String passKayit = password;

        System.out.print("E-Mailinizi giriniz: ");
        String eMail2 = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        String password2 = scanner.nextLine();

        int islem = 0;

        double bakiye = 6541232.10;

        double parasalIslem = 0.0;

        int exit = 00;

        // Mail ve Şifre değerlerinin doğruluğunu kontrol edelim.
        // Giriş sonrası yapılacak işlemleri girelim.

        while (exit == 00) {

            if (!eMail.contains("@")) {
                System.out.println("Yanlış Giriş!");
                exit = 1;
            } else if (!eMail.contains("@gmail.com")) {
                System.out.println("Girilen mail gmail olmalı");
                exit = 1;
            } else if (!eMail.endsWith("@gmail.com")) {
                System.out.println("Geçersiz mail");
                exit = 1;
            } else if (eMail.contains(" ")) {
                System.out.println("Yazim hatasi");
                exit = 1;
            } else if (eMail.startsWith("@")) {
                System.out.println("Email boş bırakılamaz");
                exit = 1;
            } else if (eMail2.equals(emailKayit) && password2.equals(passKayit)) {
                System.out.println("\nYapmak istediğiniz işlemi seçiniz!\n1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                islem = scanner.nextInt();

                switch (islem) {
                    case 1:
                        System.out.print("Yatırılacak Miktarı Giriniz: ");
                        parasalIslem = scanner.nextDouble();
                        bakiye = bakiye + parasalIslem;
                        System.out.println("Güncel bakiye: " + bakiye);
                        break;
                    case 2:
                        System.out.print("Çekilecek Miktarı Giriniz: ");
                        parasalIslem = scanner.nextDouble();
                        if (parasalIslem > bakiye) {
                            System.out.println("Bakiye yetersiz!");
                            System.out.println("Güncel bakiye: " + bakiye);
                        } else {
                            bakiye = bakiye - parasalIslem;
                            System.out.println("Güncel bakiye: " + bakiye);
                        }
                        break;
                    case 3:
                        System.out.println("Güncel bakiye: " + bakiye);
                        break;
                    case 4:
                        System.out.println("Çıkış Yapılıyor...");
                        exit = 1;
                        break;
                    default:
                        System.out.println("Yanlış İşlem...");

                }

            } else {
                System.out.println("Girilen bilgiler yanlış");
                exit = 1;
            }

        }

    }

}
