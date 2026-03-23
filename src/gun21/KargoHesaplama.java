package gun21;

public class KargoHesaplama {
    public static void urunYazdir(String urun, double kilo) {
        System.out.println("-----Ürün Bilgileri-----");
        System.out.println("Ürün adi: " + urun);
        System.out.println("Ürün kilosu: " + kilo);
    }

    public static double fiyatHesapla(double kilo) {
        return kilo * 20;
    }

    public static void kargoUcretiYazdir(double toplamKilo) {
        double toplam = fiyatHesapla(toplamKilo);
        System.out.println("Toplam kargo ücreti: " + toplam);
    }

    public static void main(String[] args) {

        String urun1 = "Kitap";
        double kilo1 = 5.2;

        String urun2 = "Laptop";
        double kilo2 = 6.3;

        urunYazdir(urun1, kilo1);
        urunYazdir(urun2, kilo2);

        double toplamKilo = kilo1 + kilo2;
        kargoUcretiYazdir(toplamKilo);
    }
}
