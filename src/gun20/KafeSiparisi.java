package gun20;

import java.util.Scanner;

public class KafeSiparisi {

    public static double fiyatBul(String icecek) {
        if (icecek.equalsIgnoreCase("kahve")) {
            return 60.0;
        } else if (icecek.equalsIgnoreCase("cay")) {
            return 40.0;
        } else if (icecek.equalsIgnoreCase("limonata")){
            return 20.0;
        } else {
            return 0.0; // Gecersiz icecek girmesi durumu icin
        }
    }

    public static double araToplam(double icecekFiyati, int adet) {
        return icecekFiyati * adet;
    }

    public static double indirimHesapla(double araToplam, String ogrenciMi) {
        if (ogrenciMi.equalsIgnoreCase("evet")) {
            return araToplam * 0.10;
        } else {
            return 0.0;
        }
    }

    public static void fisYazdir(String icecek, int adet, double araToplam, double indirim, double toplam) {
        System.out.println("----Fis-----");
        System.out.println("Icecek: " + icecek);
        System.out.println("Adet: " + adet);
        System.out.println("Ara toplam: " + araToplam);
        System.out.println("Indirim: " + indirim);
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {
        /**
         * Bir kafede müşteri:
         * içecek türünü girsin (kahve, cay, limonata)
         * adet girsin
         * öğrenci olup olmadığını girsin (evet / hayir)
         * Program şunları yapsın:
         * İçeceğin birim fiyatını bulan bir method olsun
         * Ara toplamı hesaplayan bir method olsun
         * Öğrenci ise indirim tutarını hesaplayan bir method olsun
         * En son ödenecek tutarı ekrana yazdırsın
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Icecek türü secin(kahve, cay, limonata)");
        String icecek = scanner.nextLine().trim();

        System.out.print("Adet girin: ");
        int adet = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ögrenci misiniz: ");
        String ogrenciMi = scanner.nextLine().trim();

        double birimFiyat = fiyatBul(icecek);

        if (birimFiyat == 0) {
            System.out.println("Gecersiz icecek girdiniz");
        } else {
            double araToplam = araToplam(birimFiyat, adet);

            double indirim = indirimHesapla(araToplam, ogrenciMi);

            double toplam = araToplam - indirim;

            fisYazdir(icecek, adet, araToplam, indirim, toplam);
        }
        scanner.close();

    }
}
