package gun21;

public class RestorantHesapSistemi {

    public static int toplamHesapla(int adet, int birimFiyat) {
        return adet * birimFiyat;
    }

    public static void hesapYazdir(String urun, int adet, int birimFiyat) {
        int toplam = toplamHesapla(adet, birimFiyat);
        System.out.println("Ürün adi: " + urun);
        System.out.println("Ürün adedi: " + adet);
        System.out.println("Ürün birim fiyati: " + birimFiyat);
        System.out.println("Toplam tutar: " + toplam);
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. müsteri
        hesapYazdir("Pizza", 3, 60);
        // 2. müsteri
        hesapYazdir("Döner", 2, 80);
        // 3. müsteri
        hesapYazdir("Kebap", 4, 100);
        // 4. müsteri
        hesapYazdir("Revani", 6, 30);
    }
}
