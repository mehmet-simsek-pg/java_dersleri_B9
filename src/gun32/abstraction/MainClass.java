package gun32.abstraction;

public class MainClass {
    public static void main(String[] args) {

        Kedi kedi = new Kedi("Tekir");
        Kopek kopek = new Kopek("Karabas");

        kedi.sesCikar();
        kopek.sesCikar();

        Araba araba = new Araba("Mercedes");
        Ucak ucak = new Ucak("Boeing 747");

        araba.hareketEt();
        ucak.hareketEt();
    }
}
