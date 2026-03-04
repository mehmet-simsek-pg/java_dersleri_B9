package gun13;

import java.util.Scanner;

public class SinifTablosu {
    public static void main(String[] args) {
        /**
         * Bir sınıfta 3 öğrenci ve her öğrencinin 4 sınav notu var.
         * Kullanıcıdan notları tablo şeklinde al.
         * İstenenler:
         * Her öğrencinin ortalamasını yazdır.
         * Ortalaması 50 ve üstü olanlara “Geçti”, aksi halde “Kaldı” yazdır.
         * Sınıftaki en yüksek notu ve hangi öğrenci/sınavda olduğunu yazdır.
         * */

        Scanner scanner = new Scanner(System.in);

        int ogrSayisi = 3;
        int notlar = 4;

        int[][] sinavNotlari = new int[ogrSayisi][notlar];

        int maxNot = 0;
        // 0 diye baslatsaydik 0,0 indexlerini baslangic
        // olarak en yüksek not ve ögrenci diye kabul etmis oluruz
        // 1. ögrencinin 1. notu en yüksek demis olurdum.
        // Gecersiz bir deger olan -1 diye baslangic degeri atadik
        int ogrIndex = -1;
        int sinavIndex = -1;

        for (int i = 0; i < sinavNotlari.length; i++) {
            System.out.println((i + 1) + ". ögrencinin notlari");
            for (int j = 0; j < sinavNotlari[i].length; j++) {
                System.out.print((j + 1) + ". not: ");
                int not = scanner.nextInt();
                sinavNotlari[i][j] = not; // notlari tabloya kaydediyoruz

                if (maxNot < not) {
                    maxNot = not;
                    ogrIndex = i;
                    sinavIndex = j;
                }
            }
            System.out.println();
        }

        System.out.println("Ögrencilerin not ortalamalari");
        for (int i = 0; i < sinavNotlari.length; i++) {
            int toplam = 0; // Ic döngü bittiginde toplam degeri sifirlanir
            // bu sayede her ögrenci icin yeniden toplam degeri olustururuz
            for (int j = 0; j < sinavNotlari[i].length; j++) {
                toplam += sinavNotlari[i][j];
            }

            double ortalama = (double) toplam / sinavNotlari[i].length;

            // If-Else konusundaki ternary kullanimi
            String sinavSonucu = (ortalama >= 50) ? "Gecti" : "Kaldi";

            System.out.printf("%d. ögrenci not ortalamasi: %.2f -> %s%n",
                    (i + 1), ortalama, sinavSonucu);
        }

        System.out.println("En yüksek not bilgisi");
        System.out.println("En yüksek not: " + maxNot);
        System.out.println("En yüksek notu alan: " +
                (ogrIndex + 1) + ". ögrenci " + (sinavIndex + 1) + ". sinav");

        scanner.close();
    }
}
