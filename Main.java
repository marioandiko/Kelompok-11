import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kelas kelas = new Kelas();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine(); // hapus enter

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("Nilai Tugas: ");
            double tugas = input.nextDouble();
            System.out.print("Nilai UTS  : ");
            double uts = input.nextDouble();
            System.out.print("Nilai UAS  : ");
            double uas = input.nextDouble();
            input.nextLine(); // hapus enter

            Mahasiswa mhs = new Mahasiswa(nama, nim, tugas, uts, uas);
            kelas.tambahMahasiswa(mhs);
        }

        kelas.tampilkanDaftarMahasiswa();
    }
}
