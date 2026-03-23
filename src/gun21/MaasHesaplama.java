package gun21;

public class MaasHesaplama {
    public static void maasHesapla(int saat, int saatlikUcret) {
        int maas = saat * saatlikUcret;
        System.out.println("Calisan maasi: " + maas + " Euro");
    }
    public static void calisanBilgisiYazdir(String isim, String bolum, int saat, int saatlikUcret) {

        System.out.println("------Calisan Özeti-------");
        System.out.println("Calisan ismi: " + isim);
        System.out.println("Calisan bolumu: " + bolum);
        System.out.println("Calisan saatlik ücreti: " + saatlikUcret);
        maasHesapla(saat, saatlikUcret);
        // geri dönüs tipi void olan bir metodu
        // direkt olarak sout icinde kullanamayiz
        //System.out.println("Toplam maas" + maasHesapla(saat, saatlikUcret));
    }
    public static void main(String[] args) {
        // isim, bolum, aylik calisma saati, saatlik ücreti
        calisanBilgisiYazdir("Mehmet", "Yazilim", 160, 150);
        calisanBilgisiYazdir("Izzet", "Yazilim", 160, 120);
        calisanBilgisiYazdir("Gökay", "E-Ticaret, Yazilim", 160, 100);
        calisanBilgisiYazdir("Huseyin", "Yazilim", 160, 130);

    }
}
