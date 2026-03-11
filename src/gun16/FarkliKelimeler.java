package gun16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FarkliKelimeler {
    public static void main(String[] args) {
        /**
         * Kullanicidan bir cümle alin.
         * Bu cümleyi kelimelerine ayirin.
         * Kelimeleri kaydedin ama tekrar eden kelimeleri kaydetmeyin.
         * Tüm benzersiz kelimeleri yazdirin.
         * Kac tane farkli kelime oldugunu bulun.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String cumle = scanner.nextLine().trim();

        // split() bir String metodudur.
        // Parantez icerisine verdigim ifadeye göre
        // String icinde bölmeler yapar.
        // "" -> harf harf böler
        // "." -> noktalara göre cümleyi böler
        String[] kelimeler = cumle.split(" ");

        // Tekrar etmeyen kelimeleri tutacak Set
        Set<String> farkliKelimeler = new HashSet<>();

        for (String kelime : kelimeler) {
            farkliKelimeler.add(kelime);
        }

        System.out.println("-----Farkli kelimeler-----");
        System.out.println(farkliKelimeler);
        System.out.println("Toplam farkli kelime sayisi: " + farkliKelimeler.size());

    }
}
