package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_IstenenharfinOlduguIsımleriListeleme {

    public static void main(String[] args) {
        /*
            Verilen bir String Array'de istenen harfi iceren isimleri
            bir Liste olarak yazdirin.
        */

        String[] isimler = {"Derya", "İsmail","Sedat","Tuğba","Murat","Sahil","Zapo","Selo","Şevko","Halo"};

        String istenenHarf = "e";

        List<String> yazilacakIsim = new ArrayList<>();

        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].contains(istenenHarf)){
                yazilacakIsim.add(isimler[i]);
            }
        }
        System.out.println(yazilacakIsim);

    }

}
