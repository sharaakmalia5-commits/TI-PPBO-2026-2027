public class MainKepegawaian {
    public static void main(String[] args) {
        // Membuat object dari Manager, Staff, dan Direktur
        Manager mgr = new Manager("James Arthur", "M001", 12000000, 4500000);
        Staff stf = new Staff("Sienna Spiro", "S001", 6000000, 1500000);
        Direktur dir = new Direktur("Adele", "D001", 25000000, 10000000, 35000000);

        System.out.println("INFORMASI DATA MANAGER");
        mgr.tampilkanData();
        System.out.println("Tunjangan Jabatan : Rp " + mgr.getTunjanganJabatan());

        System.out.println("\nINFORMASI DATA STAFF");
        stf.tampilkanData();
        System.out.println("Tunjangan Kinerja : Rp " + stf.getTunjanganKinerja());

        System.out.println("\nINFORMASI DATA DIREKTUR");
        dir.tampilkanData();
        System.out.println("Tunjangan Jabatan : Rp " + dir.getTunjanganJabatan());
        System.out.println("Tunjangan Saham   : Rp " + dir.getTunjanganSaham());
    }
}
