package gun17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MarketSatisOzeti {
    public static void main(String[] args) {
        /**
         * Bir markette gün boyunca satilan ürünler sirasiyla giriliyor.
         * Kullanici kac satis yapacagi bilgisini giriyor.
         * Her satista sadece ürün adi girilsin.
         * Her ürünün kac defa satildigini bulun.
         * Satis sonunda tüm ürünleri ve satis miktarlarini yazdirin.
         * En cok satilan ürünü bulup yazdirin.
         * Hic girilmeyen ürünler icin islem yapmayin.
         * */

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> urunler = new HashMap<>();

        System.out.println("Kac ürün girmek istiyorsunuz?");
        int adet = scanner.nextInt();
        scanner.nextLine();

        for (int index = 1; index <= adet; index++) {
            System.out.print(index + ". ürün adi: ");
            String name = scanner.nextLine().trim();

            if (urunler.containsKey(name)) {
                urunler.put(name, (urunler.get(name) + 1));
            } else {
                urunler.put(name, 1);
            }
        }

        System.out.println("------Özet--------");
        String enCokSatilanUrun = "";
        int maxSatis = 0;

        for (Map.Entry<String, Integer> entry: urunler.entrySet()) {
            System.out.println("Ürün adi: " + entry.getKey() + " - "
                    + " satis miktari: " + entry.getValue());

            if (entry.getValue() > maxSatis) {
                maxSatis = entry.getValue();
                enCokSatilanUrun = entry.getKey();
            }
        }

        System.out.println("--------");
        System.out.println("En cok satilan ürün: " + enCokSatilanUrun);
        System.out.println("Satis miktari: " + maxSatis);
    }
}
