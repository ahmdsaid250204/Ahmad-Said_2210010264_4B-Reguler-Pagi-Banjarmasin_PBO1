# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Polisi`, `PolisiTeliti`, dan `PolisiBergerak` adalah contoh dari class.

```bash
public class Polisi {
    ...
}

public class PolisiTeliti extends Polisi {
    ...
}

public class PolisiBergerak {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pls[i] = new PolisiTeliti(nama, nip);` adalah contoh pembuatan object.

```bash
pls[i] = new PolisiTeliti(nama, nip);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `nip` adalah contoh atribut.

```bash
String nama;
String nip;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Polisi` dan `PolisiTeliti`.

```bash
public Polisi(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

public PolisiTeliti(String nama, String nip) {
        super(nama, nip);
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setNip` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getNip`, `getTahunMasuk`, `getKantor`, `getBidang`, dan `getNoPeserta` adalah contoh method accessor.

```bash
public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nip` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String nip;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PolisiTeliti` mewarisi `Polisi` dengan sintaks `extends`.

```bash
public class PolisiTeliti extends Polisi {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Polisi` merupakan overloading method `displayInfo` dan `displayInfo` di `PolisiTeliti` merupakan override dari method `displayInfo` di `Polisi`.

```bash
public String displayInfo(String kantor){
    return displayInfo() + "\nkantor: " + kantor;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKantor` dan seleksi `switch` dalam method `getBidang`.

```bash
public String getKantor(){
        String kodeKan = getNip().substring(2, 4);
        if(kodeKan.equals ("10")){
            return "Timur";
        } else {
            return "Kantor Tidak Ditemukan";
        }

    //return getNip().substring(2, 4).equals("10") ? "Timur" : "Kantor Tidak Ditemukan";
}

public String getBidang(){
        String kodeBidang = getNip().substring(4, 6);
        switch(kodeBidang){
            case "01":
                return "Polantas";
            case "02":
                return "Intelijen";
            default:
                return "Tidak Ditemukan";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<pls.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Nama Polisi "+(i+1)+": ");
String nama = scanner.nextLine();
System.out.print("Masukkan NIP Polisi "+(i+1)+": ");
String nip = scanner.nextLine();

System.out.println("=================");
System.out.println("Data Polisi: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PolisiTeliti[] pls = new PolisiTeliti[2];` adalah contoh penggunaan array.

```bash
PolisiTeliti[] pls = new PolisiTeliti[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (StringIndexOutOfBoundsException e){
      System.out.println("Silahkan Menginput NIP Dengan Benar: "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Ahmad Said
NPM: 2210010264
