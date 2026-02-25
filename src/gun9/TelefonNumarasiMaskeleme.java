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

        String telNo;

        do {
            System.out.println("Telefon numarasi girin");
            telNo = scanner.nextLine().trim();

            // bu islem sonucunde elimizde sadece sayilar kaldi
            telNo = telNo
                    .replace(" ", "")
                    .replace("-","")
                    .replace("/","");

            // 0555-345-23-22 aradaki - leri sildikten sonra
            // if ve while sadece sayilarin uzunluguna bakar
            if (telNo.length() != 11) {
                System.out.println("Tel no 11 haneli olmali");
            }

        } while (telNo.length() != 11);

        // String ilkDortKarakter = telNo.substring(0, 4);
        // degisken ismini istedigim gibi verebilrim
        // dikkat edecegim kisim anlamli isimlendirme yapmak
        String prefix = telNo.substring(0,4);

        String operator;

        switch (prefix) {
            case "0555":
                operator = "OperatörA";
                break;
            case "0533":
                operator = "OperatörB";
                break;
            default:
                operator = "Bilinmeyen operator";
                break;
        }

        int count = 0;
        for (int i = 0; i < telNo.length(); i++) {
            if (telNo.charAt(i) == '5') {
                count++;
            }
        }

        System.out.println("Operator: " + operator);
        System.out.println("Tel no icerisindeki 5 miktari: " + count);

        if (count > 4) {
            System.out.println("Cok fazla tekrar eden 5 var");
        }

        String masked = telNo.substring(0,4) + "****" + telNo.substring(8);
        System.out.println("Masked tel no: " + masked);

        scanner.close();
    }
}
