package gun29.ornek3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir restoranda tüm ürünlerin ortak olarak
         * ad, fiyat ve kategori bilgisi bulunuyor.
         * Fakat ürünler kendi içinde ayrılıyor:
         * İçecek için litre bilgisi
         * Tatlı için şerbetli olup olmama bilgisi
         * Ana yemek için acılık seviyesi
         * Menüye birkaç ürün eklenecek. Kullanıcıdan bir ürün adı
         * alınacak ve ürün menüde varsa bilgileri gösterilecek.
         * Aynı isimde tekrar ürün eklenmek istenirse uygun uyarı
         * verilecek. Ayrıca kategoriye göre kaç ürün olduğu bulunacak.
         * */

        Scanner scanner = new Scanner(System.in);

        Icecek icecek = new Icecek("Limonata", 25, "Icecek", 0.5);
        Icecek icecek2 = new Icecek("Kahve", 20, "Icecek", 0.3);
        Tatli tatli = new Tatli("Kadayif dolmasi", 45, "Tatli", true);
        AnaYemek anaYemek = new AnaYemek("Iskender", 50, "Ana yemek", 3);
        AnaYemek anaYemek2 = new AnaYemek("Döner", 15, "Ana yemek", 3);


        ArrayList<Urun> urunler = new ArrayList<>();
        urunler.add(icecek);
        urunler.add(icecek2);
        urunler.add(tatli);
        urunler.add(anaYemek);
        urunler.add(anaYemek2);

        System.out.println("Hangi urunu istersiniz? ");
        String arananUrun = scanner.nextLine().trim();

        for (Urun urun : urunler) {
            if (urun.getAd().equalsIgnoreCase(arananUrun)) {
                urun.bilgiYaz();
            }
        }

        System.out.print("Yeni urun ismi girin: ");
        String yeniUrun = scanner.nextLine().trim();
        boolean varMi = false;

        for (Urun urun : urunler) {
            if (urun.getAd().equalsIgnoreCase(yeniUrun)) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Bu isimde urun menu de vardir");
        } else {
            System.out.println("ürün menuye eklenebilir");
        }

        int icecekMiktari = 0;
        int tatliMiktari = 0;
        int anayemekMiktari = 0;

        for (Urun urun : urunler) {
            if (urun.getKategori().equalsIgnoreCase("Icecek")) {
                icecekMiktari++;
            } else if (urun.getKategori().equalsIgnoreCase("Tatli")) {
                tatliMiktari++;
            } else {
                anayemekMiktari++;
            }
        }

        System.out.println("Icecek miktari: " + icecekMiktari);
        System.out.println("Tatli miktari: " + tatliMiktari);
        System.out.println("Ana yemek miktari: " + anayemekMiktari);

    }
}
