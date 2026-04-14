package gun32.abstraction.ornek3;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Bir şirkette farklı çalışan türleri vardır.

         * Yazılımcı
         * Muhasebeci

         * Tüm çalışanların adı ortaktır.
         * Ama yaptıkları iş farklıdır.
         * Buna göre abstraction yapısı kurunuz.
         * */

        Yazilimci yazilimci = new Yazilimci("Izzet Ay");
        Muhasebeci muhasebeci = new Muhasebeci("Kader Topan");

        yazilimci.bilgi();
        yazilimci.gorev();

        System.out.println();

        muhasebeci.bilgi();
        muhasebeci.gorev();
    }
}
