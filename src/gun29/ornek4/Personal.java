package gun29.ornek4;

public class Personal {

    private String ad;
    private String soyad;
    private int yas;
    private String gorevYeri;

    public Personal(String ad, String soyad, int yas, String gorevYeri) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.gorevYeri = gorevYeri;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            System.out.println("Yas negatif olamaz");
        } else {
            this.yas = yas;
        }
    }

    public String getGorevYeri() {
        return gorevYeri;
    }

    public void setGorevYeri(String gorevYeri) {
        this.gorevYeri = gorevYeri;
    }

    public void bilgiYaz() {
        System.out.println("Ad ve soyad: " + ad + " " + soyad);
        System.out.println("Yas: " + yas);
        System.out.println("Görev yeri: " + gorevYeri);
    }
}
