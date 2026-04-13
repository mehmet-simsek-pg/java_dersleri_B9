package gun31.ornek2;

public class AyniGunKargo extends Kargo implements Hesapla{

    double kuryeUcreti;

    public AyniGunKargo(String gonderiSahibiAdi, double agirlik, double kuryeUcreti) {
        super(gonderiSahibiAdi, agirlik, GonderimTuru.AYNI_GUN);
        this.kuryeUcreti = kuryeUcreti;
    }

    @Override
    public double ucretHesapla() {
        double toplam = getAgirlik() * 25 + kuryeUcreti;

        if (getAgirlik() > 10) {
            toplam += 20;
        }
        return toplam;
    }

    @Override
    public void bilgiGoster() {
        super.bilgiGoster();
        System.out.println("Kurye ücreti: " + kuryeUcreti);
    }
}
