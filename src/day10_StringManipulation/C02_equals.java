package day10_StringManipulation;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";

        String str2 = "AHMET";

        String str3 = "ahmet";

        String str4 = "AhMeT";

        String str5 = "Ahmet";

        String str6 = new String("Ahmet");

        String str7 = "Ah";

        String str8 = "met";

        String str9 = str7 + str8; // Ahmet

        //1- String case sensitive'dir,
        // str1, str2, str3 ve str4'ün değerleri birbirinden farklıdır.
        // str1, str5, str6 ve str9'un değerleri ise aynıdır.

        // String'de karşılaştırma yapmak için == kullanırsanız
        // metni aynı olan String'lerde bile false dönebilir.
        // == hem metin değerine hem de referansa baktığı için
        // metni aynı olan farklı String'ler için farklı sonuçlar verebilir.



        System.out.println(str1 == str5);   // Ahmet == Ahmet true
        System.out.println(str1 == str6);   // Ahmet == Ahmet false
        System.out.println(str1 == "Ahmet");// Ahmet == Ahmet true
        System.out.println(str1 == str9);   // Ahmet == Ahmet false

        // Iki String'in Metin olarak aynı olup olmadığını kontrol etmek için
        // SIMDILIK == kullanmayacağız.
        // String'lerde metin olarak aynı olmayı kontrol için equals() kullanılır.

        // equals() metodu aynı metinler için true döner.
        System.out.println(str1.equals(str5));      // Ahmet == Ahmet true
        System.out.println(str1.equals(str6));      // Ahmet == Ahmet true
        System.out.println(str1.equals("Ahmet"));   // Ahmet == Ahmet true
        System.out.println(str1.equals(str9));      // Ahmet == Ahmet true

        // equals() metodu aynı metinin farklı yazımları için

        System.out.println(str1.equals(str2));      //Ahmet == AHMET false
        System.out.println(str1.equals(str3));      //Ahmet == ahmet false
        System.out.println(str1.equals(str4));      //Ahmet == AhMeT false

        // Eğer büyük-küçük harf farkli yazilimlari da eşit kabul edelim derseniz
        System.out.println(str1.equalsIgnoreCase(str2));    // Ahmet == AHMET true
        System.out.println(str1.equalsIgnoreCase(str3));    // Ahmet == ahmet true
        System.out.println(str1.equalsIgnoreCase(str4));    // Ahmet == AhMeT true





    }
}
