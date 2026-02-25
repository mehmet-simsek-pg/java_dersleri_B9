package gun10;

public class OtobusKoltukPlani {
    public static void main(String[] args) {
        /**
         * Otobüste 4 sıra var, her sırada 3 koltuk var.
         * Koltukları 1A, 1B, 1C ... 4C şeklinde ekrana yazdır.
         * */

        int siraSayisi = 4;
        int siradakiKoltukSayisi = 3;

        // Sira numarasini verir
        for (int sira = 1; sira <= siraSayisi; sira++) {
            // siradaki koltuk harflerini verir
            for (int siradakiKoltuk = 0; siradakiKoltuk < siradakiKoltukSayisi ; siradakiKoltuk++) {
                // 0, 65 -> A, 1, 66 -> B, 2, 67 -> C
                char koltukAdi = (char) ('A' + siradakiKoltuk);

                System.out.print(sira + "" + koltukAdi + " ");
            }
            System.out.println(); // Sirayi yazdiktan sonra alt satira inmesi icin kullandik
        }
    }
}
