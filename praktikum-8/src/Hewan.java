public class Hewan {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void bersuara() {
        System.out.println(" ");
    }
}

// Subclass Kucing
class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }
}

// Subclass Anjing
class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }
}

