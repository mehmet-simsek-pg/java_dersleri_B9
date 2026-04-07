package gun28.ornek2;

public class MainClass {
    public static void main(String[] args) {
        Kedi kedi = new Kedi(true,"Tekir");
        Kopek kopek = new Kopek(false, "Karabas");

        System.out.println("Kedi adi: " + kedi.ad);
        System.out.println("Kedi yasiyor mu: " + kedi.yasiyorMu);
        kedi.sesCikar();

        System.out.println("Kopek adi: " + kopek.ad);
        System.out.println("Kopek yasiyor mu: " + kopek.yasiyorMu);
        kopek.sesCikar();


    }
}
