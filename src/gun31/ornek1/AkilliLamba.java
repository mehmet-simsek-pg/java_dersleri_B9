package gun31.ornek1;

public class AkilliLamba extends Cihaz implements Acilabilir{

    private IsikRengi isikRengi;

    public AkilliLamba(String marka, String model, IsikRengi isikRengi) {
        super(marka, model);
        this.isikRengi = isikRengi;
    }

    public IsikRengi getIsikRengi() {
        return isikRengi;
    }

    public void setIsikRengi(IsikRengi isikRengi) {
        this.isikRengi = isikRengi;
    }

    @Override
    public void bilgi() {
        super.bilgi();
        System.out.println("Isik Rengi: " + isikRengi);
    }

    @Override
    public void ac() {
        System.out.println("Akilli lamba acildi");
    }

    @Override
    public void kapat() {
        System.out.println("Akilli lamba kapandi");
    }
}
