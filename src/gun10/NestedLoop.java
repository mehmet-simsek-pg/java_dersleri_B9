package gun10;

public class NestedLoop {
    public static void main(String[] args) {
        /**
         * // dis döngü -> tur sayisini belirtir
         * for (int i = 0; i < bitisDegeri ; i++) { // satir
         *      // ic döngü -> o turda tekrar sayisini belirtir
         *      for (int j = 0; j < bitisDegeri2 ; j++) { // sütun
         *         }
         *   }
         *   Örn: hafta ici 5 gün, her gün 3 ders var.
         *   Toplamda haftalik 15 ders
         * */

        for (int gun = 1; gun <= 5; gun++) {
            for (int ders = 1; ders <= 3 ; ders++) {
                System.out.print(gun + ". gün " + ders + ". ders ");
            }
            System.out.println();
        }

    }
}
