package gun28.ornek4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir arac kiralama sirketinde bütün araclarin ortak
         * olarak plaka, marka ve günlük ücret bilgileri vardir. Arabalarin
         * ayrica kapi sayisi, motorsikletlerin ise kask dahil mi bilgisi
         * vardir. Bu bilgilere göre class lari olusturun.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kac araba kiralamak istiyorsunuz?");
        int arabaSayisi = scanner.nextInt();
        scanner.nextLine();

        Araba[] arabas = new Araba[arabaSayisi];

        double toplamUcret = 0;

        for (int index = 0; index < arabas.length; index++) {
            System.out.print((index + 1) + ".araba plakasini girin: ");
            String plaka = scanner.nextLine().trim();

            System.out.print((index + 1) + ".araba markasini girin: ");
            String marka = scanner.nextLine().trim();

            System.out.print((index + 1) + ".araba günlük ücretini girin: ");
            double ucret = scanner.nextDouble();
            toplamUcret += ucret;

            System.out.print((index + 1) + ".araba kapi sayisini girin: ");
            int kapiSayisi = scanner.nextInt();
            scanner.nextLine();

            arabas[index] = new Araba(plaka, marka, ucret, kapiSayisi);
        }

        for (Araba araba : arabas) {
            araba.bilgiYaz();
        }

        System.out.println("Toplam kiralama ücreti: " + toplamUcret);

    }
}
