package gun33;

import java.util.Scanner;

public class ThrowKullanimi {
    public static void main(String[] args) {

        /**
         * throw kullanimindaki amac programcinin kendi kodunu kontrol altina
         * almasini saglamaktir. Hatali olan verilerle islem yapmaya devam
         * etmemek icin hata firlatilir.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yas: ");
        int yas = scanner.nextInt();

        if (yas < 0) {
            throw new IllegalArgumentException("Yas sifirdan kücük olamaz");
        }

        System.out.println("Yas: " + yas);
    }
}
