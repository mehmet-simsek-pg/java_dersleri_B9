package gun21;

public class SinavOrtalamasi {
    public static double ortalamaHesapla(int not1, int not2, int not3) {
        return (not1 + not2 + not3) / 3.0;
    }

    public static void sinavDurumu(double ortalama) {
        if (ortalama >= 50) {
            System.out.println("Sinavi gecti");
        } else {
            System.out.println("Sinavdan kaldi");
        }
    }
    public static void ogrenciBilgisiYazdir(String isim, int not1, int not2, int not3) {
        double ortalama = ortalamaHesapla(not1, not2 , not3);

        System.out.println("----Ögrenci Bilgileri------");
        System.out.println("Ögrenci ismi: " + isim);
        System.out.println("1. not: " + not1);
        System.out.println("2. not: " + not2);
        System.out.println("3. not: " + not3);
        System.out.printf("Ortalama: %.2f%n" , ortalama);
        sinavDurumu(ortalama);
    }

    public static void main(String[] args) {
        // ogrenci ismi ve aldigi notlar
        ogrenciBilgisiYazdir("Ali", 34, 45, 98);
        ogrenciBilgisiYazdir("Vali", 56, 77, 55);
        ogrenciBilgisiYazdir("Can", 56, 78, 34);
        ogrenciBilgisiYazdir("Funda", 56, 43, 98);
    }
}
