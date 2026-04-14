package gun32.interfaceIle;

public class EmailBildirim implements Bildirim{
    @Override
    public void gonder() {
        System.out.println("Email ile bildirim gönderildi");
    }
}
