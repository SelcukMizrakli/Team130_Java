package day12_StringManipulations;

import java.util.Scanner;

public class C09_StingManipulations {
    public static void main(String[] args) {

        // kullanicidan isim, soyisim ve kredi karti numarasini alin
        // gorunurIsim olarak A****** N****** seklinde
        // sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);

        System.out.print("Isminizi giriniz: ");
        String isim = scanner.nextLine();

        System.out.print("Soyisminizi giriniz: ");
        String soyisim = scanner.nextLine();

        System.out.print("Kart Numaranizi Boşluksuz 16 Karakter Giriniz: ");
        String kartNo = scanner.nextLine();

        String gorunenIsım = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).replaceAll("\\w", "*") +
                " " +
                soyisim.substring(0, 1).toUpperCase() +
                soyisim.substring(1).replaceAll("\\S", "*");

        String gorunenKartNo = "**** **** **** " + kartNo.substring(kartNo.length()-4);

        System.out.println(gorunenIsım+ "\n" + gorunenKartNo);


    }
}
