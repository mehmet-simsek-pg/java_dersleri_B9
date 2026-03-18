package gun20;

public class MetodIcindeMetod {

    public static int toplam(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static void toplamYazdir(int sayi1, int sayi2) {
        // diger metodu bu method icinde kullandik
        int toplam = toplam(sayi1,sayi2);
        System.out.println("Toplam: " + toplam);
    }

    public static void main(String[] args) {
        toplamYazdir(34, 678);
        toplamYazdir(67, 890);
        toplamYazdir(234, 456);
    }
}
