package gun26.ornek2;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir BankaHesabi sinifi olusturun. Bakiye alani private olsun.
         * Para yatirma ve para cekme islemlerini kontrollü bir sekilde
         * yaptirin.
         * */

        BankaHesabi bankaHesabi = new BankaHesabi(500);

        bankaHesabi.paraYatirma(1000);
        bankaHesabi.paraYatirma(500);
        bankaHesabi.paraCekme(2000);
        bankaHesabi.paraCekme(1400);
        bankaHesabi.paraYatirma(200);
    }
}
