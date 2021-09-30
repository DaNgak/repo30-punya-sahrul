package Jobsheet_4.Tugas;

public class Main {
    public static void main(String[] args) {
        Akar akar = new Akar("Tunggang", 1);
        Batang batang = new Batang("Bercabang", 3, "Cokelat Tua");
        Daun daun = new Daun("Sejajar", "Hijau Tua");
        Tumbuhan mangga = new Tumbuhan("Pohon Mangga", true, daun, batang, akar);
        mangga.cetakInfo();
    }
}
