public class Direktur extends Manager {
    private double tunjanganSaham;
    // Constructor Direktur
    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan,
                    double tunjanganSaham) {
        super(nama, nip, gajiPokok, tunjanganJabatan); // Memanggil constructor Manager
        this.tunjanganSaham = tunjanganSaham;
    }

    // Getter untuk tunjangan saham
    public double getTunjanganSaham() {
        return tunjanganSaham;
    }

    // Override hitungGaji()
    @Override
    public double hitungGaji() {
        return super.hitungGaji() + tunjanganSaham;
    }

    // menampilkan rincian informasi direktur
    public void tampilkanInfoDirektur() {
        System.out.println("Direktur - Tunjangan Saham: Rp " + tunjanganSaham);
    }
}

