// pewarisan dari pegawai, manager, direktur
public class Direktur extends Manager {
        private double tunjanganSaham;

        public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {
            super(nama, nip, gajiPokok, tunjanganJabatan); // Memanggil constructor Manager
            this.tunjanganSaham = tunjanganSaham;
        }

        public double getTunjanganSaham() {
            return tunjanganSaham;
        }
    }

