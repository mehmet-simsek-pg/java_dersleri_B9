package gun23.soru2;

public class Ogrenci {
    String ad;
    int numara;
    double ortalama;

    void bilgiYaz() {
        System.out.println("Ad: " + ad);
        System.out.println("Numara: " + numara);
        System.out.println("Ortalama: " + ortalama);
    }

    void sinavDurumu() {
        if (ortalama >= 50) {
            System.out.println("Sinavi gecti ");
        } else {
            System.out.println("Sinavdan kaldi");
        }
        System.out.println();
    }

}
