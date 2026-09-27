# ☕ Java Control Flow Suite: Seleksi Kondisi & Logika Percabangan

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Build](https://img.shields.io/badge/Build-Passing-brightgreen?style=for-the-badge)
![Level](https://img.shields.io/badge/Difficulty-Beginner%20Friendly-blue?style=for-the-badge)
![Course](https://img.shields.io/badge/Practicum-Pemrograman%20Dasar%20Modul%202-orange?style=for-the-badge)

Repositori ini memuat implementasi dan catatan belajar mendalam (*deep-dive study notes*) mengenai **Struktur Seleksi Kondisi (Control Flow)** pada bahasa pemrograman Java. Berisi 3 studi kasus praktikal: kalkulator geometri interaktif, klasifikasi metrik kesehatan (*Body Mass Index*), serta sistem komputasi penggajian karyawan berjenjang.

---

## 🎯 Intisari Konsep & Teori Belajar

Sebelum masuk ke implementasi kasus, berikut adalah prinsip dasar seleksi kondisi yang dipelajari:

| Struktur | Kapan Digunakan? | Kelebihan | Kelemahan |
| :--- | :--- | :--- | :--- |
| **`if` / `if-else`** | Evaluasi kondisi berbasis rentang nilai (range), logika boolean majemuk (`&&`, `\|\|`), atau relasional ($<, \le, >, \ge$). | Sangat fleksibel, mampu menangani perbandingan logika yang rumit. | Kurang rapi jika digunakan untuk pencocokan nilai tunggal yang sangat banyak. |
| **`switch-case`** | Pencocokan nilai tunggal diskret/konstan (*equality check*), seperti pilihan menu atau kode status. | Kode lebih bersih (*clean code*), pembacaan alur percabangan lebih mudah dipahami. | Tidak mendukung perbandingan rentang/kondisi logika rumit secara langsung (pada Java standar). |

---

## 📂 Struktur Repositori

```text
├── modul2_1.java    # Studi Kasus 1: Interactive Multi-Shape Geometry Calculator
├── modul2_2.java    # Studi Kasus 2: Body Mass Index (IMT) Health Classifier
├── modul2_3.java    # Studi Kasus 3: Overtime & Penalty Payroll Settlement Engine
└── README.md        # Showcase dokumentasi teknis & catatan belajar