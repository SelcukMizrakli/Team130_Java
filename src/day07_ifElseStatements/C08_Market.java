package day07_ifElseStatements;

import java.util.Scanner;

public class C08_Market {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, az alırsa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.print("Alınan ürün adedi: ");
        int urunAdedi = scanner.nextInt();

        System.out.print("Aldığınız ürünün indirimsiz fiyatını giriniz: ");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Ürün kartınız var mı? \n\tEVET\t\tHAYIR");
        char musteriKarti = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamSatisFiyati = urunAdedi*indirimsizFiyat;

        if (musteriKarti == 'E' && urunAdedi>10){
            System.out.println("%20 indirimli toplam fiyat: " + (indirimsizToplamSatisFiyati*80/100));
        } else if (musteriKarti == 'E' && urunAdedi<=10) {
            System.out.println("%15 indirimli toplam fiyat: " + indirimsizToplamSatisFiyati*85/100);
        } else if (musteriKarti == 'H' && urunAdedi>10 ) {
            System.out.println("%15 indirimli toplam fiyat: " + (indirimsizToplamSatisFiyati*85/100));
        } else if (musteriKarti == 'H' && urunAdedi<=10) {
            System.out.println("%10 indirimli toplam fiyat: " + (indirimsizToplamSatisFiyati*80/100));
        } else {
            System.out.println("Girilen değerlerde hata var!");
        }

    }
}
