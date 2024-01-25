package day24_arrayLists_forEachLoop;

import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {
    public static void main(String[] args) {
        /*Soru 4- Kullanicidan bir cumle ve bir harf alin,
        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
        */

        Scanner scanner =new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.print("Aranacak harfi giriniz: ");
        String harf = scanner.next().substring(0,1);

        String[] cumleHarfArrayi = cumle.split("");

        int sayac = 0;

        for (String each: cumleHarfArrayi){
            if (each.equalsIgnoreCase(harf))
            {
                sayac++;
            }
        }

        if (sayac == 0 ) {
            System.out.println("harf cumlede kullanilmamis");
        }else{
            System.out.println("Verilen harf cumlede " + sayac + " defa kullanilmis");
        }

    }
}
