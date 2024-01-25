package day10_StringManipulation;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {


        String str = "Java Candır";

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candır

        // String methodları kullanıldığında orijinal metin değişmez.
        System.out.println(str);

        // Değişikliği kalıcı olarak yapmak istersek ATAMA yapmalıyız

        str = str.toUpperCase();

        System.out.println(str); //JAVA CANDIR

        //str'ı küçük harfe çevirin ancak büyük I harfi küçük harfe çevrildiğinde İngilizce i olur

        // eğer metinde ingilizcede olmayan I'yı
        // tükçe küçük "ı"ya çevirmek istersek
        //


        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR")));   //java candır



    }
}
