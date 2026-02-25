package gun10;

public class MarketRafi {
    public static void main(String[] args) {
        /**
         * 3 raf var, her rafta 4 ürün var.
         * Etiketler Raf1-Urun1 ... Raf3-Urun4 şeklinde yazsın.
         * Ayrıca ürün numarası çiftse yanına (kampanya) yaz.
         * */

        for (int raf = 1; raf <= 3 ; raf++) { // raflar
            for (int urun = 1; urun <= 4 ; urun++) { // raftaki ürünler
                System.out.print("Raf" + raf + "-Urun" + urun);

                if (urun % 2 == 0) {
                    System.out.print(" (kampanya)");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
