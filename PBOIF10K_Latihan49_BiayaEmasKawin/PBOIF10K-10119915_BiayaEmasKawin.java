/**
 * Nama     : M.Hongki Alfikram
 * Kelas    : IF10K
 * NIM      : 10119915
 * Program  : Biaya Emas Kawin
 */
 public class PBOIF10k10119915Latihan49 {
    public static void main(String[] args) {
        EmasKawin masKawin = new EmasKawin();

        masKawin.setEMAS(15.7f);
        masKawin.setHarga(570000.0f);

        float EMAS = masKawin.getEMAS();
        float Harga = masKawin.getHarga();

        masKawin.TotalBayar(EMAS, Harga);
    }
}