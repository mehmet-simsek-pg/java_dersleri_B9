package gun32.interfaceIle;

public class MesajBildirim implements Bildirim{
    @Override
    public void gonder() {
        System.out.println("Mesaj ile bildirim gönderildi");
    }
}
