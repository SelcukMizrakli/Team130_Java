package day03_scanner_dataCasting;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {

        double dbl = 34.7;

        int sayi = (int) dbl,sayi2 = 130;

        byte byt = (byte) sayi2;

        System.out.println(byt); //-126 sonucunu verir

        int sayi3 = 260;

        byte byt2 = (byte) sayi3;

        System.out.println(byt2); //4 değerini verir

        int sayi4 = 2600;

        byte byt3 = (byte) sayi4;

        System.out.println(byt3); //4 değerini verir

        int sayi5 = 2100000000;
        sayi5 = sayi5 + 500000000;
        System.out.println(sayi5); //-1694967296 değerini verir
    }
}
