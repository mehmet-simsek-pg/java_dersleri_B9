package gun17;

import java.util.HashMap;

public class MapKonusu {
    public static void main(String[] args) {
        /**
         * Array -> Ayni veri tipinde ama kac veri saklayacagi baslangicta belli olan yapi
         * ArrayList -> Ayni veri tipinde kac tane veri saklayacagi belli olmayan bir yapi
         * Set -> Ayni veri tipinde kac tane veri saklayacagi belli olmayan, ama tekrar eden verileri de saklamayan yapi
         * Map -> anahtar - deger seklinde veriler saklayan bir yapidir
         * örn ->
         * ogrenci no -> ogrenci adi soyadi
         * plaka kodu -> sehir adi
         * tc -> kisi bilgileri
         * urun adi -> fiyat

         * key(anahtar) -> value(deger)
         * "TR" -> "Türkiye"
         * "DE" -> "Deutschland"
         * "EN" -> "England"

         * keyler(anahtarlar) -> benzersiz olmali,
         * ayni anahtara yeni deger eklersem,
         * eski degeri silip yenisi ekler

         * map lerde index mantigi yok.
         * map.get(0) -> diye bir kullanim yok

         * Map türleri:
         * 1) HashMap
         * - En hizlisi
         * - Keyleri kendi algoritmasina göre siralar
         * - Sirali bir sekilde veri kaydetmeyi garanti etmez

         * 2) LinkedHashMap
         * - Ekleme sirasini koruyordu

         * 3) TreeMap
         * - Alfabatik ya da sayisal deger ise kücükten büyüge seklinde
         * keyleri siralar
         * */

        // ilk String key i ifade eder, ikinci String value yu ifade eder
        // Her seferinde key,value String, String olmak zorunda degil.
        // örn:
        // HashMap<Integer , String> ogrenciler = new HashMap<>();
        HashMap<String , String> ulkeler = new HashMap<>();

        // Veri ekleme
        ulkeler.put("TR", "Türkiye");
        ulkeler.put("DE", "Deutschland");
        ulkeler.put("EN", "England");

        System.out.println(ulkeler);

        System.out.println("-----------");

        // Veri cagirmalar key ile yapilir.
        // Eger girilen key map te yok ise cevap null döner
        System.out.println(ulkeler.get("DE"));

        // Eleman silme key ile yapilir
        ulkeler.remove("DE");

        // Aranan eleman var mi kontrolu key ile
        System.out.println(ulkeler.containsKey("TR"));

        // Aranan eleman var mi kontrolu value ile
        System.out.println(ulkeler.containsValue("Türkiye"));

        // Map bos mu kontrolu
        System.out.println(ulkeler.isEmpty());

        // Map in boyutunu
        System.out.println(ulkeler.size());

        // Map i tamamen silme
        ulkeler.clear();

    }
}
