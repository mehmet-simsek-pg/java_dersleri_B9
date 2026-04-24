package gun38_OCA;

public class Soru_16_30 {
    /**
     * Soru 16

     Aşağıdakilerden hangisi constructor için doğrudur?

     A) Her zaman void ile yazılır
     B) Class adıyla aynı isimde olur (dogru cevap)
     C) Geriye int döndürür
     D) Sadece bir kez yazılabilir

     * Soru 17

     Aşağıdaki kodun çıktısı ne olur?

     ArrayList<String> liste = new ArrayList<>();
     liste.add("Elma");
     liste.add("Armut");
     System.out.println(liste.size());

     A) 0
     B) 1
     C) 2 (dogru cevap)
     D) Hata verir

     * Soru 18

     Aşağıdakilerden hangisi exception handling yapısında kullanılır?

     A) loop - endloop
     B) try - catch (dogru cevap)
     C) check - error
     D) if - else

     * Soru 19

     Aşağıdaki kodun çıktısı ne olur?

     String a = "Java";
     String b = "Java";
     System.out.println(a == b);

     A) false
     B) true (dogru cevap)
     C) Hata verir
     D) Java

     * Soru 20

     Aşağıdaki kodun çıktısı ne olur?

     String a = new String("Java");
     String b = new String("Java");

     System.out.println(a == b);
     System.out.println(a.equals(b));

     A) true true
     B) false false
     C) false true (dogru cevap)
     D) true false

     * Soru 21

     Aşağıdaki kodun çıktısı ne olur?

     int[] arr = {2, 4, 6, 8};
     System.out.println(arr[arr.length - 1]);

     A) 2
     B) 6
     C) 8 (dogru cevap)
     D) Hata verir


     * Soru 22

     Aşağıdaki kodun çıktısı ne olur?

     for (int i = 1; i <= 3; i++) {
        for (int j = 1; j <= 2; j++) {
            System.out.print(i + "" + j + " ");
        }
     }

     A) 11 12 21 22 31 32 (dogru cevap)
     B) 1 2 3 1 2 3
     C) 11 21 31 12 22 32
     D) Hata verir

     * Soru 23

     Aşağıdaki kodun çıktısı ne olur?

     int x = 5;
     System.out.println(x++);
     System.out.println(x);

     A) 5 ve 5
     B) 6 ve 6
     C) 5 ve 6 (dogru cevap)
     D) 6 ve 5

     * Soru 24

     Aşağıdaki kodun çıktısı ne olur?

     int x = 5;
     System.out.println(++x);

     A) 5
     B) 6 (dogru cevap)
     C) 4
     D) Hata verir

     * Soru 25

     Aşağıdaki kodun çıktısı ne olur?

     String text = "Merhaba";
     text.concat(" Java");
     System.out.println(text);

     A) Merhaba Java
     B) Java
     C) Merhaba (dogru cevap)
     D) Hata verir

     * Soru 26

     Aşağıdakilerden hangisi overriding için gereklidir?

     A) Aynı class içinde olmak
     B) Farklı isimde metod kullanmak
     C) Alt class’ın üst class’taki metodu aynı imza ile yeniden yazması (dogru cevap)
     D) Metodun mutlaka static olması

     * Soru 27

     Aşağıdaki kodun çıktısı ne olur?

     class Hayvan {
        void sesCikar() {
            System.out.println("Hayvan sesi");
        }
     }

     class Kedi extends Hayvan {
        void sesCikar() {
            System.out.println("Miyav");
        }
     }
     Hayvan h = new Kedi();
     h.sesCikar();

     A) Hayvan sesi
     B) Miyav (dogru cevap)
     C) Hata verir
     D) null

     * Soru 28

     Aşağıdaki kodun çıktısı ne olur?

     ArrayList<String> list = new ArrayList<>();
     list.add("A");
     list.add("B");
     list.add("C");
     list.remove(1);

     System.out.println(list);

     A) [A, B, C]
     B) [A, C] (dogru cevap)
     C) [B, C]
     D) Hata verir

     * soru 29

     Aşağıdaki kodun çıktısı ne olur?

     ArrayList<Integer> list = new ArrayList<>();
     list.add(10);
     list.add(20);
     list.add(30);

     System.out.println(list.get(3));

     A) 10
     B) 20
     C) 30
     D) Hata verir (dogru cevap)

     * Soru 30

     Aşağıdaki kodun çıktısı ne olur?

     int[] nums = {1, 2, 3};
     for (int i = 0; i < nums.length; i++) {
        nums[i] = nums[i] * 2;
     }
     System.out.println(nums[1]);

     A) 2
     B) 4 (dogru cevap)
     C) 6
     D) 8

     * */
}
