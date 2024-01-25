package day30_timeDate_varargs;

public class C04_VarargsDikkatEdilecekler {
    /*
        Argument olarak verilen sayilardan ilki harici geriye kalanlari
        toplayip bulunan toplami ilk sayi ile carpip sonucu yazdiran
        bir method olusturun.
     */

    public static void main(String[] args) {
        islemYap(0,2,3,4,1);        //0
        islemYap(1,2,3);            //5
        islemYap(2,3,4,5,6,7,8,9);  //84
    }

    public static void islemYap(int ilkSayi, int... geriyeKalanlar){
        int toplam = 0;
        for (int each:geriyeKalanlar
             ) {
            toplam+= each;
        }
        System.out.println(toplam*ilkSayi);
    }
}
