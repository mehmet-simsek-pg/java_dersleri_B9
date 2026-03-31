package gun25.enums;

public class MainClass {
    public static void main(String[] args) {
        Gun bugun = Gun.CARSAMBA;

        System.out.println(bugun);

        TrafikIsiklari isik = TrafikIsiklari.YESIL;

        if (isik == TrafikIsiklari.KIRMIZI) {
            System.out.println("Dur");
        } else if (isik == TrafikIsiklari.SARI) {
            System.out.println("Kornaya bas :)");
        } else {
            System.out.println("Gec");
        }

        Mevsimler mevsim = Mevsimler.SONBAHAR;

        switch (mevsim) {
            case KIS :
                System.out.println("Hava soguk");
                break;
            case YAZ:
                System.out.println("Hava sicak");
                break;
            case ILKBAHAR:
                System.out.println("Hava durumu karisik");
                break;
            case SONBAHAR:
                System.out.println("Yapraklar dökülüyor");
                break;
        }

        System.out.println("-------------");
        KahveBoyutu boyut = KahveBoyutu.KUCUK;

        System.out.println("Secilen boyut: " + boyut);
        System.out.println("Fiyati: " + boyut.fiyat);

        System.out.println("-------------");

        SiparisDurumu durum = SiparisDurumu.HAZIRLANIYOR;

        System.out.println("Siparis durumu: " + durum);
        System.out.println("Aciklama: " + durum.aciklama);

        System.out.println("-------------");

        Yon secim = Yon.KUZEY;

        System.out.println("Yön: " + secim);
        System.out.println("Aciklama: " + secim.yon);
    }
}
