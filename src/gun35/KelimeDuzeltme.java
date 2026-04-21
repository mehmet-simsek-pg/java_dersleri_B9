package gun35;

public class KelimeDuzeltme {
    public static void main(String[] args) {
        /**
         * Başlangıçta "Jvaa Programlama" metni verilsin.
         * Bu metindeki yazım hatası düzeltilsin ve sonuç:
         * Java Programlama
         * */

        // 1. cözüm
        StringBuilder sb = new StringBuilder("Jvaa Programlama");

        sb.replace(0, 4 , "Java");

        System.out.println(sb);

        // 2. cözüm
        StringBuilder sb2 = new StringBuilder("Jvaa Programlama");

        sb2.deleteCharAt(1);
        sb2.insert(2, 'v');

        System.out.println(sb2);
    }
}
