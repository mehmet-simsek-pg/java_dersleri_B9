package gun13;

public class Arrays2D {
    public static void main(String[] args) {
        /**
         * 1D Array int[] numbers = new int[3]; -> 10, 20, 4 seklinde icerisinde
         * 3 tane int deger tutuyor
         *
         * 2D Array -> satir ve sütun lari olan bir yapi
         * int[][] notlar = new int[3][4] -> 3 satir, 4 sütun dan olusan bir yapi
         * */

        int[][] sayilar = new int[3][4]; // 3x4 lük bir tablo olusturduk.

        sayilar[0][0] = 12;
        sayilar[1][3] = 46;
        // sayilar[3][4] = 56; // 3. index yok o yüzden bu tanimlama hata verir

        int[][] numbers = {{3, 4, 5}, {3, 2, 1}}; // 2x3 lük bir tablo

        System.out.println("2. satir, 3. sütun -> " + numbers[1][2]);
        System.out.println("1. satir, 2. sütun -> " + numbers[0][1]);

        System.out.println("----------------- ");

        for (int i = 0; i < numbers.length; i++) { // satir
            // numbers.length -> satir sayisi
            for (int j = 0; j < numbers[i].length; j++) { // sütun
                // numbers[i].length -> satirda ki sütun sayisi
                System.out.print(numbers[i][j] + " "); // sütunlari yazicak
            }
            System.out.println(); // satirlar arasi bosluk biraksin diye ekledik
        }

        System.out.println("-----------------");
        int[][] degiskenYapi = {{1, 2}, {3, 4, 5, 6}, {4, 5, 6}};
        for (int i = 0; i < degiskenYapi.length; i++) {
            for (int j = 0; j < degiskenYapi[i].length; j++) {
                System.out.print(degiskenYapi[i][j] + " ");
            }
            System.out.println();
        }
    }
}
