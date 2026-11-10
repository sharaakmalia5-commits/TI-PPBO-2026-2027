public class BangunDatar {
    protected String namaBangun;
    // Constructor untuk menginisialisasi
    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    // Method hitungLuas() dengan nilai default 0
    public double hitungLuas() {
        return 0;
    }

    // Method hitungKeliling() dengan nilai default 0
    public double hitungKeliling() {
        return 0;
    }

    // Method non-override yang memanfaatkan polimorfisme untuk mencetak informasi
    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.println("Luas        : " + hitungLuas());
        System.out.println("Keliling    : " + hitungKeliling());
        System.out.println("-----------------------------------");
    }
}
