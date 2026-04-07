package gun29.ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir araç kiralama şirketinde tüm araçlar için ortak olarak plaka,
         * marka, günlük ücret ve kirada olup olmama bilgisi tutuluyor.
         * Ancak şirketin farklı araç türleri var:
         * Otomobil için bagaj hacmi
         * Motosiklet için kask verilip verilmediği
         * Kamyonet için taşıma kapasitesi
         * Kullanıcıdan araç bilgileri alınacak.
         * Daha sonra kiralanmak istenen aracın bilgileri ekrana yazdırılacak.
         * Eğer araç zaten kiradaysa kullanıcıya uygun bir mesaj verilecek.
         * Ayrıca marka bilgisinin içinde geçen belirli bir kelime kontrol edilerek
         * özel kampanya uygulanacak.
         * */

        Scanner scanner = new Scanner(System.in);

        Otomobil otomobil = new Otomobil("34TG345", "Mercedes", 230, true, 25);
        Motorsiklet motorsiklet = new Motorsiklet("45MS901", "BMW", 210, false, true );
        Kamyonet kamyonet = new Kamyonet("22ED231", "Volvo", 350, false, 10);

        // tüm nesneler arac oldugu icin tek bir liste icerisinde toplayabildik
        ArrayList<Arac> araclar = new ArrayList<>();
        araclar.add(otomobil);
        araclar.add(motorsiklet);
        araclar.add(kamyonet);

        System.out.print("Kiralamak istediginiz aracin markasini girin: ");
        String marka = scanner.nextLine().trim();

        boolean aracVarMi = false;

        for (Arac arac : araclar) {
            if (arac.getMarka().equalsIgnoreCase(marka)) {
                aracVarMi = true;
                arac.bilgiYaz();

                if (arac.isKiradaMi()) {
                    System.out.println("Arac su an kirada");
                } else {
                    System.out.println("Arac kiralanabilir");
                }

                if (arac.getMarka().equalsIgnoreCase("volvo")) {
                    System.out.println("Bu arac icin indirim uygulanmaktadir");
                }
            }
        }

        // if parantezi icerisindeki kosula direkt boolean degiskeni yazarsak
        // bunun anlami o degisken true dur. Eger degiskenin false olma durumunu
        // kontrol ediyorsak basina ! koyariz.
        if (!aracVarMi) {
            System.out.println("Aradiginiz marka arac bizde bulunmamaktadir");
        }
    }
}
