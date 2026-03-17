package gun19;

import java.util.*;

public class KelimeFrekansVeHarfAnalizi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan bir cümle al.
         * İstenenler:
         * Cümleyi kelimelere ayır.
         * Kelimeleri düzenleyip aynı formata getir.
         * Her kelimenin kaç kez geçtiğini hesapla.
         * Tekrar etmeyen kelimeleri göster.
         * Uzunluğu 4’ten büyük olan kelimeleri ayrı yazdır.
         * En çok geçen kelimeyi bul.
         * Cümlede kullanılan farklı kelimeleri
         * alfabetik düşünmeden tekil şekilde ekrana yazdır.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cümle girin");
        String cumle = scanner.nextLine().trim();

        // cümleyi bosluklara göre bölüp kelimeleri
        // array icerisine atiyoruz
        String[] kelimeler = cumle.split(" ");

        Map<String, Integer> kelimeSayilari = new HashMap<>();

        Set<String> benzersizKelimeler = new HashSet<>();

        // uzunlugu 4 ten büyük kelimeler icin
        List<String> uzunKelimeler = new ArrayList<>();

        // kelimeler icerisinde tek tek gezelim
        for (String kelime : kelimeler) {
            // kelimenin basinda sonunda gereksiz
            // bosluk varsa diye temizleme yaptik
            kelime = kelime.trim();
            if (kelimeSayilari.containsKey(kelime)) {
                kelimeSayilari.put(kelime, kelimeSayilari.get(kelime) + 1);
            } else {
                kelimeSayilari.put(kelime, 1);
            }

            // ayni kelime gelirse otomatik set onu kaydetmez
            benzersizKelimeler.add(kelime);

            if (kelime.length() > 4 && !uzunKelimeler.contains(kelime)) {
                uzunKelimeler.add(kelime);
            }
        }

        String enCokGecenKelime = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                enCokGecenKelime = entry.getKey();
            }
        }

        System.out.println("-------Kelimeler ve Miktarlari--------");
        for (Map.Entry<String, Integer> entry : kelimeSayilari.entrySet()) {
            System.out.println("kelime: " + entry.getKey() + ", miktari: " + entry.getValue());
        }

        System.out.println("------Benzersiz Kelimeler-------");
        System.out.println(benzersizKelimeler);

        System.out.println("------En cok gecen kelime ve miktari------");
        System.out.println(enCokGecenKelime + " - " + max);

        scanner.close();

    }
}
