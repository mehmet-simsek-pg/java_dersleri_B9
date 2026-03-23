package gun21;

public class SinemaBiletSistemi {

    public static int toplamHesapla(int biletSayisi, int biletFiyati) {
        return biletSayisi * biletFiyati;
    }

    public static void biletBilgisiYazdir(String isim, String filmAdi, int biletSayisi, int birimBiletFiyati) {
        int toplam = toplamHesapla(biletSayisi, birimBiletFiyati);

        System.out.println("Izleyici ismi: " + isim);
        System.out.println("Film adi: " + filmAdi);
        System.out.println("Bilet sayisi: " + biletSayisi);
        System.out.println("Bilet fiyati: " + birimBiletFiyati);
        System.out.println("Toplam Fiyat: " + toplam);
        System.out.println();
    }

    public static void main(String[] args) {
        // isim, film adi, kac bilet oldugu, birim bilet fiyati
        biletBilgisiYazdir("Ali", "John Wick", 2, 90);
        biletBilgisiYazdir("Kader", "Gora", 3, 80);
        biletBilgisiYazdir("Hakan", "Titanic" , 1, 120);
        biletBilgisiYazdir("Candan", "Babam ve Oglum", 4, 70);
    }
}
