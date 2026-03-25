package gun23.soru1;

public class Telefon {
    String marka;
    String model;
    int sarjYuzdesi;

    void sarjiArtir() {
        sarjYuzdesi += 10;
    }

    void bilgileriniYaz() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Sarj yüzdesi: " + sarjYuzdesi);
        System.out.println();
    }
}
