package gun1;

public class Printf {
    public static void main(String[] args) {

        /**
         * 1) print() -> icerisindeki yaziyi yazip imleci orada birakiyor
         *
         * 2) println() -> icerisindeki yaziyi yazdiktan
         * sonra imleci alt satira indiriyor
         *
         * 3) printf() -> ekrana formatli bir sekilde
         * yazilar yazdirmamzi sagliyor. Otomatik olarak alt satira inmez.
         * Eger alt satira inmek istiyorsak \n ya da %n kullanicam
         * */

        String ad = "Mehmet";
        int yas = 32;

        System.out.printf("Ad: %s, Yas: %d%n", ad, yas);
        // %s -> yazilar icin kullanilir
        // %d -> digit(sayilar) icin kullanilir
        System.out.println("Alt satirda mi?");

        // Genislik verme
        System.out.printf("[%5d]%n", 7);
        System.out.printf("[%5d]%n", 123);

        //Sola yaslama
        System.out.printf("[%-5d]%n", 7);

        // Ondalikli sayi kontrolü
        System.out.printf("Ortalama: %f%n", 10.34567);
        System.out.printf("Ortalama: %.2f%n", 10.34567);

        // Yazi hizalama(Tablo hissi verir)
        System.out.printf("%-10s %-10s %-10s%n", "Ad", "Soyad", "Sehir");
        System.out.printf("%-10s %-10s %-10s%n", "Mehmet", "Simsek", "Dortmund");
    }
}
