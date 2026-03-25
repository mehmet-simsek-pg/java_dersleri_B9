package gun23.soru4;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /**
         * Kullanicidan 5 tane kitap bilgisi alin. Kitap sayfa
         * sayisi 200 den fazla olanlari ekrana yazdirin.
         * Kitaplarin yazarlarini ayrica yazdirin.
         * */

        Scanner scanner = new Scanner(System.in);
        // icerisinde 5 tane Kitap bilgisi tutacak array tanimladik
        Kitap[] kitap = new Kitap[5];
        // new Kitap[5] dememizin sebebi 5 tane index olustursun
        // eger bu indexler icin nesne olusturmazsam,
        // baslangic default degerleri null olur.
        // kitap[0] => null -> cünkü icerisinde nesne yok
        // kitap[1] => null -> -> cünkü icerisinde nesne yok
        // Kitap kitap = new Kitap();

        // 5 kitabin bilgilerini kullanicidan aldik
        for (int index = 0; index < kitap.length ; index++) {
            // array icerisindeki her bir eleman bir kitaptir.
            // bu yüzden önce o kitaptan bir nesne üretmek gerekir.
            // bu satirin amaci her index e bir kitap nesnesi eklemek
            kitap[index] = new Kitap();
            System.out.print((index + 1) + ". kitap ismi: ");
            kitap[index].adi = scanner.nextLine().trim();

            System.out.print((index + 1) + ". kitap yazari: ");
            kitap[index].yazar = scanner.nextLine().trim();

            System.out.print((index + 1) + ". kitap sayfa sayisi: ");
            kitap[index].sayfaSayisi = scanner.nextInt();
            scanner.nextLine();
        }

        // sayfa sayisi 200 den büyük olanlarin ismini yazdirdik
        for (int i = 0; i < kitap.length ; i++) {
            if (kitap[i].sayfaSayisi > 200) {
                System.out.println("Sayfa sayisi 200 den büyük: " + kitap[i].adi);
            }
        }

        for (int i = 0; i < kitap.length; i++) {
            System.out.println(kitap[i].yazar);
        }
    }
}
