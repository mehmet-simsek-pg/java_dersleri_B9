package gun34.ornek3;

public abstract class Hesap {
    String hesapSahibi;
    String hesapNo;
    double bakiye;

    public Hesap(String hesapSahibi, String hesapNo, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public void paraYatir(double miktar) {
        if (miktar <= 0) {
            throw new IllegalArgumentException("Yatirilacak miktar pozitif olmalidir.");
        }

        bakiye += miktar;
        System.out.println(hesapNo + " nolu hesaba " + miktar + " TL para yatirildi.");
        System.out.println("Güncel bakiye: " + bakiye);
    }

    public abstract void paraCek(double miktar);

    public void transferYap(Hesap hedefHesap, double miktar) {
        if (hedefHesap == null) {
            throw new RuntimeException("Gecersiz hesap bilgisi");
        }

        // Once para hesaptan cekilir
        this.paraCek(miktar);

        hedefHesap.paraYatir(miktar);

        System.out.println(this.hesapNo + " hesabina " + miktar + " TL transfer edilmistir.");
    }

    public abstract String hesapTuru();

    public void hesapOzeti() {
        System.out.println("Hesap türü: " + hesapTuru() + ", hesap sahibi: " + hesapSahibi + ", hesap no: " + hesapNo + ", bakiye: " + bakiye);
    }
}
