import java.util.ArrayList;

public class Kelas {
    private ArrayList<Mahasiswa> daftarMahasiswa;
    //ArrayList itu seperti daftar (list) yang bisa menampung banyak data.

    public Kelas() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa m) {
        daftarMahasiswa.add(m);
    }

    public void tampilkanDaftarMahasiswa() {
        System.out.println("\n=== Daftar Nilai Mahasiswa ===");
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM : " + m.getNim());
            System.out.println("Nilai Rata-rata: " + String.format("%.2f", m.hitungRataRata()));
            //String.format("%.2f", angka) adalah cara untuk menampilkan angka desimal dengan format tertentu —
           //alam hal ini 2 angka di belakang koma.
            System.out.println("Status: " + (m.isLulus() ? "LULUS" : "TIDAK LULUS"));
            System.out.println("----------------------------");
        }
    }
}
