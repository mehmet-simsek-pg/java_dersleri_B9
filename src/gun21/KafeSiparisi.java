package gun21;

public class KafeSiparisi {

    public static int toplamHesapla(int birimFiyat, int adet) {
        return birimFiyat * adet;
    }

    public static void siparisYazdir(String icecek, int adet, int birimFiyat) {
        int toplam = toplamHesapla(birimFiyat, adet);
        System.out.println("-----Fis------");
        System.out.println("Icecek: " + icecek);
        System.out.println("Adet: " + adet);
        System.out.println("Birim fiyati: " + birimFiyat);
        System.out.println("Toplam fiyat: " + toplam);
    }

    public static void main(String[] args) {
        // 1. müsteri siparisi
        siparisYazdir("Kahve", 2 , 45);
        // 2. müsteri siparisi
        siparisYazdir("Cay", 4, 20);
        // 3. müsteri siparisi
        siparisYazdir("Sicak Cikolata", 3, 50);
        // 4. müsteri siparisi
        siparisYazdir("Limonata", 5, 43);
    }
}
