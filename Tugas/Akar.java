package Jobsheet_4.Tugas;

public class Akar {
    private String jenisAkar;
    private int panjangAkar;

    Akar(String jenisAkar, int panjangAkar){
        this.jenisAkar = jenisAkar;
        this.panjangAkar = panjangAkar;
    }

    public String getJenisAkar() {
        return jenisAkar;
    }

    public int getPanjangAkar() {
        return panjangAkar;
    }

    public void cetakInfo() {
        System.out.println(jenisAkar != null ? "Jenis Akar = " +  jenisAkar : "Jenis Akar = Undefined");
        System.out.println(panjangAkar != 0 ? "Panjang Akar = " + panjangAkar : "Panjang Akar = Undefined");
    }
}
