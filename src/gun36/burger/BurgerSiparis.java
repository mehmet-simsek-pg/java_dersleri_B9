package gun36.burger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BurgerSiparis {
    String musteriAdi;
    BurgerBoyut boyut;
    BurgerTuru turu;
    Icecek icecek;
    int adet;
    LocalDateTime siparisZamani;

    public BurgerSiparis(String musteriAdi, BurgerBoyut boyut, BurgerTuru turu, Icecek icecek, int adet) {
        this.musteriAdi = musteriAdi;
        this.boyut = boyut;
        this.turu = turu;
        this.icecek = icecek;
        this.adet = adet;
        this.siparisZamani = LocalDateTime.now();
    }

    public double burgerBirimFiyatGetir() {
        switch (boyut) {
            case KUCUK -> {
                return 80;
            }
            case ORTA -> {
                return 100;
            }
            case BUYUK -> {
                return 120;
            }
            default -> {
                return 0;
            }
        }
    }

    public double icecekBirimFiyatGetir() {
        switch (icecek) {
            case SU -> {
                return 10;
            }
            case AYRAN -> {
                return 15;
            }
            case KOLA -> {
                return 20;
            }
            default -> {
                return 0;
            }
        }
    }

    public double araToplamHesapla() {
        return (burgerBirimFiyatGetir() * adet) + (icecekBirimFiyatGetir() * adet);
    }

    public double indirimOrani() {
        if (adet >= 3) {
            return 0.1;
        }
        return 0;

    }

    public double indirimHesapla() {
        return araToplamHesapla() * indirimOrani();
    }

    public double toplamFiyatHesapla() {
        return araToplamHesapla() - indirimHesapla();
    }

    public void siparisBilgileri() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("Müsteri adi: " + musteriAdi);
        System.out.println("Burger boyutu: " + boyut);
        System.out.println("Burger türü: " + turu);
        System.out.println("Siparis zamani: " + siparisZamani.format(formatter));
        System.out.println("Siparis adedi: " + adet);
        System.out.println("Ara toplam: " + araToplamHesapla());

        if (adet >= 3) {
            System.out.println("Indirim       : %" + (int) (indirimOrani() * 100));
            System.out.println("Indirim tutari: " + indirimHesapla());
        }
        System.out.println("Toplam tutar: " + toplamFiyatHesapla());

        if (boyut == BurgerBoyut.BUYUK) {
            System.out.println("Not: Hazirlanmasi biraz daha uzun sürebilir.");
        }
        System.out.println("Siparisiniz alindi");
    }
}
