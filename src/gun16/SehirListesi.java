package gun16;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SehirListesi {
    public static void main(String[] args) {
        /**
         * Kullanicidan ziyaret ettigi 7 sehir ismini alin.
         * Ayni sehir ismi varsa bunu kaydetmeyin.
         * Sonunda sehir isimleri gittigi sirayla yazdirin.
         * Istanbul sehrinin listede olup olmadigini kontrol edin.
         * */

        Scanner scanner = new Scanner(System.in);
        Set<String> sehirler = new LinkedHashSet<>();

        for (int index = 1; index <= 7; index++) {
            System.out.print(index + ". sehir ismi: ");
            String sehir = scanner.nextLine().trim();

            sehirler.add(sehir);
        }

        System.out.println("-----Sehir isimleri------");
        for(String s: sehirler) {
            System.out.println(s);
        }

        if (sehirler.contains("Istanbul")) {
            System.out.println("Istanbul daha önce ziyaret edilmistir.");
        } else {
            System.out.println("Büyük kayip.");
        }
    }
}
