package gun9;

import java.util.Scanner;

public class TelefonNumarasiMaskeleme {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan telefon numarası alın (String): " 0555-123-45-67 "
          - veya ' ' karakterlerini kaldırın.
         * Uzunluk 11 değilse hata yazdırın.
         * İlk 4 haneye göre  operatör yazdırın
         * (ör: 0555=OperatörA, 0533=OperatörB, diğer=bilinmiyor).
         numaranın içinde kaç tane 5 olduğunu sayın.
         * 5 sayısı 4’ten fazlaysa “çok tekrar var” uyarısı yazdırın.
         * Maskeli formatta yazdırın: 0555****567 gibi.
         * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Telefon numarasi girin");
        String telNo = scanner.nextLine().trim();

        telNo = telNo
                .replace(" ", "")
                .replace("-","")
                .replace("/","");


    }
}
