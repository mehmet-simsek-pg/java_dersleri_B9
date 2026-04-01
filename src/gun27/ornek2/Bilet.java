package gun27.ornek2;

public class Bilet {
    private String filmAdi;
    private int koltukNo;
    private double fiyat;

    public Bilet(String filmAdi, int koltukNo, double fiyat) {
        this.filmAdi = filmAdi;
        this.koltukNo = koltukNo;
        this.fiyat = fiyat;
    }

    public void biletYazdir() {
        System.out.println("------Bilet Bilgileri-----");
        System.out.println("Film: " + filmAdi);
        System.out.println("Koltuk no: " + koltukNo);
        System.out.println("Fiyat: " + fiyat);
    }
}
