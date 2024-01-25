package day30_timeDate_varargs;

public class C03_Varargs {

    public static void main(String[] args) {
        // verilen 2 sayinin toplamini yazdiran bir method olusturun

        /*
            Vararg: variety of arguments demektir
            varargs degisken sayida argument kullanmamıza imkan taniyan
            array altyasini kullanan bir java objesidir.

            siz argument olarak (4,5) yollarsaniz int[] saayi = {4,5} olur
                                (4,2,7) yollarsaniz int[] saayi = {4,2,7}
                                (4,5,6,7,8,9) yollarsaniz int[] saayi = {4,5,6,7,8}
         */

        topla(4, 5);                      //9
        topla(4, 2, 7);                   //13
        topla(1, 2, 3, 4);          //10
        topla(1, 2, 3, 4, 5, 6, 7); //28
        topla(4, 5, 6, 7, 8, 9);    //39

    }

    public static void topla(int... sayi) {
        int toplam = 0;
        for (int each : sayi) {
            toplam += each;
        }
        System.out.println(toplam);
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println(sayi1 + sayi2 + sayi3);
    }

    public static void topla(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }

}
