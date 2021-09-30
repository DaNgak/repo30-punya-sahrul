package Jobsheet_4.Tugas;

public class Daun {
    private String warnaDaun;
    private String tipeDaun;

    Daun(String tipeDaun, String warnaDaun){
        this.warnaDaun = warnaDaun;
        this.tipeDaun = tipeDaun;
    }

    public String getTipeDaun() {
        return tipeDaun;
    }

    public String getWarnaDaun() {
        return warnaDaun;
    }

    public void cetakInfo() {
        System.out.println(warnaDaun != null ? "Warna Daun = " + warnaDaun : "Warna Daun = Undefined");
        System.out.println(tipeDaun != null ? "Tipe Daun = " +  tipeDaun : "Tipe Daun Undefined");
    }
}
