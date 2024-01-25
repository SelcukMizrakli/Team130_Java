package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C03_nestedIfElseIndirimliUrunSorusu2 {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedini ve urunun indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //        Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satin aldiginiz urun adedini giriniz");
        int urunAdedi = scanner.nextInt();
        System.out.println("Aldiginiz urunun indirimsiz fiyatini giriniz");
        double indirimsizFiyat = scanner.nextDouble();
        System.out.println("Ürün kartınız var mı? \n\tEVET\t\tHAYIR");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);
        int indirimOrani = 0;

        if (urunAdedi > 10) {
            //ürün miktarı 10'dan çok olanlar.
            if (kartVarMi == 'e') {
                indirimOrani = 20;
            } else if (kartVarMi == 'h') {
                indirimOrani = 15;
            } else {
                System.out.println("Kart bilgisi hatalı!");
            }

        } else if (urunAdedi > 0) {
            //ürün miktarı 1-10 arasında olanlar.
            if (kartVarMi == 'e') {
                indirimOrani = 15;
            } else if (kartVarMi == 'h') {
                indirimOrani = 10;
            } else {
                System.out.println("Kart bilgisi hatalı");
            }

        } else {
            //Ürün miktarı 0 veya negatif olanlar.
            System.out.println("Ürün miktarı hatalı!");
        }

        System.out.println( indirimOrani + " indirimli toplam fiyat: " +
                            urunAdedi*indirimsizFiyat*(100-indirimOrani)/100);

    }
}
