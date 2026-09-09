# Tugas Praktikum Minggu 1 - Pengembangan Aplikasi Mobile

**Nama:** Firman H Gultom

**NIM:** 123140171

**Program Studi:** Teknik Informatika

**Mata Kuliah:** Pengembangan Aplikasi Mobile

---
## Deskripsi Tugas
Tugas ini berfokus pada pengenalan dan konfigurasi awal lingkungan pengembangan berbasis **Kotlin Multiplatform (KMP)** menggunakan kerangka kerja antarmuka **Compose Multiplatform**.

1. **Setup Lingkungan Pengembangan** 

    Konfigurasi Android Studio dengan dukungan plugin Kotlin Multiplatform serta integrasi JDK 21.
2. **Inisialisasi Proyek** 

    Membuat proyek Compose Multiplatform yang mendukung target platform Desktop (JVM) dan Android.

3. **Modifikasi UI Dasar:**
    * Mengubah teks default *Hello World* menjadi teks salam personal (**Firman H Gultom**).
    * Menambahkan **123140171** tepat di bawah nama.
    * Menampilkan nama platform target yang aktif saat tombol interaktif ditekan.
4. **Eksekusi Multiplatform** 

    Menjalankan serta memverifikasi kode pada target platform Desktop (JVM).

5. **Manajemen Repositori** 

    Mengorganisasi struktur direktori proyek ke dalam repositori Git publik dengan dokumentasi yang lengkap.

---

##  Teknologi & Lingkungan Pengembangan
* **Bahasa Pemrograman:** [Kotlin](https://kotlinlang.org/) (Multiplatform)
* **Kerangka Antarmuka (UI Framework):** [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)
* **IDE:** Android Studio Ladybug / Meerkat
* **Java Development Kit (JDK):** OpenJDK 21 (Temurin / JetBrains Runtime)
* **Build System:** Gradle (Kotlin DSL - `.gradle.kts`)
* **Target Eksekusi:** Desktop JVM (Java 21) & Android Platform

---

##  Struktur Direktori Proyek
Proyek menggunakan pola pembagian modul KMP standar, di mana logika dan tampilan antarmuka dipakai bersama pada modul `shared`:

```text
PRAKTIKUM1_123140149/
├── androidApp/   
├── desktopApp/  
├── shared/                   
│   └── src/
│       ├── commonMain/       
│       │   └── kotlin/
│       │       └── App.kt    
│       ├── androidMain/      
│       └── jvmMain/          
├── build.gradle.kts          
├── settings.gradle.kts       
├── README.md                 
├── screenshot-desktop.png    
└── screenshot-desktop2.png   
```
---

## Hasil Eksekusi Aplikasi
<img width="1600" height="846" alt="WhatsApp Image 2026-09-09 at 22 26 54" src="https://github.com/user-attachments/assets/180329d8-16cb-4218-9677-df2b58143113" />
<img width="1402" height="737" alt="image" src="https://github.com/user-attachments/assets/4db77142-b1a9-44e2-9b97-09fcd883f7ab" />

