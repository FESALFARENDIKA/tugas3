
class Tiket {
    private String jenisTiket;
    private double harga;

    public Tiket(String jenisTiket, double harga) {
        this.jenisTiket = jenisTiket;
        this.harga = harga;

    }

    /**
     * @return jenistiket menbembalikan nilai jenis tiket
     */
    public String getJenisTiket() {
        return jenisTiket;
    }

    /**
     *
     * @return harga menbembalikan nilai harga dari tiket yang sudah diinpukan
     */
    public double getHarga() {
        return harga;
    }
}

class Pemesanan {
    private Tiket tiket;
    //encap & rename

    public Pemesanan(Tiket tiket) {
        this.setTiket(tiket);
    }

    /**
     *
     * @param jumlah dari tiket
     */
    public void tampilkanDetail(int jumlah) {
        // inline
        System.out.println("Jenis Tiket: " + getTiket().getJenisTiket());
        System.out.println("Harga per Tiket: " + getTiket().getHarga());
        System.out.println("Jumlah Tiket: " + jumlah);
        /*System.out.println("Total Harga: " + hitungtotal + "\n");*/
        System.out.println("Total Harga: " + getTiket().getHarga() * jumlah + "\n");
    }

    public Tiket getTiket() {
        return tiket;
    }

    public void setTiket(Tiket tiket) {
        this.tiket = tiket;
    }
}


/*public class WaterBoom {*/
    /**
     * @see Main class ini dipindahkan ke main karena ingin mencoba refactor move member
     */
   /* public class WaterBoom {
        public static void main(String[] args) {
// rename
            Tiket tiketReguler = new Tiket("Reguler", 100000);
            Pemesanan Pemesanan = new Pemesanan(tiketReguler);
            Tiket tiketPremium = new Tiket("Premium", 200000);
            Pemesanan Pemesanan2 = new Pemesanan(tiketPremium);

            int jumlahTiket = 3, jumlahTiket2 = 3;
            Pemesanan.tampilkanDetail(jumlahTiket);
            Pemesanan2.tampilkanDetail(jumlahTiket2);
        }
    }*/

