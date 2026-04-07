package gun28.ornek3;

public class Hemsire extends Calisan{
    String servisAdi;

    public Hemsire(String ad, String soyad, double maas, String servisAdi) {
        super(ad, soyad, maas);
        this.servisAdi = servisAdi;
    }

    @Override
    public void bilgiYazdir() {
        super.bilgiYazdir();
        System.out.println("Servis adi: " + servisAdi);
    }
}
