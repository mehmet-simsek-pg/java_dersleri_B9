package gun37_OCA;

public class Soru_31_50 {
    /**
     * Soru 31

     public class Test {
     public static void main(String[] args) {
     int x = 5;
     while(x-- > 0) {
     System.out.print(x);
     }
     }
     }

     A) 54321
     B) 43210 (dogru cevap)
     C) 54320
     D) 4321

     * Soru 32

     Aşağıdakilerden hangisi doğru constructor’dır?

     A) void Test(){}
     B) Test(){} (dogru cevap)
     C) int Test(){}
     D) static Test(){}

     * Soru 33

     public class Test {
     public static void main(String[] args) {
     int[] arr = {1,2,3};
     System.out.println(arr.length);
     }
     }

     A) 2
     B) 3 (dogru cevap)
     C) 4
     D) Compile error

     * Soru 34

     public class Test {
     public static void main(String[] args) {
     String s1 = "Java";
     String s2 = "Ja" + "va";
     String s3 = new String("Java"); // degerler ayni olsada hafizadaki yerleri farklidir

     System.out.println(s1 == s2);
     System.out.println(s1 == s3);
     }
     }

     Cevap: true false

     * Soru 35

     public class Test {
     public static void main(String[] args) {
     int x = 0;
     System.out.println(x++ == ++x);
     }
     }

     A) true
     B) false (dogru cevap)
     C) Compile error
     D) Runtime error

     * Soru 36

     public class Test {
     public static void main(String[] args) {
     int[] arr = new int[2];
     System.out.println(arr[0] + " " + arr[1]);
     }
     }

     Cevap: 0 0

     * Soru 37

     public class Test {
     public static void main(String[] args) {
     int x = 5;
     if(x = 10) {
     System.out.println("A");
     }
     }
     }

     Cevap: Compile time error

     * Soru 38

     public class Test {
     public static void main(String[] args) {
     String s = "Java";
     s.replace("a", "o");
     System.out.println(s);
     }
     }

     Cevap: Java

     * Soru 39

     Encapsulation için hangisi doğrudur?

     A) Tüm değişkenler public olmalıdır
     B) Değişkenler private yapılır, getter/setter kullanılır (dogru cevap)
     C) Sadece static değişkenler kullanılır
     D) Sadece constructor ile yapılır

     * Soru 40

     Aşağıdakilerden hangisi doğrudur?

     A) Constructor’ın dönüş tipi vardır
     B) Constructor sınıfla aynı isimde olmalıdır (dogru cevap)
     C) Constructor static olabilir
     D) Constructor override edilir

     * Soru 41

     class A {
     void show() {
     System.out.println("A");
     }
     }
     class B extends A {
     }

     A) Compile error
     B) Runtime error
     C) B sınıfı show() kullanabilir (dogru cevap)
     D) show() override edilmelidir

     * Soru 42

     this keyword neyi ifade eder?

     A) Parent class
     B) Current object (dogru cevap)
     C) Static class
     D) Constructor

     * Soru 43

     class A {
     void show() { System.out.println("A"); }
     }
     class B extends A {
     void show() { System.out.println("B"); }
     }

     A obj = new B();
     obj.show();

     A) A
     B) B (dogru cevap)
     C) Compile error
     D) Runtime error

     * Soru 44

     import java.util.*;

     public class Test {
     public static void main(String[] args) {
     List<String> list = new ArrayList<>();
     list.add("A");
     list.add("B");
     list.remove("A");
     System.out.println(list.size());
     }
     }

     A) 0
     B) 1 (dogru cevap)
     C) 2
     D) Compile error

     * Soru 45

     import java.util.*;

     Set<Integer> set = new HashSet<>();
     set.add(1);
     set.add(1);
     System.out.println(set.size());

     A) 0
     B) 1 (dogru cevap)
     C) 2
     D) Compile error

     * Soru 46

     import java.util.*;

     Map<String, Integer> map = new HashMap<>();
     map.put("A", 1);
     map.put("A", 2);
     System.out.println(map.get("A"));

     A) 1
     B) 2 (dogru cevap)
     C) null
     D) Compile error

     * Soru 47

     public class Test {
     public static void main(String[] args) {
     int x = 10 / 0;
     System.out.println("A");
     }
     }

     A) A
     B) Compile error
     C) Runtime exception (dogru cevap)
     D) 0

     * Soru 48

     public class Test {
     public static void main(String[] args) {
     try {
     System.out.println(10 / 0);
     } catch (Exception e) {
     System.out.println("Error");
     }
     }
     }

     A) 0
     B) Error (dogru cevap)
     C) Compile error
     D) Runtime error

     * Soru 49

     import java.time.*;

     LocalDate date = LocalDate.of(2023, 5, 10);
     date.plusDays(5);
     System.out.println(date);

     A) 2023-05-15
     B) 2023-05-10 (dogru cevap)
     C) Compile error
     D) Runtime error

     * Soru 50

     import java.util.*;

     Scanner sc = new Scanner(System.in);
     int x = sc.nextInt();
     System.out.println(x);

     A) Compile error
     B) Runtime input bekler (dogru cevap)
     C) null yazdırır
     D) 0 yazdırır










     * */

}
