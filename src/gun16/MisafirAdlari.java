package gun16;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MisafirAdlari {
    public static void main(String[] args) {
        /**
         * Kullanicidan 6 tane misafir ismi alicaz. Ayni isimden
         * birden fazla giris yapilirsa kayit edilmeyecek.
         * En son misafir isimlerini yazdirin.
         * Toplam kac misafir oldugunu yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);
        // soruda ya da görevde özellikle belirtilmez
        // ise HashSet kullanilir set olarak
        Set<String> isimler = new HashSet<>();

        for (int index = 0; index < 6; index++) {
            System.out.print((index + 1) + ". misafir ismi: ");
            String isim = scanner.nextLine().trim();

            isimler.add(isim);
        }

        System.out.println("------Misafir isimleri------");
        for (String name : isimler) {
            System.out.println(name);
        }

        System.out.println("Toplam misafir sayisi: " + isimler.size());

    }
}
