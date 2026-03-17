package gun19;

import java.util.*;

public class FilmTuru {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 10 kişinin sevdiği film türünü al.
         * Örnek:
         * aksiyon - ali, veli, huseyin
         * komedi - izzet, alperen, kader
         * İstenenler:
         * Tür isimlerini düzenleyip aynı formata getir.
         * Hangi türün kaç kişi tarafından seçildiğini hesapla.
         * Aynı türü seçen kişileri birlikte göster.
         * Sadece 1 kişi tarafından seçilen türleri yazdır.
         * İsminin içinde "e" harfi geçen kişileri ayrıca göster.
         * En popüler türü bul ve o türü seçen tüm kişileri yazdır.
         * */

        Scanner scanner = new Scanner(System.in);

        // film türü -> key, kisi isimleri -> value
        Map<String, List<String>> kisilerVeFilmTurleri = new HashMap<>();

        // 10 kisilik veri alicaz
        for (int index = 1; index <=10 ; index++) {
            System.out.print(index + ". kullanici adi: ");
            String kisi = scanner.nextLine().trim().toLowerCase();

            System.out.print("Sevdigi film türü: ");
            String filmTuru = scanner.nextLine().trim().toLowerCase();

            if (!kisilerVeFilmTurleri.containsKey(filmTuru)) {
                kisilerVeFilmTurleri.put(filmTuru, new ArrayList<>());
            }

            kisilerVeFilmTurleri.get(filmTuru).add(kisi);
        }

        System.out.println("------Türlere göre kisiler------");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmTurleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("------Türleri izleyenlerin sayisi------");
        for (Map.Entry<String, List<String>> entry : kisilerVeFilmTurleri.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().size());
        }

    }
}
