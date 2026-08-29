# 🏨 HotelSeek 🏨


## Informasi Proyek
| No | Nama                  | NRP        |
|----|-----------------------|------------|
| 1  | Waffi Haris Ashari    | 5026241020 |
| 2  | Crystal Reinheart    | 5026241055 |
| 3  | Raid Orlando Azurae  | 5026241063 |
| 4  | Naina Mazaya Putri   | 5026241183 |

Kelompok: 4

Kelas : D

Program Studi : Sistem Informasi

Mata Kuliah: Algoritma & Struktur Data (ASD)

Dosen Pengampu: Renny Pradina Kusumawardani, S.T., M.T.

Nama Proyek : HotelSeek

## A. LATAR BELAKANG

Saat memilih tempat penginapan, wisatawan umumnya ingin menemukan hotel dengan kualitas terbaik serta akses yang mudah dan cepat. Namun, proses membandingkan harga, rating, dan lokasi hotel sering kali memakan waktu. Oleh karena itu, diperlukan sebuah sistem yang mampu membantu pengguna memilih hotel terbaik sekaligus menentukan rute tercepat menuju hotel tersebut agar perencanaan perjalanan menjadi lebih efisien.

## B. SOLUSI YANG DITAWARKAN

Solusi yang ditawarkan dalam permasalahan ini adalah Hotelseek, yaitu sebuah sistem yang dirancang untuk membantu pengguna dalam menemukan hotel yang paling sesuai dengan kebutuhan, preferensi, dan prioritas mereka. Sistem ini memungkinkan pengguna untuk melakukan pencarian hotel berdasarkan berbagai kriteria prioritas, seperti harga, rating, lokasi hotel, serta berdasarkan lokasi tujuan.

Selain membantu dalam proses pemilihan hotel, Hotelseek juga dilengkapi dengan fitur perhitungan rute secara otomatis yang mampu menentukan dan menampilkan jalur atau path terpendek dari lokasi pengguna menuju hotel yang dipilih. Dengan menggabungkan proses seleksi hotel terbaik dan perencanaan rute perjalanan dalam satu sistem yang terpadu, Hotelseek mampu meningkatkan efisiensi  perencanaan perjalanan.

## C. FITUR-FITUR
### 1. Rekomendasi Hotel Berdasarkan Prioritas

Sistem menampilkan rekomendasi hotel berdasarkan pilihan prioritas pengguna, yaitu:

#### i. Price (70% Price, 30% Review)
Gambar Output:
![WhatsApp Image 2025-12-14 at 15 04 53_0305f745](https://github.com/user-attachments/assets/3a1c53e4-b458-4533-b1a7-3791530ff3ae)

#### ii. Review (30% Price, 70% Review)
Gambar Output:
![WhatsApp Image 2025-12-14 at 15 06 10_c62c50fb](https://github.com/user-attachments/assets/7c6d6caa-63e5-43e1-86d8-88d005c0ffb4)

#### iii. Balanced (50% Price, 50% Review)
Gambar Output:
![WhatsApp Image 2025-12-14 at 15 06 53_5c5abaab](https://github.com/user-attachments/assets/290c2a09-de32-4cf6-9752-9ba1dcb0f69a)

#### iv. Nearby Hotel (Hotel terdekat dari lokasi pengguna saat ini)
Gambar Output:
![WhatsApp Image 2025-12-14 at 15 07 48_e390dc33](https://github.com/user-attachments/assets/1bbfe5f2-9bb4-4cc0-9332-be394971ec3d)

#### v. Destination (Hotel terdekat dari tujuan destinasi pengguna)
Gambar Output:
![WhatsApp Image 2025-12-14 at 15 08 22_f72e5fda](https://github.com/user-attachments/assets/825fa9b8-3b02-4713-a2a6-03cefc889a9e)

### 2. Pencarian Rute Terpendek

Sistem dapat mencari dan menampilkan path terdekat dari lokasi pengguna saat ini menuju hotel yang direkomendasikan.

## D. ALGORITMA YANG DIGUNAKAN DAN IMPLEMENTASINYA

Dijkstra Algorithm
Digunakan untuk mencari rute (path) terpendek dari lokasi awal pengguna menuju hotel dengan skor tertinggi berdasarkan hasil perhitungan prioritas. Algoritma ini bekerja dengan mengevaluasi jarak antar lokasi pada graph dan menentukan jalur dengan total jarak paling minimum, sehingga pengguna dapat memperoleh rekomendasi rute perjalanan yang paling efisien dan optimal dari segi waktu maupun jarak tempuh. Algoritma ini dapat ditemukan di class Dijkstra.java

Quick Sort
Digunakan untuk mengurutkan daftar hotel berdasarkan kriteria tertentu, seperti harga dan rating, sesuai dengan prioritas yang dipilih oleh pengguna. Algoritma ini dipilih karena memiliki performa yang cepat dan efisien dalam pengurutan data berukuran besar, sehingga sistem dapat menampilkan hasil rekomendasi hotel secara cepat dan terstruktur. Algoritma ini dapat ditemukan di class Sorting.java

## E. STRUKTUR DATA
Graph akan digunakan untuk menyimpan data peta daerah dan korelasinya/edges yang merepresentasikan jarak antar vector.

Untuk penyimpanan data review hotel, object class hotel akan dibuat dan menampung data nama hotel beserta rating hotel tersebut

![WhatsApp Image 2025-12-14 at 15 57 44_736882c7](https://github.com/user-attachments/assets/4ba6b76f-d78d-4568-a821-650ebe5eae95)

## F. PROGRES PRESENTASI
### 1. First PPT

- Mengemukakan ide dan rencana proyek HotelSeek

- Implementasi algoritma didasari kebutuhan pencarian hotel untuk itinerary wisata

- Sistem difokuskan pada pencarian hotel termurah, rating terbaik, dan rute tercepat

- Pemilihan Quick Sort dan Dijkstra Algorithm

### 2. PPT Progress

- Membuat graph untuk tiap daerah di Surabaya Timur

- Membuat tabel daftar hotel pada setiap daerah

- Membuat class: Hotel, HotelSeek, Graph, ScoreCalculator, Main

- Mengimplementasikan Quick Sort pada class Sorting

- Menyediakan tiga opsi prioritas: Price, Rating, dan Balanced

### 3. Final PPT

- Merapikan struktur dan kode program

- Mengimplementasikan Dijkstra Algorithm pada class Dijkstra

- Menambah opsi prioritas menjadi empat: Price, Rating, Balanced, dan Location

- Menambahkan suggestion berdasarkan lokasi awal dan tujuan pengguna

- Menampilkan hotel yang berada di lokasi tujuan


## G. UPDATE
### 1. Pembaruan Program

Tanggal Update : 11 Desember 2025

File Update : Main.java

Deskripsi Update:
Kami menambahkan prioritas ke-5 (Destination) untuk menggambarkan pilihan pengguna ketika memilih suatu daerah tujuan. Dengan fitur ini, sistem akan menampilkan hotel yang berada di daerah tujuan atau hotel terdekat di sekitarnya. Selain itu, jumlah rekomendasi hotel yang ditampilkan diubah dari satu hotel menjadi Top 5 hotel, sehingga pengguna memiliki lebih banyak pilihan berdasarkan harga, rating, dan jarak.

#### Contoh Kasus:

Lokasi Awal : Semolowaru

Tujuan : Merr

Jika pengguna ingin mencari penginapan di daerah Merr namun tidak mengetahui ketersediaan hotel di sana, maka HotelSeek akan menampilkan daftar hotel yang berada di Merr dan sekitarnya.

### 2. Video Demo

Link Video Demo:
https://youtu.be/PUTX35lZHWg
![WhatsApp Image 2025-12-14 at 15 43 10_011b992c](https://github.com/user-attachments/assets/dd46161a-b442-4cd7-82f5-a587b8e99fcd)

## Daftar GitHub Final Project Kelas D
D-1 : Word Rank Guesser Game

Link : https://github.com/NashiwaInsan/asdfinalproject


D-2 : Sistem Rekomendasi Event Berbasis Graph

Link : https://github.com/dedyirama-id/kael-recommendation-system


D-3 : Smart Traffic Light Simulator

Link : https://github.com/Sudukk/FP_ASD_Traffic_Light_Simulation_FINAL


D-4 : HotelSeek - Rekomendasi Pemilihan Hotel

Link : https://github.com/dreadf/hotelseek


D-5 :

Link :


D-6 : To-Do List

Link : https://github.com/anggraitapr/ASDFPTODOLIST


D-7 : Sistem Antrian IGD

Link : https://github.com/WilliamHanantha/FP-ASD


D-8 : Sistem Rekomendasi Jadwal Latihan dan Nutrisi Gym

Link :https://github.com/tyr3x74/GymPlan


D-9 : Sistem Rekomendasi Teman Berdasarkan Mutual Friends

Link :https://github.com/mariaelvina/FinalProjectD9


D-10 : Monster Chase

Link : https://github.com/Aida41104/FPASD


D-11 : Warehouse Management System

Link : https://github.com/FasaBil/ASD-D11-Inventory-Management


D-12 : Smart Traveling Planner

Link : https://github.com/Dziky05/FP-ASD-KEL-13


D-13 : Sistem Manajemen Inventaris Gudang dan Optimasi Rute Pengiriman

Link : https://github.com/FashaAsshofa/Final-Project-ASD-D-Kelompok-13


D-14 : Rekomendasi Film berbasis Graph

Link : https://github.com/neutralcheeze/final-project-asd.git

