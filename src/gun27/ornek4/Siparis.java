package gun27.ornek4;

public class Siparis {
    private String musteriAdi;
    private MenuTuru menuTuru;

    public Siparis(String musteriAdi, MenuTuru menuTuru) {
        this.musteriAdi = musteriAdi;
        this.menuTuru = menuTuru;
    }

    public void siparisDetayi(){
        System.out.println("Müsteri: " + musteriAdi);
        // switch-case yapisinda : kullanirsak break kullanmak zorundayiz
        // -> isaretini kullanirsak break kullanmaya gerek yok
        switch (menuTuru) {
            case CORBA -> System.out.println("Secim: Mercimek Corbasi");
            case ANAYEMEK -> System.out.println("Secim: Karisik Izgara");
            case TATLI -> System.out.println("Secim: Kadayif Dolmasi");
        }
    }
}
