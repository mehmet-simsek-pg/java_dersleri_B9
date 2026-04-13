package gun31.ornek2;

public class HizliKargo extends Kargo implements Hesapla{

    boolean sehirDisiMi;

    public HizliKargo(String gonderiSahibiAdi, double agirlik, boolean sehirDisiMi) {
        super(gonderiSahibiAdi, agirlik, GonderimTuru.HIZLI);
        this.sehirDisiMi = sehirDisiMi;
    }

    @Override
    public double ucretHesapla() {
        double toplam = getAgirlik() * 18;

        if (sehirDisiMi) {
            toplam += 30;
        }

        if (getAgirlik() > 10) {
            toplam += 20;
        }
        return toplam;
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Sehir disi mi? " + sehirDisiMi);
    }
}
