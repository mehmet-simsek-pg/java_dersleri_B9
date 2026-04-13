package gun30.ornek1;

public class Kopek implements Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("Havlar");
    }

    @Override
    public void beslenir() {
        System.out.println("Mama yedi");
    }

    @Override
    public void uyur() {
        System.out.println("Kulübe de uyudu");
    }

    @Override
    public void hareketEder() {
        System.out.println("Umarsizca Kosar");
    }
}
