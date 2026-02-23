package gun1;

public class SoruCevap {
    public static void main(String[] args) {

        /**
         * 1) System.out.print("A"); System.out.print("B");
         * Cikti: AB -> print() imleci alt satira indirmedigi icin
         *
         * 2) System.out.println("A"); System.out.println("B");
         * Cikti: A
         *        B
         *  println() -> yaziyi yazip yazi sonunda imleci alt satira indiriyor
         *
         *  3)
         *  System.out.print("Java");
         *  System.out.println("!");
         *  System.out.print("Hello");
         * bu kodun ciktisi ne olur?
         *
         * Cikti: Java!
         *        Hello
         *
         * 4) System.out.println("Ali\nVeli");
         * Cikti: Ali
         *        Veli
         *        \n -> alt satira indiriyor kendinden sonraki yaziyi
         *
         * 5) System.out.println("He said: \"Hello\"");
         * Cikti: He said: "Hello"
         *
         * 6) System.out.println("A\tB\tC");
         * Cikti: A   B   C
         *  \t -> bir tab kadar bosluk birakiyor.
         *  Bir kere tab tusuna basmis gibi davraniyor
         *
         *  7) System.out.printf("Sayı: %d", 15);
         *  Cikti: Sayi: 15
         *
         *  %s -> yazi icin, %d -> sayi icin format olusturur.
         *
         *  8) System.out.printf("Fiyat: %.2f", 12.3456);
         *  Cikti: Fiyat: 12.35
         *
         *  %.2f virgülden sonraki kismin 2 hanesini yazar
         *
         *  9) System.out.println("Bugün hava "güzel"!");
         *  Cikti: Hata verir. Hata sebebi \ olmamasi
         *  Dogrusu: System.out.println("Bugün hava \"güzel\"!")
         *  Bugün hava "güzel"!
         *
         *  10) System.out.printf("A");
         *      System.out.printf("B%n");
         *      System.out.printf("C");
         *
         *   Cikti:    AB
         *             C
         *
         *  11) System.out.printf("Merhaba %s", "Mehmet");
         *  Cikti: Merhaba Mehmet
         *  %s -> yazi icin format(sablon) olusturuyor
         *
         *  12) System.out.printf("|%5d|%5d|", 7, 123);
         *  Cikti: |    7||  123|
         *
         *  13) System.out.printf("%s:%d", "Age", 25);
         *  Cikti: Age:25
         *
         *  14) System.out.println("Merhaba\Dünya");
         *  Cikti: Merhaba\Dünya
         *
         *  15) System.out.printf("X=%d, Y=%d%n", 10, 20);
         *      System.out.print("Done");
         *
         *  Cikti: X= 10 Y= 20
         *         Done
         * */
    }
}
