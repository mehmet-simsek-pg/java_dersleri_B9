package gun27.ornek6;

public class AkilliLamba {
    private LambaModu lambaModu;

    public AkilliLamba(LambaModu lambaModu) {
        this.lambaModu = lambaModu;
    }

    public void modDegistir(LambaModu yeniMod) {
        System.out.println("Eski mod: " + lambaModu);
        this.lambaModu = yeniMod;
        System.out.println("Yeni Mod: " + yeniMod);
    }
}
