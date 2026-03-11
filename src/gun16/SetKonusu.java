package gun16;

import java.util.HashSet;
import java.util.Set;

public class SetKonusu {
    public static void main(String[] args) {

        /**
         * Ayni elemani birden fazla kez saklamaz. Elemanlari equals olarak kontrol eder. Büyük kücük harf önemli
         * örn -> Istanbul, Izmir, Ankara, Jena, Izmir
         * ArrayList -> bu listeyi oldugu gibi saklar String olarak.
         * Set ise ikinci defa girilen Izmir String ifadesini saklamaz.
         *
         * Tekrar eden verileri önlemek istedigimizde
         * Bir elemanin var olup olmadigini kontrol etmek istedigimizde
         * Liste gibi sira önemli degilse
         * Benzersiz kayitlar tutmak istedigimizde
         *
         * */

        Set<String> sehirler = new HashSet<>();
        sehirler.add("Istanbul");
        sehirler.add("Ankara");
        sehirler.add("Izmir");
        sehirler.add("Jena");
        sehirler.add("Izmir");

        System.out.println(sehirler);
        System.out.println("Eleman sayisi: " + sehirler.size());

        /**
         * Set lerde add metodu ile eleman eklemek istedigimde
         * add metodunun cevabi boolean olur. Eger var olan degerden ekleme yapmak
         * istersem hata vermez, onun yerine cevap false olur.
         * */

        System.out.println(sehirler.add("Ankara")); // false
        System.out.println(sehirler.add("Koeln")); // true

        /**
         * Set lerde index olmaz. sehirler.get(0) diye bir kullanim yok.
         * */

        System.out.println("-------------");
        for(String sehir: sehirler) {
            System.out.println(sehir);
        }

        System.out.println("----------");
        // eleman silme
        Set<String> isimler = new HashSet<>();
        isimler.add("Gökay");
        isimler.add("Alperen");
        isimler.add("Izzet");
        isimler.add("Kader");
        isimler.add("Mehmet");

        System.out.println("Silmeden önce: " + isimler);

        isimler.remove("Mehmet");
        System.out.println("Sildikten sonra: " + isimler);

        System.out.println("----------");
        // Eleman var mi kontrolü

        System.out.println(isimler.contains("Kader")); // true
        System.out.println(isimler.contains("Humeyra")); // false
    }

}
