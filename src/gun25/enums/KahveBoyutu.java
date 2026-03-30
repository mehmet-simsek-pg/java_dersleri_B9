package gun25.enums;

public enum KahveBoyutu {
    KUCUK(50), ORTA(80), BUYUK(100);

    int fiyat;

    KahveBoyutu(int fiyat) {
        this.fiyat = fiyat;
    }
}
