package gun18;

import java.util.*;

public class SetKonuTekrari {
    public static void main(String[] args) {

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Mehmet");
        isimler.add("Alperen");
        isimler.add("Gökay");
        isimler.add("Hüseyin");
        isimler.add("Serhat");
        isimler.add("Mehmet");
        isimler.add("Kader");
        isimler.add("Gülsah");
        isimler.add("Hüseyin");

        System.out.println("Toplam listteki isim miktari: " + isimler.size());

        Set<String> benzersizIsimler = new HashSet<>(isimler);

        System.out.println("Toplam setteki isim miktari: " + benzersizIsimler.size());
        // Set lerde index yoktur. benzersizIsimler.get(0) -> diye bir kullanim yok

        for (String isim : benzersizIsimler) {
            System.out.println(isim);
        }

        ArrayList<String> indexliBenzersizIsimler = new ArrayList<>(benzersizIsimler);

        System.out.println("1. eleman: " + indexliBenzersizIsimler.get(0));

        /**
         * 3 cesit Set vardir.
         * 1.) HashSet
         *  - Kendi algoritmasi var elemanlari ona göre siralar
         * 2) LinkedHashSet
         *  - Elemanlari ekleme sirasina göre siralar
         * 3) TreeSet
         *  - Elemanlar alfabetik ya da sayisal olanlari kücükten büyüge seklinde siralar
         * */

        System.out.println("---------------");
        Set<String> sehirlerHash = new HashSet<>();
        sehirlerHash.add("Istanbul");
        sehirlerHash.add("Ankara");
        sehirlerHash.add("Izmir");
        sehirlerHash.add("Erzurum");

        Set<String> sehirlerLinked = new LinkedHashSet<>();
        sehirlerLinked.add("Istanbul");
        sehirlerLinked.add("Ankara");
        sehirlerLinked.add("Izmir");
        sehirlerLinked.add("Erzurum");

        Set<String> sehirlerTree = new TreeSet<>();
        sehirlerTree.add("Istanbul");
        sehirlerTree.add("Ankara");
        sehirlerTree.add("Izmir");
        sehirlerTree.add("Erzurum");

        System.out.println("Hash: " + sehirlerHash);
        System.out.println("Linked: " + sehirlerLinked);
        System.out.println("Tree: " + sehirlerTree);

    }
}
