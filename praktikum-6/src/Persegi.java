public class Persegi {
        double sisi;

        // Constructor berparameter
        public Persegi(double sisi) {
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
    }

