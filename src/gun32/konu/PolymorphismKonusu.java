package gun32.konu;

import gun32.interfaceIle.Bildirim;
import gun32.interfaceIle.EmailBildirim;
import gun32.interfaceIle.MesajBildirim;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismKonusu {
    /**
     * Inheritance and interface

      extends -> alt siniflar üst sinifta tanimlanan degisken ve
         metodlara sahip oluyorlar

     implements -> siniflara tanimlanan metodlari eklemis oluyoruz

     Hayvan -> parent , void sesCikar()
     Kedi -> child , @Override void sesCikar() -> kendisine göre yeniden yazdik
     Kopek -> child , @Override void sesCikar() -> kendisine göre yeniden yazdik
     * */
    public static void main(String[] args) {
        Hayvan kedi = new Kedi();
        Hayvan kopek = new Kopek();

        List<Hayvan> hayvanlar = new ArrayList<>();

        hayvanlar.add(new Kedi());
        hayvanlar.add(new Kopek());
        hayvanlar.add(new Kopek());
        hayvanlar.add(new Kedi());

        kedi.sesCikar();
        kopek.sesCikar();
        System.out.println();

        for(Hayvan hayvan : hayvanlar) {
            hayvan.sesCikar();
        }

        Bildirim bildirim1 = new EmailBildirim();
        Bildirim bildirim2 = new MesajBildirim();

        bildirim1.gonder();
        bildirim2.gonder();
    }
}
