package gun27.ornek7;

public class SporSalonuUyesi {
    private String adi;
    private UyelikPaketi paket;

    public SporSalonuUyesi(String adi, UyelikPaketi paket) {
        this.adi = adi;
        this.paket = paket;
    }

    private double ucretHesapla(){
        switch (paket) {
            case AYLIK : return 800;
            case UCAYLIK: return 2200;
            case YILLIK: return 7500;
            default: return 0;
        }
    }

    public void bilgiYazdir() {
        System.out.println("Üye adi: " + adi);
        System.out.println("Secilen paket: " + paket);
        System.out.println("Toplam ücret: " + ucretHesapla() + " TL");
    }
}
