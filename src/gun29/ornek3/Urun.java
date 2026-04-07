package gun29.ornek3;

public class Urun {

    private String ad;
    private double fiyat;
    private String kategori;

    public Urun(String ad, double fiyat, String kategori) {
        this.ad = ad;
        this.fiyat = fiyat;
        this.kategori = kategori;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        if (ad.isEmpty()) {
            System.out.println("Ad bos olamaz");
        } else {
            this.ad = ad;
        }
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        if (fiyat < 0 || fiyat == 0) {
            System.out.println("Fiyat sifir ya da negatif olamaz");
        } else {
            this.fiyat = fiyat;
        }
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void bilgiYaz() {
        System.out.println("Ad: " + ad);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Kategori: " + kategori);
    }
}
