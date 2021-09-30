package Jobsheet_4.Percobaan.ariapratamarelasiclass.percobaan4;

public class Gerbong {
    private String kode;
    private Kursi arrayKursi[];
    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
            System.out.println("Kursi " + nomor + " Sudah Ditempati Oleh "
            + this.arrayKursi[nomor - 1].getPenumpang().getNama());
        } else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
    public void setArrayKursi(Kursi[] arrayKursi) {
        this.arrayKursi = arrayKursi;
    }
    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}