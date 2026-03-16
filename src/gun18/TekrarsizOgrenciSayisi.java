package gun18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TekrarsizOgrenciSayisi {
    public static void main(String[] args) {
        /**
         Bir sınıfta öğrencilerin isimleri aşağıdaki gibi bir listede tutuluyor:
         ["Ali", "Ayşe", "Ali", "Mehmet", "Ayşe", "Zeynep", "Can"]
         İstenenler:
         Tüm isimleri bir liste içinde sakla.
         Tekrar eden isimleri çıkarıp sadece benzersiz isimleri
         ayrı bir yapıda tut.
         Kaç farklı öğrenci olduğunu ekrana yazdır.
         Benzersiz isimleri ekrana yazdır.
         */

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Ayse");
        isimler.add("Ali");
        isimler.add("Mehmet");
        isimler.add("Ayse");
        isimler.add("Zeynep");
        isimler.add("Can");

        Set<String> benzersizIsimler = new HashSet<>(isimler);

        System.out.println("Tüm ögrenciler: " + isimler);
        System.out.println("Benzersiz isimler: " + benzersizIsimler);
        System.out.println("Benzersiz ögrenci miktari: " + benzersizIsimler.size());


    }
}
