package gun17;

import java.util.HashMap;
import java.util.Scanner;

public class NotSorgulama {
    public static void main(String[] args) {
        /**
         * Bir ögretmenin elinde ögrencilerin notlari ve isimleri var.
         * 4 ögrenci ve notu Map icine ekleyecegiz.
         * Kullanicidan ögrenci adini alicaz
         * Ögrenci varsa notunu göster, yoksa ögrenci sistemde yok yazdiricaz
         * */

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> ogrenciler = new HashMap<>();
        ogrenciler.put("Serhat", 89);
        ogrenciler.put("Izzet", 90);
        ogrenciler.put("Kader", 92);
        ogrenciler.put("Mehmet", 97);

        System.out.print("Aramak istediginiz ögrencinin adi: ");
        String name = scanner.nextLine().trim();

        if (ogrenciler.containsKey(name)) {
            System.out.println("Ögrenci notu: " + ogrenciler.get(name));
        } else {
            System.out.println("Aranan ögrenci sistemde yoktur");
        }

    }
}
