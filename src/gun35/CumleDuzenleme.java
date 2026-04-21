package gun35;

public class CumleDuzenleme {
    public static void main(String[] args) {
        /**
         * Başlangıçta "Java cok eglenceli" metni olsun.
         * Bu metinde:

         * cok kelimesi çok olarak düzeltilecek
         * cümlenin sonuna bir dil. eklenecek

         * Son hali şu olacak:

         * Java çok eglenceli bir dil.
         * */

        StringBuilder sb = new StringBuilder("Java cok eglenceli");

        sb.replace(5, 8, "çok");

        sb.append(" bir dil.");

        System.out.println(sb);

    }
}
