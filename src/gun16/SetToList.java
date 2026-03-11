package gun16;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {

        // Set ten List e cevirmek
        Set<String> isimler = new HashSet<>();
        isimler.add("Gökay");
        isimler.add("Alperen");
        isimler.add("Izzet");
        isimler.add("Hüseyin");

        System.out.println(isimler);
       // isimler.get(0); bu kullanim hatali.
        // Cünkü set lerde index yok

        List<String> isimListesi = new ArrayList<>(isimler);
        System.out.println(isimListesi.get(3));
        // burada cevabin Gökay cimasinin sebebi HashSet in kendi
        // kayit algoritmasindan dolayi.
        // isimler setinin ciktisi su sekilde
        // [Alperen, Hüseyin, Izzet, Gökay]

        System.out.println("-------------");
        // List i Set e cevirmek
        List<String> liste = new ArrayList<>();
        liste.add("Fuat");
        liste.add("Serhat");
        liste.add("Gamze");
        liste.add("Fuat");

        System.out.println("liste: " + liste);

        // Bir listedeki tekrar eden elemanlari kaldirmak icin kullaniriz.
        Set<String> benzersiz = new HashSet<>(liste);
        System.out.println("set e cevrilmis hali: " + benzersiz);

        System.out.println("-----------");
        Set<String> benzersizLinked = new LinkedHashSet<>(liste);
        System.out.println("Linked: " + benzersizLinked);

        System.out.println("-------------");

        Set<String> benzersizTree = new TreeSet<>(liste);
        System.out.println("tree: " + benzersizTree);

    }
}
