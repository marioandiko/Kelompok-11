# UTS KOMPUTER PEMROGRAMAN (Kelompok-11)
# Judul project: STUDI KASUS 1: MANAJEMEN NILAI MAHASISWA

# Anggota Kelompok:
1. Mario andiko Dwi Saputra (G1A025015)

2. Viola Ahza Amita (G1A025009)

3. Muhammad Afzal Saputra (G1A025049)

# Overview Sistem

Sebagai bagian dari tugas mata kuliah pemrograman berorientasi objek, mahasiswa Program Studi Informatika diminta untuk membuat sebuah sistem yang dapat mengelola data nilai mahasiswa secara otomatis. Selama ini, proses pengolahan nilai masih sering dilakukan secara manual menggunakan lembar kerja seperti Excel, yang berisiko menimbulkan kesalahan dalam perhitungan, keterlambatan dalam pengumuman nilai, serta kesulitan dalam menentukan kelulusan mahasiswa secara cepat dan akurat. Dari tugas tersebut, mahasiswa diminta untuk merancang sistem sederhana yang mampu menghitung nilai rata-rata serta menentukan status kelulusan mahasiswa berdasarkan kriteria tertentu.

Dari kebutuhan itu, lahirlah sistem manajemen nilai mahasiswa berbasis Java. Sistem ini dibuat untuk membantu proses pengelolaan nilai agar lebih efisien dan terstruktur. Melalui sistem ini, setiap mahasiswa memiliki data tersendiri yang mencakup nama, NIM, nilai tugas, nilai UTS, dan nilai UAS. Program akan secara otomatis menghitung nilai rata-rata dari ketiga komponen tersebut dan menentukan apakah mahasiswa dinyatakan lulus atau tidak lulus berdasarkan ambang batas nilai rata-rata minimal 75.

Secara teknis, sistem ini dibangun menggunakan pendekatan Object-Oriented Programming (OOP) dan terdiri dari tiga kelas utama: Mahasiswa, Kelas, dan Main. Class Mahasiswa digunakan untuk menyimpan data serta menghitung nilai rata-rata dan status kelulusan. Class Kelas berfungsi menampung banyak objek mahasiswa menggunakan struktur data ArrayList serta menampilkan seluruh data nilai yang telah diinput. Sementara itu, class Main menjadi pusat eksekusi program, di mana pengguna dapat memasukkan data mahasiswa melalui input terminal menggunakan perulangan (looping), dan hasil akhirnya akan ditampilkan dalam bentuk daftar nilai beserta status kelulusannya.

Sistem ini menjadi contoh penerapan konsep OOP dalam dunia nyata, di mana setiap bagian program memiliki tanggung jawabnya masing-masing. Dengan rancangan sederhana namun terstruktur, sistem manajemen nilai mahasiswa ini dapat dikembangkan lebih lanjut menjadi aplikasi yang lebih kompleks — misalnya berbasis web atau terhubung ke database — untuk mendukung proses akademik secara otomatis, cepat, dan akurat.
