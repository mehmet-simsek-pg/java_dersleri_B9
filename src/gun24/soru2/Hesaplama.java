package gun24.soru2;

public class Hesaplama {

    public static int kupAl(int sayi) {
        return sayi * sayi * sayi;
    }

    // bu iki metot max ve min örnek olmasi icin var.
    // Math class inin metotlarini kendimiz yazdik
    public static int max(int sayi1, int sayi2) {
        if (sayi1 > sayi2) {
            return sayi1;
        } else {
            return sayi2;
        }
    }

    public static int min(int sayi1, int sayi2) {
        if (sayi1 < sayi2) {
            return sayi1;
        } else {
            return sayi2;
        }
    }
}
