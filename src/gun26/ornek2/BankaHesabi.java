package gun26.ornek2;

public class BankaHesabi {
    private double bakiye;

    BankaHesabi(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatirma(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " miktar eklendi. Yeni bakiye: " + bakiye);
        }
    }

    public void paraCekme(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " miktar cekildi. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye, önce para yatir");
        }
    }
}
