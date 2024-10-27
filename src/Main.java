/**
 * @version Intelij IDEA 2023 3.8
 */
public class Main {
    /**
     * @see WaterBoom nyambung refrensi dengan class WaterBoom karena dipindah kesini
     */
    public static void main(String[] args) {
        Tiket tiketReguler = new Tiket("Reguler", 100000);
        Pemesanan Pemesanan = new Pemesanan(tiketReguler);
        Tiket tiketPremium = new Tiket("Premium", 200000);
        Pemesanan Pemesanan2 = new Pemesanan(tiketPremium);
/**
 * @return tampilkan fungsi (tampilkanDetail) yang menampilkan jenis, jumlah, total harga tiket
 */
        int jumlahTiket = 3, jumlahTiket2 = 3;
        Pemesanan.tampilkanDetail(jumlahTiket);
        Pemesanan2.tampilkanDetail(jumlahTiket2);
    }
    /*public static void main(String[] args) {

        Tiket tiketReguler = new Tiket("Reguler", 100000);
        Pemesanan Pemesanan = new Pemesanan(tiketReguler);
        Tiket tiketPremium = new Tiket("Premium", 200000);
        Pemesanan Pemesanan2 = new Pemesanan(tiketPremium);

        int jumlahTiket = 3, jumlahTiket2 = 3;
        Pemesanan.tampilkanDetail(jumlahTiket);
        Pemesanan2.tampilkanDetail(jumlahTiket2);
    }*/
}
/**
 * @author FesalFarendika - Informatika 2023
 */
