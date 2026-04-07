package gun29.ornek1;

public class Arac {

    String plaka;
    String marka;
    double gunlukUcret;
    boolean kiradaMi;

    public Arac(String plaka, String marka, double gunlukUcret, boolean kiradaMi) {
        this.plaka = plaka;
        this.marka = marka;
        this.gunlukUcret = gunlukUcret;
        this.kiradaMi = kiradaMi;
    }

    public String getPlaka() {
        return plaka;
    }

    public String getMarka() {
        return marka;
    }

    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public boolean isKiradaMi() {
        return kiradaMi;
    }

    public void bilgiYaz() {
        System.out.println("Plaka: " + plaka);
        System.out.println("Marka: " + marka);
        System.out.println("Günlük ücret: " + gunlukUcret);
        System.out.println("Kirada mi? " + kiradaMi);
    }
}
