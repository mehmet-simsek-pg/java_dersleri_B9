package gun20;

public class ReturnKullanimi {

    // 1
    public static int kontrolEt(int sayi) {
        if (sayi < 0) {
            return 0;
        }
        return sayi;
    }

    // 2
    public static void yasKontrolu(int yas) {
        if (yas < 0) {
            System.out.println("Yas sifirdan kücük olamaz");
            return; // geriye deger döndürmek icin degil,
            // methodu bitirmek icin kullanildi
        }
        System.out.println("Yas: " + yas);
    }

    public static void main(String[] args) {
        /**
         * return iki sekilde kullanilir
         * 1 - geriye bir deger döndürüyordu
         * 2 - Metodu bitirmek icin kullanilir
         * */

        int number = kontrolEt(43);
        System.out.println("Sayi: " + number);
        yasKontrolu(-23);
        yasKontrolu(23);
    }
}
