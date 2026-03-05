package gun14;

import java.util.ArrayList;

public class ArrayListKonusu {
    public static void main(String[] args) {

        /**
         *  int[] sayilar = new int[5]; sayilar dizisi 5 tane int deger alabilir.
         *  sayilar[0] = 3;
         *
         *  String[] sehirler = new String[3]; sehirler dizisi 3 tane String deger alabilir
         *  sehirler[2] = "Izmir";
         */

        ArrayList<String> ogrenciler = new ArrayList<>();
        // boyutu belli degil, bu sayede istedigim kadar String eleman ekleyebilirim

        ArrayList<Integer> notlar = new ArrayList<>();
        // arraylist kullanirken primitive tip(int, double, boolean vs kullanmiyoruz)
        // Integer, Double, Boolean, Float, Long seklinde class yapilarini kullaniyoruz

        // ekleme
        notlar.add(3);
        notlar.add(56); // 1. index
        notlar.add(35);
        notlar.add(67);

        System.out.println(notlar);
        System.out.println("Eleman sayisi: " + notlar.size());

        System.out.println("----------");
        // ekleme sonradan da yapilabilir ve arraylistin sonuna ekler
        notlar.add(45);
        System.out.println(notlar);
        System.out.println("Eleman sayisi: " + notlar.size());

        System.out.println("-----------");
        // belirli index e ekleme yapma
        notlar.add(3, 98);
        System.out.println(notlar);
        System.out.println("Eleman sayisi: " + notlar.size());

        System.out.println("---------");
        // index numarasi ile elemani getirme
        System.out.println("2. indexteki eleman: " + notlar.get(2));

        System.out.println("-------");
        // index numarasi ile deger güncellemesi yapma
        notlar.set(2, 68);
        System.out.println("2. indexteki eleman güncellemeden sonra: " + notlar.get(2));
        System.out.println("Güncellemeden sonra genel yapi: " + notlar);

        System.out.println("-----------");
        // ilk ve son eleman icin kolaylik
        System.out.println("ilk eleman: " + notlar.get(0));
        System.out.println("son eleman: " + notlar.get(notlar.size() - 1));

        // index numarasi ile silme islemi
        notlar.remove(2);
        System.out.println("Silme isleminden sonra genel yapi: " + notlar);

        System.out.println("Liste icerisinde 67 var mi? -> " + notlar.contains(67));
        System.out.println("Liste bos mu? -> " + notlar.isEmpty());

        // tüm arraylist i silmek icin
        notlar.clear();
        System.out.println("Her seyi sildikten sonra arraylistin boyutu: " + notlar.size());
    }

}
