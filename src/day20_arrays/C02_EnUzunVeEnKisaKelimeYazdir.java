package day20_arrays;

public class C02_EnUzunVeEnKisaKelimeYazdir {

    public static void main(String[] args) {
        //Soru 6- Verilen String bir array’deki en uzun ve
        // en kisa kelimeleri yazdiran bir method olusturun.
        String[] isimler = {"Sedat", "Kenan", "Mustafa", "Gül", "Ramazan", "Eren","Abdürrezzak","A"};
        uzunVeKisaIsimYazdir(isimler);
    }
    public static void uzunVeKisaIsimYazdir(String[] isimler){
        String uzunisim = isimler[0];
        String kisaIsim = isimler[0];
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length()>uzunisim.length()){
                uzunisim = isimler[i];
            }else if (isimler[i].length()<kisaIsim.length())
            {
                kisaIsim = isimler[i];
            }
        }
        System.out.println("Uzun isim: " + uzunisim + "\nKısa isim: " + kisaIsim);
    }

}
