package gun34.ornek1;

public class Urun {
    String ad;
    double fiyat;
    int stok;

    public Urun(String ad, double fiyat, int stok) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    public double fiyatHesapla() {
        return fiyat;
    }

    public void bilgiYaz() {
        System.out.println("Ad: " + ad + " fiyat: " + fiyatHesapla() + " stok adedi: " + stok);
    }

    public void satinAl(int adet) {

        if (adet < 0) {
            throw new IllegalArgumentException("Negatif adet girilemez");
        }

        if (adet > stok) {
            throw new RuntimeException(ad + " icin stok miktari yetersiz");
        }

        stok -= adet;

        System.out.println(adet + " tane " + ad + " alinmistir");
    }


}
