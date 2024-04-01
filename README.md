# latihan-10

# Volume Calculator

Program Volume Calculator adalah program sederhana yang memungkinkan pengguna untuk menghitung volume berbagai macam bangun ruang, seperti balok, bola, dan tabung.

## Cara Penggunaan

1. Pastikan Anda memiliki Java Runtime Environment (JRE) yang terinstal di komputer Anda.
2. Unduh semua file dalam repositori ini.
3. Buka terminal atau command prompt dan navigasikan ke direktori tempat Anda menyimpan file-file tersebut.
4. Compile dan jalankan `VolumeCalculatorDriver.java` dengan perintah berikut:

    ```
    javac driver/VolumeCalculatorDriver.java
    java driver.VolumeCalculatorDriver
    ```

5. Ikuti petunjuk yang muncul di layar untuk memilih jenis bangun ruang dan masukkan dimensi yang diperlukan.
6. Program akan menghitung volume sesuai dengan pilihan Anda dan mencetak hasilnya.

## Contoh Input dan Output

### Input
```
Pilih jenis bangun ruang (0: Balok, 1: Bola, 2: Tabung): 1
```

### Output
```
Volume Bola: 113.09733552923255
```

## Struktur Proyek

- `driver/VolumeCalculatorDriver.java`: File utama yang berisi logika program dan interaksi dengan pengguna.
- `model/VolumeShape.java`: Antarmuka yang diterapkan oleh semua bangun ruang untuk menghitung volume.
- `model/Cuboid.java`: Kelas yang mewakili balok dan mengimplementasikan antarmuka `VolumeShape`.
- `model/Sphere.java`: Kelas yang mewakili bola dan mengimplementasikan antarmuka `VolumeShape`.
- `model/Cylinder.java`: Kelas yang mewakili tabung dan mengimplementasikan antarmuka `VolumeShape`.
- `model/ShapeType.java`: Enumerasi yang mendefinisikan jenis-jenis bangun ruang yang mungkin.
```
