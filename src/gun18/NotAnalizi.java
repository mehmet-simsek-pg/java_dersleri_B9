package gun18;

import java.util.*;

public class NotAnalizi {
    public static void main(String[] args) {
        /**
         * Bir öğretmen öğrencilerin notlarını bir listede tutuyor:
         * [70, 85, 70, 90, 100, 85, 60, 90]
         * İstenenler:
         * Tüm notları bir listede sakla.
         * Tekrar etmeyen notları ayrı bir yapıda sakla.
         * Her notun kaç kez tekrar ettiğini ayrı bir yapıda tut.
         * En çok tekrar eden notu bul ve yazdır.
         * Kaç farklı not olduğunu yazdır.
         * */

        ArrayList<Integer> notlar = new ArrayList<>();
        notlar.add(70);
        notlar.add(85);
        notlar.add(70);
        notlar.add(90);
        notlar.add(100);
        notlar.add(85);
        notlar.add(60);
        notlar.add(0);

        Set<Integer> farkliNotlar = new HashSet<>(notlar);

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer not : notlar) {
            if (map.containsKey(not)) {
                // not -> key(anahtar)
                // map.get(not) -> o anki notun value(deger) su
                map.put(not, map.get(not) + 1);
            } else {
                map.put(not, 1);
            }
        }

        System.out.println("------ÖZET-------");
        System.out.println("Tüm notlar: " + notlar);
        System.out.println("Farkli notlar: " + farkliNotlar);
        System.out.println("Farkli notlarin miktari: " + farkliNotlar.size());

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println("Not: " + entry.getKey() + " - " + "tekrar miktari: " + entry.getValue());
        }

        int tekrarSayisi = 0;
        int enCokTekrarlananNot = -1;

        for (Integer key: map.keySet()) {
            // map.get(key) -> value yu verir,
            // yani o key in tekrar miktarini
            if (map.get(key) > tekrarSayisi) {
                tekrarSayisi = map.get(key);
                enCokTekrarlananNot = key;
            }
        }

        System.out.println("En cok tekrarlanan sayi: " + enCokTekrarlananNot);
        System.out.println("Tekrar miktari: " + tekrarSayisi);
    }
}
