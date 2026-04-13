package gun31.ornek2;

public class StandartKargo extends Kargo implements Hesapla{

    public StandartKargo(String gonderiSahibiAdi, double agirlik) {
        super(gonderiSahibiAdi, agirlik, GonderimTuru.STANDART);
    }

    @Override
    public double ucretHesapla() {
        double toplam = getAgirlik() * 12;

        if (getAgirlik() > 10) {
            toplam += 20;
        }

        return toplam;
    }
}
