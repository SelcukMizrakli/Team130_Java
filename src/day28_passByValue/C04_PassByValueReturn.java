package day28_passByValue;

public class C04_PassByValueReturn {

    public static void main(String[] args) {

    /*

    Method'lar arasi geciste veriable'in kendisi degil degeri yollanir.

    Her method'un icindeki local veriable o method'da gecerli oldugundan
    main method'da atama varsa, main method'daki fiyat variable'i kalici
    degisir. Diger method'da atama varsa o method'daki variable'in degeri degisir.

    Method her caagrildiginda sanki ilk defa caalisiyor gibi sifirdan baslar.



    Verilen bir fiyat icin
    %10 indirimli fiyat hesaplayip
    indirimli fiyati donduren bir method olusturun

     */

    double fiyat = 200;

        System.out.println(yüzde10IndirimliFiyat(fiyat));   //180

        System.out.println(fiyat);                          //200
        fiyat = yüzde10IndirimliFiyat(fiyat);
        System.out.println(fiyat);                          //180
    }

    public static double yüzde10IndirimliFiyat(double fiyat){

        fiyat = fiyat* 90/100;
        return fiyat;
    }

}
