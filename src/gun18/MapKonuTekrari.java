package gun18;

import java.util.HashMap;
import java.util.Map;

public class MapKonuTekrari {
    public static void main(String[] args) {

        // Map ler key(anahtar), value(deger) seklinde calisan bir yapidir
        // ayni key den ekleme yapilamaz, value lar ise ayni olabilir

        // örn sinav sonuclari

        Map<String, Integer> notlar = new HashMap<>();

        notlar.put("Ali", 89);
        notlar.put("Fatma", 45);
        notlar.put("Hayriye", 67);
        notlar.put("Mehmet", 98);
        notlar.put("Kadir", 45);
        notlar.put("Tarik", 89);
        notlar.put("Fatma", 67);

        // bu kullanimda olacaklar
        // ArrayListte: oldugu gibi list icerisine eklerdi
        // Setlerde ikinci Fatma degerini eklemezdi
        // Maplerde ise ilk deger güncellendi

        System.out.println(notlar);

        System.out.println("-----------");
        Map<Integer, String> sehirler = new HashMap<>();
        sehirler.put(1, "Adana");
        sehirler.put(34, "Istanbul");
        sehirler.put(35, "Izmir");
        sehirler.put(25, "Erzurum");
        sehirler.put(41, "Kocaeli");

        System.out.println(sehirler);
    }
}
