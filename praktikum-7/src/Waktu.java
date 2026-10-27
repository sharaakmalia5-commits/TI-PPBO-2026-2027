public class Waktu {
    private int jam;
    private int menit;
    private int detik;

    // Constructor berparameter
    public Waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    // getter
    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    // setter dengan validasi

    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Jam tidak valid! Harus di rentang 0 - 23.");
        }
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Menit tidak valid! Harus di rentang 0 - 59.");
        }
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Detik tidak valid! Harus di rentang 0 - 59.");
        }
    }
}

