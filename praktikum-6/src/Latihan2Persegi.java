public class Latihan2Persegi {
    double sisi;

    // Constructor Latihan2Persegi
    public Latihan2Persegi(double sisi) {
        this.sisi = sisi;
    }

    // Method menghitung luas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method menghitung keliling
    public double hitungKeliling() {
        return 4 * sisi;
    }

    public void tampilkanHasil() {
        System.out.println("Sisi     : " + sisi);
        System.out.println("Luas     : " + hitungLuas());
        System.out.println("Keliling : " + hitungKeliling());
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Latihan2Persegi p1 = new Latihan2Persegi(5.0);
        Latihan2Persegi p2 = new Latihan2Persegi(10.5);

        System.out.println("=== PERHITUNGAN PERSEGI ===");
        p1.tampilkanHasil();
        p2.tampilkanHasil();
    }
}