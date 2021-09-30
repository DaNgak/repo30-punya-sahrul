package Jobsheet_4.Tugas;

public class Tumbuhan {
    private String namaTumbuhan;
    private boolean memilikiBuah = false;
    private Daun daun;
    private Batang batang;
    private Akar akar;

    Tumbuhan(){

    }
    Tumbuhan(String namaTumbuhan, boolean memilikiBuah, Daun daun, Batang batang, Akar akar){
        this.namaTumbuhan = namaTumbuhan;
        this.memilikiBuah = memilikiBuah;
        this.daun = daun;
        this.batang = batang;
        this.akar = akar;
    }

    public void setNamaTumbuhan(String namaTumbuhan) {
        this.namaTumbuhan = namaTumbuhan;
    }
    public String getNamaTumbuhan() {
        return namaTumbuhan;
    }
    public void setMemilikiBuah(boolean memilikiBuah) {
        this.memilikiBuah = memilikiBuah;
    }

    public boolean getMemilikiBuah(){
        return memilikiBuah;
    }

    public void setDaun(Daun daun) {
        this.daun = daun;
    }

    public Daun getDaun() {
        return daun;
    }

    public void setBatang(Batang batang) {
        this.batang = batang;
    }

    public Batang getBatang() {
        return batang;
    }

    public void setAkar(Akar akar) {
        this.akar = akar;
    }

    public Akar getAkar() {
        return akar;
    }

    public void cetakInfo() {
        System.out.println("--------------Tumbuhan--------------");
        System.out.println(namaTumbuhan != null ? "Nama Tumbuhan = " +  namaTumbuhan : "Nama Tumbuhan = Undefined");
        System.out.println(memilikiBuah == true ? "Memiliki Buah = Ya Memiliki Buah" : "Memiliki Buah = Tidak Memiliki Buah");
        System.out.println(namaTumbuhan != null ? "---Akar " +  namaTumbuhan + "---" : "---Akar Undefined---");
        getAkar().cetakInfo();
        System.out.println(namaTumbuhan != null ? "---Batang " +  namaTumbuhan + "---" : "---Batang Undefined---");
        getBatang().cetakInfo();
        System.out.println(namaTumbuhan != null ? "---Daun " +  namaTumbuhan + "---" : "---Daun Undefined---");
        getDaun().cetakInfo();
    }
}
