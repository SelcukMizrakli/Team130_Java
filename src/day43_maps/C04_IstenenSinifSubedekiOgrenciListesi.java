package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C04_IstenenSinifSubedekiOgrenciListesi {

    public static void main(String[] args) {
        Map<Integer, String> ogrenciMap = new HashMap<>();

        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Cem-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Sevgi-Can-10-K-MF");
        ogrenciMap.put(107, "Esra-Han-11-M-SOZ");
        ogrenciMap.put(108, "Azim-Kan-12-L-SOZ");
        ogrenciMap.put(109, "Huseyin-Fan-12-H-MF");
        ogrenciMap.put(110, "Azim-Kayisi-11-K-TM");

        Integer istenenSinif = 10;
        String istenenSube = "K";

        // verilen sinif ve subedeki ogrencilerin isim ve soyisimlerini yazdirin

        Set<Integer> keySeti = ogrenciMap.keySet();
        System.out.println(istenenSinif+"/"+istenenSube + " kayitli ogrencilerin isim ve soyisimleri : ");
        for (Integer eachKey:keySeti){

            String value = ogrenciMap.get(eachKey);

            String[] valueArr = value.split("-");

            if (valueArr[3].equalsIgnoreCase(istenenSube) && Integer.parseInt(valueArr[2]) == istenenSinif){
                System.out.println(valueArr[0] + " " + valueArr[1]);
            }
        }

    }
}
