package gun26.ornek1;

public class Ogrenci {
    private String isim;
    private int yas;
    private double notOrtalamasi;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas > 0) {
            this.yas = yas;
        } else {
            System.out.println("Yas negatif sayi olamaz.");
        }

    }

    public double getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(double notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }
}
