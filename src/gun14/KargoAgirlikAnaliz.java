package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class KargoAgirlikAnaliz {
    public static void main(String[] args) {
        /**
         * Bir kargo şubesinde paket ağırlıkları tek tek giriliyor.
         * Kullanıcıdan paket ağırlıklarını kg cinsinden alın.
         * Kullanıcı 0 girerse giriş biter.
         * Negatif ağırlık girilirse uyarı verin ve listeye eklemeyin.
         * Kurallar:
         * 0 < ağırlık ≤ 2 ise “Küçük Paket”
         * 2 < ağırlık ≤ 5 ise “Orta Paket”
         * ağırlık > 5 ise “Büyük Paket”
         * Giriş bittikten sonra:
         * Hiç paket girilmediyse: “Hiç paket girilmedi.” yazdırın.
         * Girildiyse:
         * Tüm paketleri sıra numarasıyla yazdırın
         * Küçük/Orta/Büyük paket sayısını yazdırın
         * Toplam ağırlığı yazdırın
         * Ortalama ağırlığı yazdırın
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> agirliklar = new ArrayList<>();

        System.out.println("Paketin kilosunu girin. Cikis icin 0 girin.");
        while (true) {
            System.out.print("Agirlik: ");
            double kg = scanner.nextDouble();

            // Cikis yapmak icin kosul
            if (kg == 0) {
                break;
            }

            if (kg < 0) {
                System.out.println("Negatif giris olamaz. Tekrar deneyin");
                continue;
            }
            agirliklar.add(kg);
        }

        if (agirliklar.size() == 0) {
            System.out.println("Hiç paket girilmedi.");
        } else {

            int kucuk = 0, orta = 0, buyuk = 0;
            double toplam = 0;

            System.out.println("-----Paket Listesi");
            for (int index = 0; index < agirliklar.size(); index++) {

                toplam += agirliklar.get(index);

                String kategori;

                if (agirliklar.get(index) <= 2) {
                    kategori = "Kücük paket";
                    kucuk++;
                } else if (agirliklar.get(index) <= 5) {
                    kategori = "Orta paket";
                    orta++;
                } else {
                    kategori = "Büyük paket";
                    buyuk++;
                }

                System.out.println((index + 1) + ". paket agirligi: "
                        + agirliklar.get(index) + " kategori: " + kategori);
            }

            double ortalama = toplam / agirliklar.size();

            System.out.println("-----Analiz-----");
            System.out.println("Ortalama agirlik: " + ortalama);
            System.out.println("Toplam agirlik: " + toplam);
            System.out.println("Kücük paket sayisi: " + kucuk);
            System.out.println("Orta paket sayisi: " + orta);
            System.out.println("Büyük paket sayisi: " + buyuk);

        }
    }
}
