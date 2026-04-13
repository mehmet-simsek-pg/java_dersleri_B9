package gun31.ornek2;

public class Kargo {
    private String gonderiSahibiAdi;
    private double agirlik;
    private GonderimTuru gonderimTuru;

    public Kargo(String gonderiSahibiAdi, double agirlik, GonderimTuru gonderimTuru) {
        this.gonderiSahibiAdi = gonderiSahibiAdi;
        this.agirlik = agirlik;
        this.gonderimTuru = gonderimTuru;
    }

    public String getGonderiSahibiAdi() {
        return gonderiSahibiAdi;
    }

    public void setGonderiSahibiAdi(String gonderiSahibiAdi) {
        this.gonderiSahibiAdi = gonderiSahibiAdi;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }

    public GonderimTuru getGonderimTuru() {
        return gonderimTuru;
    }

    public void setGonderimTuru(GonderimTuru gonderimTuru) {
        this.gonderimTuru = gonderimTuru;
    }

    public void bilgiGoster() {
        System.out.println("Musteri adi: " + gonderiSahibiAdi);
        System.out.println("Paket agirligi: " + agirlik);
        System.out.println("Gönderim türü: " + gonderimTuru);
    }
}
