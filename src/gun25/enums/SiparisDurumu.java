package gun25.enums;

public enum SiparisDurumu {
    HAZIRLANIYOR("Kargo hazirlaniyor"),
    KARGODA("Kargo yolda"),
    TESLIM_EDILDI("Kargo teslim edildi"),
    IPTAL_EDILDI("Kargo iptal edildi");

    String aciklama;

    SiparisDurumu(String aciklama) {
        this.aciklama = aciklama;
    }
}
