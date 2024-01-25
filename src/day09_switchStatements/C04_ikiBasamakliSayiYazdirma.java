package day09_switchStatements;

import java.util.Scanner;

public class C04_ikiBasamakliSayiYazdirma {
    public static void main(String[] args) {
        //Soru 2- Kullanicidan 2 basamakli bir sayi alip
        // girilen sayiyi yazi ile yazdirin

        // 34 ==> 3 otuz , 4 dört -> otuz dört

        Scanner scanner = new Scanner(System.in);

        System.out.print("İki basamakı bir sayı giriniz: ");

        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = girilenSayi % 10;

        int onlarBasamagi = girilenSayi / 10;

        switch (onlarBasamagi) {
            case 1:
                System.out.print("on ");
                break;
            case 2:
                System.out.print("yirmi ");
                break;
            case 3:
                System.out.print("otuz ");
                break;
            case 4:
                System.out.print("kırk ");
                break;
            case 5:
                System.out.print("elli ");
                break;
            case 6:
                System.out.print("altmış ");
                break;
            case 7:
                System.out.print("yetmiş ");
                break;
            case 8:
                System.out.print("seksen ");
                break;
            case 9:
                System.out.print("doksan ");
                break;
            default:
                System.out.print("Yanlış değer girdiniz.");

        }
        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                System.out.println("altı");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
        }

    }
}
