package gun23.soru3;

public class Araba {
    String marka;
    String renk;
    int hiz;

    void bilgiYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Renk: " + renk);
        System.out.println("Hiz: " + hiz);
        System.out.println();
    }

    void hizlan() {
        hiz += 20;
        System.out.println("Hiz artirdiktan sonra");
        System.out.println("Hiz: " + hiz);
        if (hiz >= 120) {
            System.out.println("Hiz sinirini astiniz");
            System.out.println();
        }
    }
}
