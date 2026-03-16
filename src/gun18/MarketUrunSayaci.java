package gun18;

import java.util.*;

public class MarketUrunSayaci {
    public static void main(String[] args) {
        /**
         * Bir markette müşterinin aldığı ürünler sırasıyla şöyle giriliyor:
         * elma, armut, elma, muz, muz, muz, armut
         * İstenenler:
         * Ürünleri bir liste içinde sakla.
         * Her ürünün kaç kez alındığını ayrı bir yapıda tut.
         * Sadece farklı ürünleri ayrı bir yapıda sakla.
         * Sonuç olarak:
         * Kaç farklı ürün var?
         * Hangi üründen kaç tane alınmış?
         * ekrana yazdır.
         * */

        // ürünleri bir liste icinde sakla
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("muz");
        meyveler.add("armut");

        //Sadece farklı ürünleri ayrı bir yapıda sakla
        Set<String> benzersizMeyveler = new HashSet<>(meyveler);

        Map<String, Integer> urunSayilari = new HashMap<>();

        /**
         * örn muz bu örnekte 3 defa geciyor. O yüzden mpat icerisinde
         * // muz,3
         * */
        for (String meyve : meyveler) {
            if (urunSayilari.containsKey(meyve)) {
                urunSayilari.put(meyve, urunSayilari.get(meyve) + 1);
            } else {
                urunSayilari.put(meyve, 1);
            }
        }

        System.out.println("------Özet--------");
        System.out.println("Tüm ürünler: " + meyveler);
        System.out.println("BenzersizMeyveler: " + benzersizMeyveler);
        // Kaç farklı ürün var?
        System.out.println("Farkli meyve miktari: " +benzersizMeyveler.size());

        // ürün miktarlari
        System.out.println("Ürün miktarlari keyset() ile");
        for (String urun: urunSayilari.keySet()){
            System.out.println(urun + " - " + urunSayilari.get(urun));
        }

        System.out.println("Ürün miktarlari entrySet() ile");
        for (Map.Entry<String,Integer> entry: urunSayilari.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("Map icinde value ile gezme");
        for (Integer value : urunSayilari.values()) {
            System.out.println(value);
        }
    }

}
