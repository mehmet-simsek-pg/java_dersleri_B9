package gun28.ornek3;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir hastanede tüm calisanlarin ortak ad, soyad ve maas
         * bilgileri vardir. Doktorlarin ayrica uzmanlik alani, hemsirelerin
         * ise servis adi vardir. Bu bilgilere göre class lari olusturun.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doktor ismi girin: ");
        String isim = scanner.nextLine().trim();

        System.out.print("Doktor soyismi girin: ");
        String soyisim = scanner.nextLine().trim();

        System.out.print("Doktor maasini girin: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Doktor uzmanlik alani girin: ");
        String uzmanlikAlani = scanner.nextLine().trim();

        Doktor doktor =
                new Doktor(isim, soyisim,
                        maas,
                        uzmanlikAlani);

        Hemsire hemsire = new Hemsire("Ayse", "Test",
                66000, "Gogus Hastaliklari");

        doktor.bilgiYazdir();
        System.out.println();
        hemsire.bilgiYazdir();
        System.out.println();

        System.out.println(doktor.bilgi());

    }
}
