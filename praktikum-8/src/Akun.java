// Superclass Akun
class Akun {
    protected String username;
    protected double saldo;

    public Akun(String username, double saldo) {
        this.username = username;
        this.saldo = saldo;
    }
}

// Subclass AkunPremium
class AkunPremium extends Akun {
    private double batasKredit;

    public AkunPremium(String username, double saldo, double batasKredit) {
        super(username, saldo);
        this.batasKredit = batasKredit;
    }

    // Method cekLimit mengakses saldo (protected dari superclass) dan batasKredit (private milik sendiri)
    public void cekLimit() {
        System.out.println("Username     : " + username);
        System.out.println("Saldo Akun   : Rp " + saldo);
        System.out.println("Batas Kredit : Rp " + batasKredit);
        System.out.println("Total Limit  : Rp " + (saldo + batasKredit));
    }
}
