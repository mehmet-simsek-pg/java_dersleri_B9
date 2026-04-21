package gun35;

public class StringBuilderVeStringBuffer {
    public static void main(String[] args) {
        /**
         * [metin][metin][metin][][][][] -> String
         * [metin][][][][][][] -> StringBuilder, StringBuffer

         *  Döngü icinde sürekli metin ekleme, silme, birlestirme islemleri yapiliyorsa.
          - Gereksiz yere cok fazla nesne olusur
          - performans düser
          - bellek kullanimi artar
         * */
        String metin = "Merhaba";
        metin = metin + " Dünya";
        metin = metin + " !";

        System.out.println("Metin: " + metin);

        /**
         * StringBuilder, metin üzerinde degisiklik yapmayi kolaylastiran ve hizli
         * calisan bir class tir.
          Neler yapar
         - sona ekleme
         - araya ekleme
         - silme
         - karakter degistirme
         - ters cevirir
         * */

        StringBuilder stringBuilder = new StringBuilder("Merhaba");

        stringBuilder.append(" Dünya"); // append() metodu ekleme yapar

        // Bu kullanim sayesinde yeni yeni nesneler üretmedi, onun yerine tek nesne
        // üzerinden islemleri gerceklestirdi.
        System.out.println(stringBuilder);

        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");

        System.out.println(stringBuffer);

        /**
         * StringBuilder -> daha hizlidir
         * StringBuffer -> thread-safe, yani coklu islemlerde daha güvenli

         * En cok kullanilan metotlar

         * append() ->  sona ekleme yapar
          StringBuilder stringBuilder = new StringBuilder("Java");
          stringBuilder.append(" Ogreniyorum");
          System.out.println(stringBuilder); // Java Ogreniyorum

         * insert() -> belirli bir index e ekleme yapar
         StringBuilder stringBuilder = new StringBuilder("Jaa");
         stringBuilder.insert(2, "v");
         System.out.println(stringBuilder); // Java

         * delete() -> belirli araliktaki karakterleri siler
         StringBuilder stringBuilder = new StringBuilder("Merhaba Dünya");
         stringBuilder.delete(7, 13);
         System.out.println(stringBuilder); // Merhaba

         * deleteCharAt() -> tek bir karakter siler
         StringBuilder stringBuilder = new StringBuilder("Javva");
         stringBuilder.deleteCharAt(3);
         System.out.println(stringBuilder); // Java

         * replace() -> Belirli araliktaki kismi baska bir metinle degistirir
         StringBuilder stringBuilder = new StringBuilder("Merhaba Java");
         stringBuilder.replace(8, 12 , "Dünya");
         System.out.println(stringBuilder); // Java Dünya

         * setCharAt() -> Belirli bir indexteki karakteri degistirir
         StringBuilder stringBuilder = new StringBuilder("Jaxa");
         stringBuilder.setCharAt(2, 'v');
         System.out.println(stringBuilder); // Java

         * reverse() -> Metni ters cevirir
         StringBuilder stringBuilder = new StringBuilder("Java");
         stringBuilder.reverse();
         System.out.println(stringBuilder); // avaJ

         * length() -> Karakter sayisini verir
         StringBuilder stringBuilder = new StringBuilder("Merhaba");
         stringBuilder.length();
         System.out.println(stringBuilder); // 7

         * charAt() -> Belirli indexteki karakteri verir
         StringBuilder stringBuilder = new StringBuilder("Java");
         System.out.println(stringBuilder.charAt(1)); // a

         * toString()
         StringBuilder stringBuilder = new StringBuilder("Java");
         String metin = stringBuilder.toString();
         System.out.println(metin);
         * */
    }
}
