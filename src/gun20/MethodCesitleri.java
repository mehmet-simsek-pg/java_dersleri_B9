package gun20;

public class MethodCesitleri {
    public static void main(String[] args) {
        /**
         * 1 -> deger döndürmeyen parametresiz method
         * 2 -> deger döndürmeyen parametreli method
         * 3 -> deger döndüren parametresiz method
         * 4 -> deger döndüren parametreli method
         * */
        selamVer();
        merhabaYaz("Mehmet");
        // deger dönüyor demek,
        // dönen deger tipinde bir degiskene atama yapmaktir.
        int toplamSonucu = toplam();
        // deger döndüren ve parametre alan method
        int carpmaSonucu = carpma(5, 6);

        System.out.println("Toplam: " + toplamSonucu);
        System.out.println("Carpma: " + carpmaSonucu);

    }

    // 1.
    public static void selamVer() {
        System.out.println("Method konusuna hos geldiniz :)");
    }

    // 2.
    public static void merhabaYaz(String name) {
        System.out.println("Hosgeldin " + name);
    }

    // 3.
    public static int toplam() {
        return 3 + 4;
    }

    // 4.
    public static int carpma(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }
}
