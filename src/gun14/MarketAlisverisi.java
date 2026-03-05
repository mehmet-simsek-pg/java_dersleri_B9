package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketAlisverisi {
    public static void main(String[] args) {
        /**
         * Bir kullanıcıdan kaç ürün alacağını öğrenin.
         * Her ürün için:
         * ürün adını alın
         * ürün fiyatını alın
         * Tüm ürünleri bir listede tutun.
         * Sonunda:
         * ürünleri sırayla yazdırın
         * toplam tutarı hesaplayın
         * kullanıcının verdiği bütçe ile karşılaştırın
         * Kurallar:
         * Ürün adı boş girilirse tekrar isteyin
         * Fiyat 0 veya negatif olamaz
         * Toplam bütçe aşılmışsa “Bütçe aşıldı”, aşılmadıysa “Bütçe uygun” yazdırın
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> urunler = new ArrayList<>();
        ArrayList<Double> fiyatlar = new ArrayList<>();

        System.out.print("Kac ürün alacaksiniz: ");
        int adet = scanner.nextInt();

        System.out.print("Bütceniz: ");
        double butce = scanner.nextDouble();

        scanner.nextLine();

        double toplam = 0;

        for (int i = 0; i < adet; i++) {

            String urunAdi;
            while (true) {
                System.out.print((i + 1) + ". ürün adi: ");
                urunAdi = scanner.nextLine();

                if (urunAdi.isEmpty()) {
                    System.out.println("Ürün adi bos olamaz. Tekrar girin");
                } else {
                    break;
                }
            }

            double tutar;
            while (true) {
                System.out.print((i + 1) + ". ürün fiyati: ");
                tutar = scanner.nextDouble();
                scanner.nextLine();
                if (tutar <= 0) {
                    System.out.println("Ürün fiyati 0 ya da negatif olamaz. Tekrar deneyin");
                } else {
                    break;
                }
            }

            urunler.add(urunAdi);
            fiyatlar.add(tutar);

            toplam += tutar;
        }

        System.out.println("------Alisveris Listesi------");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + ". ürün adi: " + urunler.get(i)
                    + " ürünün fiyati: " + fiyatlar.get(i));
        }

        System.out.println("Toplam tutar: " + toplam);
        System.out.println("Bütce: " + butce);

        String durum = (toplam > butce) ? "Bütce asildi" : "Bütce uygun";
        System.out.println(durum);
        /*
        if (toplam > butce) {
            System.out.println("Bütce asildi");
        } else {
            System.out.println("Bütce uygun");
        }
        */
    }
}
