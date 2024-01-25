package day43_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_VerilenSoyismeSahipOgrenciListesiYazdirma {
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

        String istenenSoyisim = "ASDASD";
        boolean istenenSoyisimYoksa = true;
        // istenen soyisme sahip ogrencilerin, numara, isim ve bolumlerini yazdirin.

        // 1- keySet'i olusturalim

        Set<Integer> keySeti = ogrenciMap.keySet();

        // 2- key'setindeki herbir key'in value'sune ulasmak icin bir for-each loop kullanalim

        for (Integer eachKey: keySeti){

            // 3- foreaach loop'un getirdigi key'e ait value'yu kaydedelim

            String valueEach = ogrenciMap.get(eachKey);

            // 4- istenen bilgiye ulasmak icin, split yapip array'e kaydedelim

            String[] valueEachArr = valueEach.split("-");

            // 5- istenen bilgiyi yazdiralim
            //    istenen soyisme sahip ogrencilerin, numara, isim ve bolumlerini yazdirin.

            if (valueEachArr[1].equalsIgnoreCase(istenenSoyisim)){
                System.out.println(eachKey + " " + valueEachArr[0] + " " + valueEachArr[4]);
                istenenSoyisimYoksa = false;
            }
        }
        if (istenenSoyisimYoksa){
            System.out.println("Istenilen soyisme sahip kayitli bir ogrenci bulunamadi!");
        }
    }
}
