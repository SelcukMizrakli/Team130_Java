package day03_scanner_dataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {

        //küçük data türündeki değeri, büyük data türündeki veriable'a atamak isterseniz, Java bunu otomatik olarak yapar
        // buna "auto widening" denir.

        byte a = 15;

        short b = a;

        int c = b;

        long d = c;

        // büyük data veriable'i değeri, küçük data türündeki veriable'a atamak istersek Java bunu otomatik olarak yapmaz.
        // sorumluluk almamızı ister, sorumluluk almamızı ister. Bunun için büyük data türündeki değerin önüne
        // parantez içinde çevirmek istediğimiz küçük data türünü yazarız. Buna da "Explicit Narrowing " denir.

        double f = 34.5;

        int g = (int)f;

        short h =  (short) g;

        System.out.println(h + " & " + g);



    }
}
