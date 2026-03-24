package gun22;

import java.util.*;

public class FilmArsivi {
    public static List<String> filmListesi(String veri) {
        List<String> filmler = new ArrayList<>();

        String [] filmIsimleri = veri.split(",");

        for (String film : filmIsimleri) {
            film = film.trim();

            if (!film.isEmpty()) {
                // Ayni isimde film gelirse set icinde
                // kaydetmesin büyük kücük harften dolayi diye toUpperCase() ekledik
                filmler.add(film.toUpperCase());
            }
        }
        return filmler;
    }

    public static Set<String> benzersizFilmler(List<String> filmler) {
        // (buraya List verdigimiz zaman otomatik set e dönüstürüyor)
        return new HashSet<>(filmler);
        /**
         * bu kullanim yukaridaki ile ayni sonucu verir.
         * Set<String> benzersiz = new HashSet<>(filmler);
         * return benzersiz;
         * */
    }

    public static String kategoriBilgisi(String kod) {
        // return ifadesi iki sekilde kullanilir.
        // 1. metodun dönecegi deger
        // 2. Metodu o anda bitirmek icin kullanilir
        switch (kod.toUpperCase()) {
            case "A":
                return "Bilim Kurgu";
            case "B" :
                return "Dram";
            case "C":
                return "Aksiyon";
            default:
                return "Tanimsiz";
        }
    }

    public static void main(String[] args) {
        /**
         * Bir sinema uygulamasında kullanıcıdan virgülle ayrılmış şekilde
         * film isimleri alınır.
         * Örnek giriş:
         * Avatar, Inception, avatar, Interstellar, Joker, joker
         * Program şu işlemleri yapmalıdır:
         * Film isimlerini uygun şekilde parçalayarak bir koleksiyona aktarsın.
         * Tekrar eden film isimlerini temizlesin.
         * Her film adının başındaki ve sonundaki boşlukları temizlesin.
         * Kullanıcıdan ayrıca bir kategori kodu alınsın:
         * A → Bilim Kurgu
         * B → Dram
         * C → Aksiyon
         * diğer durumlar → Tanımsız
         * Bir metod film listesini düzenlesin.
         * Bir metod tekrar edenleri kaldırsın.
         * Bir metod kategori koduna göre tür açıklamasını döndürsün.
         * Son olarak ekrana temizlenmiş film listesi ve seçilen kategori yazdırılsın.
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Film isimlerini aralarinda virgül olacak sekilde girin");
        String veri = scanner.nextLine().trim();

        System.out.print("Kategori kodu girin(A,B ya da C): ");
        String kod = scanner.nextLine().trim();

        List<String> filmler = filmListesi(veri);

        Set<String> benzersizFilmler = benzersizFilmler(filmler);

        String kategori = kategoriBilgisi(kod);

        System.out.println("Film listesi " + filmler);
        System.out.println("Benzersiz film listesi " + benzersizFilmler);
        System.out.println("Film kategorisi: " + kategori);

    }
}
