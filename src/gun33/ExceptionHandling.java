package gun33;

public class ExceptionHandling {
    /**
     * Exception Nedir?
      - Kullanici sayi yerine yazi girerse
      - Bir sayiyi 0 a bölmeye calisinca
      - Bir dizide index sayisinin disina cikildiginda

     * Neden kullaniriz?
      - Program aniden kapanmasin diye
      - Hatayi kullaniciya anlasilir bir sekilde göstermek icin
      - Programi daha güvenli ve profesyonel göstermek icin

     * Hata türleri

      - 1) Compile time error
     System.out.println("Hello Exception")
     satir sonunda ; olmadigi icin ide bize hata gösterir.

      - 2) RunTime Error
     int sonuc = 10 / 0;

     int[]nums = new int[3];
     nums[3] = 12;

     Yazildigi anda hata yoktur, ama programi calistirdiktan olusan hatalara denir

     Hata yönetimi yapisi

     1) try
     2) catch
     3) finally
     4) throws
     5) throw
     * */
}
