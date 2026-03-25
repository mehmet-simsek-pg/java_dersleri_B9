package gun23;

public class Araba {

    // Fields(özellikler)
    String marka;
    String model;
    double motor;
    String renk;
    boolean manuelMi;
    int hiz;

    // Davranislari(methods)
    void hizlan() {
        hiz += 20;
    }

    void yavasla() {
        hiz -= 20;
    }

    void bilgileriniYazdir() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Motor hacmi: " + motor);
        System.out.println("Rengi: " + renk);
        System.out.println("Hiz: " + hiz);
        System.out.println("Manuel mi? " + manuelMi);
        System.out.println();
    }
}
