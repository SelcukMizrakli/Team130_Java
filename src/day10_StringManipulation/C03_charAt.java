package day10_StringManipulation;

public class C03_charAt {
    public static void main(String[] args) {
        String str = "Java Candir";

        // ilk harf yazdirin

        System.out.println(str.charAt(0));  // J

        System.out.println(str.charAt(7));  // n

        // Son harfi yazdirin

        System.out.println(str.charAt(10));     //r

        System.out.println(str.charAt(11-1));   //r

        System.out.println(str.length());       //11

        System.out.println(str.charAt(str.length()-1)); //r

        // Eğer bir kod yazarken verilen input'taki değişimleri algılasın ve
        // yeni haline göre isteneni yapsın istiyorsak
        // dinamik kod yazmalıyız.
        // bunun için elle yazacağımız index değerleri yerine
        // metnin length'ini kullanabiliriz.

        // sondan 3. harfi yazdırınız

        System.out.println(str.charAt(str.length()-3)); //d

        // olmayan bir index kullanırsak

        //  System.out.println(str.charAt(20));     Sınırların dışında hatasını verir.  StringIndexOutOfBoundsException

        //System.out.println(str.charAt(str.length()));   //StringIndexOutOfBoundsException
        // burada metnin uzunluğu 11'dir, charAt() 10. indekse kadar alabiliyor.








    }
}
