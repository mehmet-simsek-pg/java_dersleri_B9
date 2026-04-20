package gun34.ornek3;

public class VadesizHesap extends Hesap{

    public VadesizHesap(String hesapSahibi, String hesapNo, double bakiye) {
        super(hesapSahibi, hesapNo, bakiye);
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException("Cekilecek miktar pozitif olmalidir.");
        }

        if (miktar > bakiye) {
            throw new RuntimeException("Yetersiz bakiye. Güncel bakiye: " + bakiye);
        }

        bakiye -= miktar;
        System.out.println(hesapNo + " vadesiz hesaptan " + miktar + " cekilmistir.");
        System.out.println("Güncel bakiye: " + bakiye);
    }

    @Override
    public String hesapTuru() {
        return "Vadesiz Hesap";
    }
}
