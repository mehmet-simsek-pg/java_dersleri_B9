package gun31.ornek1;

public class AkilliKlima extends Cihaz implements Acilabilir, Baglanabilir{

    private int sicaklikDerecesi;

    public AkilliKlima(String marka, String model, int sicaklikDerecesi) {
        super(marka, model);
        this.sicaklikDerecesi = sicaklikDerecesi;
    }

    public int getSicaklikDerecesi() {
        return sicaklikDerecesi;
    }

    public void setSicaklikDerecesi(int sicaklikDerecesi) {
        this.sicaklikDerecesi = sicaklikDerecesi;
    }

    @Override
    public void bilgi() {
        super.bilgi();
        System.out.println("Sicaklik derecesi: " + sicaklikDerecesi);
    }

    @Override
    public void ac() {
        System.out.println("Akilli klima acildi");
    }

    @Override
    public void kapat() {
        System.out.println("Akilli klima kapandi");
    }

    @Override
    public void interneteBaglan() {
        System.out.println("Akilli klima internete baglandi");
    }
}
