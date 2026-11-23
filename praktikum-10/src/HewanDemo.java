public class HewanDemo {
    public static void main(String[] args) {
        Hewan[] daftar = {
                new Kucing("Milo"),
                new Bebek("Donal"),
                new Elang("Garuda"),
                new Pinguin("Pingu")
        };

        for (Hewan h : daftar) {
            h.bersuara();

            if (h instanceof BisaTerbang) {
                BisaTerbang bt = (BisaTerbang) h;
                bt.terbang();
            }
            if (h instanceof BisaBerenang) {
                ((BisaBerenang) h).Berenang();
            }
        }
    }
}