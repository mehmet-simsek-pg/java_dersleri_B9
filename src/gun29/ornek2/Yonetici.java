package gun29.ornek2;

public class Yonetici extends Kullanici{

    String yetkiSeviyesi;

    public Yonetici(String ad, String soyad, String email, boolean uyelikDurumu, String yetkiSeviyesi) {
        super(ad, soyad, email, uyelikDurumu);
        this.yetkiSeviyesi = yetkiSeviyesi;
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Yetki seviyesi: " + yetkiSeviyesi);
    }
}
