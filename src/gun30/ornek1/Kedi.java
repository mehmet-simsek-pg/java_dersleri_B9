package gun30.ornek1;

public class Kedi implements Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("Miyavlar");
    }

    @Override
    public void beslenir() {
        System.out.println("Fare yedi");
    }

    @Override
    public void uyur() {
        System.out.println("Evde uyudu");
    }

    @Override
    public void hareketEder() {
        System.out.println("Arka ayaklari ön ayaklari ile koordineli calisiyor");
    }
}
