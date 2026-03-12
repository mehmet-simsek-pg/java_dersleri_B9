package gun17;

import java.util.HashMap;
import java.util.Map;

public class MapUzerindeGezmek {
    public static void main(String[] args) {

        HashMap<Integer, String> ogrenciler = new HashMap<>();

        ogrenciler.put(1, "Serhat");
        ogrenciler.put(2, "Kader");
        ogrenciler.put(3, "Hüseyin");
        ogrenciler.put(4, "Gökay");
        ogrenciler.put(5, "Merve");

        // 1. Key ler ile ve sadece keyleri alir
        for (Integer key: ogrenciler.keySet()) {
            System.out.println(key);
        }

        System.out.println("-----------");

        // 2. Value lar ile, sadece value lari getirir
        for (String value: ogrenciler.values()) {
            System.out.println(value);
        }

        System.out.println("------------");

        // 3. Hem key hem value larin geldigi durum
        // Map.Entry<key,value> degiskenIsmi : tanimlanan map.entrySet()
        for (Map.Entry<Integer, String> entry: ogrenciler.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
