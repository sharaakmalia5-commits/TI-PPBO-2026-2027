public class BankDemo {
    public static void main(String[] args) {
        // Membuat minimal 2 objek RekeningBank (pengembangan untuk tugas)
        RekeningBank akun1 = new RekeningBank("001", "Budi", 100000, "Tabungan");
        RekeningBank akun2 = new RekeningBank("002", "Siti", 200000, "Giro");

        System.out.println("Kondisi Awal");
        akun1.cetakMutasi();
        akun2.cetakMutasi();

        // 1: Setor dan Tarik pada masing-masing rekening
        System.out.println("Pengujian Setor dan Tarik");
        akun1.setor(50000);
        akun1.tarik(30000);
        akun1.tarik(500000); // Seharusnya ditolak, saldo tidak cukup
        akun1.setor(-100);   // Seharusnya ditolak, jumlah tidak valid
        System.out.println();

        // 2: Transfer BERHASIL antar kedua rekening[cite: 3]
        System.out.println("Pengujian Transfer Berhasil");
        akun1.transferKe(akun2, 40000);
        System.out.println();

        //3: Transfer GAGAL (saldo tidak cukup atau jumlah tidak valid)
        System.out.println("Pengujian Transfer Gagal");
        akun1.transferKe(akun2, 999999); // Gagal: Saldo tidak cukup
        akun1.transferKe(akun2, -10000);  // Gagal: Jumlah tidak valid
        System.out.println();

        // 4: Mencetak mutasi akhir kedua rekening
        System.out.println("Mutasi Akhir");
        akun1.cetakMutasi();
        akun2.cetakMutasi();
    }
}