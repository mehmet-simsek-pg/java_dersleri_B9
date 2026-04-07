package gun28.ornek3;

public class Calisan {
    String ad;
    String soyad;
    double maas;

    public Calisan(String ad, String soyad, double maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.maas = maas;
    }

    public void bilgiYazdir() {
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Maas: " + maas);
    }

    public String bilgi(){
        return "Ad: " + ad + " Soyad: " + soyad + " maas: " + maas;
    }
}
