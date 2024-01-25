package day11_StringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {
        String str = "Bu Java ogrenilecek.";

        // e'nin ilk kullaniminin index'ini yazdirin

        System.out.println(str.indexOf('e'));   //11

        // e'nin son kullaniminin index'ini yazdirin

        System.out.println(str.lastIndexOf('e'));   //17

        System.out.println(str.lastIndexOf('e',str.lastIndexOf('e')-1));   //15

        // u'nun ilk kullanim ve son kullanim index'lerini yaziniz.

        System.out.println("ilk index: " + str.indexOf("u"));//1
        System.out.println("Last index: " + str.lastIndexOf("u"));

        // J harfinin metinde hic kullanilmadigini ya da sadece 1 defa kullanildigini yazdirin

        if (str.indexOf('J') == -1){
            System.out.println("J degeri hic kullanilmamistir.");
        } else if (str.indexOf('J') == str.lastIndexOf('J')){
            System.out.println("J degeri 1 defa kullanilmistir: " + str.indexOf('j'));
        } else {
            System.out.println("Hataa");
        }


    }
}
