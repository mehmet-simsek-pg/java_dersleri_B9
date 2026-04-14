package gun32.tur;

public class PolymorphismTurleri {

    // 1) Method Overloading -> Ayni isimli metodun parametrelerini
    // degistirerek fazla is yapmasidir

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int topla(int sayi1, int sayi2, int sayi3) {
        return sayi1 + sayi2 + sayi3;
    }

    public static double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    // 2) Method Override
    // parent class ta yazilan methodu child class icerisinde yeniden yazmaktir.
    // Calisan -> parent , maasBilgisi()
    // Ogretmen, Mudur -> maasBilgisi() override ettik

    public static void main(String[] args) {
        int toplam = PolymorphismTurleri.topla(2,45);
        double toplamD = PolymorphismTurleri.topla(222,45);
        int toplam2 = PolymorphismTurleri.topla(34,45,12);

        System.out.println("1. toplam: " + toplam);
        System.out.println("2. toplam: " + toplamD);
        System.out.println("3. toplam: " + toplam2);

        String text = "Bugün hava cok güzel";

        System.out.println("2-6 arasi: " + text.substring(2, 6));
        System.out.println("3 ten sonrasi: " + text.substring(3));

    }
}
