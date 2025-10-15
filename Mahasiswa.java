public class Mahasiswa {
    private String nama;
    private String nim;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public Mahasiswa(String nama, String nim, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    public String getNama() { return nama; } //mengambil nilai (baca data)
    public String getNim() { return nim; } //mengambil nilai (baca data)
    public double getNilaiTugas() { return nilaiTugas; } //mengambil nilai (baca data)
    public double getNilaiUTS() { return nilaiUTS; } //mengambil nilai (baca data)
    public double getNilaiUAS() { return nilaiUAS; } //mengambil nilai (baca data)

    public double hitungRataRata() {
        return (nilaiTugas + nilaiUTS + nilaiUAS) / 3; //Penghitungan rata-rata
    }

    public boolean isLulus() {
        return hitungRataRata() >= 75;  //jika lebih dari 75 maka lulus
    }
}
