    // Superclass Kendaraan (dengan constructor berparameter untuk Latihan 3)
    class Kendaraan {
        protected String merek;
        protected int kecepatanMaks;

        public Kendaraan(String merek, int kecepatanMaks) {
            this.merek = merek;
            this.kecepatanMaks = kecepatanMaks;
        }
    }

    // Subclass Mobil (dengan method tampilkanInfo Latihan 4)
    class Mobil extends Kendaraan {
        int jumlahPintu;

        public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
            super(merek, kecepatanMaks); // Constructor chaining
            this.jumlahPintu = jumlahPintu;
        }

        // Latihan 4: Mengakses langsung atribut protected merek dan kecepatanMaks
        public void tampilkanInfo() {
            System.out.println("Merek Mobil     : " + merek);
            System.out.println("Kecepatan Maks  : " + kecepatanMaks + " km/h");
            System.out.println("Jumlah Pintu    : " + jumlahPintu);
        }
    }

    // Subclass Motor
    class Motor extends Kendaraan {
        String jenisMotor; // contoh: 'Matic', 'Manual'

        public Motor(String merek, int kecepatanMaks, String jenisMotor) {
            super(merek, kecepatanMaks); // Constructor chaining
            this.jenisMotor = jenisMotor;
        }

        public void tampilkanInfo() {
            System.out.println("Merek Motor     : " + merek);
            System.out.println("Kecepatan Maks  : " + kecepatanMaks + " km/h");
            System.out.println("Jenis Motor     : " + jenisMotor);
        }
    }

