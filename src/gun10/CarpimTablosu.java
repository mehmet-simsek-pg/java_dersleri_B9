package gun10;

public class CarpimTablosu {
    public static void main(String[] args) {
        /**
         * 1-5 arasi carpim tablosunu ekrana yazdirin
         * */

        for (int i = 1; i <= 5 ; i++) { // satir
            for (int j = 1; j <=5 ; j++) { // sütun
                // "%d" -> virgül den sonraki sayilari yaziyor.
                // 4 kullanimi bosluk birakmasi icin
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
