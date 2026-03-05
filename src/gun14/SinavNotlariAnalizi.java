package gun14;

import java.util.ArrayList;
import java.util.Scanner;

public class SinavNotlariAnalizi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan sınav notlarını tek tek alacak bir program yazın.
         * Kullanıcı 0 ile 100 arasında notlar girebilir.
         * Kullanıcı -1 yazarsa not girişi biter ve analiz kısmına geçilir.
         *
         * Kullanıcı 0–100 dışında (örn. 120, -5 gibi) bir değer girerse:
         * “Geçersiz not” uyarısı verin
         * bu notu listeye eklemeyin
         * tekrar not girişi isteyin.
         *
         * Giriş tamamlandıktan sonra:
         * Eğer hiç geçerli not girilmediyse
         * “Hiç not girilmedi. Analiz yapılamaz.” mesajını yazdırın.
         * Eğer en az 1 geçerli not girildiyse
         * Girilen notları sıra numarasıyla yazdırın
         *
         * Notların ortalamasını hesaplayın (ondalıklı olsun)
         * Geçen (≥ 50) ve kalan (< 50) sayısını yazdırın
         * En yüksek ve en düşük notu yazdırın
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<>();

        System.out.println("0-100 arasi not girin. Bitirmek icin -1 girin");

        while (true) {
            System.out.print("Not: ");
            int not = scanner.nextInt();

            // Cikis icin kosul
            if (not == -1) {
                break;
            }

            // hatali not girisi icin kosul
            if (not < 0 || not > 100) {
                System.out.println("Not araligi 0-100 arasi olmali. Tekrar girin");
                continue; // yeniden not istiyoruz
            }

            notlar.add(not);
        }

        if (notlar.isEmpty()) { // notlar.size() == 0 da kosul olarak olur
            System.out.println("Hiç not girilmedi. Analiz yapılamaz.");
        } else {
            int toplam = 0;
            int gecenSayisi = 0;
            int kalanSayisi = 0;

            int enYuksekNot = notlar.get(0);
            int enDusukNot = notlar.get(0);

            for (int index = 0; index < notlar.size(); index++) {

                toplam += notlar.get(index);

                if (notlar.get(index) >= 50) {
                    gecenSayisi++;
                } else {
                    kalanSayisi++;
                }

                if (notlar.get(index) > enYuksekNot) {
                    enYuksekNot = notlar.get(index);
                }

                if (notlar.get(index) < enDusukNot) {
                    enDusukNot = notlar.get(index);
                }
            }

            double ortalama = (double) toplam / notlar.size();

            System.out.println("------Notlar------");
            for (int index = 0; index < notlar.size(); index++) {
                System.out.println((index + 1) + ". not: " + notlar.get(index));
            }

            System.out.println("------Analiz Sonuclari------");
            System.out.println("Ortalama: " + ortalama);
            System.out.println("Gecen sayisi: " + gecenSayisi);
            System.out.println("Kalan sayisi: " + kalanSayisi);
            System.out.println("En yüksek not: " + enYuksekNot);
            System.out.println("En düsük not: " + enDusukNot);
        }

        scanner.close();
    }
}
