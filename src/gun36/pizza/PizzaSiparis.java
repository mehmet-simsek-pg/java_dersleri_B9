package gun36.pizza;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PizzaSiparis {
    String musteriAdi;
    Boyut boyut;
    PizzaTuru pizzaTuru;
    int adet;
    LocalDateTime siparisZamani;

    public PizzaSiparis(String musteriAdi, Boyut boyut, PizzaTuru pizzaTuru, int adet) {
        this.musteriAdi = musteriAdi;
        this.boyut = boyut;
        this.pizzaTuru = pizzaTuru;
        this.adet = adet;
        this.siparisZamani = LocalDateTime.now();
    }

    public double birimFiyatGetir() {
        switch (boyut) {
            case KUCUK -> {
                return 150;
            }
            case ORTA -> {
                return 200;
            } case BUYUK -> {
                return 250;
            }
            default -> {
                return 0;
            }
        }
    }

    public double toplamFiyatGetir() {
        return birimFiyatGetir() * adet;
    }

    public void siparisBilgileri() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("-----Siparis Bilgileri-------");
        System.out.println("Müsteri adi: " + musteriAdi);
        System.out.println("Pizza boyutu: " + boyut);
        System.out.println("Pizza türü: " + pizzaTuru);
        System.out.println("Adet: " + adet);
        System.out.println("Siparis zamani: " + siparisZamani.format(formatter));
        System.out.println("Toplam fiyat: " + toplamFiyatGetir());
    }
}
