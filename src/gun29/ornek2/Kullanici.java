package gun29.ornek2;

public class Kullanici {
    private String ad;
    private String soyad;
    private String email;
    private boolean uyelikDurumu;

    public Kullanici(String ad, String soyad, String email, boolean uyelikDurumu) {
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.uyelikDurumu = uyelikDurumu;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getEmail() {
        return email;
    }

    public boolean isUyelikDurumu() {
        return uyelikDurumu;
    }

    public void setUyelikDurumu(boolean uyelikDurumu) {
        this.uyelikDurumu = uyelikDurumu;
    }

    public void bilgiYaz() {
        System.out.println("Ad ve soyad: " + ad + " " + soyad);
        System.out.println("Email: " + email);
        System.out.println("Üyelik durumu: " + uyelikDurumu);
    }
}
