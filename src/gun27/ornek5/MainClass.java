package gun27.ornek5;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir kütüphane üyesinin adi ve ödünc aldigi kitap
         * sayisi tutuluyor. Bir üye ayni anda en fazla 3
         * kitap alabilsin. Kitap sayisi disaridan dogrudan
         * degistirilemesin. Sadece kitap alma ve kitap iade etme
         * islemleriyle güncellensin.
         * */

        Uye uye = new Uye("Gökay");
        uye.kitapAl();
        uye.bilgileriGoster();

        uye.kitapAl();
        uye.kitapAl();
        uye.bilgileriGoster();

        uye.kitapAl();
        uye.bilgileriGoster();
    }
}
