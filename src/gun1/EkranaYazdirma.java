public class EkranaYazdirma {
    /**
     * Camel Case nedir?
     * Class isimlerdirmelerinde ilkharf büyük harfle baslar
     * _ ve & koymayiz, onun yerine ikinci isim de büyük harfle baslar.
     **/
    public static void main(String[] args) {
        /**
         * main method java da startin verildigi yerdir.
         * Kodlar bu main method icersinde olmali ki calissin.
         * Java da kodlar sirayla okunur.
         * */
        System.out.print("Hello Class 1");
        System.out.println("Hello World"); // Ekrana yazi yazdirmami sagliyor.
        System.out.print("Hello Class 2"); // Ekrana yazi yazdirmami sagliyor

        System.out.println("---------------");
        /**
         * print() ayni satirda yazar icerisindekileri
         * println() yazdiktan sonra otomatik alt satira indirir imleci
         * */

        System.out.print("Merhaba");
        System.out.print(" Dünya");
        System.out.println("!");
        System.out.print("Alt ");
        System.out.println("satir");
    }
}
