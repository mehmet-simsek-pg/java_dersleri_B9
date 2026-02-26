package gun11;

import java.util.Scanner;

public class SinemaSalonu {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan satır sayısı ve her satırdaki koltuk sayısını al.
         * Her koltuk için kullanıcı B (boş) veya D (dolu) girsin.
         * Her satır sonunda o satırdaki dolu koltuk sayısını yazdır.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Satir sayisi: ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Satirdaki koltuk sayisi: ");
        int satirdakiKoltukSayisi = scanner.nextInt();
        scanner.nextLine();

        for (int satir = 1; satir <= satirSayisi ; satir++) {

            // her satirdaki dolu koltuk sayisi bilgisine ihtiyacim var.
            // ic döngü bittiginde yeni satira gececegi icin
            // o satirin dolu koltuk sayisi miktarini sifirlamis oluyoruz.
            int doluKoltukSayisi = 0;
            System.out.println(satir + ". satir icin B/D gir");

            for (int koltukSayisi = 1; koltukSayisi <=satirdakiKoltukSayisi ; koltukSayisi++) {

                System.out.print("Koltuk Bos mu Dolu mu(B/D): ");
                String durum = scanner.nextLine().trim();

                if (durum.length() == 0) {
                    System.out.println("Bos giris yapildi. Koltuk dolu degil olarak kaydedildi");
                    continue;
                }

                // D girisi icin burada equalsIgnoreCase kullanabiliriz. kullanici d girerse diye
                // durum bilgisini alirken toUpperCase metodunu kullanabiliriz.
                if (durum.equalsIgnoreCase("D")) {
                    doluKoltukSayisi++;
                } else if (!durum.equalsIgnoreCase("B")) {
                    System.out.println("Gecersiz giris yapildi. Koltuk dolu degil olarak kaydedildi");
                }
            }
            System.out.println("-> " + satir + ". satir daki dolu koltuk sayisi: " + doluKoltukSayisi);
        }
    }
}
