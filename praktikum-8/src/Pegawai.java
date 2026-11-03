public class Pegawai {
    protected String nama;
    protected String nip ;
    protected double gajiPokok ;

    public Pegawai (String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;

        // Validasi gajiPokok tidak boleh negatif
        if (gajiPokok < 0) {
            System.out.println("Peringatan: Gaji pokok untuk " + nama + " tidak boleh negatif! Diset menjadi 0.");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
