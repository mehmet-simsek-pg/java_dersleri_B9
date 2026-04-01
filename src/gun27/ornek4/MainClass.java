package gun27.ornek4;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir restoranda corba, ana yemek ve tatli secimi
         * yapiliyor. Siparis nesnesi müsterinin adi ve sectigi
         * menü türü ile olusturuluyor. Menü türüne göre ekrana
         * aciklama yazdiriliyor.
         * */

        Siparis siparis = new Siparis("Izzet", MenuTuru.CORBA);
        siparis.siparisDetayi();

        Siparis siparis2 = new Siparis("Izzet", MenuTuru.ANAYEMEK);
        siparis2.siparisDetayi();
    }
}
