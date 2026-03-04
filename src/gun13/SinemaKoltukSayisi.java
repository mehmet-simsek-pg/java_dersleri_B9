package gun13;

import java.util.Scanner;

public class SinemaKoltukSayisi {
    public static void main(String[] args) {
        /**
         * Bir sinema salonu 4 sıra ve her sırada 5 koltuk içeriyor.
         * Kullanıcı 0/1 girerek koltuk durumlarını doldursun:
         * 0 = boş
         * 1 = dolu
         * İstenenler:
         * Toplam dolu koltuk sayısını yazdır.
         * En çok dolu olan sırayı yazdır.
         * Eğer toplam doluluk %70 ve üstüyse “Salon dolu sayılır” mesajı ver.
         * */

        Scanner scanner = new Scanner(System.in);

        int sira = 4;
        int koltuk = 5;

        int[][] salon = new int[sira][koltuk];

        System.out.println("Koltuk durumlarini girin(0 -> bos, 1 -> dolu )");
        for (int i = 0; i < salon.length; i++) {
            System.out.println((i + 1) + " sira icin girdi yapin");
            for (int j = 0; j < salon[i].length; j++) {
                System.out.print((j + 1) + ". koltuk: ");
                int durum = scanner.nextInt();

                while (durum != 0 && durum != 1) {
                    System.out.println("Hatali giris yaptiniz. 0 ya da 1 degeri girin");
                    durum = scanner.nextInt();
                }

                salon[i][j] = durum;
            }
        }

        int toplamDoluKoltuk = 0;
        int enDoluSiraIndex = -1;
        int enDoluSira = 0;

        for (int i = 0; i < salon.length; i++) { // sira
            int dolulukMiktari = 0; // bu siradaki dolu koltuklar
            for (int j = 0; j < salon[i].length; j++) { // koltuk
                if (salon[i][j] == 1) {
                    toplamDoluKoltuk++;
                    dolulukMiktari++;
                }

                // sira hala ayni, koltuklarin durumu bitti
                // dis döngü icindeyiz, ama ic döngü bitti
                if (dolulukMiktari > enDoluSira) {
                    enDoluSira = dolulukMiktari;
                    enDoluSiraIndex = i;
                }
            }

            System.out.println("------Sonuclar------");
            System.out.println("Toplam dolu koltuk sayisi: " + toplamDoluKoltuk);
            System.out.println("En dolu sira: " + (enDoluSiraIndex + 1)
                    + " doluluk miktari: " + enDoluSira);

            int toplamKoltukSayisi = sira * koltuk;
            double dolulukYuzdesi = (double) toplamDoluKoltuk / toplamKoltukSayisi;

            System.out.println("Doluluk yüzdesi: " + dolulukYuzdesi);

            if (dolulukYuzdesi >= 70) {
                System.out.println("Salon dolu sayılır");
            }
        }
    }
}
