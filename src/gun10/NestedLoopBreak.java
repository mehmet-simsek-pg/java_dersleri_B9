package gun10;

public class NestedLoopBreak {
    public static void main(String[] args) {

/*
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }*/

        for (int satir = 1; satir <= 3; satir++) {
            for (int sutun = 1; sutun <= 5; sutun++) {
                if (sutun == 3) {
                    break; // bu satirin devamini keser
                }
                System.out.print(sutun + " ");
            }
            System.out.println();
        }

        System.out.println("------------");

        outer:
        for (int i = 1; i <= 3 ; i++) {
            for (int j = 1; j <= 5 ; j++) {
                if (i == 2 && j == 2) {
                    break outer; // dis döngüyü dahil herseyi durdurur.
                    // bu kullanima labeled break denir.
                    // Degisken ismi gibi istedigimiz ismi verebiliriz
                }
                System.out.println("i= " + i + " j = " + j);
            }
        }
    }
}
