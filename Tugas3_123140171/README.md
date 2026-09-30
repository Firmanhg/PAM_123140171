# My Profile App

Praktikum Pertemuan 3 — Compose Multiplatform Basics  
**IF25-22017 Pengembangan Aplikasi Mobile**  
Program Studi Teknik Informatika · Institut Teknologi Sumatera

## Deskripsi

My Profile App merupakan aplikasi multiplatform berbasis Kotlin dan Compose Multiplatform yang menampilkan informasi profil pengguna, mulai dari foto, biodata, statistik, kontak, hingga daftar keahlian.

## Screenshot

| Desktop |
|---------|
| <img width="323" height="607" alt="image" src="https://github.com/user-attachments/assets/8f05a918-d13d-40cc-b977-bdf07d8ac328" />
 |

## Fitur

- Menampilkan foto dan identitas pengguna.
- Menyediakan deskripsi singkat tentang profil.
- Menampilkan statistik proyek, IPK, dan semester.
- Tombol Follow yang dapat diubah menjadi Following.
- Menampilkan informasi kontak pengguna.
- Menyediakan daftar keahlian beserta ikon.
- Mendukung tampilan yang dapat di-scroll.

## Teknologi

- Kotlin
- Compose Multiplatform
- Material 3
- Material Icons Extended

## Cara Menjalankan

### Desktop (JVM)

```bash
./gradlew :composeApp:run
```

### Android

1. Buka proyek menggunakan Android Studio.
2. Pilih konfigurasi `composeApp`.
3. Jalankan aplikasi melalui emulator atau perangkat Android.

## Dependency Tambahan

Pastikan dependency berikut sudah ditambahkan pada bagian `commonMain.dependencies` di file `composeApp/build.gradle.kts`.

```kotlin
implementation(compose.materialIconsExtended)
```

## Struktur File

```text
composeApp/
└── src/
    └── commonMain/
        └── kotlin/
            └── org/example/project/
                ├── App.kt
                └── ProfileScreen.kt
```

## Identitas Mahasiswa

| Keterangan | Informasi |
|---|---|
| Nama | Firman Gultom |
| NIM | 123140171 |
| Kelas | PAM RA |
| Program Studi | Teknik Informatika |
| Institusi | Institut Teknologi Sumatera |

---

*Tugas Praktikum 3 — Tahun Akademik Genap 2025/2026*
