package gun12;

import java.util.Scanner;

public class MarketSepeti {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan 5 ürün adı alın.
         * Her ürün adını temizleyip (baş/son boşluklar),
         * boş girilmişse tekrar isteyin.
         * En sonda:
         * Girilen ürünleri sırayla yazdırın
         * İçlerinde kaç tanesinde rakam geçtiğini bulun (örn: “Süt2”)
         * */

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        int index = 0;

        while (index < names.length) { // kac defa dönecegini bilmiyorum
            System.out.print("Ürün adi girin: ");
            String name = scanner.nextLine().trim();

            if (name.isEmpty()) {
                System.out.println("Ürün adi bos olamaz. Tekrar girin");
                continue;
            }

            names[index] = name;
            index++;
        }

        int rakamSayisi = 0;

        // Ürünlerin sira ile ismi
        System.out.println("------Girilen ürünler-----");
        for (int i = 0; i < names.length; i++) {
            String n = names[i];
            System.out.println((i + 1) + " - " + n);

            for (int j = 0; j < n.length(); j++) {
                // names[0] = "Armut"; -> length 5
                // names[1] = "Kiwi"; -> length 4
                char ch = n.charAt(j);

                if (ch >= '0' && ch <= '9') { // bu kosul true ise
                    rakamSayisi++; // ürün ismi icerisinde rakam var demektir
                }
            }
        }
        System.out.println("Ürünler icerisinde gecen toplam rakam sayisi: " + rakamSayisi);

    }
}
