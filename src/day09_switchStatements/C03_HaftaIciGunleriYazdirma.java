package day09_switchStatements;

import java.util.Locale;
import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan gun ismini alip hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gün ismini giriniz: ");
        String gunIsmi = scanner.next().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Hatalı giriş!");
        }


    }
}
