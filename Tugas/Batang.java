package Jobsheet_4.Tugas;

public class Batang {
    private int tinggiBatang;
    private String tipeBatang;
    private String warnaBatang;

    Batang(String tipeBatang, int tinggiBatang, String warnaBatang){
        this.tipeBatang = tipeBatang;
        this.tinggiBatang = tinggiBatang;
        this.warnaBatang = warnaBatang;
    }

    public int getTinggiBatang() {
        return tinggiBatang;
    }

    public String getTipeBatang() {
        return tipeBatang;
    }

    public String getWarnaBatang() {
        return warnaBatang;
    }

    public void cetakInfo() {
        System.out.println(tinggiBatang != 0 ? "Tinggi Batang = " +  tinggiBatang + " Meter" : "Tinggi Batang = Undefined");
        System.out.println(tipeBatang != null ? "Tipe Batang = " +  tipeBatang : "Tipe Batang = Undefined");
        System.out.println(warnaBatang != null ? "Warna Batang = " +  warnaBatang : "Warna Batang = Undefined");
    }
}
