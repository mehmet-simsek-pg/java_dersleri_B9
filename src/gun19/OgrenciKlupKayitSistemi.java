package gun19;

import java.util.*;

public class OgrenciKlupKayitSistemi {
    public static void main(String[] args) {
        /**
         * Her öğrenci bir kulübe kayıt oluyor.
         * Kullanıcıdan 7 öğrencinin adını ve kayıt olduğu kulübü al.
         * İstenenler:
         * Öğrenci adlarını ve kulüp isimlerini düzenli hale getir.
         * Aynı kulübe kayıt olan öğrencileri birlikte göster.
         * Her kulüpte kaç öğrenci olduğunu yazdır.
         * Birden fazla öğrencisi olan kulüpleri ayrı göster.
         * İsmi "m" harfi ile başlayan öğrencileri bul.
         * Hiç tekrar etmeyen kulüp isimlerini ayrı olarak ekrana yazdır.
         * */

        Scanner scanner = new Scanner(System.in);

        // yazilim -> ahmet, mehmet,ayse, izzet
        // futbol -> tarik, alperen, huseyin
        Map<String, List<String>> kulupOgrencileri = new HashMap<>();

        // farkli kulüp isimlerini bir yerde tutucaz
        Set<String> kulupSeti = new HashSet<>();

        // ismi m harfi ile baslayan ögrenciler
        List<String> mHarfiIleBaslayanlar = new ArrayList<>();

        // 7 ögrenci
        for (int index = 1; index <=7 ; index++) {
            System.out.print(index + ".ogrenci adi: ");
            String ogrenci = scanner.nextLine().trim().toLowerCase();

            System.out.print("Kulüp adi: ");
            String kulup = scanner.nextLine().trim().toLowerCase();

            kulupSeti.add(kulup);

            // ismi m harfi ile baslayan ogrenciler
            if (ogrenci.startsWith("m")) {
                mHarfiIleBaslayanlar.add(ogrenci);
            }

            // Eger bu kulupten map icerisinde yoksa önce o kulubu mapa
            // eklemem lazim. Ama deger(value) kismi icin direkt olarak
            // ogrenci ismini eklemedik, cunku value bir list.
            // Eklemeyi asagida yaptik
            if (!kulupOgrencileri.containsKey(kulup)) {
                kulupOgrencileri.put(kulup, new ArrayList<>());
            }

            // artik kulup map icerisinde olustu.
            // Value atamasi yapabiliriz.
            // kulupOgrencileri.get(kulup) bu value kismini ifade eder
            // value lar List<String> dir. O yüzden add()
            // ile value ya atama yapabiliriz
            kulupOgrencileri.get(kulup).add(ogrenci);
        }

        System.out.println("-----Kulüplere Göre Ogrenci isimleri-------");
        for (Map.Entry<String, List<String>> entry: kulupOgrencileri.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("----Her kulüpteki ögrenci sayisi----");
        for (Map.Entry<String, List<String>> entry: kulupOgrencileri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }

        System.out.println("-----Ismi m harfi ile baslayanlar------");
        for (String name: mHarfiIleBaslayanlar) {
            System.out.println(name);
        }

        System.out.println("------Farkli kulüp isimleri------");
        System.out.println(kulupSeti);
    }
}
