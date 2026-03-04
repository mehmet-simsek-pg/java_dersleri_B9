package gun12;

import java.util.Scanner;

public class OtobusKartiBakiyesi {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan kaç yolculuk yapacağını alın.
         * Her yolculuk için “tam/ogrenci/indirimli” tipini sorun.
         * Her yolculukta ücret düşülsün.
         * En sonda:
         * Toplam kullanılan ücret
         * Kalan bakiye
         * En çok kullanılan kart tipi hangisi (tam/ogrenci/indirimli) yazdırın
         * Kart tipi yanlış girilirse o yolculuğu saymayın.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Baslangic bakiyesi girin: ");
        double bakiye = scanner.nextDouble();

        System.out.print("Kac yolculuk yapacaksiniz? ");
        int yolculukSayisi = scanner.nextInt();

        // int tam = 0, ogrenci = 0, indirimli = 0; bu sekilde de tanimlayabiliriz
        int tam = 0;
        int ogrenci = 0;
        int indirimli = 0;

        double toplamHarcamaMiktari = 0;

        scanner.nextLine(); // buffer temizleme
        for (int i = 0; i <yolculukSayisi; i++) {
            System.out.print((i + 1) + ". yolculuk tipi(tam, ogrenci, indirimli): ");
            String yolculukTipi = scanner.nextLine().trim().toLowerCase();
            double ucret;

            switch (yolculukTipi) {
                case "tam":
                    ucret = 20;
                    tam++;
                    break;
                case "ogrenci":
                    ucret = 15;
                    ogrenci++;
                    break;
                case "indirimli":
                    ucret = 10;
                    indirimli++;
                    break;
                default:
                    System.out.println("Hatali yolculuk tipi yapildi");
                    continue;
            }

            if (bakiye < ucret) {
                System.out.println("Yetersiz bakiye");
                continue;
            }

            bakiye -= ucret;
            toplamHarcamaMiktari += ucret;

        }

        System.out.println("Toplam harcanan: " + toplamHarcamaMiktari);
        System.out.println("Kalan bakiye: " + bakiye);

        if (tam >= ogrenci && tam >= indirimli) {
            System.out.println("En cok kullanilan tip tam dir");
        } else if (ogrenci >= tam && ogrenci >= indirimli) {
            System.out.println("En cok kullanilan tip ogrenci dir");
        } else {
            System.out.println("En cok kullanilan tip indirimli dir");
        }

        scanner.close();
    }
}
