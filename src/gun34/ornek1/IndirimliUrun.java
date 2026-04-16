package gun34.ornek1;

public class IndirimliUrun extends Urun{
    double indirimOrani;

    public IndirimliUrun(String ad, double fiyat, int stok, double indirimOrani) {
        super(ad, fiyat, stok);
        this.indirimOrani = indirimOrani;
    }

    @Override
    public double fiyatHesapla() {
        return fiyat - ((fiyat * indirimOrani) / 100);
    }

    @Override
    public void bilgiYaz() {
        super.bilgiYaz();
        System.out.println("Indirim orani: " + indirimOrani);
    }

}
