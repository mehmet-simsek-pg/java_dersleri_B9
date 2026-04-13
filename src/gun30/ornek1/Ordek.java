package gun30.ornek1;

public class Ordek implements Ucabilir, Yuzebilir, Hayvan{
    @Override
    public void sesCikar() {
        System.out.println("Vakladi");
    }

    @Override
    public void beslenir() {
        System.out.println("Ot yedi");
    }

    @Override
    public void uyur() {
        System.out.print("Suda uyuyakaldi");
    }

    @Override
    public void hareketEder() {
        System.out.println("Paytak paytak yürüdü");
    }

    @Override
    public void ucar() {
        System.out.println("Tehlike görüp uctu");
    }

    @Override
    public void yuzer() {
        System.out.println("Balik pesinde yüzdü");
    }
}
