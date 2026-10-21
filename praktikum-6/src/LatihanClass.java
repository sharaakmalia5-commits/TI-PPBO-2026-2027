public class LatihanClass {
    public static void main (String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // constructor default
        Mahasiswa m2 = new Mahasiswa("Siti", "67890", 3.90); // berparameter
        m2.tampilkanData();

        System.out.println("Cumlaude?" + m2.isCumlaude());

    }
}
