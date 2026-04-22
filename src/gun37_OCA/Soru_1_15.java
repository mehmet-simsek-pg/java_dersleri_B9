package gun37_OCA;

public class Soru_1_15 {
    /**
     * Soru 1
     int a = 7;
     int b = 2;
     System.out.println(a / b);
     System.out.println(a % b);

     A) 3 ve 1 (Dogru Cevap)
     B) 3.5 ve 1
     C) 3 ve 0.5
     D) 7 ve 2

     * Soru 2

     Aşağıdakilerden hangisi Java’da geçerli identifier değildir?

     A) $value
     B) _count
     C) 2number (Dogru cevap)
     D) firstName

     * Soru 3

     String s = "OCA";
     s.concat("Exam");
     System.out.println(s);

     A) OCA (Dogru cevap)
     B) OCAExam
     C) Exam
     D) null

     * Soru 4

     Aşağıdakilerden hangisi compile-time error verir?

     A) if(x) {} (x int türünde) (Dogru cevap)
     B) if(b) {} (b boolean türünde)
     C) if(y > 2) {}
     D) switch(z) { case 0: }


     * Soru 5

     int i = 0;
     while(i < 3) {
     i++;
     }
     System.out.println(i);

     A) 0
     B) 2
     C) 3 (Dogru cevap)
     D) Sonsuz döngü

     * Soru 6

     for(int i=0; i<5; i+=2) {
     System.out.print(i);
     }

     Çıktı nedir?

     A) 01234
     B) 024 (Dogru cevap)
     C) 135
     D) 02

     * Soru 7

     default keyword hangi yapıda kullanılamaz?

     A) switch case
     B) Interface method
     C) Constructor tanımı (Dogru cevap)
     D) Generic type parametre

     * Soru 8

     String str = "Java";
     System.out.println(str.charAt(4));

     A) a
     B) IndexOutOfBoundsException (Dogru cevap)
     C) null
     D) v

     * Soru 9

     break ve continue hakkında hangisi doğrudur?

     A) İkisi de döngüyü bitirir
     B) break döngüyü bitirir, continue o turu atlar (Dogru cevap)
     C) İkisi de sadece for’da kullanılır
     D) İkisi de sadece switch’te kullanılır


     * Soru 10

     int x = 5;
     do {
     System.out.print(x);
     } while(x < 5);

     A) 5 (Dogru cevap)
     B) Sonsuz döngü
     C) Hiçbir şey yazmaz
     D) Derleme hatası


     * Soru 11

     Hangi access modifier sadece aynı pakette erişime izin verir?

     A) private
     B) protected
     C) public
     D) default (Dogru cevap)

     * Soru 12 TODO

     int i = 1;
     switch(i) {
     case 0: System.out.println("Zero"); break;
     default: System.out.println("Default");
     case 1: System.out.println("One");
     }

     Çıktı nedir?

     A) Zero
     B) Default
     C) One (Dogru cevap)
     D) Default One

     * Soru 13

     public class Test {
     public static void main(String[] args) {
     int x = 10;
     int y = x++;
     System.out.println(y);
     }
     }

     A) 10 (Dogru cevap)
     B) 11
     C) 9
     D) Compile error

     * Soru 14

     public class Test {
     public static void main(String[] args) {
     String s = "Java";
     System.out.println(s.substring(1, 3));
     }
     }

     A) av (Dogru cevap)
     B) ava
     C) ja
     D) Jav

     * Soru 15

     public class Test {
     public static void main(String[] args) {
     int[] arr = {1,2,3};
     for(int i : arr) {
     i = i * 2;
     }
     System.out.println(arr[0]);
     }
     }

     A) 2
     B) 1 (Dogru cevap)
     C) 3
     D) 6
     * */

}
