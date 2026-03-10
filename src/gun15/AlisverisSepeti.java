package gun15;

import java.util.ArrayList;
import java.util.Scanner;

public class AlisverisSepeti {
    public static void main(String[] args) {
        /**
         * Kullanici ürün isimlerini tek tek girecek.
         * Kullanici "bitti" yazana kadar giris yapmaya devam edecek.
         * En son:
         * Sepetteki ürünleri sira numarisi ile yazdirin.
         * Kullanicinin girdigi bir ürün ün adini aratin:
         * varsa kacinci sirada oldugunu yazdirin, yoksa bulunamadi yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> isimler = new ArrayList<>();
        // bu da ikinci cözüm yolu. kullanici ilk giriste bitti yazabilir
        // diye do-while döngüsü kullandik.
        /**
         String isim;
         do {
         System.out.print("Ürün ismi: ");
         isim = scanner.nextLine().trim();
         if (!isim.equalsIgnoreCase("bitti")) {
         isimler.add(isim);
         }
         } while (!isim.equalsIgnoreCase("bitti"));
         */

        System.out.println("Ürün ismi girin. Girdi yapmayi bitirmek icin bitti yazin");

        while (true) {
            System.out.print("Ürün: ");
            String name = scanner.nextLine().trim();

            if (name.equalsIgnoreCase("bitti")) {
                break;
            }

            if (name.isEmpty()) {
                System.out.println("Ürün ismi bos olamaz");
                continue;
            }
            isimler.add(name);
        }

        for (int index = 0; index < isimler.size(); index++) {
            System.out.println((index + 1) + " ürün ismi -> " + isimler.get(index));
        }

        System.out.print("Aramak istediginiz ürün adini girin: ");
        String aranan = scanner.nextLine().trim();

        // boolean degisken atamasi yaparken default olarak false deger atanir.
        // islem dogru cikarsa degisken true yapilir.
        // int degerlerde ise default deger -1 yapilir.
        // Islem sonucu int degiskene atanir.
        // Index degerleri 0 dan basladigi icin bu sekilde kullanilir.

        int bulunduguIndex = -1; // bu kullanima flag(ara degisken) denir.
        // Bu sayede islemler yapilir sonuc bir degiskene kaydedilir ve sonrasinda
        // bu degisken kullanilabilir.
        for (int index = 0; index < isimler.size(); index++) {
            if (aranan.equalsIgnoreCase(isimler.get(index))) {
                bulunduguIndex = index;
                break; // aradigim ismi bulduktan sonra liste icerisinde gezmesine gerek yok
            }
        }

        if (bulunduguIndex == -1) {
            System.out.println("Ürün bulunamadi");
        } else {
            System.out.println("ürün bulundu. Sirasi -> " + (bulunduguIndex + 1));
        }


    }
}
