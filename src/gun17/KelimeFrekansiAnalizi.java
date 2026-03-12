package gun17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KelimeFrekansiAnalizi {
    public static void main(String[] args) {
        /**
         * Kullanicidan bir cümle al.
         * Cümleyi tamamiyle kücük harflere cevir.
         * Nokta ve virgül gibi isaretleri temizle.
         * Her kelimenin kac kez tekrarlandigini kaydet
         * Sadece 2 veya daha fazla girilen kelimeleri yazdir.
         * En cok gecen kelimeyi ayrica yazdir.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");

        // girilen cümleden bastaki ve sondaki bosluklari
        // sildikten sonra tüm cümleyi kücük harflere cevirdik
        String cumle = scanner.nextLine().trim().toLowerCase();

        // Noktalama isaretlerini cümleden kaldirdik
        cumle = cumle.replace(".", "")
                .replace(",", "")
                .replace("?", "")
                .replace("!", "");

        // cümle icinde gecen kelimeleri ayirip kelimeler
        // array i icerisine kaydettik
        String[] kelimeler = cumle.split(" ");

        HashMap<String, Integer> frekans = new HashMap<>();

        for (int index = 0; index < kelimeler.length; index++) {
            String kelime = kelimeler[index];

            if (kelime.isEmpty()) {
                continue;
            }

            if (frekans.containsKey(kelime)) {
                frekans.put(kelime, (frekans.get(kelime) + 1));
            } else {
                frekans.put(kelime, 1);
            }
        }

        String enCokKullanilanKelime = "";
        int tekrarMiktari = 0;

        for(Map.Entry<String, Integer> entry : frekans.entrySet()) {
            String k = entry.getKey();
            int miktar = entry.getValue();

            if (miktar >= 2) {
                System.out.println(k + " -> " + miktar);
            }

            if (miktar > tekrarMiktari) {
                tekrarMiktari = miktar;
                enCokKullanilanKelime = k;
            }
        }

        System.out.println("-------------");
        System.out.println("En cok kullanilan kelime: " + enCokKullanilanKelime);
        System.out.println("Miktari: " + tekrarMiktari);


    }
}
