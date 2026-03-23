package gun21;

public class TelefonFaturasi {
    public static int toplamHesapla(int dakika) {
        return dakika * 2;
    }

    public static void indirimKontrolEt(int toplamTutar) {
        if (toplamTutar >= 1000) {
            System.out.println("Indirim kazandiniz");
        } else {
            System.out.println("Indirim yok");
        }
    }

    public static void faturaYazdir(String isim, int dakika) {
        int toplamTutar = toplamHesapla(dakika);
        System.out.println("-----Fatura Bilgileri------");
        System.out.println("Isim: " + isim);
        System.out.println("Kullanilan dakika: " + dakika);
        System.out.println("Toplam tutar: " + toplamTutar);
        indirimKontrolEt(toplamTutar);
        System.out.println();
    }

    public static void main(String[] args) {
        faturaYazdir("Mehmet", 200);
        faturaYazdir("Ali", 350);
        faturaYazdir("Fatma", 500);
        faturaYazdir("Can", 240);
    }
}
