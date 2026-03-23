package gun21;

public class OgrenciNotSistemi {

    public static void ogrenciBilgisiYazdir(String ogrenci, int not) {
        System.out.println("------Ögrenci bilgileri------");
        System.out.println("Ögrenci adi: " + ogrenci);
        System.out.println("Ögrenci notu: " + not);
        System.out.println("-------------");
    }

    public static void sinavDurumu(String ogrenci, int not) {
        if (not >= 50) {
            System.out.println();
            System.out.println(ogrenci + " sinavi gecti");
        } else {
            System.out.println();
            System.out.println(ogrenci + " sinavdan kaldi");
        }
    }

    public static void main(String[] args) {

        String ogrenci1 = "Mehmet";
        int not1 = 99;

        String ogrenci2 = "Ahmet";
        int not2 = 48;

        ogrenciBilgisiYazdir(ogrenci1, not1);
        ogrenciBilgisiYazdir(ogrenci2, not2);

        sinavDurumu(ogrenci1, not1);
        sinavDurumu(ogrenci2, not2);

    }
}
