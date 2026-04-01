package gun27.ornek1;

public class TrafikIsiklari {
    private IsikDurumu durumu;
    private String isik;

    public TrafikIsiklari(IsikDurumu durumu){
        this.durumu = durumu;
    }

    public void mesajGoster(){
        switch (durumu) {
            case KIRMIZI -> System.out.println("Dur");
            case SARI -> System.out.println("Hazirlan");
            case YESIL -> System.out.println("Gec");
        }
    }
    // String kullanirsak
    public TrafikIsiklari(String isik) {
        this.isik = isik;
    }

    public void mesajGosterString(){
        switch (isik) {
            case "KIRMIZI" -> System.out.println("Dur");
            case "SARI" -> System.out.println("Hazirlan");
            case "YESIL" -> System.out.println("Gec");
            default -> System.out.println("Hatali giris");
        }
    }
}
