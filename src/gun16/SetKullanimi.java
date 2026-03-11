package gun16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetKullanimi {
    public static void main(String[] args) {
        /**
         * 1) HashSet() -> Tekrar eden veri tutmaz,
         * ama kaydedilen verileri sirali bir sekilde kaydetmez.
         * Diger set türlerine göre en hizlisidir.
         *
         * 2) LinkedHashSet() -> Tekrar eden veri tutmaz,
         * ama bu sefer kaydedilen verilerin sirasini korur.
         *
         * 3) TreeSet() -> Tekrar eden veri tutmaz,
         * eklenen verileri sirali tutar. Yani sayisal verileri
         * kücükten büyüge olacak sekilde, yazisal degerleri ise
         * alfabatik olarak kaydeder.
         * */

        System.out.println("------HashSet()------");
        Set<String> sehirler = new HashSet<>();
        sehirler.add("Izmir");
        sehirler.add("Ankara");
        sehirler.add("Jena");
        sehirler.add("Istanbul");
        sehirler.add("Elazig");

        System.out.println("HashSet: " + sehirler);

        System.out.println("------LinkedHashSet()------");
        Set<String> isimler = new LinkedHashSet<>();
        isimler.add("Izzet");
        isimler.add("Kader");
        isimler.add("Humeyra");
        isimler.add("Gamze");
        isimler.add("Serhat");

        System.out.println("LinkedHashSet(): " + isimler);

        System.out.println("------TreeSet()-----");
        Set<String> dersler = new TreeSet<>();
        dersler.add("Java");
        dersler.add("Selenium");
        dersler.add("Appium");
        dersler.add("Docker");
        dersler.add("Math");

        System.out.println("TreeSet(): " + dersler);

        Set<Integer> sayilar = new TreeSet<>();
        sayilar.add(123);
        sayilar.add(23);
        sayilar.add(45);
        sayilar.add(67);

        System.out.println("Sayilardaki durum: " + sayilar);
    }
}
