package day02_dataTurleri_Scanner;

public class C03_IsimVermeKurallari {
    public static void main(String[] args) {

        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;

        // veriable isimler case sensitive (büyük - küçük harf duyarlıdır!)

        System.out.println(NOT); //23
        System.out.println(not); //54

        int abc3 = 45;

        // camelCase

        int karneNotu = 63;

        String isminIlkHarfi = "S";

        System.out.println("Ders Ortalaması: " + NOT + "." + "Diğer Ders Ortalaması: " + not);

    }
}
